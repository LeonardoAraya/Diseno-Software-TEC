package com.abstractfactory;

import com.abstractfactory.factory.GUIFactory; //imports necesarios de los otros paquetes
import com.abstractfactory.factory.MacFactory;
import com.abstractfactory.factory.WindowsFactory;
import com.abstractfactory.productos.Boton;
import com.abstractfactory.productos.Ventana;

class Aplicacion {
    private Boton boton;
    private Ventana ventana;

    public Aplicacion(GUIFactory factory) { //constructor
        boton = factory.crearBoton();
        ventana = factory.crearVentana();
    }

    public void renderizar() {
        boton.renderizar();
        ventana.mostrar();
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Ejecutando con Windows Factory ===");
        Aplicacion appWindows = new Aplicacion(new WindowsFactory()); //crear aplicación con WindowsFactory
        appWindows.renderizar();

        System.out.println("\n=== Ejecutando con Mac Factory ===");
        Aplicacion appMac = new Aplicacion(new MacFactory()); //crear aplicación con MacFactory
        appMac.renderizar();
    }
}