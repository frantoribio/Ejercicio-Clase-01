package Models;

import com.diogonunes.jcolor.Attribute;

import static com.diogonunes.jcolor.Ansi.colorize;

public class Aula {
private final Alumnos[] alumnosClase;


    /**
     * Constructor de aula.
     */
    public Aula() {
        alumnosClase = new Alumnos[15];
        crearAlumnos();
    }


    /**
     * Creación de alumnos.
     */
    private void crearAlumnos() {
        int random;
        for (int i = 0; i < alumnosClase.length; i++){
            random = (int) (Math.random() * 100)+1;
            if (random<60){
                alumnosClase[i]= new Alumna();
            }else{
                alumnosClase[i]= new Alumno();
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

        for (int i = 0; i < alumnosClase.length; i++) {
            for (int j = i + 1; j < alumnosClase.length; j++) {
                if (alumnosClase[i] != null && alumnosClase[j] != null &&
                        alumnosClase[i].getNombre()
                                .toLowerCase()
                                .compareTo(alumnosClase[j]
                                        .getNombre()
                                        .toLowerCase()) > 0) {
                    aux = alumnosClase[i];
                    alumnosClase[i] = alumnosClase[j];
                    alumnosClase[j] = aux;
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
