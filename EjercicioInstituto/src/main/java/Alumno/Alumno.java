package Alumno;

import Creator.Creators;
import Models.Alumnos;
import com.diogonunes.jcolor.Attribute;

import static com.diogonunes.jcolor.Ansi.colorize;

public class Alumno extends Alumnos {

    public Alumno() {
        setNombre(Creators.nombreAlumnos());
        setApellido(Creators.apellidosAlumnos());
        setEdad(Creators.edadAlumnos());
    }

    @Override
    public String toString() {
        return colorize("Alumno 👬{ Nombre: " +getNombre()+" "+
                "Apellido: " +getApellido()+" "+
                "Edad: " +getEdad()+" "+
                "}", Attribute.BLUE_TEXT());
    }
}
