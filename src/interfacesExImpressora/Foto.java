package interfacesExImpressora;

public class Foto implements Imprimivel {

    private String nome;
    private String tipo;


    @Override
    public void imprimir() {
        System.out.println("Sou uma selfie " +nome+ "\t" +tipo);
    }
}