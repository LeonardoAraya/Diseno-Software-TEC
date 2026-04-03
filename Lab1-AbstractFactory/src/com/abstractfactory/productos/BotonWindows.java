package com.abstractfactory.productos;

public class BotonWindows implements Boton {
    @Override
    public void renderizar() {
        System.out.println("Renderizado botón estilo Windows");
    }
}
