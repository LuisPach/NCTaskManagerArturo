package mx.edu.j2se.Pacheco.tasks;

public class Main {

	static final String nombre="Artur";
	static final int edad=27;

	public static void main(String[] args) {

		/*Persona estudianteNC = new Persona();
		estudianteNC.setNombre("Artur");
		String elNombre = estudianteNC.getNombre();
		estudianteNC.setEdad(8);
		int laEdad = estudianteNC.getEdad();
		String loDejaron=estudianteNC.loDejanEntrarAlBar(laEdad);

		//System.out.println(elNombre);
		System.out.println(elNombre +": " +loDejaron);

		Persona estudianteNC2 = new Persona();
		estudianteNC2.setNombre("Luis");
		String elNombre2 = estudianteNC2.getNombre();
		estudianteNC2.setEdad(19);
		int laEdad2 = estudianteNC2.getEdad();
		System.out.println(elNombre2+" tiene "+laEdad2); */

		Persona persona = new Persona(nombre, edad);
		System.out.println(agregar(1, "Sal"));
		persona.mostrarDatos();

		Task task1=new Task("correr", 9);
		Task task2=new Task("jugar",10,20,1);
		task2.setTime(2);
		//task1.isRepeated();

		System.out.println(task2.getTime()+" "+task2.getTitle());

	}

	public static String agregar(String x, Integer y){
		return "metodo 1";

	}

	public static String agregar(Integer x, String y){
		return "metodo 2";

	}

}
