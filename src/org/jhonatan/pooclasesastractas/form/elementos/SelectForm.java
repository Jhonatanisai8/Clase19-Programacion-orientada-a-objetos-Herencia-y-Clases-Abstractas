package org.jhonatan.pooclasesastractas.form.elementos;

import java.util.ArrayList;
import java.util.List;

import org.jhonatan.pooclasesastractas.form.elementos.select.Opcion;

public class SelectForm extends ElementoForm {

    // atributos list<tipo> <= indica el tipo
    private List<Opcion> opciones;

    // constructores

    public SelectForm(String nombre) {
        super(nombre);
        this.opciones = new ArrayList<Opcion>();
    }

    public SelectForm(String nombre, List<Opcion> opciones) {
        super(nombre);
        this.opciones = opciones;
    }

    @Override
    public String dibujarHtml() {
        // TODO Auto-generated method stub
        return null;
    }

}
