/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controlescolar2;

import java.util.Scanner;

import static controlescolar2.InformacioAlumno.Nom;
import static controlescolar2.InformacioAlumno.tel;
import static controlescolar2.InformacioAlumno.naci;
import static controlescolar2.InformacioAlumno.dire;
import static controlescolar2.InformacioAlumno.Nm;
import static controlescolar2.InformacioAlumno.sem;
import static controlescolar2.InformacioAlumno.m1;
import static controlescolar2.InformacioAlumno.m2;
import static controlescolar2.InformacioAlumno.m3;
import static controlescolar2.InformacioAlumno.m4;
import static controlescolar2.InformacioAlumno.m5;
import static controlescolar2.InformacioAlumno.m6;
import static controlescolar2.Calificaciones.c1;
import static controlescolar2.Calificaciones.c2;
import static controlescolar2.Calificaciones.c3;
import static controlescolar2.Calificaciones.c4;
import static controlescolar2.Calificaciones.c5;
import static controlescolar2.Calificaciones.c6;
import static controlescolar2.Calificaciones.prom;
        
public class ControlEscolar2{
    
        
    public static void main(String[] args) {
   
        InformacioAlumno inf= new InformacioAlumno();
        inf.Informacionpersonal(Nom,naci,tel,dire);
         Scanner stdIn = new Scanner(System.in);
            Nom = stdIn.nextLine(); 
            tel = stdIn.nextLine();
            naci = stdIn.nextLine();
           dire = stdIn.nextLine();
         
     InformacioAlumno dat= new InformacioAlumno();
     dat.InformacionAcademica(Nm, sem);
           Scanner dato =new Scanner (System.in);
           Nm=dato.nextLine();
           sem=dato.nextLine();
     InformacioAlumno hor= new InformacioAlumno();
         hor.Horarios(m1, m2, m3, m4, m5, m6);
           Scanner mat= new Scanner (System.in);
           m1=mat.nextLine();
           m2=mat.nextLine();
           m3=mat.nextLine();
           m4=mat.nextLine();
           m5=mat.nextLine();
           m6=mat.nextLine();
               
     Calificaciones cal=new Calificaciones();
         cal.Materias(c1,c2,c3,c4,c5,c6,prom); 
         Scanner cali=new Scanner (System.in);
           c1=cali.nextInt();
           c2=cali.nextInt();
           c3=cali.nextInt();
           c4=cali.nextInt();
           c5=cali.nextInt();
           c6=cali.nextInt();
     Calificaciones prome=new Calificaciones();
     prome.Promedio(c1, c2, c3, c4, c5, c6, prom);
           
    }

}
