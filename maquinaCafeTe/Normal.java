
package maquinaCafeTe;

public class Normal extends Cafe {

    public Normal(int leche, int azucar) {
        super(leche, azucar);
    }

    @Override
    public String descripcion() {
      return "Café normal"; //Retorno la descripción; 
    }

    @Override
    public float precio() {
        return 90; // Acá retorna el precio del café expresso;
    }

    @Override
    public String clase() {
        return "Café";
    }
   
    
}
