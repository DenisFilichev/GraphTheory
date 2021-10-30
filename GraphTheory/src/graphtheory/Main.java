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
        System.out.println(pointOfEntry.getChildren()[0]);
    }
    
}
