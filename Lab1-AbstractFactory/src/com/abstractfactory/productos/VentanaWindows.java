package com.abstractfactory.productos;

public class VentanaWindows implements Ventana{
    @Override
    public void mostrar(){
        System.out.println("Mostrando ventana estilo Windows");
    }
}
