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
	
			public void createTableCientificosEjercicio7(Connection conexion,String db, String name) {
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
			
			public void createTableProyectoEjercicio7(Connection conexion,String db, String name) {
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
			
			public void createTableAsignadoAEjercicio7(Connection conexion,String db, String name) {
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
			public void insertDataCientificosEjercicio7(Connection conexion,String db, String table_name, String dni, String nom_apels) {
				try {
					String Querydb = "USE "+db+";";
					Statement stdb = conexion.createStatement();
					stdb.executeUpdate(Querydb);
					
					String Query = "INSERT INTO "+table_name+"  (Dni,NomApels) VALUE("
							+"\""+dni+"\", "
							+"\""+nom_apels+"\");";
					
					Statement st = conexion.createStatement();
					st.executeUpdate(Query);
					
					System.out.println("Datos almacenados correctamente");
					
				}catch(SQLException ex) {
					System.out.println(ex.getMessage());
					JOptionPane.showMessageDialog(null, "Error en el almacenamiento");
				}
			}
			
			public void insertDataProyectoEjercicio7(Connection conexion,String db, String table_name, String id, String nombre) {
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
			
			public void insertDataAsignadoAEjercicio7(Connection conexion,String db, String table_name, String cientifcio, String proyecto) {
				try {
					String Querydb = "USE "+db+";";
					Statement stdb = conexion.createStatement();
					stdb.executeUpdate(Querydb);
					
					String Query = "INSERT INTO "+table_name+"  (Cientifico,Proyecto) VALUE("
							+"\""+cientifcio+"\", "
							+"\""+proyecto+"\");";
					
					Statement st = conexion.createStatement();
					st.executeUpdate(Query);
					
					System.out.println("Datos almacenados correctamente");
					
				}catch(SQLException ex) {
					System.out.println(ex.getMessage());
					JOptionPane.showMessageDialog(null, "Error en el almacenamiento");
				}
			}
			
			//-------------------------------------------------VER DATOS EJERCICIO 1 UD18-----------------------------------------------------------
			
			public void getValuesCientificosEjercicio7(Connection conexion,String db, String table_name) {
				try {
					String Querydb = "USE "+db+";";
					Statement stdb = conexion.createStatement();
					stdb.executeUpdate(Querydb);
					
					String Query = "SELECT * FROM "+table_name;
					Statement st= conexion.createStatement();
					java.sql.ResultSet resultSet;
					resultSet = st.executeQuery(Query);
					
					while (resultSet.next()) {
						System.out.println("Dni: " + resultSet.getString("Dni")+" "+"NomApels: "+ resultSet.getString("NomApels"));
					}
				
					
				}catch(SQLException ex) {
					System.out.println(ex.getMessage());
					JOptionPane.showMessageDialog(null, "Error en la adquisición de datos");
				}
			}
			
			public void getValuesProyectosEjercicio7(Connection conexion,String db, String table_name) {
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
			
			public void getValuesAsignadoAEjercicio7(Connection conexion,String db, String table_name) {
				try {
					String Querydb = "USE "+db+";";
					Statement stdb = conexion.createStatement();
					stdb.executeUpdate(Querydb);
					
					String Query = "SELECT * FROM "+table_name;
					Statement st= conexion.createStatement();
					java.sql.ResultSet resultSet;
					resultSet = st.executeQuery(Query);
					while (resultSet.next()) {
						System.out.println("Cientifico: " + resultSet.getString("Cientifico")+" "+"Proyecto: "+ resultSet.getString("Proyecto"));
					}
				
					
				}catch(SQLException ex) {
					System.out.println(ex.getMessage());
					JOptionPane.showMessageDialog(null, "Error en la adquisición de datos");
				}
			}
			//-------------------------------------------------ELIMINAR REGISTROS--------------------------------------------------------------------
			public void deleteRecordProyectoEjercicio7(Connection conexion,String db, String table_name, String id) {
				try {
					String Querydb = "USE "+db+";";
					Statement stdb = conexion.createStatement();
					stdb.executeUpdate(Querydb);
					
					String Query = "DELETE FROM "+table_name+" WHERE Id = \""+id+"\"";
					Statement st = conexion.createStatement();
					st.executeUpdate(Query);
					System.out.println("Se ha eliminado el registro correctamente");
				}catch(SQLException ex) {
					System.out.println(ex.getMessage());
					JOptionPane.showMessageDialog(null,"Error borrando el registro especificado");
				}
			}
}