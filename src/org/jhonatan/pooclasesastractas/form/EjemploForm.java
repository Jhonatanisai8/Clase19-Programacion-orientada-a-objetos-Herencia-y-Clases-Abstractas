package org.jhonatan.pooclasesastractas.form;

import org.jhonatan.pooclasesastractas.form.elementos.ElementoForm;

public class EjemploForm {
    public static void main(String[] args) {
        ElementoForm el = new ElementoForm() {
            @Override
            public String dibujarHtml() {
                return null;
            }
        };
    }

}
