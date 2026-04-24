package com.adapter.adapter;

import com.adapter.adaptee.DispositivoImperial;
import com.adapter.target.CalculadorIMC;

public class AdaptadorImperial implements CalculadorIMC {
    private DispositivoImperial dispositivo;

    public AdaptadorImperial(DispositivoImperial dispositivo) {
        this.dispositivo = dispositivo;
    }

    @Override
    public double calcularIMC(double weightKg, double heightM) {
        double kg = dispositivo.getWeightLbs() * 0.4536;
        double metros = dispositivo.getHeightFt() * 0.3048;
        return kg / (metros * metros);
    }

    @Override
    public String determinarRango(double imc) {
        if (imc < 18.5) return "Bajo peso";
        else if (imc < 25.0) return "Normal";
        else return "Sobrepeso";
    }
}
