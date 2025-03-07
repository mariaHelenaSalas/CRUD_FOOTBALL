package com.futbol;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;


public class equiposervice {
    private static final String FILE_PATH = "equipos.json";
    private Map<Integer, Equipo> equipos;
    private ObjectMapper objectMapper;

    public equiposervice() {
        objectMapper = new ObjectMapper();
        equipos = cargarEquipos();
    }

    // 🔹 Cargar equipos desde JSON
    private Map<Integer, Equipo> cargarEquipos() {
        try {
            File file = new File(FILE_PATH);
            if (!file.exists()) {
                return new HashMap<>();
            }
            return objectMapper.readValue(file, new TypeReference<Map<Integer, Equipo>>() {});
        } catch (IOException e) {
            e.printStackTrace();
            return new HashMap<>();
        }
    }

    // 🔹 Guardar equipos en JSON
    private void guardarEquipos() {
        try {
            objectMapper.writeValue(new File(FILE_PATH), equipos);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 🔹 Crear un nuevo equipo
    public void crearEquipo(Equipo equipo) {
        int id = equipos.size() + 1;
        equipos.put(id, equipo);
        guardarEquipos();
        System.out.println("✅ Equipo creado con ID: " + id);
    }

    // 🔹 Listar todos los equipos
    public void listarEquipos() {
        if (equipos.isEmpty()) {
            System.out.println("⚠️ No hay equipos registrados.");
            return;
        }
        for (Map.Entry<Integer, Equipo> entry : equipos.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " | " + entry.getValue());
        }
    }

    // 🔹 Actualizar un equipo
    public void actualizarEquipo(int id, Equipo equipo) {
        if (equipos.containsKey(id)) {
            equipos.put(id, equipo);
            guardarEquipos();
            System.out.println("✅ Equipo actualizado.");
        } else {
            System.out.println("⚠️ Equipo no encontrado.");
        }
    }

    // 🔹 Eliminar un equipo
    public void eliminarEquipo(int id) {
        if (equipos.remove(id) != null) {
            guardarEquipos();
            System.out.println("🗑 Equipo eliminado.");
        } else {
            System.out.println("⚠️ Equipo no encontrado.");
        }
    }

}
