
package arrelgos1;


public class Metodos {
    
    
  public void burbuja (double [] array)
   {
     double aux;
     boolean cambios=false;
     
     while(true)
     {
       cambios=false;  
       for(int i=1; i<array.length;i++)
       {
        if(array[i]<array[i-1])
        {
           aux=array[i];
           array[i]= array[i-1];
           array[i-1] = aux;
           cambios=true;
        }
       }
       if(cambios==false)
           break;
     }
   }
   public void insersion (double[] array){
     int ubi;
     double auxi;
     
     for(int i=0;i<array.length;i++){
                ubi = i;
                auxi = array[i];
                                                    
                while((ubi>0)&&(array[ubi-1]>auxi)){
                array[ubi]= array[ubi-1];
                ubi--;
                }
                array[ubi] = auxi;
                }
   
   
   }
   public void seleccion(double[] array){
       
   int pos;
   double menor, temp;   
       
   for (int i=0;i<array.length-1;i++){
                 menor=array[i];
                 pos=i;
                 for(int j=i+1; j<array.length;j++){
                     if (array[j]<menor){
                         menor = array[j];
                         pos = j;
                        }                     
                    }  
                 if(pos!=i){
                     temp=array[i];
                     array[i]=array[pos];
                     array[pos]=temp;
                    }
                }
   
   }
   public void sort(int [] array, int izquierdo, int derecho){
       if(izquierdo<derecho){
           int media =(izquierdo+derecho)/2;
           
           sort(array, izquierdo, media);
           sort(array, media+1, derecho);
           
           merge(array, izquierdo, media, derecho);
       }
   }
   public void merge(int []array, int izquierdo, int media, int derecho){
        
        int n1 = media - izquierdo + 1;
        int n2 = derecho - media;

        int leftArray[] = new int [n1];
        int rightArray[] = new int [n2];

        for (int i=0; i < n1; i++) {
        leftArray[i] = array[izquierdo+i];
        }
        
        for (int j=0; j < n2; j++) {
        rightArray[j] = array[media + j + 1];
        }

        int i = 0, j = 0;

        int k = izquierdo;

        while (i < n1 && j < n2) {
          if (leftArray[i] <= rightArray[j]) {
            array[k] = leftArray[i];
            i++;
            } else {
            array[k] = rightArray[j];
            j++;
            }   k++;
        }

  
        while (i < n1) {
          array[k] = leftArray[i];
          i++;
          k++;
        }
  
        while (j < n2) {
          array[k] = rightArray[j];
          j++;
          k++;
        }
   }


}
