import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.Base64;

/**
 * Exemplo de implementação de criptografia AES usando o modo GCM.
 * AES/GCM/NoPadding é uma escolha moderna que fornece criptografia autenticada (AEAD),
 * protegendo tanto a confidencialidade quanto a integridade dos dados.
 */
public class AES {

    // Definimos o tamanho da chave AES (pode ser 128, 192 ou 256 bits)
    private static final int TAMANHO_CHAVE_AES_BITS = 256;

    // Definimos o tamanho do Vetor de Inicialização (IV) para o modo GCM.
    // 12 bytes (96 bits) é o tamanho recomendado pelo NIST.
    private static final int TAMANHO_IV_GCM_BYTES = 12;

    // Definimos o tamanho da Tag de Autenticação do GCM (em bits)
    // 128 bits é o mais seguro.
    private static final int TAMANHO_TAG_GCM_BITS = 128;

    // A transformação completa que usaremos no Cipher
    private static final String TRANSFORMACAO = "AES/GCM/NoPadding";

    private SecretKey chaveSecreta;
    private byte[] iv; // Vetor de Inicialização (ou "nonce")

    /**
     * Construtor que gera uma nova chave secreta e um novo IV a cada instância.
     * Em uma aplicação real, a chave secreta seria armazenada de forma segura
     * (ex: em um "vault" ou "keystore") e o IV seria armazenado junto com o
     * texto cifrado.
     */
    public AES() throws Exception {
        this.chaveSecreta = gerarChave();
        this.iv = gerarIV();
    }

    /**
     * Gera uma chave AES segura.
     */
    private SecretKey gerarChave() throws Exception {
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(TAMANHO_CHAVE_AES_BITS, SecureRandom.getInstanceStrong());
        return keyGen.generateKey();
    }

    /**
     * Gera um Vetor de Inicialização (IV) aleatório e seguro.
     * O IV NUNCA deve ser reutilizado com a mesma chave.
     */
    private byte[] gerarIV() {
        byte[] iv = new byte[TAMANHO_IV_GCM_BYTES];
        new SecureRandom().nextBytes(iv);
        return iv;
    }

    /**
     * Método principal para criptografar uma mensagem de texto.
     * @param textoPlano A mensagem original.
     * @return A mensagem criptografada, em formato Base64.
     */
    public String criptografar(String textoPlano) throws Exception {
        // 1. Obter a instância do Cipher com a transformação desejada
        Cipher cipher = Cipher.getInstance(TRANSFORMACAO);

        // 2. Criar os parâmetros para o modo GCM (IV e tamanho da Tag)
        GCMParameterSpec gcmParameterSpec = new GCMParameterSpec(TAMANHO_TAG_GCM_BITS, this.iv);

        // 3. Inicializar o Cipher para o modo de CRIPTOGRAFIA
        cipher.init(Cipher.ENCRYPT_MODE, this.chaveSecreta, gcmParameterSpec);

        // 4. Executar a criptografia
        byte[] textoCifradoBytes = cipher.doFinal(textoPlano.getBytes(StandardCharsets.UTF_8));

        // 5. Retornar como Base64 (formato seguro para transporte/armazenamento)
        return Base64.getEncoder().encodeToString(textoCifradoBytes);
    }

    /**
     * Método principal para descriptografar uma mensagem.
     * @param textoCifradoBase64 A mensagem criptografada, em Base64.
     * @return A mensagem original (texto plano).
     */
    public String descriptografar(String textoCifradoBase64) throws Exception {
        // 1. Obter a instância do Cipher (mesma transformação)
        Cipher cipher = Cipher.getInstance(TRANSFORMACAO);

        // 2. Criar os parâmetros GCM (DEVE usar o MESMO IV da criptografia)
        GCMParameterSpec gcmParameterSpec = new GCMParameterSpec(TAMANHO_TAG_GCM_BITS, this.iv);

        // 3. Inicializar o Cipher para o modo de DESCRIPTOGRAFIA
        cipher.init(Cipher.DECRYPT_MODE, this.chaveSecreta, gcmParameterSpec);

        // 4. Decodificar o Base64 para bytes
        byte[] textoCifradoBytes = Base64.getDecoder().decode(textoCifradoBase64);

        // 5. Executar a descriptografia
        // (Se a tag de autenticação GCM falhar, uma exceção será lançada aqui)
        byte[] textoPlanoBytes = cipher.doFinal(textoCifradoBytes);

        // 6. Converter de volta para String
        return new String(textoPlanoBytes, StandardCharsets.UTF_8);
    }

    /**
     * Método main para testar a implementação.
     */
    public static void main(String[] args) {
        try {
            // 1. Cria uma instância da nossa classe
            AES aes = new AES();

            String mensagemOriginal = "Este é um teste secreto para o AES!";
            System.out.println("Mensagem Original: " + mensagemOriginal);

            // 2. Criptografa
            String mensagemCriptografada = aes.criptografar(mensagemOriginal);
            System.out.println("Mensagem Criptografada (Base64): " + mensagemCriptografada);

            // 3. Descriptografa
            String mensagemDescriptografada = aes.descriptografar(mensagemCriptografada);
            System.out.println("Mensagem Descriptografada: " + mensagemDescriptografada);

            // 4. Verificação
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