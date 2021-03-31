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

		/*
		String[] a1 = {"Avila","Burgos","León","Palencia","Salamanca", "Segovia","Soria","Valladolid","Zamora"};
		String a2[] =new String[0];
		System.arraycopy(a2,0,a1,0,0);
		for (int i=0;i<a2.length;i++){
			System.out.println(a2[i]);
		}

		 /*
		int arr1[] = { 0, 1, 2, 3, 4, 5 };
		int arr2[] = { 5, 10, 20, 30, 40, 50 };

		// copies an array from the specified source array
		System.arraycopy(arr1, 0, arr2, 0, 1);
		System.out.print("array2 = ");
		System.out.print(arr2[0] + " ");
		System.out.print(arr2[1] + " ");
		System.out.print(arr2[2] + " ");
		System.out.print(arr2[3] + " ");
		System.out.print(arr2[4] + " ");
		*/


	}

	public static String agregar(String x, Integer y){
		return "metodo 1";

	}

	public static String agregar(Integer x, String y){
		return "metodo 2";

	}

}
