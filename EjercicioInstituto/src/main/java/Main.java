import Models.Instituto;

/**
 * @author Rocio PF
 * @version 1.0
 * github: Rochiio
 */

public class Main {

    public static void main(String[] args){
        //Creación Instituto
        Instituto instituto = Instituto.getInstance();
        //Ver todas las aulas
        System.out.println(instituto.readAulas());
        //Ordenar aula
        System.out.println(instituto.verAulaOrdenada());
    }
}
