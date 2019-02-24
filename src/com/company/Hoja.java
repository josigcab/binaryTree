/**
 *
 */

package com.company;

public class Hoja implements Arbol{
    public int value;

    public Hoja(int value) {
        this.value = value;
    }

    @Override
    public int hojas(){
        return 1;
    }

    @Override
    public int sumElements() {
        return value;
    }
}
