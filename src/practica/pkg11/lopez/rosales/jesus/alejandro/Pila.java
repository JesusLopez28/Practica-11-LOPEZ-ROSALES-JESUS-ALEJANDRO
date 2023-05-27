/*
 López Rosales Jesús Alejandro
 22110104       3°O        POE
 */
package practica.pkg11.lopez.rosales.jesus.alejandro;

import javax.swing.JOptionPane;

public class Pila {

    protected final Object[] elementos;
    private int tamaño;
    private final int capacidad;

    public Pila(int capacidad) {
        this.capacidad = capacidad;
        this.elementos = new Object[capacidad];
        this.tamaño = 0;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public boolean estaVacia() {
        return tamaño == 0;
    }

    public boolean estaLlena() {
        return tamaño == capacidad;
    }

    public void push(Object elemento) {
        if (estaLlena()) {
            JOptionPane.showMessageDialog(null, "La pila está llena. No se puede apilar más elementos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        elementos[tamaño] = elemento;
        tamaño++;
    }

    public Object pop() {
        if (estaVacia()) {
            JOptionPane.showMessageDialog(null, "La pila está vacía. No se puede desapilar ningún elemento.", "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        tamaño--;
        Object elemento = elementos[tamaño];
        elementos[tamaño] = null;
        return elemento;
    }

    public int tamaño() {
        return tamaño;
    }

    public Object[] imprimirPila() {
        if (estaVacia()) {
            JOptionPane.showMessageDialog(null, "La pila está vacía. No se puede imprimir.", "Error", JOptionPane.ERROR_MESSAGE);
            return new Object[0];
        }
        Object[] arreglo = new Object[tamaño];
        System.arraycopy(elementos, 0, arreglo, 0, tamaño);
        return arreglo;
    }
}
