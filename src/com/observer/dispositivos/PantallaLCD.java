package com.observer.dispositivos;

import com.observer.observer.Dispositivo;

public class PantallaLCD implements Dispositivo {
    @Override
    public void actualizar(double temperatura) {
        System.out.println("Pantalla LCD: Temperatura actual → " + temperatura + "°C");
    }
}
