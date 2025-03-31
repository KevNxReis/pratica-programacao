import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import org.junit.jupiter.api.Test;

class PraticaTest {

    @Test
    void testMain() {
        // Simplesmente verifica se a classe Pratica pode ser executada sem erros
        assertDoesNotThrow(() -> Pratica.main(new String[]{}));
    }
}
