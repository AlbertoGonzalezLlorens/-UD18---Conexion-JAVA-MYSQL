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
		funcion_individual.createTableCientificosEjercicio7(conexion,"Ejercicio7_UD18","Cientificos");
		funcion_individual.createTableProyectoEjercicio7(conexion,"Ejercicio7_UD18","Proyectos");
		funcion_individual.createTableAsignadoAEjercicio7(conexion,"Ejercicio7_UD18","Asignado_A");
		funcion_individual.insertDataCientificosEjercicio7(conexion,"Ejercicio7_UD18", "Cientificos", "1111111A", "Cientifico 1");
		funcion_individual.insertDataCientificosEjercicio7(conexion,"Ejercicio7_UD18", "Cientificos", "2222222B", "Cientifico 2");
		funcion_individual.insertDataCientificosEjercicio7(conexion,"Ejercicio7_UD18", "Cientificos", "3333333C", "Cientifico 3");
		funcion_individual.insertDataProyectoEjercicio7(conexion,"Ejercicio7_UD18", "Proyectos", "AAA1", "Proyecto 1");
		funcion_individual.insertDataProyectoEjercicio7(conexion,"Ejercicio7_UD18", "Proyectos", "BBB1", "Proyecto 2");
		funcion_individual.insertDataProyectoEjercicio7(conexion,"Ejercicio7_UD18", "Proyectos", "CCC1", "Proyecto 3");
		funcion_individual.insertDataAsignadoAEjercicio7(conexion,"Ejercicio7_UD18", "Asignado_A", "1111111A", "AAA1");
		funcion_individual.insertDataAsignadoAEjercicio7(conexion,"Ejercicio7_UD18", "Asignado_A", "1111111A", "BBB1");
		funcion_individual.insertDataAsignadoAEjercicio7(conexion,"Ejercicio7_UD18", "Asignado_A", "2222222B", "BBB1");
		System.out.println("Datos Cientifcios");
		funcion_individual.getValuesCientificosEjercicio7(conexion,"Ejercicio7_UD18","Cientificos");
		System.out.println("Datos Proyectos");
		funcion_individual.getValuesProyectosEjercicio7(conexion,"Ejercicio7_UD18","Proyectos");
		System.out.println("Datos Asignado A");
		funcion_individual.getValuesAsignadoAEjercicio7(conexion,"Ejercicio7_UD18","Asignado_A");
		funcion_individual.deleteRecordProyectoEjercicio7(conexion, "Ejercicio7_UD18", "Proyectos", "CCC1");
		funcion.closeConnection(conexion);

	}

}
