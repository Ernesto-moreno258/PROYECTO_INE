package CajeroDB4O;

import java.util.Scanner; 
import java.security.SecureRandom;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		DataBase4O DB = new DataBase4O();
		Persona P = new Persona();
		Scanner keybd = new Scanner(System.in);
		SecureRandom rand = new SecureRandom();
		do {
			
		System.out.println("\nConsulta tu INE\n\n *�Qu� desea hacer?*\n" + "1- Crear una cuenta " + "\n2- Consulta t� cuenta");
		int ans = keybd.nextInt();

		
			if (ans == 1) {
				System.out.println("Ingrese sus datos personales, por favor");
				P.setNumTarj(rand.nextInt(2000));
				System.out.println("Introduce t� nombre(s):");
				P.setNombrePersona(keybd.next());
				System.out.println("Apellido paterno:");
				P.setApellidoPPersona(keybd.next());
				System.out.println("Apellido materno:");
				P.setApellidoMPersona(keybd.next());
				System.out.println("Fecha de nacimiento:");
				P.setFechaNacimiento(keybd.next());
				System.out.println("SEXO:");
				P.setSexo(keybd.next());
				System.out.println("DOMICILIO:");
				P.setDomicilio(keybd.next());
				System.out.println("CLAVE DE ELECTOR:");
				P.setClaveElector(keybd.next());
				System.out.println("CURP:");
				P.setCURP(keybd.next());
				System.out.println("A�O DE REGISTRO:");
				P.setAnioRegistro(keybd.nextInt());
				System.out.println("ESTADO:");
				P.setEstado(keybd.nextInt());
				System.out.println("MUNICIPIO:");
				P.setMunicipio(keybd.nextInt());
				System.out.println("SECCI�N:");
				P.setSeccion(keybd.nextInt());
				System.out.println("LOCALIDAD:");
				P.setLocalidad(keybd.nextInt());
				System.out.println("EMISI�N:");
				P.setEmision(keybd.nextInt());
				System.out.println("VIGENCIA:");
				P.setVigencia(keybd.nextInt());
				DB.insertarRegistro(P);
				System.out.println(P);
				
				
			} else if (ans == 2) {
				System.out.println("CURP:");
				P.setCURP(keybd.next());
				P = DB.seleccionarPersona(P);
				System.out.println(P);	
			}

		// ELIMINAR PERSONA
		// r.eliminarPersona(1587);

		//keybd.close();
		}
		while(true);
	}
		
	}

