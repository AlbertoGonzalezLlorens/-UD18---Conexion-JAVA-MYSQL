package ejercicio_8_ud18;

import mysql_functions.Functions;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Ejercicio8Ud18App {

	public static void main(String[] args) {
		Functions funcion = new Functions();
		FuncionesIndividualesEjercicio8 funcion_individual = new FuncionesIndividualesEjercicio8();
		Connection conexion = funcion.createConexion();
		funcion.createDB(conexion, "Ejercicio8_UD18");
		funcion_individual.createTableProductosEjercicio8(conexion,"Ejercicio8_UD18","Productos");
		funcion_individual.createTableCajerosEjercicio8(conexion,"Ejercicio8_UD18","Cajeros");
		funcion_individual.createTableMaquinaRegistradoraEjercicio8(conexion,"Ejercicio8_UD18","Maquinas_Registradoras");
		funcion_individual.createTableVentaEjercicio8(conexion,"Ejercicio8_UD18","Venta");
		funcion_individual.insertDataProductosEjercicio8(conexion,"Ejercicio8_UD18", "Productos", "Producto 1", 10);
		funcion_individual.insertDataProductosEjercicio8(conexion,"Ejercicio8_UD18", "Productos", "Producto 2", 20);
		funcion_individual.insertDataProductosEjercicio8(conexion,"Ejercicio8_UD18", "Productos", "Producto 3", 30);
		funcion_individual.insertDataCajerosEjercicio8(conexion,"Ejercicio8_UD18", "Cajeros", "Cajero 1");
		funcion_individual.insertDataCajerosEjercicio8(conexion,"Ejercicio8_UD18", "Cajeros", "Cajero 2");
		funcion_individual.insertDataCajerosEjercicio8(conexion,"Ejercicio8_UD18", "Cajeros", "Cajero 3");
		funcion_individual.insertDataMaquinasRegistradorasEjercicio8(conexion,"Ejercicio8_UD18", "Maquinas_Registradoras", 1);
		funcion_individual.insertDataMaquinasRegistradorasEjercicio8(conexion,"Ejercicio8_UD18", "Maquinas_Registradoras", 2);
		funcion_individual.insertDataMaquinasRegistradorasEjercicio8(conexion,"Ejercicio8_UD18", "Maquinas_Registradoras", 3);
		funcion_individual.insertDataVentaEjercicio8(conexion,"Ejercicio8_UD18", "Venta",1,3,1);
		funcion_individual.insertDataVentaEjercicio8(conexion,"Ejercicio8_UD18", "Venta",1,2,1);
		funcion_individual.insertDataVentaEjercicio8(conexion,"Ejercicio8_UD18", "Venta",2,1,3);
		System.out.println("Datos Productos");
		funcion_individual.getValuesProductosEjercicio8(conexion,"Ejercicio8_UD18","Productos");
		System.out.println("Datos Cajeros");
		funcion_individual.getValuesCajerosEjercicio8(conexion,"Ejercicio8_UD18","Cajeros");
		System.out.println("Datos Maquinas_Registradoras");
		funcion_individual.getValuesMaquinasRegistradorasEjercicio8(conexion,"Ejercicio8_UD18","Maquinas_Registradoras");
		System.out.println("Datos Venta");
		funcion_individual.getValuesVentaEjercicio8(conexion,"Ejercicio8_UD18","Venta");
		funcion_individual.deleteRecordCajerosEjercicio8(conexion, "Ejercicio8_UD18", "Cajeros", 2);
		funcion.closeConnection(conexion);
	}

}
