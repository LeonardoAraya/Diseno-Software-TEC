package com.observer.dispositivos;

import com.observer.observer.Dispositivo;

public class AireAcondicionado implements Dispositivo {
    @Override
    public void actualizar(double temperatura) {
        if (temperatura > 26) {
            System.out.println("Aire Acondicionado: ENCENDIDO (temperatura: " + temperatura + "°C)");
        } else {
            System.out.println("Aire Acondicionado: apagado (temperatura: " + temperatura + "°C)");
        }
    }
}