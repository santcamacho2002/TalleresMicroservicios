package javeriana.ms.rest;

import java.util.ArrayList;

public interface IPaseos {
    public ArrayList<Paseo>paseos();
    public boolean eliminarPaseo (String id);
    public boolean modificarPaseo (String id, String origen, String destino);
    public boolean nuevoPaseo (Paseo nuevo);
}
