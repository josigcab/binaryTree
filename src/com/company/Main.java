package com.company;
/*
    Task
    hacer arbol generico
 */
public class Main {

    public static void main(String[] args) {
        Arbol<String> hoja1 = new Hoja("leaf1");
        Arbol<String> hoja2 = new Hoja("leaf2");
        Arbol<String> hoja3 = new Hoja("leaf3");
        Arbol<String> hoja4 = new Hoja("leaf4");
        Arbol<String> rama1 = new Rama(hoja1, hoja2);
        Arbol<String> rama2 = new Rama(hoja3, hoja4);
        Arbol<String> root = new Rama(rama1, rama2);
        System.out.println(root.hojas());
//        System.out.println(root.sumElements());
    }
}
