package com.mycompany.bucles_do_while;

/*edito desde github y pongo otro comentario
creo un comentario
de dos líneas */
import java.util.Scanner;
public class Bucles_do_while {

public static void main(String[] args){
Scanner an = new Scanner(System.in);
int numero;
do{
System.out.println("Escribe un número");
numero = an.nextInt();
}while( !(numero >1 && numero <=10));
System.out.println("has escrito "+numero);
}
}
