/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fitxersbinaris;

import java.io.Serializable;

/**
 *
 * @author thejo
 */
public class Persona implements Serializable{
    String nom, cognoms, sexe;
	int edat;

	public Persona(String nom, String cognoms, String sexe, int edat) {
		this.nom = nom;
		this.cognoms = cognoms;
		this.sexe = sexe;
		this.edat = edat;
	}

	@Override
	public String toString() {
		return nom + " " + cognoms + ", " + sexe + ", " + edat + " anys";
	}
}
