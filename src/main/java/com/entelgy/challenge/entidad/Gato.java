package com.entelgy.challenge.entidad;

public class Gato implements Animal{
    private String nombre;
    private int edad;
    private String raza;
    private int tiempoDeVida;
    private final String tipo = "Gato";

    public Gato(String nombre, int edad, String raza, int tiempoDeVida) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.tiempoDeVida = tiempoDeVida;
    }

    @Override
    public String realizarSonido() {
        return "Maulla";//
    }

    @Override
    public String describir() {
        return String.format("%s es un %s de raza %s que tiene %d años de edad. Siempre %s cuando está feliz. Su expectativa de vida es de %d años.",
                nombre, tipo, raza, edad, realizarSonido(), tiempoDeVida);
    }

    public String getNombre() {
        return nombre;
    }
}