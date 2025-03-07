package com.futbol;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
               equiposervice servicio = new equiposervice();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("GESTIÓN DE EQUIPOS DE FÚTBOL");
            System.out.println("1. Agregar equipo");
            System.out.println("2. Listar equipos");
            System.out.println("3. Actualizar equipo");
            System.out.println("4. Eliminar equipo");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del equipo: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ciudad que representa: ");
                    String ciudad = scanner.nextLine();
                    System.out.print("Fecha de fundación: ");
                    String fechaFundacion = scanner.nextLine();
                    System.out.print("Presidente del equipo: ");
                    String presidente = scanner.nextLine();

                    ArrayList<Jugador> jugadores = new ArrayList<>();
                    System.out.print("¿Cuántos jugadores deseas agregar? ");
                    int numJugadores = scanner.nextInt();
                    scanner.nextLine(); // Limpiar buffer

                    for (int i = 0; i < numJugadores; i++) {
                        System.out.println("\n agregando jugador #"+(i + 1));
                        System.out.print("Número de dorsal: ");
                        int dorsal = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Nombre del jugador: ");
                        String nombreJugador = scanner.nextLine();
                        System.out.print("Ciudad del jugador: ");
                        String ciudadJugador = scanner.nextLine();
                        System.out.print("Edad del jugador: ");
                        int edad = scanner.nextInt();
                        scanner.nextLine();

                        jugadores.add(new Jugador(dorsal, nombreJugador, ciudadJugador, edad));
                    }

                    Equipo equipo = new Equipo(nombre, ciudad, fechaFundacion, presidente, jugadores);
                    servicio.crearEquipo(equipo);
                    break;

                case 2:
                    servicio.listarEquipos();
                    break;

                case 3:
                    System.out.print("ID del equipo a actualizar: ");
                    int idActualizar = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nuevo nombre del equipo: ");
                    String nuevoNombre = scanner.nextLine();
                    System.out.print("Nueva ciudad que representa: ");
                    String nuevaCiudad = scanner.nextLine();
                    System.out.print("Nueva fecha de fundación: ");
                    String nuevaFechaFundacion = scanner.nextLine();
                    System.out.print("Nuevo presidente del equipo: ");
                    String nuevoPresidente = scanner.nextLine();

                    ArrayList<Jugador> nuevosJugadores = new ArrayList<>();
                    System.out.print("¿Cuántos jugadores deseas agregar? ");
                    int numNuevosJugadores = scanner.nextInt();
                    scanner.nextLine();

                    for (int i = 0; i < numNuevosJugadores; i++) {

                        System.out.print("\n Número de dorsal: ");
                        int dorsal = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Nombre del jugador: ");
                        String nombreJugador = scanner.nextLine();
                        System.out.print("Ciudad del jugador: ");
                        String ciudadJugador = scanner.nextLine();
                        System.out.print("Edad del jugador: ");
                        int edad = scanner.nextInt();
                        scanner.nextLine();

                        nuevosJugadores.add(new Jugador(dorsal, nombreJugador, ciudadJugador, edad));
                    }

                    Equipo equipoActualizado = new Equipo(nuevoNombre, nuevaCiudad, nuevaFechaFundacion, nuevoPresidente, nuevosJugadores);
                    servicio.actualizarEquipo(idActualizar, equipoActualizado);
                    break;

                case 4:
                    System.out.print("ID del equipo a eliminar: ");
                    int idEliminar = scanner.nextInt();
                    servicio.eliminarEquipo(idEliminar);
                    break;

                case 5:
                    System.out.println("👋 Saliendo del sistema...");
                    scanner.close();
                    return;

                default:
                    System.out.println("⚠️ Opción no válida.");
            }
        }
    }

    
}