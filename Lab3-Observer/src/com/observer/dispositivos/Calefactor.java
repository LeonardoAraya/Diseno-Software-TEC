package com.observer.dispositivos;

import com.observer.observer.Dispositivo;

public class Calefactor implements Dispositivo {
    @Override
    public void actualizar(double temperatura) {
        if (temperatura < 16) {
            System.out.println("Calefactor: ENCENDIDO (temperatura: " + temperatura + "°C)");
        } else {
            System.out.println("Calefactor: apagado (temperatura: " + temperatura + "°C)");
        }
    }
}
