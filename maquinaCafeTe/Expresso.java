
package maquinaCafeTe;


public class Expresso extends Cafe {

    public Expresso(int leche, int azucar) {
        super(leche, azucar);
    }

    @Override
    public String descripcion() {
      return "Café expresso"; //Retorno la descripción;
      
      
    }

    @Override
    public float precio() {
        return 100; // Acá retorna el precio del café expresso;
    }

    @Override
    public String clase() {
        return "Café";
    }

}
