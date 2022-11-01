package ejercicio_5_ud18;

import mysql_functions.Functions;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Ejercicio5App {

	public static void main(String[] args) {
		
		Functions funcion = new Functions();
		FuncionesIndividualesEjercicio5 funcion_individual = new FuncionesIndividualesEjercicio5();
		Connection conexion = funcion.createConexion();
		funcion.createDB(conexion, "Ejercicio5_UD18");
		funcion_individual.createTableDespachosEjercicio5(conexion,"Ejercicio5_UD18","Despachos");
		funcion_individual.createTableDirectoresEjercicio5(conexion,"Ejercicio5_UD18","Directores");
		funcion_individual.insertDataDespachosEjercicio5(conexion,"Ejercicio5_UD18", "Despachos", 5);
		funcion_individual.insertDataDespachosEjercicio5(conexion,"Ejercicio5_UD18", "Despachos", 6);
		funcion_individual.insertDataDespachosEjercicio5(conexion,"Ejercicio5_UD18", "Despachos", 3);
		funcion_individual.insertDataDirectoresEjercicio5(conexion,"Ejercicio5_UD18", "Directores", "11111111A", "Director 1",null,1);
		funcion_individual.insertDataDirectoresEjercicio5(conexion,"Ejercicio5_UD18", "Directores", "22222222B", "Director 2","11111111A",1);
		funcion_individual.insertDataDirectoresEjercicio5(conexion,"Ejercicio5_UD18", "Directores", "33333333C", "Director 3","22222222B",2);
		System.out.println("Datos Despachos");
		funcion_individual.getValuesDespachosEjercicio5(conexion,"Ejercicio5_UD18","Peliculas");
		System.out.println("Datos Directores");
		funcion_individual.getValuesDirectoresEjercicio5(conexion,"Ejercicio5_UD18","Salas");
		funcion_individual.deleteRecordDespachosEjercicio5(conexion, "Ejercicio5_UD18", "Peliculas", 2);
		funcion.closeConnection(conexion);

	}

}
