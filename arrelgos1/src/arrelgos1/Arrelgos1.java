
package arrelgos1;


import java.util.Scanner;

public class Arrelgos1 {

  public static void main(String[] args) {
     
      
        Scanner opcion= new Scanner (System.in);
        int op;
       
       
        do {
            
                        
            System.out.println("------------Menu Arreglos--------------");
            System.out.println("Seleccione su metodo de ordenamiento");
            System.out.println("");
            System.out.println("1.Metodo Burbuja");
            System.out.println("2.Metodo Insercion");
            System.out.println("3.Metodo Seleccion");
            System.out.println("4.Metodo Mergesort");
            System.out.println("0.Salir programa");

            System.out.println("Digite el metodo de ordenamiento a realizar");
            op= opcion.nextInt();

         

            switch (op) {

                case 1:
                            
                Scanner burbuja= new Scanner (System.in);
                int burbujan;
                
                         
                System.out.println("Digite la cantidad de elementos del arreglo: ");
                burbujan = burbuja.nextInt();
                        
                double [] arreglob = new double [burbujan];
                        
                for(int i=0; i<burbujan;i++){
                    arreglob[i] = (double) (Math.random()*100);
                        }
                // metodo burbuja
                Metodos burbujao = new Metodos();
                burbujao.burbuja(arreglob);
                
                System.out.print("Orden en forma creciente: ");
                for(int i=0;i<arreglob.length;i++){
                System.out.print(arreglob[i]+" | ");
                }
                System.out.println("");
                System.out.print("Orden en forma decreciente: ");
                for(int i=(arreglob.length-1);i>=0;i--){
                System.out.print(arreglob[i]+" | ");
                }
                System.out.println("");
                
                

                break;

                case 2:
                               
                Scanner insercion= new Scanner (System.in);
                      
                int insercionn;
                        
                System.out.println("Digite la cantidad de elementos del arreglo: ");
                insercionn = insercion.nextInt();
                        
                double [] arregloi = new double [insercionn];
                        
                for(int i=0; i<insercionn;i++){
                arregloi[i] = (double) (Math.random()*100);
                }
                //Metodo insercion
                Metodos inserciono = new Metodos();
                inserciono.insersion(arregloi);
                        
                System.out.print("Orden en forma creciente: ");
                for(int i=0;i<insercionn;i++){
                System.out.print(arregloi[i]+" | ");
                }
                System.out.println("");
                System.out.print("Orden en forma decreciente: ");
                for(int i=(insercionn-1);i>=0;i--){
                System.out.print(arregloi[i]+" | ");
                }
                System.out.println("");
                                            
                break;
                       
                case 3:
                            
                Scanner seleccion= new Scanner (System.in); 
                        
                int seleccionn;

                
                System.out.println("Digite la cantidad de elementos del arreglo: ");
                seleccionn = seleccion.nextInt();
                
                double [] arreglos = new double [seleccionn];
                
                for(int i=0; i<seleccionn;i++){
                arreglos[i] = (double) (Math.random()*100);    
                }
                
                Metodos selecciono = new Metodos();
                selecciono.seleccion(arreglos);
                        
                System.out.println("");
                System.out.print("Ordenado forma creciente: ");
                for (int i=0; i<arreglos.length ;i++){
                    System.out.print(arreglos[i]+" | ");                     
                }
                System.out.println("");
                System.out.print("Orden en forma decreciente: ");
                for(int i=(arreglos.length-1);i>=0;i--){
                System.out.print(arreglos[i]+" | ");
                }
                System.out.println("");
                
                break;
                
                case 4:
                                        
                Scanner merges= new Scanner (System.in); 
                        
                int mergen;
                
                System.out.println("Digite la cantidad de elementos del arreglo: ");
                mergen = merges.nextInt();
                
                int [] arreglom = new int [mergen];
                
                for(int i=0; i<mergen;i++){
                arreglom[i] = (int) (Math.random()*100);    
                }
                
                Metodos mergeo = new Metodos();
                mergeo.sort(arreglom, 0, mergen-1);
                
               
                System.out.println("");
                System.out.print("Ordenado forma creciente: ");
                for (int i=0; i<arreglom.length ;i++){
                    System.out.print(arreglom[i]+" | ");                     
                }
                System.out.println("");
                System.out.print("Orden en forma decreciente: ");
                for(int i=(arreglom.length-1);i>=0;i--){
                System.out.print(arreglom[i]+" | ");
                }
                System.out.println("");
               
                break;

            default: System.out.println("Digite un valor valido");

                        
            }
        } while (op !=0);
    }
    
}
