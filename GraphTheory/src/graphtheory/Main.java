package graphtheory;

/**
 *
 * @author denis
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A pointOfEntry = FillingArray.getFilling();
        System.out.println(pointOfEntry);
        A layer1number1 = pointOfEntry.getChildren()[0];
        System.out.println(layer1number1);
        A layer1number2 = pointOfEntry.getChildren()[1];
        System.out.println(layer1number2);
        A layer1number3 = pointOfEntry.getChildren()[2];
        System.out.println(layer1number3);
        
        A layer2number1 = layer1number1.getChildren()[0];
        System.out.println(layer2number1);
        A layer2number2 = layer1number1.getChildren()[1];
        System.out.println(layer2number2);
        A layer2number3 = layer1number1.getChildren()[2];
        System.out.println(layer2number3);
        A layer2number4 = layer1number2.getChildren()[0];
        System.out.println(layer2number4);
        A layer2number5 = layer1number2.getChildren()[1];
        System.out.println(layer2number5);
        A layer2number6 = layer1number2.getChildren()[2];
        System.out.println(layer2number6);
        A layer2number7 = layer1number3.getChildren()[0];
        System.out.println(layer2number7);
        A layer2number8 = layer1number3.getChildren()[1];
        System.out.println(layer2number8);
        A layer2number9 = layer1number3.getChildren()[2];
        System.out.println(layer2number9);
    }
    
}
