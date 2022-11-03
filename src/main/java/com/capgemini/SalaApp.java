package com.capgemini;

public class SalaApp {

    public static void main(String[] args) {

        Sala sala = new Sala();

        Sala sala1 = new Sala("40x60", true);

        sala.setDimensiones("50x60");
        sala.setAireacond(false);

        System.out.println(sala.getDimensiones());
        System.out.println(sala.getAireacond());

        System.out.println(sala1);

        Aula aula = new Aula();
        aula.setProfesorAsignado("David");
        System.out.println(aula.getProfesorAsignado());
        System.out.println(aula);


    }

}
