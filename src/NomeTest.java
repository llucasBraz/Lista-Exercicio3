package listas.lista01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NomeTest {

    @Test
    public void testNomeCompletoComTitulo() {
        Nome nome = new Nome("Dr.", "Carlos", "Silva", "Santos");
        assertEquals("Dr. Carlos Silva Santos", nome.getNomeCompleto());
    }

    @Test
    public void testNomeCompletoSemTitulo() {
        Nome nome = new Nome(null, "Carlos", null, "Santos");
        assertEquals("Carlos Santos", nome.getNomeCompleto());
    }
}
