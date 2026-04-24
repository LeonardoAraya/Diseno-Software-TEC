package com.adapter.target;

public interface CalculadorIMC {
    double calcularIMC(double weightKg, double heightM);
    String determinarRango(double imc);
}