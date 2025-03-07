package com.futbol;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Jugador implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("numero_dorsal")
    private int numeroDorsal;

    @JsonProperty("nombre_jugador")
    private String nombreJugador;

    @JsonProperty("ciudad")
    private String ciudad;

    @JsonProperty("edad")
    private int edad;

    public Jugador() {
    }

    public Jugador(int numeroDorsal, String nombreJugador, String ciudad, int edad) {
        this.numeroDorsal = numeroDorsal;
        this.nombreJugador = nombreJugador;
        this.ciudad = ciudad;
        this.edad = edad;
    }

    // Getters y Setters

    public int getNumeroDorsal() {
        return numeroDorsal;
    }

    public void setNumeroDorsal(int numeroDorsal) {
        this.numeroDorsal = numeroDorsal;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return " dorsal=" + numeroDorsal + ", jugador=" + nombreJugador + ", ciudad=" + ciudad + ", edad=" + edad;
    }


}
