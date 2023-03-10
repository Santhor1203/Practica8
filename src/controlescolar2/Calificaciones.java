
package controlescolar2;



public class Calificaciones {
 static int c1, c2, c3, c4, c5, c6;
 static double prom;
 
    public void Materias(int c1,int c2,int c3,int c4,int c5,int c6, double prom ){
     
        System.out.print("Cuales son las calificaciones de tus materias?\n");   
    }
    public void Promedio(int c1,int c2,int c3,int c4,int c5,int c6, double prom){
        prom=(c1+c2+c3+c4+c5+c6)/6;
        System.out.print("Tu promedio es"+prom);
    
    }    
}   

