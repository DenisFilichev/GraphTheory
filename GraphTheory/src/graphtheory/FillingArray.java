/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphtheory;

/**
 *
 * @author denis
 */
public class FillingArray {
    public static A getFilling(){
        //Основной объект
        A pointOfEntry = new A();
        
        //Первый слой связей
        A layer2number1 = new A();
        A layer2number2 = new A();
        A layer2number3 = new A();
        pointOfEntry.setDependencies(layer2number1, null);
        pointOfEntry.setDependencies(layer2number2, null);
        pointOfEntry.setDependencies(layer2number3, null);
        
        //Второй слой связей
        A layer3number1 = new A();
        A layer3number2 = new A();
        A layer3number3 = new A();
        A layer3number4 = new A();
        A layer3number5 = new A();
        A layer3number6 = new A();
        A layer3number7 = new A();
        A layer3number8 = new A();
        A layer3number9 = new A();
        layer2number1.setDependencies(layer3number1, layer2number1);
        layer2number1.setDependencies(layer3number2, layer2number1);
        layer2number1.setDependencies(layer3number3, layer2number1);
        layer2number2.setDependencies(layer3number4, layer2number1);
        layer2number2.setDependencies(layer3number5, layer2number1);
        layer2number2.setDependencies(layer3number6, layer2number1);
        layer2number3.setDependencies(layer3number7, layer2number1);
        layer2number3.setDependencies(layer3number8, layer2number1);
        layer2number3.setDependencies(layer3number9, layer2number1);
        
        return pointOfEntry; //Возвращает первый объект класса A, являющийся точкой входа
    }
}
