package com.observer;

import com.observer.dispositivos.AireAcondicionado;
import com.observer.dispositivos.Calefactor;
import com.observer.dispositivos.PantallaLCD;
import com.observer.subject.SensorTemperatura;

public class Main {
    public static void main(String[] args) {
        SensorTemperatura sensor = new SensorTemperatura();

        AireAcondicionado aire = new AireAcondicionado();
        Calefactor calefactor = new Calefactor();
        PantallaLCD pantalla = new PantallaLCD();

        sensor.suscribir(aire);
        sensor.suscribir(calefactor);
        sensor.suscribir(pantalla);

        System.out.println("--- Temperatura: 20°C ---");
        sensor.setTemperatura(20);

        System.out.println("\n--- Temperatura: 28°C ---");
        sensor.setTemperatura(28);

        System.out.println("\n--- Temperatura: 12°C ---");
        sensor.setTemperatura(12);
    }
}