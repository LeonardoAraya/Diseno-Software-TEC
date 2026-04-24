package com.adapter;

import com.adapter.adaptee.DispositivoImperial;
import com.adapter.adapter.AdaptadorImperial;
import com.adapter.target.CalculadorIMC;

public class Main {
    public static void main(String[] args) {
        //paciente medido con dispositivo imperial (170 libras, 5.9 pies)
        DispositivoImperial dispositivo = new DispositivoImperial(170, 5.9);

        //el adapter traduce para el sistema de salud
        CalculadorIMC calculador = new AdaptadorImperial(dispositivo);

        //el sistema de salud calcula sin saber que los datos eran imperiales
        double imc = calculador.calcularIMC(0, 0);
        String rango = calculador.determinarRango(imc);

        System.out.println("=== Sistema de Salud ===");
        System.out.println("IMC calculado: " + Math.round(imc * 100.0) / 100.0);
        System.out.println("Rango de salud: " + rango);
    }
}