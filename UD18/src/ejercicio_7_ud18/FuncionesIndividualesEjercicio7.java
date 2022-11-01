package ejercicio_7_ud18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.JOptionPane;


public class FuncionesIndividualesEjercicio7 {
	
	public void FuncionesIndividualesEjercicio7() {
		
	}
	
	//-------------------------------------------------CREAR TABLAS EJERCICIO UD18--------------------------------------------------------
	
			public static void createTableCientificosEjercicio6(Connection conexion,String db, String name) {
				try {
					String Querydb = "USE " +db+";";
					Statement stdb= conexion.createStatement();
					stdb.executeUpdate(Querydb);
					
					String Query = "CREATE TABLE " + name+"(Dni VARCHAR(8) PRIMARY KEY, NomApels NVARCHAR(255))";
					Statement st = conexion.createStatement();
					st.executeUpdate(Query);
					System.out.println("Tabla creada");
					}catch(SQLException ex) {
					System.out.println(ex.getMessage());
					System.out.println("Error creando tabla.");
				}
				
			}
			
			public static void createTableProyectoEjercicio6(Connection conexion,String db, String name) {
				try {
					String Querydb = "USE " +db+";";
					Statement stdb= conexion.createStatement();
					stdb.executeUpdate(Querydb);
					
					String Query = "CREATE TABLE " + name+"(Id CHAR(4) PRIMARY KEY,  Nombre NVARCHAR(255), Horas INT)";
					Statement st = conexion.createStatement();
					st.executeUpdate(Query);
					System.out.println("Tabla creada");
					}catch(SQLException ex) {
					System.out.println(ex.getMessage());
					System.out.println("Error creando tabla.");
				}
				
			}
			
			public static void createTableAsignadoAEjercicio6(Connection conexion,String db, String name) {
				try {
					String Querydb = "USE " +db+";";
					Statement stdb= conexion.createStatement();
					stdb.executeUpdate(Querydb);
					
					String Query = "CREATE TABLE " + name+"(Cientifico VARCHAR(8), Proyecto CHAR(4),PRIMARY KEY (Cientifico,Proyecto), FOREIGN KEY (Cientifico) REFERENCES Cientificos(Dni) ON DELETE CASCADE ON UPDATE CASCADE, FOREIGN KEY (Proyecto) REFERENCES Proyectos(Id) ON DELETE CASCADE ON UPDATE CASCADE)";
					Statement st = conexion.createStatement();
					st.executeUpdate(Query);
					System.out.println("Tabla creada");
					}catch(SQLException ex) {
					System.out.println(ex.getMessage());
					System.out.println("Error creando tabla.");
				}
				
			}
			
			
			//-------------------------------------------------INTRODUCIR DATOS EJERCICIO 1 UD18-----------------------------------------------------
			public static void insertDataPiezasEjercicio6(Connection conexion,String db, String table_name, String nombre) {
				try {
					String Querydb = "USE "+db+";";
					Statement stdb = conexion.createStatement();
					stdb.executeUpdate(Querydb);
					
					String Query = "INSERT INTO "+table_name+"  (Nombre) VALUE("
							+"\""+nombre+"\");";
					
					Statement st = conexion.createStatement();
					st.executeUpdate(Query);
					
					System.out.println("Datos almacenados correctamente");
					
				}catch(SQLException ex) {
					System.out.println(ex.getMessage());
					JOptionPane.showMessageDialog(null, "Error en el almacenamiento");
				}
			}
			
			public void insertDataProveedoresEjercicio6(Connection conexion,String db, String table_name, String id, String nombre) {
				try {
					String Querydb = "USE "+db+";";
					Statement stdb = conexion.createStatement();
					stdb.executeUpdate(Querydb);
					
					String Query = "INSERT INTO "+table_name+"  (Id,Nombre) VALUE("
							+"\""+id+"\", "
							+"\""+nombre+"\");";
					
					Statement st = conexion.createStatement();
					st.executeUpdate(Query);
					
					System.out.println("Datos almacenados correctamente");
					
				}catch(SQLException ex) {
					System.out.println(ex.getMessage());
					JOptionPane.showMessageDialog(null, "Error en el almacenamiento");
				}
			}
			
			public void insertDataSuministraEjercicio6(Connection conexion,String db, String table_name, int codigo_pieza, String id_proveedor, int precio) {
				try {
					String Querydb = "USE "+db+";";
					Statement stdb = conexion.createStatement();
					stdb.executeUpdate(Querydb);
					
					String Query = "INSERT INTO "+table_name+"  (CodigoPieza,IdProveedor,Precio) VALUE("
							+"\""+codigo_pieza+"\", "
							+"\""+id_proveedor+"\", "
							+"\""+precio+"\");";
					
					Statement st = conexion.createStatement();
					st.executeUpdate(Query);
					
					System.out.println("Datos almacenados correctamente");
					
				}catch(SQLException ex) {
					System.out.println(ex.getMessage());
					JOptionPane.showMessageDialog(null, "Error en el almacenamiento");
				}
			}
			
			//-------------------------------------------------VER DATOS EJERCICIO 1 UD18-----------------------------------------------------------
			
			public static void getValuesPiezasEjercicio6(Connection conexion,String db, String table_name) {
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
			
			public static void getValuesProveedoresEjercicio6(Connection conexion,String db, String table_name) {
				try {
					String Querydb = "USE "+db+";";
					Statement stdb = conexion.createStatement();
					stdb.executeUpdate(Querydb);
					
					String Query = "SELECT * FROM "+table_name;
					Statement st= conexion.createStatement();
					java.sql.ResultSet resultSet;
					resultSet = st.executeQuery(Query);
					while (resultSet.next()) {
						System.out.println("Id: " + resultSet.getString("Id")+" "+"Nombre: "+ resultSet.getString("Nombre"));
					}
				
					
				}catch(SQLException ex) {
					System.out.println(ex.getMessage());
					JOptionPane.showMessageDialog(null, "Error en la adquisición de datos");
				}
			}
			
			public static void getValuesSuministraEjercicio6(Connection conexion,String db, String table_name) {
				try {
					String Querydb = "USE "+db+";";
					Statement stdb = conexion.createStatement();
					stdb.executeUpdate(Querydb);
					
					String Query = "SELECT * FROM "+table_name;
					Statement st= conexion.createStatement();
					java.sql.ResultSet resultSet;
					resultSet = st.executeQuery(Query);
					while (resultSet.next()) {
						System.out.println("CodigoPieza: " + resultSet.getString("CodigoPieza")+" "+"IdProveedor: "+ resultSet.getString("IdProveedor")+" "+"Precio: "+ resultSet.getString("Precio"));
					}
				
					
				}catch(SQLException ex) {
					System.out.println(ex.getMessage());
					JOptionPane.showMessageDialog(null, "Error en la adquisición de datos");
				}
			}
			//-------------------------------------------------ELIMINAR REGISTROS--------------------------------------------------------------------
			public void deleteRecordPiezasEjercicio6(Connection conexion,String db, String table_name, int id) {
				try {
					String Querydb = "USE "+db+";";
					Statement stdb = conexion.createStatement();
					stdb.executeUpdate(Querydb);
					
					String Query = "DELETE FROM "+table_name+" WHERE Codigo = \""+id+"\"";
					Statement st = conexion.createStatement();
					st.executeUpdate(Query);
					System.out.println("Se ha eliminado el registro correctamente");
				}catch(SQLException ex) {
					System.out.println(ex.getMessage());
					JOptionPane.showMessageDialog(null,"Error borrando el registro especificado");
				}
			}
}