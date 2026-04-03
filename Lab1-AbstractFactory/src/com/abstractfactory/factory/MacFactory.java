package com.abstractfactory.factory;

import com.abstractfactory.productos.Boton;
import com.abstractfactory.productos.Ventana;
import com.abstractfactory.productos.BotonMac;
import com.abstractfactory.productos.VentanaMac;

public class MacFactory implements GUIFactory {
    @Override
    public Boton crearBoton() {
        return new BotonMac();
    }

    @Override
    public Ventana crearVentana() {
        return new VentanaMac();
    }
}
