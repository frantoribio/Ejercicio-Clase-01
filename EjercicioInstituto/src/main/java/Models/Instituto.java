package Models;

import java.util.Scanner;

public class Instituto {
    private static Instituto instance = null;
    private final Aula[] aula;
    private int num=0;


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
        aula = new Aula[10];
        iniciarAulas();
    }


    /**
     * Inicializar las aulas.
     */
    private void iniciarAulas() {
        for (int i = 0; i < aula.length; i++) {
            aula[i] = new Aula();
        }
    }


    /**
     * Leer las aulas.
     * @return String con todas las aulas y alumnos.
     */
    public String readAulas() {
        StringBuilder read = new StringBuilder();
        for (int i = 0; i < aula.length; i++) {
            read.append("\n").append("Aula 📚").append(i + 1).append(" :").append("\n");
            read.append(aula[i].toString()).append("\n");
            read.append(aula[i].numerosAlumnos()).append("\n");
        }
        return read.toString();
    }


    /**
     * Pedir aula a ver.
     */
    public void pedirAula() {
        Scanner scanner = new Scanner(System.in);
        do {
            try {
                System.out.println("Dime que clase quieres ver: ");
                num = scanner.nextInt();
            }catch (NumberFormatException e) {
                num = -1;
                System.out.println("Número incorrecto, vuelva a intentarlo.");
                scanner.next();
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
        aula[num-1].ordenarAlumnos();
        for (Aula value : aula) {
            if (value == aula[num-1]) {
                result.append(value.toString()).append("\n");
            }
        }
        return result.toString();
    }
}
