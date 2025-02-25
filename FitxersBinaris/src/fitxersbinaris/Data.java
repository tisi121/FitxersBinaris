/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fitxersbinaris;

/**
 *
 * @author thejo
 */
public class Data {
    int dia, mes, any;
	
	public Data(int dia, int mes, int any) {
		this.dia = dia;
		this.mes = mes;
		this.any = any;
	}

	@Override
	public String toString() {
		return dia + "/" + mes + "/" + any;
	}
}
