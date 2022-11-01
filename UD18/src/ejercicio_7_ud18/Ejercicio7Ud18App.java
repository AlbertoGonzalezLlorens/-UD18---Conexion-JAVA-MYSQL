package ejercicio_7_ud18;

import mysql_functions.Functions;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Ejercicio7Ud18App {

	public static void main(String[] args) {
		Functions funcion = new Functions();
		FuncionesIndividualesEjercicio7 funcion_individual = new FuncionesIndividualesEjercicio7();
		Connection conexion = funcion.createConexion();
		funcion.createDB(conexion, "Ejercicio7_UD18");
		funcion_individual.createTablePiezasEjercicio6(conexion,"Ejercicio7_UD18","Piezas");
		funcion_individual.createTableProveedoresEjercicio6(conexion,"Ejercicio7_UD18","Proveedores");
		funcion_individual.createTableAsignadoAEjercicio6(conexion,"Ejercicio7_UD18","Suministra");

	}

}
