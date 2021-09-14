package com.company;

import interfacesExImpressora.Contrato;
import interfacesExImpressora.Documento;
import interfacesExImpressora.Foto;
import interfacesExImpressora.Impressora;

public class Main {

    public static void main(String[] args) {

        Contrato contrato1 = new Contrato();
        Foto foto1 = new Foto();
        Documento documento1 = new Documento();

        Impressora impressora = new Impressora() {
            @Override
            public void imprimirTudo() {
                super.imprimirTudo();
            }
        };
    }
}
