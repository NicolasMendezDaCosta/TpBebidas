
package maquinaCafeTe;


public class TeRojo extends Te {

    public TeRojo(int leche, int azucar) {
        super(leche, azucar);
    }

       @Override
    public String descripcion (){
       return "Té rojo";
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
