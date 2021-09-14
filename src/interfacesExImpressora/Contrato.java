package interfacesExImpressora;

public class Contrato implements Imprimivel {

    private String nome;
    private String tipo;


    @Override
    public void imprimir() {
        System.out.println("Sou um contrato muito legal \t" +nome+ "\t" +tipo);
    }
}
