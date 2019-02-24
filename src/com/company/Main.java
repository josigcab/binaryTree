package com.company;
/*
    Task
    hacer arbol generico
 */
public class Main {

    public static void main(String[] args) {
        Arbol hoja1 = new Hoja(1);
        Arbol hoja2 = new Hoja(2);
        Arbol hoja3 = new Hoja(3);
        Arbol hoja4 = new Hoja(4);
        Arbol rama1 = new Rama(hoja1, hoja2);
        Arbol rama2 = new Rama(hoja3, hoja4);
        Arbol root = new Rama(rama1, rama2);
        System.out.println(root.hojas());
        System.out.println(root.sumElements());
    }
}
