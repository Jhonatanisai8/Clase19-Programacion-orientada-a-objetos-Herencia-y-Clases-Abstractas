package org.jhonatan.pooclasesastractas.form.elementos;

public class InputForm extends ElementoForm {

    // atributos
    private String tipo = "text";

    /* inicializa solo el objeto con el nombre */
    public InputForm(String nombre) {
        super(nombre);
    }

    /* inicializa con nombre y tipo el objeto creado */
    public InputForm(String nombre, String tipo) {
        super(nombre);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String dibujarHtml() {
        return null;
    }

}
