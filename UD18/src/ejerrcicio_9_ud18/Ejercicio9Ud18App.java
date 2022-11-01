package ejerrcicio_9_ud18;

import mysql_functions.Functions;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Ejercicio9Ud18App {

	public static void main(String[] args) {
		
		Functions funcion = new Functions();
		FuncionesIndividualesEjercicio9 funcion_individual = new FuncionesIndividualesEjercicio9();
		Connection conexion = funcion.createConexion();
		funcion.createDB(conexion, "Ejercicio9_UD18");
		funcion_individual.createTableFacultadEjercicio9(conexion,"Ejercicio9_UD18","Facultades");
		funcion_individual.createTableInvestigadoresEjercicio9(conexion,"Ejercicio9_UD18","Investigadores");
		funcion_individual.createTableEquiposEjercicio9(conexion,"Ejercicio9_UD18","Equipos");
		funcion_individual.createTableReservaEjercicio9(conexion,"Ejercicio9_UD18","Reserva");
		funcion_individual.insertDataFacultadEjercicio9(conexion,"Ejercicio9_UD18","Facultades","Facultad 1");
		funcion_individual.insertDataFacultadEjercicio9(conexion,"Ejercicio9_UD18","Facultades","Facultad 2");
		funcion_individual.insertDataFacultadEjercicio9(conexion,"Ejercicio9_UD18","Facultades","Facultad 3");
		funcion_individual.insertDataInvestigadoresEjercicio9(conexion,"Ejercicio9_UD18","Investigadores","11111111A","Investigador 1",1);
		funcion_individual.insertDataInvestigadoresEjercicio9(conexion,"Ejercicio9_UD18","Investigadores","22222222B","Investigador 2",2);
		funcion_individual.insertDataInvestigadoresEjercicio9(conexion,"Ejercicio9_UD18","Investigadores","33333333C","Investigador 3",1);
		funcion_individual.insertDataEquiposEjercicio9(conexion,"Ejercicio9_UD18","Equipos","AAA1","Equipo 1",1);
		funcion_individual.insertDataEquiposEjercicio9(conexion,"Ejercicio9_UD18","Equipos","AAB1","Equipo 2",1);
		funcion_individual.insertDataEquiposEjercicio9(conexion,"Ejercicio9_UD18","Equipos","AAC1","Equipo 3",2);
		funcion_individual.insertDataReservaEjercicio9(conexion,"Ejercicio9_UD18","Reserva","11111111A","AAC1","2021-10-02","2022-10-02");
		funcion_individual.insertDataReservaEjercicio9(conexion,"Ejercicio9_UD18","Reserva","22222222B","AAC1","2020-10-02","2021-10-02");
		funcion_individual.insertDataReservaEjercicio9(conexion,"Ejercicio9_UD18","Reserva","11111111A","AAB1","2021-10-02","2022-10-02");
		System.out.println("Datos Facultades");
		funcion_individual.getValuesFacultadesEjercicio9(conexion,"Ejercicio9_UD18","Facultades");
		System.out.println("Datos Investigadores");
		funcion_individual.getValuesInvestigadoresEjercicio9(conexion,"Ejercicio9_UD18","Investigadores");
		System.out.println("Datos Equipos");
		funcion_individual.getValuesEquiposEjercicio9(conexion,"Ejercicio9_UD18","Equipos");
		System.out.println("Datos Reserva");
		funcion_individual.getValuesReservaEjercicio9(conexion,"Ejercicio9_UD18","Reserva");
		funcion_individual.deleteRecordFacultadesEjercicio9(conexion, "Ejercicio9_UD18", "Facultades", 2);
		funcion.closeConnection(conexion);
		
		
	}

}
