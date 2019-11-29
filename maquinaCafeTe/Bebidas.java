package maquinaCafeTe;

public abstract class Bebidas {

    abstract String descripcion();
    abstract float precio();
    abstract String clase();
    
    private int leche;
    private int azucar;

    public Bebidas(int leche, int azucar) {
        this.azucar = azucar;
        this.leche = leche;

    }
}
