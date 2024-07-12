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

    // método para agregar una opcion a la lista
    public SelectForm addOpcion(Opcion opcion) {
        this.opciones.add(opcion);
        return this;
    }

    @Override
    public String dibujarHtml() {
        StringBuilder sb = new StringBuilder("<select ");
        sb.append("name = '")
                .append(this.nombre)
                .append("'>");
        for (Opcion opcion : this.opciones) {
            sb.append("\n<option value = '")
                    .append(opcion.getValor())
                    .append("'");
            if (opcion.isSelected()) { // si el atributo esta seleccionado (true)
                sb.append("select");
                this.valor = opcion.getValor();
            }
            sb.append(">").append(opcion.getNombre())
                    .append("</option>");
        }
        sb.append("</select>");
        return sb.toString();
    }

}
