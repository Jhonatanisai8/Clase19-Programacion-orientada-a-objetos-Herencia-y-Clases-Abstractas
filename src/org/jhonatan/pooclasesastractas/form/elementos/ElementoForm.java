package org.jhonatan.pooclasesastractas.form.elementos;

abstract public class ElementoForm {

    // atributos
    protected String valor;
    protected String nombre;

    public ElementoForm() {

    }

    public ElementoForm(String nombre) {
        this();
        this.nombre = nombre;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    // métodos
    abstract public String dibujarHtml();

}
