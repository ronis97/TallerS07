 

import java.util.ArrayList;

public class Flota {
    private Tablero tablero;
    private String nombre;
    private ArrayList<Marino> marinos;
    private ArrayList<Maquina> maquinas;
    public void alNorte(){
        
    }
    public void avance(int dLon, int dLat){
        for (Maquina i: maquinas){
            i.avance(dLon, dLat);
        }
    }
    public ArrayList<Maquina> seranDestruidas(int longitud, int latitud){
        ArrayList<Maquina> destruidas = new ArrayList<Maquina>();
        for (Maquina i: maquinas){
            if (i.seraDestruida(longitud, latitud)) destruidas.add(i);
        }
        return destruidas;
    }
    public ArrayList<Maquina> maquinasDebiles(){
        ArrayList<Maquina> debiles = new ArrayList<Maquina>();
        for(Maquina i: maquinas){
            if (i.maquinaDebil()) debiles.add(i);
        }
        return debiles;
    }
    public boolean esBuenAtaque(int longitud, int latitud){
        return false;
    }
    public void ataquen(int lon, int lat){
        maquinas.removeAll(maquinasDebiles());
        for (Maquina i: maquinas){
            i.avance(lon, lat);
        }
    }
    
    //Incluya el contenedor de maquinas
}
