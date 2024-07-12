package org.jhonatan.pooclasesastractas.form.elementos;

import java.util.List;

public class SelectForm extends ElementoForm {

    // atributos
    private List<String> opciones;

    // constructores

    public SelectForm(String nombre) {
        super(nombre);
    }

    public SelectForm(String nombre, List<String> opciones) {
        super(nombre);
        this.opciones = opciones;
    }

    @Override
    public String dibujarHtml() {
        // TODO Auto-generated method stub
        return null;
    }

}
