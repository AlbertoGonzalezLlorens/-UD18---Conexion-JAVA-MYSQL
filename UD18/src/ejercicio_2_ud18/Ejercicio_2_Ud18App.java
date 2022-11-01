package ejercicio_2_ud18;

import mysql_functions.Functions;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import ejercicio_1_ud18.FuncionesIndividualesEjercicio1;

public class Ejercicio_2_Ud18App {

	public static void main(String[] args) {
		
		Functions funcion = new Functions();
		FuncionesIndividualesEjercicio2 funcion_individual = new FuncionesIndividualesEjercicio2();
		Connection conexion = funcion.createConexion();
		funcion.createDB(conexion, "Ejercicio2_UD18");
		funcion_individual.createTableDepartamentosEjercicio2(conexion,"Ejercicio2_UD18","Departamentos");
		funcion_individual.createTableEmpleadosEjercicio2(conexion,"Ejercicio2_UD18","Empleados");
		funcion_individual.insertDataDepartamentosEjercicio2(conexion,"Ejercicio2_UD18", "Departamentos", "Departamento 1",1000);
		funcion_individual.insertDataDepartamentosEjercicio2(conexion,"Ejercicio2_UD18", "Departamentos", "Departamento 2",2000);
		funcion_individual.insertDataDepartamentosEjercicio2(conexion,"Ejercicio2_UD18", "Departamentos", "Departamento 3",3000);
		funcion_individual.insertDataEmpleadosEjercicio2(conexion,"Ejercicio2_UD18", "Empleados", "11111111A", "Nombre 1","Apellido 1",1);
		funcion_individual.insertDataEmpleadosEjercicio2(conexion,"Ejercicio2_UD18", "Empleados", "11111111B", "Nombre 2","Apellido 2",1);
		funcion_individual.insertDataEmpleadosEjercicio2(conexion,"Ejercicio2_UD18", "Empleados", "11111111C", "Nombre 3","Apellido 3",2);
		System.out.println("Datos Departamento");
		funcion_individual.getValuesDepartamentosEjercicio2(conexion,"Ejercicio2_UD18","Departamentos");
		System.out.println("Datos Articulos");
		funcion_individual.getValuesEmpleadosEjercicio2(conexion,"Ejercicio2_UD18","Empleados");
		funcion_individual.deleteRecordDepartamentosEjercicio2(conexion, "Ejercicio2_UD18", "Departamentos", 2);
		funcion.closeConnection(conexion);
	}

}
