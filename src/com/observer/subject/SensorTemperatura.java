package com.observer.subject;

import com.observer.observer.Dispositivo;
import java.util.ArrayList;
import java.util.List;

public class SensorTemperatura {
    private List<Dispositivo> dispositivos = new ArrayList<>();
    private double temperatura;

    public void suscribir(Dispositivo dispositivo) {
        dispositivos.add(dispositivo);
    }

    public void desuscribir(Dispositivo dispositivo) {
        dispositivos.remove(dispositivo);
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
        notificarTodos();
    }

    private void notificarTodos() {
        for (Dispositivo d : dispositivos) {
            d.actualizar(temperatura);
        }
    }
}