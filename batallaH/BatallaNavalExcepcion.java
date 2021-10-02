
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
    
}
