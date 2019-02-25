/**
 *
 */

package com.company;

public class Hoja<T> implements Arbol{
    public T value;

    public Hoja(T value) {
        this.value = value;
    }

    @Override
    public int hojas(){
        return 1;
    }

//    @Override
//    public T sumElements() {
//        return sumNode(value, null);
//    }

}
