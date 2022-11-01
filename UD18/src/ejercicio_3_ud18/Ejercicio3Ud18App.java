package ejercicio_3_ud18;

import mysql_functions.Functions;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Ejercicio3Ud18App {

	public static void main(String[] args) {
		
		Functions funcion = new Functions();
		FuncionesIndividualesEjercicio3 funcion_individual = new FuncionesIndividualesEjercicio3();
		Connection conexion = funcion.createConexion();
		funcion.createDB(conexion, "Ejercicio3_UD18");
		funcion_individual.createTableAlmacenesEjercicio3(conexion,"Ejercicio3_UD18","Almacenes");
		funcion_individual.createTableCajasEjercicio3(conexion,"Ejercicio3_UD18","Cajas");
		funcion_individual.insertDataAlmacenesEjercicio3(conexion,"Ejercicio3_UD18", "Almacenes", "Lugar 1",1);
		funcion_individual.insertDataAlmacenesEjercicio3(conexion,"Ejercicio3_UD18", "Almacenes", "Lugar 2",2);
		funcion_individual.insertDataAlmacenesEjercicio3(conexion,"Ejercicio3_UD18", "Almacenes", "Lugar 3",3);
		funcion_individual.insertDataCajasEjercicio3(conexion,"Ejercicio3_UD18", "Cajas", "00001", "Contenido 1",10,1);
		funcion_individual.insertDataCajasEjercicio3(conexion,"Ejercicio3_UD18", "Cajas", "00002", "Contenido 2",20,1);
		funcion_individual.insertDataCajasEjercicio3(conexion,"Ejercicio3_UD18", "Cajas", "00003", "Contenido 3",30,2);
		System.out.println("Datos Almacenes");
		funcion_individual.getValuesAlmacenesEjercicio3(conexion,"Ejercicio3_UD18","Almacenes");
		System.out.println("Datos Cajas");
		funcion_individual.getValuesCajasEjercicio3(conexion,"Ejercicio3_UD18","Cajas");
		funcion_individual.deleteRecordAlmacenesEjercicio3(conexion, "Ejercicio3_UD18", "Almacenes", 2);
		funcion.closeConnection(conexion);

	}

}
