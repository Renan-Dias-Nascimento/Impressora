package interfacesExImpressora;

import java.util.ArrayList;

public abstract class Impressora {

    private ArrayList<Imprimivel> lista = new ArrayList<>();


    public void imprimirTudo() {
        lista.forEach(Imprimivel::imprimir);
        lista = new ArrayList<>();
    }

    public void adicionarImprimivel(Imprimivel umImprimivel) {
        lista.add(umImprimivel);
    }
}
