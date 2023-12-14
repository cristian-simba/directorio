package com.cmc.directorio.entidades;

public class AdminContacto {
    public String buscarMasPesado(Contacto ct1, Contacto ct2) {
        if (ct1.getPeso() == ct2.getPeso()) {
            return "Tienen el mismo peso";
        } else {
        	if (ct1.getPeso() > ct2.getPeso()) {
                return "El mas pesado es: " + ct1.getNombre();
            } else {
                return "El mas pesado es: " + ct2.getNombre();
            }
        }
    }
    
    public boolean compararOperadoras(Contacto ct1, Contacto ct2) {
    	if(ct1.getTelefono().getOperadora() == ct2.getTelefono().getOperadora()) {
    		return true;
    	}else {    		
    		return false;
    	}
    }
    
    public void activarUsuario(Contacto ct1) {
    	if(ct1.getTelefono().isTieneWhatsapp() == true) {
    		ct1.setActivo(true);;
    		System.out.println("Se Activo");
    	}else {
    		System.out.println("No se puede activar porque no tiene Whatsapp");
    	}
    }
}