package com.example;

// este es la clase del molde de pesona

public class Persona {

    // esta son los atributos de la clase persona
    private int cedula;
    private String nombre;
    private int correo;

//contructor metodo inicial de la clase se ejecuta inmediatamente al crear un objeto de la clase persona
    public Persona() {
        System.out.println("se ejecuto el contructor vacio");
    }

    public Persona(int cedula) {
        System.out.println("aqui se ejecuto el contructor con la cedula");
        this.cedula = cedula;
    }

    public Persona(int cedula, String nombre, int correo) {
        System.out.println("se ejecuto el contructor con todos los atributos");
        this.nombre = nombre;   
        this.correo = correo;
        this.cedula = cedula;
    }

    //aqui creamos los metodos que indican las acciones que va a realizar la persona
    public String Hablar(String saludo) {
        return saludo +":  " + this.nombre;
    }

}
