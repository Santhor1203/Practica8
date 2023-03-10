
package controlescolar2;



public class InformacioAlumno {
     static  String Nom, naci, tel, dire, Nm,sem,m1,m2,m3,m4,m5,m6  ;
     
    

    public  void Informacionpersonal(String Nom, String naci, String tel, String dire) {
       System.out.print("¿Cual es tu nombre completo?\n");
       System.out.print("¿Cual es tu fecha de naimiento?\n");
       System.out.print("¿cual es tu numero telefonico?\n");
       System.out.print("¿Cual es tu dirección?\n");
             
    }  
    public void InformacionAcademica (String Nm, String sem){
        System.out.print ("¿Cual es tu numero de cuenta?\n");
        System.out.print ("¿Que semestre cursas?\n");
    }
    public void Horarios (String m1,String m2,String m3,String m4, String m5, String m6){
            System.out.print("¿Cuales son tus materias?\n");
            
    }

}