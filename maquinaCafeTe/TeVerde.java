
package maquinaCafeTe;


public class TeVerde extends Te {

    public TeVerde(int leche, int azucar) {
        super(leche, azucar);
    }

    @Override
    public String descripcion (){
       return "Té verde";
   }

    @Override
    float precio() {
        return 75;
    }

    @Override
    String clase() {
      return "Té";
    }
    
}
