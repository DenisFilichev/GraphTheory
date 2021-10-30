/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphtheory;

import java.util.Random;

/**
 *
 * @author denis
 */
public class A {
    int serial;
    private A[] parents = new A[1];
    private A[] children = new A[1];
    
    public A (){
        serial = new Random().nextInt(10000);
    }

    public A[] getParent() {
        return parents;
    }

    protected void setDependencies(A child, A parent) {
        if (parents[parents.length-1] != null) {
            parents = resizeArray(parents);
        }
        if (children[children.length-1] != null) {
            children = resizeArray(children);
        }
        parents[parents.length-1] = parent;
        children[children.length-1] = child;
    }

    public A[] getChildren() {
        return children;
    }
    
    private A[] resizeArray (A[] array){
        A[]tempArray = new A[array.length+1];
        System.arraycopy(array, 0, tempArray, 0, array.length);
        return tempArray;
    }

    @Override
    public String toString() {
        return "A" + serial + "{parent.length=" + parents.length + ", children.length=" + children.length + '}';
    }
}
