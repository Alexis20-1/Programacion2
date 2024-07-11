/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.ArrayList;

/**
 *
 * @author juanalvarenga
 */
public class Mascota {

    //propiedades
    private String nombre;
    private String tipo;
    private String raza;
    private int edad;
    private Propietario propietario;
//    private Vacuna infoVacuna;
    private ArrayList<Vacuna> vacunas = new ArrayList();
    
//    Propietario propietario;
    
    // Propietario -> nombre, edad, genero

    //constructor por defecto
    // definido de forma implicita
    Mascota(String nombre, String tipo, String raza, int edad, ArrayList<Vacuna> vacunas, Propietario propietario) {

//        this = una instancia de "Mascota"
        this.nombre = nombre;
        this.tipo = tipo;

        this.raza = raza;
        this.edad = edad;

//        this.infoVacuna = info;
        this.vacunas = vacunas;
        this.propietario = propietario;

    }

    Mascota(String nombre) {

//        this = una instancia de "Mascota"
        this.nombre = nombre;

    }

    Mascota() {
    }

    //comportamientos
    public void mostrarInfo() {
        System.out.println("===========================");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Tipo: " + tipo);
        System.out.println("Raza: " + raza);
        System.out.println("Edad: " + edad);
        System.out.println("===========================");

        System.out.println("===Información de las vacunas===");
//        this.vacunas.mostrarInformacion();// es un metodo existente en la clase Vacuna

            //recorrer todo el listado de vacunas
           for (int i = 0; i < vacunas.size(); i++){
               
               //acceder a la instancia que se está iterando
               Vacuna info = vacunas.get(i); // devuelve una inastacia de Vacuna
               
               //ejecutar el método, para obtener la información 
               info.mostrarInformacion();
               
               System.out.println("\n");

           }
            this.propietario.mostarinfo();


    }

    //getters y setters
    String getNombre() {
        return nombre;
    }

    void setNombre(String valor) throws Exception {

        if (valor.isEmpty()) {

            // genere una excepción
            throw new Exception("El nombre no puede ser vacío");

//            return;  
        }

        this.nombre = valor;

    }
    public Propietario getPropietario(){
        return propietario;
    }

}
