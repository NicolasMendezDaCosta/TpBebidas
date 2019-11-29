package maquinaCafeTe;

import java.util.Scanner;

public class MaquinaCafeTe {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
 
        int pedido;
        int tipoCafe;
        int tipoTe;
        int azucar = 0;
        int leche = 0;
        String pedidoTotal = "";
        double precio = 0;
        double precioTotal = 0;
        double iva = 0.21;
        int totalAzucar = 0;
        int totalLeche = 0;
        
        System.out.println("¡Bienvenidos a la máquina de café y té!");
        System.out.println("¿Cuàntas bebidas desea llevar?");
        Bebidas bebida [] = new Bebidas[sc.nextInt()];
        
        
      for(int i = 0;i<bebida.length;i++){  
        System.out.println("¿Que bebida desea tomar? 1)Café 2)Té");
        pedido = sc.nextInt();
        
        if (pedido == 1){
            System.out.println("¿Que tipo de cafe desea? 1)Normal 2)Expresso 3)Ristretto");
            tipoCafe = sc.nextInt();
            System.out.println("¿Cuántas cucharadas de azúcar desea? 0)0 1)1 2)2 3)3");
            azucar = sc.nextInt();
            System.out.println("¿Cuánto quiere de leche? 0)0 1)1 2)2 3)3");
            leche = sc.nextInt();

            if(tipoCafe==1) {
              bebida [i] = new Normal(azucar, leche);   
            }
            else if (tipoCafe==2){
              bebida [i] = new Expresso(azucar, leche); 
            }
            else if(tipoCafe==3){
              bebida [i] = new Ristretto(azucar, leche); 
            } 
        } 
        
        else if (pedido == 2) {
            System.out.println("¿Que tipo de té desea? 1)Negro 2)Rojo 3)Verde");
            tipoTe = sc.nextInt();
            System.out.println("¿Cuántas cucharadas de azúcar desea? 0)0 1)1 2)2 3)3");
            azucar = sc.nextInt();
            System.out.println("¿Cuánto quiere de leche? 0)0 1)1 2)2 3)3");
            leche = sc.nextInt();
            
            if(tipoTe==1){
            bebida [i] = new TeNegro(azucar,leche);     
            }
            else if (tipoTe==2){
              bebida [i] = new TeRojo(azucar,leche); 
            }
            else if(tipoTe==3){
              bebida [i] = new TeVerde(azucar, leche); 
            }
            else{
                    System.out.println("Operación incorrecta.");
                }
                
            }
            else{
                System.out.println("Operación incorrecta.");
            }
            totalAzucar = totalAzucar+azucar;
            totalLeche = totalLeche+leche;
            
            precio = precio + bebida[i].precio() + (azucar*5) + (leche*5);
            precioTotal = precioTotal + bebida[i].precio() + (azucar*5) + (leche*5) + (precioTotal * iva);
            pedidoTotal = pedidoTotal +" "+ bebida[i].descripcion();
        }
      System.out.println(pedidoTotal+" con "+totalAzucar+" de azucar y "+totalLeche+" de leche");
      System.out.println("SUBTOTAL: $"+precio);
      System.out.println("TOTAL: $"+precioTotal);

      }  
    }
      

