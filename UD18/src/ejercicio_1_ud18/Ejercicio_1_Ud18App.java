package ejercicio_1_ud18;

import mysql_functions.Functions;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Ejercicio_1_Ud18App {

	public static void main(String[] args) {
		
		Functions funcion = new Functions();
		FuncionesIndividualesEjercicio1 funcion_individual = new FuncionesIndividualesEjercicio1();
		Connection conexion = funcion.createConexion();
		funcion.createDB(conexion, "Ejercicio1_UD18");
		funcion_individual.createTableFabricantesEjercicio1(conexion,"Ejercicio1_UD18","Fabricantes");
		funcion_individual.createTableArticulosEjercicio1(conexion,"Ejercicio1_UD18","Articulos");
		funcion_individual.insertDataFabricantesEjercicio1(conexion,"Ejercicio1_UD18", "Fabricantes", "Schwagelok");
		funcion_individual.insertDataFabricantesEjercicio1(conexion,"Ejercicio1_UD18", "Fabricantes", "Sony");
		funcion_individual.insertDataFabricantesEjercicio1(conexion,"Ejercicio1_UD18", "Fabricantes", "Fabricante 3");
		funcion_individual.insertDataArticulosEjercicio1(conexion,"Ejercicio1_UD18", "Articulos", "Rosca",5,1);
		funcion_individual.insertDataArticulosEjercicio1(conexion,"Ejercicio1_UD18", "Articulos", "Tornillo",7,1);
		funcion_individual.insertDataArticulosEjercicio1(conexion,"Ejercicio1_UD18", "Articulos", "Chip",22,2);
		System.out.println("Datos Fabricantes");
		funcion_individual.getValuesFabricantesEjercicio1(conexion,"Ejercicio1_UD18","Fabricantes");
		System.out.println("Datos Articulos");
		funcion_individual.getValuesArticulosEjercicio1(conexion,"Ejercicio1_UD18","Articulos");
		funcion_individual.deleteRecordFabrcianteEjercicio1(conexion, "Ejercicio1_UD18", "Fabricantes", 2);
		System.out.println("Datos Fabricantes");
		funcion_individual.getValuesFabricantesEjercicio1(conexion,"Ejercicio1_UD18","Fabricantes");
		System.out.println("Datos Articulos");
		funcion_individual.getValuesArticulosEjercicio1(conexion,"Ejercicio1_UD18","Articulos");
		//funcion.updateRecord(conexion, "Ejercicio1_UD18", null, null, null);
		funcion.closeConnection(conexion);
	}

}
