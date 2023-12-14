package com.cmc.directorio.test;

import com.cmc.directorio.entidades.*;

public class TestTelefono4 {
	public static void main(String[] args) {
		Telefono telf1 = new Telefono("movi", "098234233", 10);
		Telefono telf2 = new Telefono("claro", "098234244", 20);
		Telefono telf3 = new Telefono("claro", "098234255", 30);
		Telefono telf4 = new Telefono("claro", "098234255", 30);
		AdminTelefono at = new AdminTelefono();
		int contarClaro = at.contarClaro(telf1, telf2, telf3, telf4);
		System.out.println(contarClaro);
	}
}
