package com.generation;

public class Main {
    public static void main(String[] args){
    //const nombre = 'Denisse González'
    // Variable String
    String nombre ="Denisse Gonzalez";
    byte num1=10;
    short num2=10;
    int num3=10;
    long num4=10;

    //datos primitivos decimales

    float decimal= 2.2334546f;
    double decimal2=3.24567;

    //dato primitivo char
    char character='f';
    //dato primitivo boolean
    boolean verdadero=true;

    short shortNum1=num1;
    int intShort=shortNum1;
    short numShort2=(short)shortNum1;

    //Ejemplo
    int numByte1=30;
    int numByte2=15;
    //short suma=(short)(numByte1+numByte2);

    //System.out.println(suma);
    //System.out.println(numShort2);

    //Operadores aritmeticos
    //+,-,*,/,%

    int suma = numByte1+numByte2;
    int resta =numByte1-numByte2;
    int multi = numByte1*numByte2;
    float div = (float)(numByte1/numByte2);
    int modulo =numByte1%numByte2;

    System.out.println("La suma es: "+suma);
    System.out.println("La resta es: "+resta);
    System.out.println("La multiplicación es: "+multi);
    System.out.println("La división es: "+div);
    System.out.println("El módulo es: "+modulo);
}}