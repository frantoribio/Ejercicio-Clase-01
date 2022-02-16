package Creator;

public class Creators {

//Random nombres
private static final String[] alumnosNombre = {"Miguel","Javier","Jose","David","Alberto","Antonio","Jorge","Roberto"
        ,"Hugo","Lucas","Mateo","Mario","Marcos","Alejandro","Daniel","Manuel","Alvaro","Ivan","Angel","Andres"};
private static final String[] alumnasNombre = {"Ana","Rocio","Sara","Susana","Maria","Clara","Claudia","Nerea","Andrea"
        ,"Alicia","Lara","Alba","Marisa","Cristina","Marta","Candela","Laura","Carla","Paola","Nuria"};

//Random apellidos
private static final String[] alumnosApellidos = {"Fernandez","Serrano","Diaz","Rodriguez","Gonzalez","Garcia","Lopez",
        "Sanz","Sanchez","Gomez"};


    /**
     * Creación random de nombres de alumno.
     * @return el nombre aleatorio de alumno.
     */
    public static String nombreAlumnos(){
        int random = (int) (Math.random() *alumnosNombre.length);
        return alumnosNombre[random];
    }


    /**
     * Creación random de nombres de alumna.
     * @return el nombre aleatorio de alumna.
     */
    public static String nombreAlumnas(){
        int random = (int) (Math.random() *alumnasNombre.length);
        return alumnasNombre[random];
    }


    /**
     * Creación random de apellidos.
     * @return el apellido aleatorio.
     */
    public static String apellidosAlumnos(){
        int random = (int) (Math.random() *alumnosApellidos.length);
        return alumnosApellidos[random];
    }


    /**
     * Creacion de edad por probabilidades y aleatorios.
     * @return la edad.
     */
    public static int edadAlumnos(){
        int edad;
        int random = 18 +(int) (Math.random() *40-18);

        if (random<25){
            edad= (int) Math.floor(Math.random()*(25-18+1)+18);
        }else if (random<32){
            edad= (int) Math.floor(Math.random()*(32-25+1)+25);
        }else{
            edad= (int) Math.floor(Math.random()*(40-32+1)+32);
        }
        return edad;
    }
}
