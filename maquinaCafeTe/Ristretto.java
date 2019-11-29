
package maquinaCafeTe;

public class Ristretto  extends Cafe {

    public Ristretto(int leche, int azucar) {
        super(leche, azucar);
    }

  @Override
    public String descripcion() {
      return "Café ristretto"; //Retorno la descripción;
      
      
    }

    @Override
    public float precio() {
        return 110; // Acá retorna el precio del café expresso;
    }

    @Override
    public String clase() {
        return "Café";
    }
}
