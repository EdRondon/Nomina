package com.edrondon.nomina;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Empleados {
	
	private String 	nombre=new String();
	private int 	horasLab;
	private	int 	extras;
	private char 	depart;
	private	double 	sueldoBa;
	private	double 	bonoTra;
	private double	seguro;
	private double	sueldoNe;
			

	public void sueldoBasico(){
		
		if(horasLab<=40){
			sueldoBa=horasLab*150;
		}else{
			extras=horasLab-40;
			sueldoBa=40*150;
		}
		System.out.println("El sueldo basico es: Bs " +sueldoBa);
	}
	
	public void bonoTrabajo(){
		bonoTra=sueldoBa*0.35;
		System.out.println("El bono de trabajo es: Bs " +bonoTra);
	}
	
	public void seguroSocial(){
		seguro=sueldoBa*0.05;
		System.out.println("Le corresponde pagar de seguro social: Bs "+seguro);
	}
	
	public void sueldoNeto(){
		sueldoNe=(sueldoBa+bonoTra)-seguro;
		System.out.println("El sueldo neto a cobrar es de: Bs "+sueldoNe);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getHoraslab() {
		return horasLab;
	}

	public void setHoraslab(int horaslab) {
		this.horasLab = horaslab;
	}

	public char getDepart() {
		return depart;
	}

	public void setDepart(char depart) {
		this.depart = depart;
	}

}
