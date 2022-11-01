package ejercicio_6_ud18;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.JOptionPane;


public class FuncionesIndividualesEjercicio6 {
	
	public void FuncionesIndividualesEjercicio6() {
		
	}
	
	//-------------------------------------------------CREAR TABLAS EJERCICIO UD18--------------------------------------------------------
	
			public static void createTablePiezasEjercicio6(Connection conexion,String db, String name) {
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
			
			public static void createTableProveedoresEjercicio6(Connection conexion,String db, String name) {
				try {
					String Querydb = "USE " +db+";";
					Statement stdb= conexion.createStatement();
					stdb.executeUpdate(Querydb);
					
					String Query = "CREATE TABLE " + name+"(Id CHAR(4) PRIMARY KEY,  Nombre NVARCHAR(100))";
					Statement st = conexion.createStatement();
					st.executeUpdate(Query);
					System.out.println("Tabla creada");
					}catch(SQLException ex) {
					System.out.println(ex.getMessage());
					System.out.println("Error creando tabla.");
				}
				
			}
			
			public static void createTableSuministraEjercicio6(Connection conexion,String db, String name) {
				try {
					String Querydb = "USE " +db+";";
					Statement stdb= conexion.createStatement();
					stdb.executeUpdate(Querydb);
					
					String Query = "CREATE TABLE " + name+"(CodigoPieza INT, IdProveedor CHAR(4), Precio INT,PRIMARY KEY (CodigoPieza,IdProveedor), FOREIGN KEY (CodigoPieza) REFERENCES Piezas(Codigo) ON DELETE CASCADE ON UPDATE CASCADE, FOREIGN KEY (IdProveedor) REFERENCES Proveedores(Id) ON DELETE CASCADE ON UPDATE CASCADE)";
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
			
			public static void getValuesDirectoresEjercicio5(Connection conexion,String db, String table_name) {
				try {
					String Querydb = "USE "+db+";";
					Statement stdb = conexion.createStatement();
					stdb.executeUpdate(Querydb);
					
					String Query = "SELECT * FROM "+table_name;
					Statement st= conexion.createStatement();
					java.sql.ResultSet resultSet;
					resultSet = st.executeQuery(Query);
					while (resultSet.next()) {
						System.out.println("Dni: " + resultSet.getString("Dni")+" "+"NomApels: "+ resultSet.getString("NomApels")+" "+"DniJefe: "+ resultSet.getString("DniJefe")+" "+"Despacho: "+ resultSet.getString("Despacho"));
					}
				
					
				}catch(SQLException ex) {
					System.out.println(ex.getMessage());
					JOptionPane.showMessageDialog(null, "Error en la adquisición de datos");
				}
			}
			//-------------------------------------------------ELIMINAR REGISTROS--------------------------------------------------------------------
			public void deleteRecordDespachosEjercicio5(Connection conexion,String db, String table_name, int ID) {
				try {
					String Querydb = "USE "+db+";";
					Statement stdb = conexion.createStatement();
					stdb.executeUpdate(Querydb);
					
					String Query = "DELETE FROM "+table_name+" WHERE Numero = \""+ID+"\"";
					Statement st = conexion.createStatement();
					st.executeUpdate(Query);
					System.out.println("Se ha eliminado el registro correctamente");
				}catch(SQLException ex) {
					System.out.println(ex.getMessage());
					JOptionPane.showMessageDialog(null,"Error borrando el registro especificado");
				}
			}
}
