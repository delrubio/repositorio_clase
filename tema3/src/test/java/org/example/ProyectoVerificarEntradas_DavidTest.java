package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * TESTS Proyecto de Verificación de Entradas Selección Española Femenina.
 * @author David Andrés Albarracín
 * @version 1.0 (18/12/2024)
 */

class ProyectoVerificarEntradas_DavidTest {

    ProyectoVerificarEntradas_DavidTest validator = new ProyectoVerificarEntradas_DavidTest();


    @Test
    void main() {
    }

    @Test
    void numeroEntradas() {
    }

    @Test
    void verificacionEntradas() {
        assertTrue(validator.isNumeric("1234"));
        assertFalse(validator.isNumeric("12a4"));
        assertFalse(validator.isNumeric("-1234"));
        assertFalse(validator.isNumeric("123@"));
    }

    private boolean isNumeric(String number) {
        return false;
    }

    @Test
    void convertirEntrada() {
        assertTrue(validator.hasEvenLength("12"));
        assertTrue(validator.hasEvenLength("1762"));
        assertFalse(validator.hasEvenLength("123"));
        assertFalse(validator.hasEvenLength("abc"));
        assertFalse(validator.hasEvenLength("-12"));
        assertFalse(validator.hasEvenLength("12#4"));
    }

    private boolean hasEvenLength(String number) {
        return false;
    }

    @Test
    void comprobarPares() {
    }

    @Test
    void comprobarImpares() {
    }
}