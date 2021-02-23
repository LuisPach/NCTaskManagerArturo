package mx.edu.j2se.Pacheco.tasks;

public class Persona {

    String nombre;
    int edad;
    String sexo;
    Float altura;
    String nacionalidad;

    /**
     * @return String
     */


    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;

    }

    public static String loDejanEntrarAlBar(int laEdad){
        if (laEdad>=18) {
            return "Bienvenido";
        }

        else {
            return "Sigue paticipando";
        }
    }

    //Metodo constructor
    public Persona(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }

    public void mostrarDatos(){
        System.out.println("El nombre es: "+ nombre);
        System.out.println("El edad es: "+ edad);

    }

}
