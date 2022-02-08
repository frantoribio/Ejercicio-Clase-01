import Models.Instituto;

/**
 * @author Rocio PF
 * @version 1.0
 * github: Rochiio
 */

public class Main {

    public static void main(String[] args){

        Instituto instituto = Instituto.getInstance();
        System.out.println(instituto.readAulas());
        System.out.println(instituto.verAulaOrdenada());
    }
}
