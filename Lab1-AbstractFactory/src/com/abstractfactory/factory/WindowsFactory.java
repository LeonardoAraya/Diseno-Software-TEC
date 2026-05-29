package com.abstractfactory.factory;

import com.abstractfactory.productos.Boton;
import com.abstractfactory.productos.Ventana;
import com.abstractfactory.productos.BotonWindows;
import com.abstractfactory.productos.VentanaWindows;

public class WindowsFactory implements GUIFactory {
    @Override
    public Boton crearBoton() {
        return new BotonWindows();
    }

    @Override
    public Ventana crearVentana() {
        return new VentanaWindows();
    }
}
