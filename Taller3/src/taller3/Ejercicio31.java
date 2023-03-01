package taller3;

public class Ejercicio31

{
     public int cant;
     public double sumatoria=0;
     public double varianza;
     public double mediana;
     public float desviacion;
     public double moda;
     public int mR;
     public double rango;
     public double media;
 
    
     public double media(int v[])
             
    {
        int lenght = v.length;
        
         for (int i = 0; i < lenght; i++) {
           
            sumatoria += v[i];
        }
          
          media= sumatoria / lenght;
          
          return media;
    
    }
      public double mediana(int v[])
    {
        
       int mitad = v.length / 2;
       
        if (v.length % 2 == 0) {
            mediana = (v[mitad - 1] + v[mitad]) / 2;
        } else {
             mediana = v[mitad];
        }
      return mediana;
    
    }
     
      public double moda(int v[])
    {
        
       for(int i=0; i<v.length; i++)
    {
        int nR= 0;
        for(int j=0; j<v.length; j++)
        {
            if(v[i]==v[j])
            {
                nR++;
            }   
            if(nR>mR)
            {
                moda= v[i];
                mR= nR;
            }   
        }
    }   
      return moda;
    
    }
       public double varianza(int v[])
    {
        
         for(int i = 0 ; i < v.length; i++){
   
         rango = Math.pow(v[i] - media, 2f);
         varianza = varianza + rango;
        }
       varianza= varianza / (v.length-1);
         return varianza;
    
    }
       public double desviacion(int v[])
    {
        
         for(int i = 0 ; i < v.length; i++){
   
         rango = Math.pow(v[i] - media, 2f);
         varianza = varianza + rango;
        }
         varianza = varianza / (v.length-1);
         desviacion=(float) Math.sqrt(varianza);
         
         return desviacion;
    
    }
  
    
   
}


      

    
     