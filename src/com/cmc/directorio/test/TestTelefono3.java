package com.cmc.directorio.test;

import com.cmc.directorio.entidades.*;

public class TestTelefono3 {
	public static void main(String args[]) {
		Telefono telf1 = new Telefono("movi", "098234233", 10);
		Telefono telf2 = new Telefono("movi", "098234244", 20);
		Telefono telf3 = new Telefono("claro", "098234255", 30);
		AdminTelefono at = new AdminTelefono();
		int contarMovi = at.contarMovi(telf1, telf2, telf3);
		System.out.println(contarMovi);
	}
}
