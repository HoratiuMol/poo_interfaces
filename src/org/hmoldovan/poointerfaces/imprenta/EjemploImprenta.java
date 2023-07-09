package org.hmoldovan.poointerfaces.imprenta;

import org.hmoldovan.poointerfaces.imprenta.modelo.*;

public class EjemploImprenta {
    public static void main(String[] args) {

        Curriculo cv=new Curriculo(new Persona("John", "Doe"),"Ingeniero de sistemas","Resumen laboral");
        cv.addExperiencias("Java");
        cv.addExperiencias("Oracle DBA");
        cv.addExperiencias("Spring Framework");
        cv.addExperiencias("Desarrollador fullstack");
        cv.addExperiencias("Angualr");

        Libro libro= new Libro(new Persona("Erich", "Gamma"),"Patrones de diseño:" +
                "Elem.Reusables POO", Genero.PROGRAMACION);
        libro.addPagina(new Pagina("Patrón Singleton"))
                .addPagina(new Pagina("Patrón Observador"))
                .addPagina(new Pagina("Patrón Factory"))
                .addPagina(new Pagina("Patrón Composite")).addPagina(new Pagina("Patrón Fascade"));

        Informe informe= new Informe(new Persona("martín", "Fowler"), new Persona("james","Rhodes"), "Estudio sobre microservicioes");
        imprimir(cv);
        imprimir(informe);
        imprimir(libro);
    }

    public static void imprimir(Imprimible imprimible){
        System.out.println(imprimible.imprimir());
    }
}
