package org.jhonatan.pooclasesastractas.form;

import java.util.ArrayList;
import java.util.List;

import org.jhonatan.pooclasesastractas.form.elementos.ElementoForm;
import org.jhonatan.pooclasesastractas.form.elementos.InputForm;
import org.jhonatan.pooclasesastractas.form.elementos.SelectForm;
import org.jhonatan.pooclasesastractas.form.elementos.TextAreaForm;
import org.jhonatan.pooclasesastractas.form.elementos.select.Opcion;

public class EjemploForm {
    public static void main(String[] args) {
        ejemploObjetos();
    }

    public static void ejemploObjetos() {
        // creando un objeto de tipo InputForm
        InputForm username = new InputForm("userename");
        InputForm password = new InputForm("classe", "password");
        InputForm email = new InputForm("email", "email");
        InputForm edad = new InputForm("edad", "numbre");

        // creando un objeto de tipo de textArea
        TextAreaForm experencia = new TextAreaForm("exp", 5, 5);
        SelectForm lenguaje = new SelectForm("lenguaje");

        Opcion java = new Opcion("1", "Java");
        lenguaje.addOpcion(java);
        lenguaje.addOpcion(new Opcion("2", "Python"));
        lenguaje.addOpcion(new Opcion("3", "C++"));
        lenguaje.addOpcion(new Opcion("4", "JavaScript"));
        lenguaje.addOpcion(new Opcion("5", "PHP"));

        // establecemos valores
        username.setValor("john.doe");
        password.setValor("ab1c2d");
        email.setValor("juan@gmail.com");
        edad.setValor("45");
        experencia.setValor("...mas de 10 años de experencia...");
        java.setSelected(true);

        // creando una lista de la clase de elemento-Form
        List<ElementoForm> elementoForms = new ArrayList<>();
        elementoForms.add(username);
        elementoForms.add(password);
        elementoForms.addLast(email);
        elementoForms.add(edad);
        elementoForms.add(experencia);
        elementoForms.add(lenguaje);

        for (ElementoForm e : elementoForms) {
            System.out.println(e.dibujarHtml());
            System.out.println("<br>");
        }
    }

    /*public static void formaAnonima() {
        ElementoForm el = new ElementoForm() {
            @Override
            public String dibujarHtml() {
                return null;
            }
        };
    }*/
}
