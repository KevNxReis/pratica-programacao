import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.Base64;

public class AES {

    private static final int TAMANHO_CHAVE_AES_BITS = 256;

    private static final int TAMANHO_IV_GCM_BYTES = 12;

    private static final int TAMANHO_TAG_GCM_BITS = 128;

    private static final String TRANSFORMACAO = "AES/GCM/NoPadding";

    private SecretKey chaveSecreta;
    private byte[] iv;

    public AES() throws Exception {
        this.chaveSecreta = gerarChave();
        this.iv = gerarIV();
    }
    private SecretKey gerarChave() throws Exception {
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(TAMANHO_CHAVE_AES_BITS, SecureRandom.getInstanceStrong());
        return keyGen.generateKey();
    }
    private byte[] gerarIV() {
        byte[] iv = new byte[TAMANHO_IV_GCM_BYTES];
        new SecureRandom().nextBytes(iv);
        return iv;
    }
    public String criptografar(String textoPlano) throws Exception {

        Cipher cipher = Cipher.getInstance(TRANSFORMACAO);

        GCMParameterSpec gcmParameterSpec = new GCMParameterSpec(TAMANHO_TAG_GCM_BITS, this.iv);

        cipher.init(Cipher.ENCRYPT_MODE, this.chaveSecreta, gcmParameterSpec);

        byte[] textoCifradoBytes = cipher.doFinal(textoPlano.getBytes(StandardCharsets.UTF_8));

        return Base64.getEncoder().encodeToString(textoCifradoBytes);
    }
    public String descriptografar(String textoCifradoBase64) throws Exception {

        Cipher cipher = Cipher.getInstance(TRANSFORMACAO);

        GCMParameterSpec gcmParameterSpec = new GCMParameterSpec(TAMANHO_TAG_GCM_BITS, this.iv);

        cipher.init(Cipher.DECRYPT_MODE, this.chaveSecreta, gcmParameterSpec);

        byte[] textoCifradoBytes = Base64.getDecoder().decode(textoCifradoBase64);

        byte[] textoPlanoBytes = cipher.doFinal(textoCifradoBytes);

        return new String(textoPlanoBytes, StandardCharsets.UTF_8);
    }

    public static void main(String[] args) {
        try {

            AES aes = new AES();

            String mensagemOriginal = "Este é um teste secreto para o AES!";
            System.out.println("Mensagem Original: " + mensagemOriginal);

            String mensagemCriptografada = aes.criptografar(mensagemOriginal);
            System.out.println("Mensagem Criptografada (Base64): " + mensagemCriptografada);

            String mensagemDescriptografada = aes.descriptografar(mensagemCriptografada);
            System.out.println("Mensagem Descriptografada: " + mensagemDescriptografada);

            if (mensagemOriginal.equals(mensagemDescriptografada)) {
                System.out.println("\nSucesso! A mensagem foi e voltou corretamente.");
            } else {
                System.out.println("\nFalha! As mensagens não batem.");
            }

        } catch (Exception e) {
            System.err.println("Ocorreu um erro durante o processo de criptografia/descriptografia:");
            e.printStackTrace();
        }
    }
}