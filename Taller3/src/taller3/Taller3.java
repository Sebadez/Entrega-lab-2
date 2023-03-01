
package taller3;


import java.util.Scanner;
//import java.util.Arrays;

public class Taller3 {

  
    public static void main(String[] args) {
      
        
       
        Scanner larreglo= new Scanner (System.in);
    
          
          
            Scanner imp = new Scanner(System.in);
            Scanner menu= new Scanner(System.in);
        int op;
        int punto;
        do{
             System.out.println("MENU");
             System.out.println("1.EJERCICIO 3.1");
             System.out.println("2.EJERCICIO 3.3");
             System.out.println("0.SALIR");
             System.out.println("INGRESE UNA OPCION: ");
             punto=imp.nextInt();
             
            switch (punto)
            {
                case 1:
                    
                        int cant;
        
        System.out.println("Digite el tamaño del arreglo");
        cant = larreglo.nextInt();
      
        int [] v = new int[cant];
         for ( int i = 0; i < v.length; i++) {
            v[i] = (int)(Math. random() * 100); 
            System.out.println(v[i]);
          
        }
          
          Ejercicio31 arreglo= new Ejercicio31();
          
          System.out.println("La media es: "+arreglo.media(v));
          System.out.println("La mediana es: "+arreglo.mediana(v));
          System.out.print("La moda es: "+arreglo.moda(v)+"\n"); 
          System.out.println("Varianza: " + arreglo.varianza(v));
          System.out.println("Desvianción Estándar: " + arreglo.desviacion(v));
                    
                    break;
                    
                case 2:
                    
        System.out.println("1.SUSTITUCION DE CARACTERES");
        System.out.println("2.INVERTIR LINEA DE CARACTERES");
        System.out.println("0.Salir");
        System.out.println("INGRESE UNA OPCION: ");
        op=imp.nextInt();
        
        switch(op){
         
            case 1:
                int num;
                char moda=(char)0;
                Scanner letras= new Scanner(System.in);
                System.out.println("\n");
                System.out.println("INGRESE EL TAMAÑO DEL ARREGLO:");
                num = letras.nextInt();
                char[] caract = new char[num];
                System.out.println("INGRESE LOS CARACTERES:");
                for(int x=0;x<num;x++){
                System.out.println("Ingrese caracter "+(x+1));
                caract[x]= letras.next().charAt(0);
                }
                System.out.println("\n");
                System.out.println("---ARREGLO---");
                for(int i=0;i<num;i++){
                     System.out.print(caract[i]);
                }
                System.out.println("\n");
                for(int i=0;i<num;i++){
                      int rep=0;
                      int max=0;
                  for(int j=0;j<num;j++){
                      if(caract[i]==caract[j]){
                          rep++;
                      }
                      if(rep>max){
                         moda=caract[i]; 
                      }
                  }   
                }
                System.out.print("EL caracter que mas se repite es:"+moda);
                System.out.println("\n");
                for(int p=0;p<num;p++){
                    for(int q=0;q<num;q++){
                        if(caract[p]=='a'||caract[p]=='e'||caract[p]=='i'||caract[p]=='o'||caract[p]=='u'){
                            caract[p]=moda;
                        }
                    }
                }
                System.out.println("---REMPLAZO DEL ARREGLO---");
                  for(int i=0;i<num;i++){
                     System.out.print(caract[i]);
                }
             
            System.out.println("\n");
            break;

            case 2:
                int numt;
                Scanner letra= new Scanner(System.in);
                System.out.println("\n");
                System.out.println("INGRESE EL TAMAÑO DEL ARREGLO:");
                numt = letra.nextInt();
                char[] inv = new char[numt];
                System.out.println("INGRESE LOS CARACTERES:");

                for(int i=0;i<numt;i++){
                System.out.println("Ingrese caracter "+(i+1));
                inv[i]=letra.next().charAt(0);
                }
                System.out.println("El arreglo es : ");
                 for(int i=0;i<numt;i++){
                     System.out.print(inv[i]+",");
                }
                for(int i=0;i<inv.length/2;i++){
                    char tem=inv[i];
                    inv[i]=inv[inv.length-1-i];
                    inv[inv.length-1-i]=tem;
                   
                }
                System.out.println("------");
                  for(int i=0;i<numt;i++){
                     System.out.print(inv[i]+",");
                }
                  System.out.println("\n");
                break;
           
                
                 
        }   
                default:
                System.out.println("La opción que digito no existe");     
                   
            }
        
       
       }while(punto!=0);
    } 

          
    }
    
   
    
    
    
    
    
    
    
    
    
    
    
    
    
                 
   

