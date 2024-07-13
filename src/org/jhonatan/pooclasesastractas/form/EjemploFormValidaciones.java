package org.jhonatan.pooclasesastractas.form;

import java.util.Arrays;
import java.util.List;

import org.jhonatan.pooclasesastractas.form.elementos.ElementoForm;
import org.jhonatan.pooclasesastractas.form.elementos.InputForm;
import org.jhonatan.pooclasesastractas.form.elementos.SelectForm;
import org.jhonatan.pooclasesastractas.form.elementos.TextAreaForm;
import org.jhonatan.pooclasesastractas.form.elementos.select.Opcion;
import org.jhonatan.pooclasesastractas.form.validador.EmailValidador;
import org.jhonatan.pooclasesastractas.form.validador.LargoValidador;
import org.jhonatan.pooclasesastractas.form.validador.NoNuloValidador;
import org.jhonatan.pooclasesastractas.form.validador.NumeroValidador;
import org.jhonatan.pooclasesastractas.form.validador.RequeridoValidador;

public class EjemploFormValidaciones {
    public static void main(String[] args) {
        // ejemploObjetos();
        ejemploObjetosOptimizado();

    }

    public static void ejemploObjetos() {
        // creando un objeto de tipo InputForm
        InputForm username = new InputForm("username");
        username.addValidador(new RequeridoValidador());

        InputForm password = new InputForm("clave", "password");
        password.addValidador(new RequeridoValidador())
                .addValidador(new LargoValidador(6, 12));

        InputForm email = new InputForm("email", "email");
        email.addValidador(new RequeridoValidador())
                .addValidador(new EmailValidador());

        InputForm edad = new InputForm("edad", "numbre");
        edad.addValidador(new NumeroValidador());

        // creando un objeto de tipo de textArea
        TextAreaForm experencia = new TextAreaForm("exp", 5, 5);

        SelectForm lenguaje = new SelectForm("lenguaje");
        lenguaje.addValidador(new NoNuloValidador());

        Opcion java = new Opcion("1", "Java");
        // Opcion html = new Opcion("4", "Html");
        lenguaje.addOpcion(java)
                .addOpcion(new Opcion("2", "Python"))
                .addOpcion(new Opcion("3", "C++"))
                // .addOpcion(new Opcion("4", "Html").setSelected())
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
        username.setValor("");
        password.setValor("");
        email.setValor("");
        edad.setValor("45kk");
        experencia.setValor("...mas de 10 años de experencia...");
        // java.setSelected(true);
        // html.setSelected(true);

        // creando una lista de la clase de elemento-Form
        List<ElementoForm> elementoForms = Arrays.asList(username,
                password, email, edad, experencia, lenguaje, saludar);

        elementoForms.forEach(e -> {
            System.out.println(e.dibujarHtml());
            System.out.println("<br>");
        });

        // mostramos los errores
        elementoForms.forEach(e -> {
            if (!e.esValido()) {
                e.getErrores().forEach(err -> {
                    System.out.println(err);
                });
            }
        });
    }

    public static void ejemploObjetosOptimizado() {
        // creando un objeto de tipo InputForm
        InputForm username = new InputForm("username");
        username.addValidador(new RequeridoValidador());

        InputForm password = new InputForm("clave", "password");
        password.addValidador(new RequeridoValidador());
        password.addValidador(new LargoValidador(6, 12));

        InputForm email = new InputForm("email", "email");
        email.addValidador(new RequeridoValidador())
                .addValidador(new EmailValidador());

        InputForm edad = new InputForm("edad", "numbre");
        edad.addValidador(new NumeroValidador());

        // creando un objeto de tipo de textArea
        TextAreaForm experencia = new TextAreaForm("exp", 5, 5);

        SelectForm lenguaje = new SelectForm("lenguaje");
        lenguaje.addValidador(new NoNuloValidador());

        Opcion java = new Opcion("1", "Java");
        // Opcion html = new Opcion("4", "Html");
        lenguaje.addOpcion(java)
                .addOpcion(new Opcion("2", "Python"))
                .addOpcion(new Opcion("3", "C++"))
                .addOpcion(new Opcion("4", "Html").setSelected())
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
        username.setValor("");
        password.setValor("12345");
        email.setValor("joefloresgmail.com");
        edad.setValor("4j5");
        experencia.setValor("...mas de 10 años de experencia...");
        // java.setSelected(true);
        // html.setSelected(true);

        // creando una lista de la clase de elemento-Form
        List<ElementoForm> elementoForms = Arrays.asList(username,
                password, email, edad, experencia, lenguaje, saludar);

        elementoForms.forEach(e -> {
            System.out.println(e.dibujarHtml());
            System.out.println("<br>");
        });

        imprimir(elementoForms);
        // imprimirErrores(elementoForms);
    }

    // metodo para imprimir
    public static void imprimir(List<ElementoForm> elementoForms) {
        // mostramos los errores
        elementoForms.forEach(e -> {
            if (!e.esValido()) {
                e.getErrores().forEach(System.out::println);
            }
        });
    }

    public static void imprimirErrores(List<ElementoForm> elementoForms) {
        // mostramos los errores
        elementoForms.forEach(e -> {
            if (!e.esValido()) {
                e.getErrores().forEach(err -> {
                    System.out.println(e.getNombre() + ": " + err);
                });
            }
        });
    }

}
