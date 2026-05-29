package com.abstractfactory.productos;

public class BotonMac implements Boton{
    @Override
    public void renderizar(){
        System.out.println("Renderizado botón estilo Mac");
    }
}
