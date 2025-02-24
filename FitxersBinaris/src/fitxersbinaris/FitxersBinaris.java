/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fitxersbinaris;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author thejo
 */
public class FitxersBinaris {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Variables
    int num;
    String rutaFitxer="src\\prova\\dades.bin";
    Scanner sc=new Scanner(System.in);
    
    
    //Ex3
    do{
    System.out.println("Introdueix un numero per guardar-ho en un fitxer");
    num=sc.nextInt();
    
    try(FileOutputStream fos=new FileOutputStream(rutaFitxer);
        DataOutputStream dos= new DataOutputStream(fos)){
        
        dos.writeInt(num);
        
        System.out.println("S'ha escrit les dades correctament");
    }catch (IOException ex) {
            System.out.println("Error en escriure al fitxer binari: " + ex.getMessage());
            }
    
    }while(num>0);
    }
    
}
