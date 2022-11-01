package ejercicio_4_ud18;

import mysql_functions.Functions;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Ejercicio4Ud18App {

	public static void main(String[] args) {
		Functions funcion = new Functions();
		FuncionesIndividualesEjercicio4 funcion_individual = new FuncionesIndividualesEjercicio4();
		Connection conexion = funcion.createConexion();
		funcion.createDB(conexion, "Ejercicio4_UD18");
		funcion_individual.createTablePeliculasEjercicio4(conexion,"Ejercicio4_UD18","Peliculas");
		funcion_individual.createTableSalasEjercicio4(conexion,"Ejercicio4_UD18","Salas");
		funcion_individual.insertDataPeliculasEjercicio4(conexion,"Ejercicio4_UD18", "Peliculas", "Pelicula 1",16);
		funcion_individual.insertDataPeliculasEjercicio4(conexion,"Ejercicio4_UD18", "Peliculas", "Pelicula 2",14);
		funcion_individual.insertDataPeliculasEjercicio4(conexion,"Ejercicio4_UD18", "Peliculas", "Pelicula 3",18);
		funcion_individual.insertDataSalasEjercicio4(conexion,"Ejercicio4_UD18", "Salas", "Sala 1",1);
		funcion_individual.insertDataSalasEjercicio4(conexion,"Ejercicio4_UD18", "Salas", "Sala 2",1);
		funcion_individual.insertDataSalasEjercicio4(conexion,"Ejercicio4_UD18", "Salas", "Sala 3",2);
		System.out.println("Datos Peliculas");
		funcion_individual.getValuesPeliculasEjercicio4(conexion,"Ejercicio4_UD18","Peliculas");
		System.out.println("Datos Salas");
		funcion_individual.getValuesSalasEjercicio4(conexion,"Ejercicio4_UD18","Salas");
		funcion_individual.deleteRecordDepartamentosEjercicio4(conexion, "Ejercicio4_UD18", "Peliculas", 2);
		funcion.closeConnection(conexion);

		

	}

}
