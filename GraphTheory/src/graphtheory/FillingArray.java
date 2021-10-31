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
        
        //Первый слой объектов
        A layer1number1 = new A();
        A layer1number2 = new A();
        A layer1number3 = new A();
        // Создаем связи между основным объектом и объектами первого слоя 
        A.setLink(pointOfEntry, layer1number1);
        A.setLink(pointOfEntry, layer1number2);
        A.setLink(pointOfEntry, layer1number3);
        
        //Второй слой объектов
        A layer2number1 = new A();
        A layer2number2 = new A();
        A layer2number3 = new A();
        A layer2number4 = new A();
        A layer2number5 = new A();
        A layer2number6 = new A();
        A layer2number7 = new A();
        A layer2number8 = new A();
        A layer2number9 = new A();
        // Создаем связи между объектами первого и второго слоев 
        A.setLink(layer1number1, layer2number1);
        A.setLink(layer1number1, layer2number2);
        A.setLink(layer1number1, layer2number3);
        A.setLink(layer1number2, layer2number4);
        A.setLink(layer1number2, layer2number5);
        A.setLink(layer1number2, layer2number6);
        A.setLink(layer1number3, layer2number7);
        A.setLink(layer1number3, layer2number8);
        A.setLink(layer1number3, layer2number9);
        
        return pointOfEntry; //Возвращает первый объект класса A, являющийся точкой входа
    }
}
