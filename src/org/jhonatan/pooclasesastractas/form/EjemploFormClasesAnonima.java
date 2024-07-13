package org.jhonatan.pooclasesastractas.form;

import java.util.Arrays;
import java.util.List;

import org.jhonatan.pooclasesastractas.form.elementos.ElementoForm;
import org.jhonatan.pooclasesastractas.form.elementos.InputForm;
import org.jhonatan.pooclasesastractas.form.elementos.SelectForm;
import org.jhonatan.pooclasesastractas.form.elementos.TextAreaForm;
import org.jhonatan.pooclasesastractas.form.elementos.select.Opcion;

public class EjemploFormClasesAnonima {
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
        lenguaje.addOpcion(java)
                .addOpcion(new Opcion("2", "Python"))
                .addOpcion(new Opcion("3", "C++"))
                .addOpcion(new Opcion("4", "JavaScript"))
                .addOpcion(new Opcion("5", "PHP"));

        // ejemplo de clase anonima
        ElementoForm saludar = new ElementoForm("saludo") {
            @Override
            public String dibujarHtml() {
                return "<input disabled name = '" + this.nombre + "' value = \"" + this.valor + "\">";
            }
        };

        // establecemos valores
        saludar.setValor("Hola que tal ese campo esta desabilitado");
        username.setValor("john.doe");
        password.setValor("ab1c2d");
        email.setValor("juan@gmail.com");
        edad.setValor("45");
        experencia.setValor("...mas de 10 años de experencia...");
        java.setSelected(true);

        // creando una lista de la clase de elemento-Form
        List<ElementoForm> elementoForms = Arrays.asList(username,
                password, email, edad, experencia, lenguaje, saludar);

        elementoForms.forEach(e -> {
            System.out.println(e.dibujarHtml());
            System.out.println("<br>");
        });
    }
}
