package Models;

import java.util.ArrayList;
import java.util.Scanner;

public class Instituto {
    private static Instituto instance = null;
    private final ArrayList<Aula> aula = new ArrayList<>();
    private int num;

    private final Scanner sc = new Scanner(System.in);


    /**
     * Instancia de instituto.
     * @return la misma instancia siempre.
     */
    public static Instituto getInstance() {
        if (instance == null){
            instance = new Instituto();
        }
        return instance;
    }


    /**
     * Constructor instituto.
     */
    private Instituto() {
        iniciarAulas();
    }


    /**
     * Inicializar las aulas.
     */
    private void iniciarAulas() {
        int tamAula = 10;
        for (int i = 0; i < tamAula; i++) {
            aula.add(new Aula());
        }
    }


    /**
     * Leer las aulas.
     * @return String con todas las aulas y alumnos.
     */
    public String readAulas() {
        StringBuilder read = new StringBuilder();
        for (int i = 0; i < aula.size(); i++) {
            read.append("\n").append("Aula 📚").append(i + 1).append(" :").append("\n");
            read.append(aula.get(i).toString()).append("\n");
            read.append(aula.get(i).numerosAlumnos()).append("\n");
        }
        return read.toString();
    }


    /**
     * Pedir aula a ver.
     */
    public void pedirAula() {
        do {
            try {
                System.out.println("Dime que clase quieres ver: ");
                num = sc.nextInt();
            }catch (Exception e) {
                System.out.println("Error debe poner un número, vuelva a intentarlo.");
                num = 0;
                sc.next();
            }
        }while (num<1 || num>10);
    }


    /**
     * Muestra la aula elegida ordenada.
     * @return string del aula.
     */
    public String verAulaOrdenada() {
        StringBuilder result = new StringBuilder();
        pedirAula();
        aula.get(num-1).ordenarAlumnos();

        for (Aula value : aula) {
            if (value == aula.get(num-1)) {
                result.append(value.toString()).append("\n");
            }
        }
        return result.toString();
    }

}
