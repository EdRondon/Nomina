/**Proyecto de 20

Realice un proyecto que contenga una clase empleado. Esta clase a su vez tendra los siguientes metodos:

Sueldo basico, Bono de trabajo, seguro social y sueldo neto. 

Con esto se realizara un programa que lea de N empleados:

Nombre, horas laboradas (entre 0 y 55) y departamento al que pertenece (A y B).

Con estos datos calcule y muestre:

-Sueldo basico del trabajador, bono de trabajo, seguro social y sueldo neto.
-Al final, cuantos empleados trabajaron horas extra en el departamento a y en el b

El calculo de sueldo basico se basara en lo siguiente:

-Se consideran como horas laborales normales 40, el excedente se considera extra.
-Las horas laborales normales se cancerlaran a 150 bs la hora y las horas extras tendran un aumento del 77% sobre la hora normal.
-El bono de trabajo sera el 35% del sueldo basico.
-El seguro social sera el 5% del sueldo basico.
**/

package com.edrondon.nomina;

import java.util.ArrayList;
import java.util.Scanner;

public class Nomina {
	
	public static void main(String[] args) {
		
		int 	opcion=1;
		int 	a=0,b=0;
		
		ArrayList<Empleados> todosEmpleados= new ArrayList<Empleados>();

		Scanner teclado = new Scanner(System.in);
		
		while(opcion!=5){
			System.out.println("____________________________Bienvenido al sistema de nomina____________________________");
			System.out.println("1. Ingresar nuevo trabajador");
			System.out.println("2. Ver la catidad de trabajadores");
			System.out.println("3. Ver cuantos trabajadores trabajaron horas extras en el departamento A");
			System.out.println("4. Ver cuantos trabajadores trabajaron horas extras en el departamento B");
			System.out.println("5. Salir");
			
			opcion = teclado.nextInt();
			
			switch (opcion){
			case 1:{
				Scanner teclado2 = new Scanner(System.in);
	
				Empleados empleado = new Empleados();
				
				System.out.println("Ingrese nombre del empleado: ");
				empleado.setNombre(teclado2.nextLine());
				System.out.println("Ingrese horas laboradas: ");
				empleado.setHoraslab(teclado2.nextInt());
				System.out.println("Ingrese su departamento, A o B: ");
				empleado.setDepart(teclado2.next().trim().charAt(0));
				
				if(empleado.getHoraslab()>40 && empleado.getDepart()=='a'){
					a++;
				}
				if(empleado.getHoraslab()>40 && empleado.getDepart()=='b'){
					b++;
				}
				
				todosEmpleados.add(empleado);
				
				empleado.sueldoBasico();
				empleado.bonoTrabajo();
				empleado.seguroSocial();
				empleado.sueldoNeto();
				
			}break;
			case 2:{
				System.out.println("Cantidad de trabajadores en la BD: "+todosEmpleados.size());
			}break;
			case 3:{
				System.out.println("Trabajadores que trabajaron horas extras en el departamento A: "+a);
			}break;
			case 4:{
				System.out.println("Trabajadores que trabajaron horas extras en el departamento B: "+b);				
			}break;
		}
		
		}
	}

}
