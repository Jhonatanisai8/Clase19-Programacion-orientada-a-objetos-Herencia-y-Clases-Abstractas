package org.jhonatan.pooclasesastractas.form.elementos;

import java.util.ArrayList;
import java.util.List;
import org.jhonatan.pooclasesastractas.form.validador.Validador;

abstract public class ElementoForm {

    // atributos
    protected String valor;
    protected String nombre;

    // atributos del paquete Validador
    private List<Validador> validadores;
    private List<String> errores;

    // constructor
    public ElementoForm() {
        this.validadores = new ArrayList<>();
        this.errores = new ArrayList<>();
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
