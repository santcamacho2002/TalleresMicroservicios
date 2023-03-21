package javeriana.ms.rest;

import jakarta.ws.rs.PathParam;

import java.util.ArrayList;
import java.util.Objects;

public class Paseos implements IPaseos{
    private static ArrayList<Paseo> listaPaseos;

    public Paseos(){
        listaPaseos=new ArrayList<>();
    }

    @Override
    public ArrayList<Paseo> paseos(){
        return listaPaseos;
    }

    @Override
    public boolean eliminarPaseo(String id){
        return listaPaseos.removeIf(t -> Objects.equals(t.getId(), id));
    }

    @Override
    public boolean modificarPaseo(String id, String origen, String destino){
        for (Paseo t : listaPaseos) {
            if (Objects.equals(t.getId(), id)) {
                t.setLugarSalida(origen);
                t.setLugarLlegada(destino);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean nuevoPaseo(Paseo paseo){
        if (listaPaseos.stream().noneMatch(t -> Objects.equals(t.getId(), paseo.getId()))){
            listaPaseos.add(paseo);
            return true;
        }
        return false;
    }
}
