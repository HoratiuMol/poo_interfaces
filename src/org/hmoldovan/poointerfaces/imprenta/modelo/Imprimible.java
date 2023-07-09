package org.hmoldovan.poointerfaces.imprenta.modelo;

public interface Imprimible {
    default String imprimir(){
        return "Imprimiendo un valor";
    }
}
