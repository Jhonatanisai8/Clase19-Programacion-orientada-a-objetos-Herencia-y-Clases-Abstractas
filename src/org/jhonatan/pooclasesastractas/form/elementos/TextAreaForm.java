package org.jhonatan.pooclasesastractas.form.elementos;

public class TextAreaForm extends ElementoForm {

    // atributos
    private int filas;
    private int columnas;

    public TextAreaForm(String nombre) {
        super(nombre);
    }

    public TextAreaForm(String nombre, int filas, int columnas) {
        super(nombre);
        this.filas = filas;
        this.columnas = columnas;
    }

    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    @Override
    public String dibujarHtml() {
        return null;
    }
}
