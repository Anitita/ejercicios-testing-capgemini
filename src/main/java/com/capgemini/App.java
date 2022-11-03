package com.capgemini;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /*System.out.println( "Hola Mundo!" );
        Cliente cliente = new Cliente();
        System.out.println(cliente.edad);
        Cliente cliente2 = new Cliente();
        //Cliente cliente3 = new Cliente();
        cliente.edad = 2;
        System.out.println(cliente.edad);
        cliente2.edad = 12;
        System.out.println(cliente2.edad);

        //cliente = new Cliente(nombre:"Ana", direccion:"Malaga", edad:24);


        Perro toby = new Perro();
        System.out.println(toby.raza);
        toby.raza = "Terrier";

        Perro otto = new Perro();
        otto.raza = "Pastor Aleman";

        System.out.println(toby.raza);
        System.out.println(otto.raza);
        Perro fluky = new Perro("Pastor de aguas");
        fluky.getRaza();
        fluky.setRaza("Pastor de aguas");
        System.out.println();*/















        Float resultado = Calcuradora.suma( 1F,  2F);
        System.out.println(resultado);

        Float resultado2 = Calcuradora.multi( 1F, 2F);
        System.out.println(resultado2);

        Float resultado3 = Calcuradora.divi(6F, 2F);
        System.out.println(resultado3);

        Float resultado4 = Calcuradora.resta(4F, 1F);
        System.out.println(resultado4);
    }
}
