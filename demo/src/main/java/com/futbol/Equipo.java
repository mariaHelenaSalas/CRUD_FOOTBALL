package com.futbol;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Equipo implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("nombre")
    private String nombre;

    @JsonProperty("ciudad_representa")
    private String ciudadRepresenta;

    @JsonProperty("fecha_fundacion")
    private String fechaFundacion;

    @JsonProperty("presidente")
    private String presidente;

    @JsonProperty("jugadores")
    private List<Jugador> jugadores;

    public Equipo() {}

    public Equipo(String nombre, String ciudadRepresenta, String fechaFundacion, String presidente, List<Jugador> jugadores) {
        this.nombre = nombre;
        this.ciudadRepresenta = ciudadRepresenta;
        this.fechaFundacion = fechaFundacion;
        this.presidente = presidente;
        this.jugadores = jugadores;
    }

    // Getters y Setters
    
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCiudadRepresenta() { return ciudadRepresenta; }
    public void setCiudadRepresenta(String ciudadRepresenta) { this.ciudadRepresenta = ciudadRepresenta; }

    public String getFechaFundacion() { return fechaFundacion; }
    public void setFechaFundacion(String fechaFundacion) { this.fechaFundacion = fechaFundacion; }

    public String getPresidente() { return presidente; }
    public void setPresidente(String presidente) { this.presidente = presidente; }

    public List<Jugador> getJugadores() { return jugadores; }
    public void setJugadores(List<Jugador> jugadores) { this.jugadores = jugadores; }

    @Override
    public String toString() {
        return "Equipo{" +
                "nombre='" + nombre + '\'' +
                ", ciudadRepresenta='" + ciudadRepresenta + '\'' +
                ", fechaFundacion='" + fechaFundacion + '\'' +
                ", presidente='" + presidente + '\'' +
                ", jugadores=" + jugadores +
                '}';
    }

}
