
<<<<<<< HEAD
public class BatallaNavalExcepcion extends Exception
{
    public static final String NO_SE_PUDO_MOVER = "La maquina no se pudo mover";
    public static final String 
        PILOTO_ASIGNACION_INCORRECTA = "Un piloto de avion no esta asignado o este ha sido asignado a mas de un avion";
    public static final String MENOS_MARINOS_QUE_MAQUINAS = "Existen menor marinos que maquinas en la flota";
    public static final String NO_MARINOS_EN_FLOTA = "La flota no tiene marinos asignados";
    public static final String POTENCIA_FLOTAS = "Mas de la mitad de las flotas tienen problemas de potencia";
    public BatallaNavalExcepcion(String message){
        super(message);
    }
=======
/**
 * Write a description of class BatallaNavalExcepcion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BatallaNavalExcepcion extends Exception
{
    public static final String NO_SE_PUDO_MOVER_AL_NORTE = "La máquina no se pudo mover al norte.";
    public static final String MENOS_MARINOS_QUE_MAQUINAS = "Existen menos marinos que máquinas en la flota.";
    public static final String PILOTOS_ASIGNADOS = "Un piloto no es marino de la flota, un piloto de un avión asignado a un portavion no es piloto del portaavión o un piloto está asignado a más de un avión.";
    
    public BatallaNavalExcepcion(String message){
        super(message);
    }
    
>>>>>>> 1243ec993f87001bde363ab1bc0f2c487e77cf8c
}
