/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractas;

/**
 *
 * @author aiya
 */
public abstract class ProductoCongelado extends Producto {
    
    private float TemperaturaCongelaci�n;

    public float getTemperaturaCongelaci�n() {
        return TemperaturaCongelaci�n;
    }

    public void setTemperaturaCongelaci�n(float TemperaturaCongelaci�n) {
        this.TemperaturaCongelaci�n = TemperaturaCongelaci�n;
    }
    
    
}
