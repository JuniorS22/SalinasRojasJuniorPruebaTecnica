package com.entelgy.challenge;

import com.entelgy.challenge.entidad.Animal;
import com.entelgy.challenge.entidad.Gato;
import com.entelgy.challenge.entidad.Perro;
import com.entelgy.challenge.entidad.Vaca;

public class Reporte {
    public static Animal[] cargarDatos() {
        Animal[] animales = new Animal[9];

        //polimorfismo crendo objetos diferentes
        animales[0] = new Perro("Rabito", 5, "Poodle", 13);
        animales[1] = new Perro("Osa", 3, "Beagle", 15);
        animales[2] = new Perro("Deco", 4, "Boxer", 12);

        animales[3] = new Gato("Lizzy", 2, "Siames", 18);
        animales[4] = new Gato("Tim", 1, "Persa", 16);
        animales[5] = new Gato("Micho", 3, "Angora", 17);

        animales[6] = new Vaca("Teva", 5, "Holstein", 20);
        animales[7] = new Vaca("Edu", 4, "Jersey", 22);
        animales[8] = new Vaca("Placi", 6, "Guernsey", 21);

        return animales;
    }

    public static void main(String[] args) {
        Animal[] animales = cargarDatos();
        String nombreBuscado = "Lizzy";

        Animal animalEncontrado = null;
        for (Animal animal : animales) {
            if (animal instanceof Perro && ((Perro) animal).getNombre().equals(nombreBuscado)) {
                animalEncontrado = animal;
                break;
            } else if (animal instanceof Gato && ((Gato) animal).getNombre().equals(nombreBuscado)) {
                animalEncontrado = animal;
                break;
            } else if (animal instanceof Vaca && ((Vaca) animal).getNombre().equals(nombreBuscado)) {
                animalEncontrado = animal;
                break;
            }
        }

        if (animalEncontrado != null) {
            System.out.println(animalEncontrado.describir());
        } else {
            throw new RuntimeException("Animal no encontrado");
        }
    }
}
