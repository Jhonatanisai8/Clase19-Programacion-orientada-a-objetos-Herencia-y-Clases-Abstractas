package org.jhonatan.pooclasesastractas.form.validador;

import org.jhonatan.pooclasesastractas.form.validador.Mensaje.MensajeFormateable;

public class LargoValidador extends Validador implements MensajeFormateable {

    // atributos
    protected String mensaje = "el campo %s debe ser de mínimo %d caracteres y máximo %d caracteres";
    private int min;
    private int max = Integer.MAX_VALUE;

    // constructores
    public LargoValidador(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public LargoValidador() {
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }

    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMensaje() {
        return mensaje;
    }

    @Override
    public boolean esValido(String valor) {
        // this.mensaje = String.format(this.mensaje, this.min, this.max);
        if (valor == null) {
            return true;
        }
        int largo = valor.length();

        return (largo >= min && largo <= max);
    }

    @Override
    public String mensajeFormateado(String campo) {
        return String.format(this.mensaje, campo, this.min, this.max);
    }

    /*
     * public String getMensajeFormateadi(String campo) {
     * return String.format(this.mensaje, campo, this.min, this.max);
     * }
     */
}
