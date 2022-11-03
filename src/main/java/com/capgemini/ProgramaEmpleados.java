package com.capgemini;

public class ProgramaEmpleados {

    public static void main( String[] args ){

        Empelado empelado = new Empelado();

        Empelado empelado1 = new Empelado("Ana", "29548115S", 9548115, 16000F, "Junior");

        empelado.setDni("29544415A");
        empelado.getDni();

        empelado.setNombre("Marta");
        empelado.getNombre();

        empelado.setTlf(622564916);
        empelado.getTlf();

        empelado.setCargo("Junior");
        empelado.getCargo();

        empelado.setSueldo(16000F);
        empelado.getSueldo();

        System.out.println(empelado);
        System.out.println(empelado1);

        Currito currito = new Currito();
        currito.setDepartamento("Testing");
        System.out.println(currito.getDepartamento());
        System.out.println(currito);

        Jefe jefe = new Jefe();
        jefe.setGenteACargo(20);
        System.out.println(jefe.getGenteACargo());
        System.out.println(jefe);




    }



}
