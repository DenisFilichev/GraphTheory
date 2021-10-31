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
    private final int serial;
    private A[] parents = new A[1];
    private A[] children = new A[1];
    
    public A (){
        serial = new Random().nextInt(10000);
    }

    public A[] getParent() {
        return parents;
    }

    protected static void setLink(A parent, A child) {
        if(parent!=null && child!=null){
            // Проверяем наличие свободных элементов в массивах parents и children
            if (parent.getChildren()[parent.getChildren().length-1] != null) {
                parent.setChildren(resizeArray(parent.getChildren()));
            }
            if (child.getParent()[child.getParent().length-1] != null) {
                child.setChildren(resizeArray(child.getParent()));
            }
            /*
            Делаем проверку наличия объекта в массиве 
            и добавляем его только если его нет ни в одном элементе массива
            */
            A childTemp = child;
            for (A a : parent.getChildren()){
                if (a!=null && a.equals(childTemp)) childTemp=null;
            }
            
            parent.getChildren()[parent.getChildren().length-1] = childTemp;
            
            for (A a : child.getParent()){
                if (a!=null && a.equals(parent)) parent=null;
            }
            
            child.getParent()[child.getParent().length-1] = parent;
        }
    }

    public A[] getChildren() {
        return children;
    }
    
    public int getSerial (){
        return serial;
    }

    public void setParents(A[] parents) {
        this.parents = parents;
    }

    public void setChildren(A[] children) {
        this.children = children;
    }
    
    
    
    private static A[] resizeArray (A[] array){
        A[]tempArray = new A[array.length+1];
        System.arraycopy(array, 0, tempArray, 0, array.length);
        return tempArray;
    }
    
    public static String print(A[] a){
        String result = "";
        for (int i=0 ; i<a.length ; i++){
            // Не все элементы нашего массива могут инициализированы объектом А,
            // по этому делаем соответствующую проверку.
            if (a[i]!=null) result = result + " A" + a[i].getSerial();
        }
        return result;
    }

    @Override
    public String toString() {
        return "A" + serial + "{parent=" + A.print(parents) + ", children=" + A.print(children) + '}';
    }
}
