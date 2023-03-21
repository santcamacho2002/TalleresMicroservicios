package javeriana.ms.rest;

import java.util.UUID;

public class Paseo {
    private String id;
    private String lugarSalida;
    private String lugarLlegada;
    private double precio;

    public Paseo(String lugarSalida, String lugarLlegada, double precio) {
        this.id = String.valueOf(UUID.randomUUID());
        this.lugarSalida = lugarSalida;
        this.lugarLlegada = lugarLlegada;
        this.precio = precio;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setLugarSalida(String lugarSalida) {
        this.lugarSalida = lugarSalida;
    }

    public void setLugarLlegada(String lugarLlegada) {
        this.lugarLlegada = lugarLlegada;
    }


    public String getLugarSalida() {
        return lugarSalida;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getLugarLlegada() {
        return lugarLlegada;
    }

    @Override
    public String toString(){
        return "Destino: "+lugarLlegada+"; Origen: "+lugarSalida+"; Precio: "+precio;
    }

}



