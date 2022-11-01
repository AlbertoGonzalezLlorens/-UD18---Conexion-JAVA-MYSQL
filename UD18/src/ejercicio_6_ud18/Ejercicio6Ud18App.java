package ejercicio_6_ud18;

import mysql_functions.Functions;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Ejercicio6Ud18App {

	public static void main(String[] args) {
		Functions funcion = new Functions();
		FuncionesIndividualesEjercicio6 funcion_individual = new FuncionesIndividualesEjercicio6();
		Connection conexion = funcion.createConexion();
		funcion.createDB(conexion, "Ejercicio6_UD18");
		funcion_individual.createTablePiezasEjercicio6(conexion,"Ejercicio6_UD18","Piezas");
		funcion_individual.createTableProveedoresEjercicio6(conexion,"Ejercicio6_UD18","Proveedores");
		funcion_individual.createTableSuministraEjercicio6(conexion,"Ejercicio6_UD18","Suministra");
		funcion_individual.insertDataPiezasEjercicio6(conexion,"Ejercicio6_UD18", "Piezas", "Pieza 1");
		funcion_individual.insertDataPiezasEjercicio6(conexion,"Ejercicio6_UD18", "Piezas", "Pieza 2");
		funcion_individual.insertDataPiezasEjercicio6(conexion,"Ejercicio6_UD18", "Piezas", "Pieza 3");
		funcion_individual.insertDataProveedoresEjercicio6(conexion,"Ejercicio6_UD18", "Proveedores","AAA1","Proveedor 1");
		funcion_individual.insertDataProveedoresEjercicio6(conexion,"Ejercicio6_UD18", "Proveedores","BBB2","Proveedor 2");
		funcion_individual.insertDataProveedoresEjercicio6(conexion,"Ejercicio6_UD18", "Proveedores","CCC3","Proveedor 3");
		funcion_individual.insertDataSuministraEjercicio6(conexion,"Ejercicio6_UD18", "Suministra",1,"AAA1",10);
		funcion_individual.insertDataSuministraEjercicio6(conexion,"Ejercicio6_UD18", "Suministra",1,"BBB2",20);
		funcion_individual.insertDataSuministraEjercicio6(conexion,"Ejercicio6_UD18", "Suministra",2,"CCC3",30);
		System.out.println("Datos Piezas");
		funcion_individual.getValuesPiezasEjercicio6(conexion,"Ejercicio6_UD18","Piezas");
		System.out.println("Datos Proveedores");
		funcion_individual.getValuesProveedoresEjercicio6(conexion,"Ejercicio6_UD18","Proveedores");
		System.out.println("Datos Suministra");
		funcion_individual.getValuesSuministraEjercicio6(conexion,"Ejercicio6_UD18","Suministra");
		funcion_individual.deleteRecordPiezasEjercicio6(conexion, "Ejercicio5_UD18", "Peliculas", 2);
		funcion.closeConnection(conexion);
	}

}
