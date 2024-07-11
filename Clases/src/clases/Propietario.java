package clases;

public class Propietario {

    private String nombre;
    private int edad;
    private String genero;

    Propietario(String nombre, int edad, String genero){
        this.genero = genero;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre(){
        return nombre;
    }
    public String getGenero(){
        return genero;
    }
    public int getEdad(){
        return edad;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    void mostarinfo(){
        System.out.println("el propietario es : " + this.nombre);
        System.out.println("el genero es : " + this.genero);
        System.out.println("la edad  es : " + this.edad);
    }
}
