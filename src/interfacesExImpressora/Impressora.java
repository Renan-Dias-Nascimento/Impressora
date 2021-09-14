package interfacesExImpressora;

import java.util.ArrayList;

public abstract class Impressora {

    private ArrayList<Imprimivel> lista;


    public void imprimirTudo() {
        lista.forEach(System.out::println);
    }

    public void adicionarImprimivel(Imprimivel umImprimivel) {
        lista.add(umImprimivel);
    }
}
