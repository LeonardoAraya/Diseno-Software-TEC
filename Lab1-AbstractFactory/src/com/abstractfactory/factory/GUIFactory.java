package com.abstractfactory.factory;

import com.abstractfactory.productos.Boton; //importar desde el otro paquete el Boton
import com.abstractfactory.productos.Ventana; //importar desde el otro paquete la Ventana

public interface GUIFactory {
    Boton crearBoton();
    Ventana crearVentana();
}

