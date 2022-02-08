package Models;

import Creator.Creators;
import com.diogonunes.jcolor.Attribute;

import static com.diogonunes.jcolor.Ansi.colorize;

public class Alumna extends Alumnos{
    public Alumna() {
        setNombre(Creators.nombreAlumnas());
        setApellido(Creators.apellidosAlumnos());
        setEdad(Creators.edadAlumnos());
    }

    @Override
    public String toString() {
        return colorize("Alumna 👭{ Nombre: " +getNombre()+" "+
                "Apellido: " +getApellido()+" "+
                "Edad: " +getEdad()+" "+
                "}", Attribute.TEXT_COLOR(255, 184, 214 ));
    }
}
