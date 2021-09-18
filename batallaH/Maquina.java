 

public class Maquina {
    private Ubicacion ubicacion;
    public void avance(int dLon, int dLat){
        
    }
    public boolean seraDestruida(int longitud, int latitud){
        if (ubicacion.getlongitud() == longitud 
            && ubicacion.getlatitud() == latitud) return true;
        return false;
    }
    public boolean maquinaDebil(){
        return false;
    }
}
