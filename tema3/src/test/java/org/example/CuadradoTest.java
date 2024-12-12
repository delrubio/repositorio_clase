package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CuadradoTest {

    @Test
    void main() {
    }

    @Test
    void pedirNum() {
    }

    @Test
    void pedirNum() {
        assertAll(
            () -> assertTrue(Cuadrado.validarNum(2)));
            () -> assertTrue(Cuadrado.validarNum(20));
            () -> asserFalse(Cuadrado.validarNum(10000000));
            () -> asserFalse(Cuadrado.validarNum(100000000));
    );
    }
}