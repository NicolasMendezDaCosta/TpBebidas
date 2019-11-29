
package maquinaCafeTe;


public class TeNegro extends Te {

    public TeNegro(int leche, int azucar) {
        super(leche, azucar);
    }
   
    @Override
    public String descripcion (){
       return "Té negro";
   }

    @Override
    float precio() {
        return 70;
    }

    @Override
    String clase() {
      return "Té";
    }
}
