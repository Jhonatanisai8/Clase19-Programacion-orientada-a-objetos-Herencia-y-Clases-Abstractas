package org.jhonatan.pooclasesastractas.form.elementos;

import java.util.ArrayList;
import java.util.List;

import org.jhonatan.pooclasesastractas.form.validador.LargoValidador;
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

    public ElementoForm addValidador(Validador validador) {
        this.validadores.add(validador);
        return this;
    }

    public List<String> getErrores() {
        return errores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    // métodos
    public boolean esValido() {
        for (Validador v : validadores) {// iteramos
            if (!v.esValido(this.valor)) {// verificamos si es valido
                if (v instanceof LargoValidador) {
                    this.errores.add(((LargoValidador) v).getMensajeFormateadi(nombre));
                } else {
                    this.errores.add(String.format(v.getMensaje(), nombre));
                }
            }
        }
        return this.errores.isEmpty();// retorna si esta vacia
    }

    abstract public String dibujarHtml();

}
