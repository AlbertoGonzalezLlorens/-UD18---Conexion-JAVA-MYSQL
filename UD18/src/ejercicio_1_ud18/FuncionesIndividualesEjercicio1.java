package ejercicio_1_ud18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.JOptionPane;

public class FuncionesIndividualesEjercicio1 {

		public void FuncionesIndividualesEjercicio1() {
			
		}
		
		//-------------------------------------------------CREAR TABLAS EJERCICIO 1 UD18--------------------------------------------------------
		//Crea la tabla de fabricantes del ejercicio 1
			public static void createTableFabricantesEjercicio1(Connection conexion,String db, String name) {
				try {
					String Querydb = "USE " +db+";";
					Statement stdb= conexion.createStatement();
					stdb.executeUpdate(Querydb);
					
					String Query = "CREATE TABLE " + name+"(Codigo INT PRIMARY KEY AUTO_INCREMENT, Nombre NVARCHAR(100))";
					Statement st = conexion.createStatement();
					st.executeUpdate(Query);
					System.out.println("Tabla creada");
					}catch(SQLException ex) {
					System.out.println(ex.getMessage());
					System.out.println("Error creando tabla.");
				}
				
			}
			
			public static void createTableArticulosEjercicio1(Connection conexion,String db, String name) {
				try {
					String Querydb = "USE " +db+";";
					Statement stdb= conexion.createStatement();
					stdb.executeUpdate(Querydb);
					
					String Query = "CREATE TABLE " + name+"(Codigo INT PRIMARY KEY AUTO_INCREMENT, Nombre NVARCHAR(100), Precio INT, Fabricante INT, FOREIGN KEY (Fabricante) REFERENCES Fabricantes(Codigo) ON DELETE CASCADE ON UPDATE CASCADE)";
					Statement st = conexion.createStatement();
					st.executeUpdate(Query);
					System.out.println("Tabla creada");
					}catch(SQLException ex) {
					System.out.println(ex.getMessage());
					System.out.println("Error creando tabla.");
				}
				
			}
		
		//-------------------------------------------------INTRODUCIR DATOS EJERCICIO 1 UD18-----------------------------------------------------
		public static void insertDataFabricantesEjercicio1(Connection conexion,String db, String table_name, String name) {
			try {
				String Querydb = "USE "+db+";";
				Statement stdb = conexion.createStatement();
				stdb.executeUpdate(Querydb);
				
				String Query = "INSERT INTO "+table_name+"  (Nombre) VALUE("
						+"\""+name+"\");";
				
				Statement st = conexion.createStatement();
				st.executeUpdate(Query);
				
				System.out.println("Datos almacenados correctamente");
				
			}catch(SQLException ex) {
				System.out.println(ex.getMessage());
				JOptionPane.showMessageDialog(null, "Error en el almacenamiento");
			}
		}
		
		public void insertDataArticulosEjercicio1(Connection conexion,String db, String table_name, String name, int precio, int id) {
			try {
				String Querydb = "USE "+db+";";
				Statement stdb = conexion.createStatement();
				stdb.executeUpdate(Querydb);
				
				String Query = "INSERT INTO "+table_name+"  (Nombre,Precio,Fabricante) VALUE("
						+"\""+name+"\", "
						+"\""+precio+"\", "
						+"\""+id+"\");";
				
				Statement st = conexion.createStatement();
				st.executeUpdate(Query);
				
				System.out.println("Datos almacenados correctamente");
				
			}catch(SQLException ex) {
				System.out.println(ex.getMessage());
				JOptionPane.showMessageDialog(null, "Error en el almacenamiento");
			}
		}
		
		//-------------------------------------------------VER DATOS EJERCICIO 1 UD18-----------------------------------------------------------
		
		public static void getValuesFabricantesEjercicio1(Connection conexion,String db, String table_name) {
			try {
				String Querydb = "USE "+db+";";
				Statement stdb = conexion.createStatement();
				stdb.executeUpdate(Querydb);
				
				String Query = "SELECT * FROM "+table_name;
				Statement st= conexion.createStatement();
				java.sql.ResultSet resultSet;
				resultSet = st.executeQuery(Query);
				
				while (resultSet.next()) {
					System.out.println("Codigo: " + resultSet.getString("Codigo")+" "+"Nombre: "+ resultSet.getString("Nombre"));
				}
			
				
			}catch(SQLException ex) {
				System.out.println(ex.getMessage());
				JOptionPane.showMessageDialog(null, "Error en la adquisición de datos");
			}
		}
		
		public static void getValuesArticulosEjercicio1(Connection conexion,String db, String table_name) {
			try {
				String Querydb = "USE "+db+";";
				Statement stdb = conexion.createStatement();
				stdb.executeUpdate(Querydb);
				
				String Query = "SELECT * FROM "+table_name;
				Statement st= conexion.createStatement();
				java.sql.ResultSet resultSet;
				resultSet = st.executeQuery(Query);
				while (resultSet.next()) {
					System.out.println("Codigo: " + resultSet.getString("Codigo")+" "+"Nombre: "+ resultSet.getString("Nombre")+" "+"Precio: "+ resultSet.getString("Precio")+" "+"Fabricante: "+ resultSet.getString("Fabricante"));
				}
			
				
			}catch(SQLException ex) {
				System.out.println(ex.getMessage());
				JOptionPane.showMessageDialog(null, "Error en la adquisición de datos");
			}
		}
		//-------------------------------------------------ELIMINAR REGISTROS--------------------------------------------------------------------
		public void deleteRecordFabrcianteEjercicio1(Connection conexion,String db, String table_name, int ID) {
			try {
				String Querydb = "USE "+db+";";
				Statement stdb = conexion.createStatement();
				stdb.executeUpdate(Querydb);
				
				String Query = "DELETE FROM "+table_name+" WHERE Codigo = \""+ID+"\"";
				Statement st = conexion.createStatement();
				st.executeUpdate(Query);
				System.out.println("Se ha eliminado el registro correctamente");
			}catch(SQLException ex) {
				System.out.println(ex.getMessage());
				JOptionPane.showMessageDialog(null,"Error borrando el registro especificado");
			}
		}
}
