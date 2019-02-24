/**
 *
 */

package com.company;

public class Rama implements Arbol{
    private Arbol left;
    private Arbol right;

    public Rama(Arbol left, Arbol right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int hojas(){
        return left.hojas() + right.hojas();
    }

    @Override
    public int sumElements() {
        return left.sumElements() + right.sumElements();
    }
}
