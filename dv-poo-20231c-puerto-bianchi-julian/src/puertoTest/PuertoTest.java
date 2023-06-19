package puertoTest;

import domain.Amarre;
import domain.Barco;
import domain.Catamaran;
import domain.Cliente;
import domain.Puerto;
import domain.Velero;
import domain.MotoAcuatica;
import domain.Alquiler;
import domain.Anfibio;
import domain.Lancha;
import domain.Yate;

public class PuertoTest {

	public static void main(String[] args) {
		
		//Instancio Puerto
		Puerto puerto = new Puerto();
		
		//Instancio Amarres
		Amarre amarre0 = new Amarre(0,0);
		Amarre amarre1 = new Amarre(1,1);
		Amarre amarre2 = new Amarre(2,2);
		Amarre amarre3 = new Amarre(3,3);
		Amarre amarre4 = new Amarre(4,4);
		Amarre amarre5 = new Amarre(5,5);
		Amarre amarre6 = new Amarre(6,6);
		Amarre amarre7 = new Amarre(7,7);
		Amarre amarre8 = new Amarre(8,8);
		Amarre amarre9 = new Amarre(9,9);
		
		//Agrego Amarres
		puerto.addAmarre(amarre0);
		puerto.addAmarre(amarre1);
		puerto.addAmarre(amarre2);
		puerto.addAmarre(amarre3);
		puerto.addAmarre(amarre4);
		puerto.addAmarre(amarre5);
		puerto.addAmarre(amarre6);
		puerto.addAmarre(amarre7);
		puerto.addAmarre(amarre8);
		puerto.addAmarre(amarre9);
		
		//Instancio Clientes
		Cliente cliente1 = new Cliente("Julian", "Bianchi", 39296415);
		Cliente cliente2 = new Cliente("Paula", "Sultani", 39530210);
		Cliente cliente3 = new Cliente("Graciela", "Bottaioli", 13275279);
		Cliente cliente4 = new Cliente("Claudio", "Bianchi", 13100240);
		
		//Instancio Barcos
		Barco velero1 = new Velero("7-BA-1-001-21", 25.00, 2021);
		Barco velero2 = new Velero("7-BA-1-002-19", 25.00, 2019);
		Barco catamaran1 = new Catamaran("2-BA-1-003-95", 70.00, 1995);
		Barco yate1 = new Yate("2-BA-1-004-23", 170.00, 2023);
		Barco motoacuatica1 = new MotoAcuatica ("7-BA-1-005-17", 2.00, 2017);
		Barco lancha1 = new Lancha ("6-BA-1-006-13", 7.00, 2013);
		Barco anfibio1 = new Anfibio ("4-BA-1-007-20", 10.00, 2020);
		Barco anfibio2 = new Anfibio ("4-BA-1-008-11", 11.00, 2011);
		Barco yate2 = new Yate("2-BA-1-009-97", 210.00, 1997);
		Barco lancha2 = new Lancha ("6-BA-1-010-07", 6.00, 2007);
		
		//Instancio Alquileres
		Alquiler alquiler0 = new Alquiler(cliente1, amarre0, velero1);
		Alquiler alquiler1 = new Alquiler(cliente1, amarre1, yate1);
		Alquiler alquiler2 = new Alquiler(cliente1, amarre2, anfibio1);
		Alquiler alquiler3 = new Alquiler(cliente2, amarre3, velero2);
		Alquiler alquiler4 = new Alquiler(cliente3, amarre4, catamaran1);
		Alquiler alquiler5 = new Alquiler(cliente4, amarre5, lancha1);
		Alquiler alquiler6 = new Alquiler(cliente3, amarre6, yate2);
		Alquiler alquiler7 = new Alquiler(cliente2, amarre7, lancha2);
		Alquiler alquiler8 = new Alquiler(cliente1, amarre8, motoacuatica1);
		Alquiler alquiler9 = new Alquiler(cliente4, amarre9, anfibio2);
		
		alquiler0.iniciarAlquiler();
		alquiler1.iniciarAlquiler();
		alquiler2.iniciarAlquiler();
		alquiler3.iniciarAlquiler();
		alquiler4.iniciarAlquiler();
		alquiler5.iniciarAlquiler();
		alquiler6.iniciarAlquiler();
		alquiler7.iniciarAlquiler();
		alquiler8.iniciarAlquiler();
		alquiler9.iniciarAlquiler();
		
		//Agrego alquileres
		puerto.addAlquiler(alquiler0);
		puerto.addAlquiler(alquiler1);
		puerto.addAlquiler(alquiler2);
		puerto.addAlquiler(alquiler3);
		puerto.addAlquiler(alquiler4);
		puerto.addAlquiler(alquiler5);
		puerto.addAlquiler(alquiler6);
		puerto.addAlquiler(alquiler7);
		puerto.addAlquiler(alquiler8);
		puerto.addAlquiler(alquiler9);
		
		//Muestro datos
		System.out.println("__________________________________________________________________________________________");
		System.out.println("-------------------------------------LISTADO AMARRES--------------------------------------");
		System.out.println("__________________________________________________________________________________________");
		puerto.listarAmarres();
		System.out.println("__________________________________________________________________________________________");
		System.out.println("-----------------------------------LISTADO ALQUILERES-------------------------------------");
		System.out.println("__________________________________________________________________________________________");
		puerto.listarAlquileresEnCurso();
		
		//Finalizo algunos alquileres indicando el dia final
		System.out.println("__________________________________________________________________________________________");
		System.out.println("-------------------------------Tarifas a pagar finalizados--------------------------------");
		System.out.println("__________________________________________________________________________________________");
		alquiler3.finalizarAlquiler(21);
		alquiler5.finalizarAlquiler(45);
		

		//Muestro datos luego de finalizar alquileres
		System.out.println("__________________________________________________________________________________________");
		System.out.println("-------------------------------------LISTADO AMARRES--------------------------------------");
		System.out.println("__________________________________________________________________________________________");
		puerto.listarAmarres();
		System.out.println("__________________________________________________________________________________________");
		System.out.println("-----------------------------------LISTADO ALQUILERES-------------------------------------");
		System.out.println("__________________________________________________________________________________________");
		puerto.listarAlquileresEnCurso();
		
	}
}

