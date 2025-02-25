/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fitxersbinaris;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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

        Scanner sc = new Scanner(System.in);

        //Ex1
        /*
        String rutaFitxer = "src\\prova\\datas.txt";

        try (PrintWriter escriptor = new PrintWriter(new FileWriter(rutaFitxer, true))) {
            while (true) {
                System.out.print("Introdueix una data (dd mm aaaa) o -1 per sortir: ");
                int dia = sc.nextInt();
                if (dia == -1) {
                    break;
                }
                int mes = sc.nextInt();
                int any = sc.nextInt();

                Data data = new Data(dia, mes, any);
                escriptor.println(data);
            }
        } catch (IOException e) {
            System.out.println("Error en escriure al fitxer: " + e.getMessage());
        }
        sc.nextLine();
        */
        
        //Ex2
        
        /*
        String rutaFitxer = "src\\prova\\datas.txt";
        int totalRegistres = 0;
        boolean trobada = false;

        System.out.print("Introdueix la data a buscar (dd/mm/aaaa): ");
        String dataCercada = sc.nextLine();

        try (BufferedReader lector = new BufferedReader(new FileReader(rutaFitxer))) {
            String linia;
            while ((linia = lector.readLine()) != null) {
                totalRegistres++;
                if (linia.equals(dataCercada)) {
                    trobada = true;
                }
            }
        } catch (IOException e) {
            System.out.println("Error en llegir el fitxer: " + e.getMessage());
        }

        System.out.println("Total de registres: " + totalRegistres);
        if (trobada) {
            System.out.println("Data trobada!");
        } else {
            System.out.println("Data no trobada.");
        }
        */

        //Ex3
        /*
    int num;
    String rutaFitxer="src\\prova\\dades.bin";
    
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
    
        sc.nextLine();

         */
        //Ex4
        /*
    System.out.print("Introdueix el nom del fitxer: ");
        String nomFitxer = sc.nextLine();
		
        List<Integer> llistaNumeros = new ArrayList<>();
		
        try {
		BufferedReader lector = new BufferedReader(new FileReader(nomFitxer));
		String linia;
			
	while ((linia = lector.readLine()) != null) {
	try {
		int numero = Integer.parseInt(linia.trim());
		llistaNumeros.add(numero);
            } catch (NumberFormatException e) {
		System.out.println("S'ha ignorat una línia no numèrica: " + linia);
            }
	}
			
	lector.close();
		} catch (IOException e) {
			System.out.println("Error en llegir el fitxer: " + e.getMessage());
		}
		
		// Convertir la llista a array
		int[] arrayNumeros = new int[llistaNumeros.size()];
		for (int i = 0; i < llistaNumeros.size(); i++) {
			arrayNumeros[i] = llistaNumeros.get(i);
		}
		
		// Imprimir els números llegits
		System.out.println("Números llegits:");
		for (int numero : arrayNumeros) {
			System.out.println(numero);
		}
         */
        
        //Ex5
        /*
        String rutaFitxer = "persones.dat";
        // Escriure persones al fitxer
        char opcio='N';
        
        do{
            
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(rutaFitxer))) {
			for (int i = 0; i < 4; i++) {
				System.out.print("Nom: ");
				String nom = sc.nextLine();
				System.out.print("Cognoms: ");
				String cognoms = sc.nextLine();
				System.out.print("Sexe: ");
				String sexe = sc.nextLine();
				System.out.print("Edat: ");
				int edat = sc.nextInt();
				
				oos.writeObject(new Persona(nom, cognoms, sexe, edat));
                                
                                System.out.println("Vols introduïr un altre persona?: (S/N)");
                                opcio=sc.next().charAt(0);
                                sc.nextLine();
                                
			}
		} catch (IOException e) {
			System.out.println("Error en escriure el fitxer: " + e.getMessage());
		}
        }while(opcio=='S'|opcio=='s');
		
		// Llegir persones del fitxer
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(rutaFitxer))) {
			System.out.println("\nPersones desades:");
			while (true) {
				Persona p = (Persona) ois.readObject();
				System.out.println(p);
			}
		} catch (EOFException e) {
			System.out.println("Final del fitxer.");
		} catch (IOException | ClassNotFoundException e) {
			System.out.println("Error en llegir el fitxer: " + e.getMessage());
		}
*/
    }

}
