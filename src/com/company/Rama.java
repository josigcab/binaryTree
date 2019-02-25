/**
 *
 */

package com.company;

public class Rama<T> implements Arbol<T>{
    private Arbol<T> left;
    private Arbol<T> right;

    public Rama(Arbol<T> left, Arbol<T> right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int hojas(){
        return left.hojas() + right.hojas();
    }

//    @Override
//    public T sumElements() {
//        return sumNodes(left.sumElements(), right.sumElements());
//    }
}
