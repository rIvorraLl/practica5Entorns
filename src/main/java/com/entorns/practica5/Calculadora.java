package com.entorns.practica5;

/**
 *
 * @author alt
 */
public class Calculadora implements iCalculadora {

    @Override
    public float sumar(float a, float b) {
        return a + b;
    }

    @Override
    public float restar(float a, float b) {
        return a - b;
    }

    @Override
    public float multiplicar(float a, float b) {
        return a * b;
    }

    @Override
    public float dividir(float a, float b) {
        return a / b;
    }
}
