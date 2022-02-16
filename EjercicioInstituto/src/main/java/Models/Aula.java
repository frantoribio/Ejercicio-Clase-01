package Models;

import Alumno.Alumno;
import Alumno.Alumna;
import com.diogonunes.jcolor.Attribute;

import java.util.ArrayList;


import static com.diogonunes.jcolor.Ansi.colorize;

public class Aula {
private final ArrayList<Alumnos> alumnosClase;

    /**
     * Constructor de aula.
     */
    public Aula() {
        alumnosClase = new ArrayList<>();
        crearAlumnos();
    }


    /**
     * Creación de alumnos.
     */
    private void crearAlumnos() {
        int random;
        int TAM_ALUMNOS = 15;
        for (int i = 0; i < TAM_ALUMNOS; i++){
            random = (int) (Math.random() * 100)+1;
            if (random<60){
                alumnosClase.add(new Alumna());
            }else{
                alumnosClase.add(new Alumno());
            }
        }
    }


    /**
     * Imprimir aulas.
     * @return la aula.
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Alumnos alumnos : alumnosClase) {
            if (alumnos instanceof Alumno) {
                result.append(alumnos).append("\n");
            }else if (alumnos instanceof Alumna){
                result.append(alumnos).append("\n");
            }
        }
        return result.toString();
    }


    /**
     * Ordenación de una aula.
     */
    public void ordenarAlumnos(){
        Alumnos aux;

        for (int i = 0; i < alumnosClase.size(); i++) {
            for (int j = i + 1; j < alumnosClase.size(); j++) {
                if (alumnosClase.get(i) != null && alumnosClase.get(j) != null &&
                        alumnosClase.get(i).getNombre()
                                .compareToIgnoreCase(alumnosClase.get(j)
                                        .getNombre())> 0) {

                    aux = alumnosClase.get(i);
                    alumnosClase.set(i , alumnosClase.get(j));
                    alumnosClase.set(j, aux);
                }
            }
        }
    }



    /**
     * Número de alumnos y alumnas que hay en cada clase.
     * @return el número de cada clase.
     */
    public String numerosAlumnos() {
        int alumnos = 0;        int alumnas = 0;

        for (Alumnos value : alumnosClase) {
            if (value instanceof Alumno) {
                alumnos ++;
            }else {
                alumnas ++;
            }
        }
        return (colorize("Número de alumnas: " + alumnas + "\n" + "Número de alumnos: " + alumnos , Attribute.CYAN_TEXT()));
    }

}
