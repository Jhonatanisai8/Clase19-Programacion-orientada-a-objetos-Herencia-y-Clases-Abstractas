package org.jhonatan.pooclasesastractas.form.elementos;

abstract public class ElementoForm {

    // atributos
    protected String valor;
    protected String nombre;

    public ElementoForm() {

    }

    public ElementoForm(String valor, String nombre) {
        this.valor = valor;
        this.nombre = nombre;
    }

    // métodos
    abstract public String dibujarHtml();

}
