package UTN.datos;

import UTN.dominio.Estudiante;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EstudianteDAO {
    public List <Estudiante> listar(){
        List<Estudiante> estudiantes = new ArrayList<>();
        // Creamos algunos objetos que son necesarios para comunicarnos con la bd
        PreparedStatement ps; // Envia la sentencia a la base de datos
        ResultSet rs; // Obtenemos el resultado de la bd


    }
}
