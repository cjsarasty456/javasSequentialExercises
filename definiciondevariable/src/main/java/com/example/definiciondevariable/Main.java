package com.example.definiciondevariable;

public class Main {
    public static void main(String[] args) {
        /*
        para definir una variable en java primero se coloca el tipo de dato luego el nombre de la variable
        ejemplo:
        int num;
        para asignar un valor se llama primero la variable luego el signo igual
         */
        int num;
        num=3;
        int num2=4;
        System.out.println(num);
        /*
         hay dos formas de definir una variable de manera explicita o implicita
         se le puede definir explicitamente el tipo de dato o de manera implicita con la palabra var


         */
        var num3="3";
/*
 hay diferentes tipos de datos en java, double (o precisión doble) tiene una precisión de hasta 15-17 dígitos decimales, mientras que
  float (o precisión simple) tiene una precisión de 6-9 dígitos decimales. 
   String se usa para almacenar una secuencia de caracteres (o una cadena),
    mientras que char almacena un único carácter. 
    (boolean difference) se refiere al resultado de aplicar un operador lógico 
    "o" (OR) exclusivo a dos valores booleanos.
 */
float decimal=1.7f;
double decimal2=1.5;
String nombre= "stiven ";
char letra='s';
boolean booleano=true;
}


    
}