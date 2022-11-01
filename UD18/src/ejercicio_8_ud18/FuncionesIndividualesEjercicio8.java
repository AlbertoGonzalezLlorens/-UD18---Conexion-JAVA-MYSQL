package ejercicio_8_ud18;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.JOptionPane;


public class FuncionesIndividualesEjercicio8 {
	
	public void FuncionesIndividualesEjercicio8() {
		
	}
	
	//-------------------------------------------------CREAR TABLAS EJERCICIO UD18--------------------------------------------------------
	
			public void createTableProductosEjercicio8(Connection conexion,String db, String name) {
				try {
					String Querydb = "USE " +db+";";
					Statement stdb= conexion.createStatement();
					stdb.executeUpdate(Querydb);
					
					String Query = "CREATE TABLE " + name+"(Codigo INT PRIMARY KEY AUTO_INCREMENT, Nombre NVARCHAR(100), Precio INT)";
					Statement st = conexion.createStatement();
					st.executeUpdate(Query);
					System.out.println("Tabla creada");
					}catch(SQLException ex) {
					System.out.println(ex.getMessage());
					System.out.println("Error creando tabla.");
				}
				
			}
			
			public void createTableCajerosEjercicio8(Connection conexion,String db, String name) {
				try {
					String Querydb = "USE " +db+";";
					Statement stdb= conexion.createStatement();
					stdb.executeUpdate(Querydb);
					
					String Query = "CREATE TABLE " + name+"(Codigo INT PRIMARY KEY AUTO_INCREMENT,  NomApels NVARCHAR(255))";
					Statement st = conexion.createStatement();
					st.executeUpdate(Query);
					System.out.println("Tabla creada");
					}catch(SQLException ex) {
					System.out.println(ex.getMessage());
					System.out.println("Error creando tabla.");
				}
				
			}
			
			public void createTableMaquinaRegistradoraEjercicio8(Connection conexion,String db, String name) {
				try {
					String Querydb = "USE " +db+";";
					Statement stdb= conexion.createStatement();
					stdb.executeUpdate(Querydb);
					
					String Query = "CREATE TABLE " + name+"(Codigo INT PRIMARY KEY AUTO_INCREMENT,  Piso INT)";
					Statement st = conexion.createStatement();
					st.executeUpdate(Query);
					System.out.println("Tabla creada");
					}catch(SQLException ex) {
					System.out.println(ex.getMessage());
					System.out.println("Error creando tabla.");
				}
				
			}
			
			public void createTableVentaEjercicio8(Connection conexion,String db, String name) {
				try {
					String Querydb = "USE " +db+";";
					Statement stdb= conexion.createStatement();
					stdb.executeUpdate(Querydb);
					
					String Query = "CREATE TABLE " + name+"(Cajero INT, Maquina INT, Producto INT, PRIMARY KEY (Cajero,Maquina,Producto), FOREIGN KEY (Cajero) REFERENCES Cajeros(Codigo) ON DELETE CASCADE ON UPDATE CASCADE, FOREIGN KEY (Producto) REFERENCES Productos(Codigo) ON DELETE CASCADE ON UPDATE CASCADE, FOREIGN KEY (Maquina) REFERENCES Maquinas_Registradoras(Codigo) ON DELETE CASCADE ON UPDATE CASCADE)";
					Statement st = conexion.createStatement();
					st.executeUpdate(Query);
					System.out.println("Tabla creada");
					}catch(SQLException ex) {
					System.out.println(ex.getMessage());
					System.out.println("Error creando tabla.");
				}
				
			}
			
			
			//-------------------------------------------------INTRODUCIR DATOS EJERCICIO 1 UD18-----------------------------------------------------
			public void insertDataProductosEjercicio8(Connection conexion,String db, String table_name, String nombre, int precio) {
				try {
					String Querydb = "USE "+db+";";
					Statement stdb = conexion.createStatement();
					stdb.executeUpdate(Querydb);
					
					String Query = "INSERT INTO "+table_name+"  (Nombre,Precio) VALUE("
							+"\""+nombre+"\", "
							+"\""+precio+"\");";
					
					Statement st = conexion.createStatement();
					st.executeUpdate(Query);
					
					System.out.println("Datos almacenados correctamente");
					
				}catch(SQLException ex) {
					System.out.println(ex.getMessage());
					JOptionPane.showMessageDialog(null, "Error en el almacenamiento");
				}
			}
			
			public void insertDataCajerosEjercicio8(Connection conexion,String db, String table_name, String nombre) {
				try {
					String Querydb = "USE "+db+";";
					Statement stdb = conexion.createStatement();
					stdb.executeUpdate(Querydb);
					
					String Query = "INSERT INTO "+table_name+"  (NomApels) VALUE("
							+"\""+nombre+"\");";
					
					Statement st = conexion.createStatement();
					st.executeUpdate(Query);
					
					System.out.println("Datos almacenados correctamente");
					
				}catch(SQLException ex) {
					System.out.println(ex.getMessage());
					JOptionPane.showMessageDialog(null, "Error en el almacenamiento");
				}
			}
			
			public void insertDataMaquinasRegistradorasEjercicio8(Connection conexion,String db, String table_name, int piso) {
				try {
					String Querydb = "USE "+db+";";
					Statement stdb = conexion.createStatement();
					stdb.executeUpdate(Querydb);
					
					String Query = "INSERT INTO "+table_name+"  (Piso) VALUE("
							+"\""+piso+"\");";
					
					Statement st = conexion.createStatement();
					st.executeUpdate(Query);
					
					System.out.println("Datos almacenados correctamente");
					
				}catch(SQLException ex) {
					System.out.println(ex.getMessage());
					JOptionPane.showMessageDialog(null, "Error en el almacenamiento");
				}
			}
			
			public void insertDataVentaEjercicio8(Connection conexion,String db, String table_name, int cajero, int maquina, int producto) {
				try {
					String Querydb = "USE "+db+";";
					Statement stdb = conexion.createStatement();
					stdb.executeUpdate(Querydb);
					
					String Query = "INSERT INTO "+table_name+"  (Cajero,Maquina,Producto) VALUE("
							+"\""+cajero+"\", "
							+"\""+maquina+"\", "
							+"\""+producto+"\");";
					
					Statement st = conexion.createStatement();
					st.executeUpdate(Query);
					
					System.out.println("Datos almacenados correctamente");
					
				}catch(SQLException ex) {
					System.out.println(ex.getMessage());
					JOptionPane.showMessageDialog(null, "Error en el almacenamiento");
				}
			}
			
			//-------------------------------------------------VER DATOS EJERCICIO 1 UD18-----------------------------------------------------------
			
			public void getValuesProductosEjercicio8(Connection conexion,String db, String table_name) {
				try {
					String Querydb = "USE "+db+";";
					Statement stdb = conexion.createStatement();
					stdb.executeUpdate(Querydb);
					
					String Query = "SELECT * FROM "+table_name;
					Statement st= conexion.createStatement();
					java.sql.ResultSet resultSet;
					resultSet = st.executeQuery(Query);
					
					while (resultSet.next()) {
						System.out.println("Codigo: " + resultSet.getString("Codigo")+" "+"Nombre: "+ resultSet.getString("Nombre")+" "+"Precio: "+ resultSet.getString("Precio"));
					}
				
					
				}catch(SQLException ex) {
					System.out.println(ex.getMessage());
					JOptionPane.showMessageDialog(null, "Error en la adquisición de datos");
				}
			}
			
			public void getValuesCajerosEjercicio8(Connection conexion,String db, String table_name) {
				try {
					String Querydb = "USE "+db+";";
					Statement stdb = conexion.createStatement();
					stdb.executeUpdate(Querydb);
					
					String Query = "SELECT * FROM "+table_name;
					Statement st= conexion.createStatement();
					java.sql.ResultSet resultSet;
					resultSet = st.executeQuery(Query);
					while (resultSet.next()) {
						System.out.println("Codigo: " + resultSet.getString("Codigo")+" "+"NomApels: "+ resultSet.getString("NomApels"));
					}
				
					
				}catch(SQLException ex) {
					System.out.println(ex.getMessage());
					JOptionPane.showMessageDialog(null, "Error en la adquisición de datos");
				}
			}
			
			public void getValuesMaquinasRegistradorasEjercicio8(Connection conexion,String db, String table_name) {
				try {
					String Querydb = "USE "+db+";";
					Statement stdb = conexion.createStatement();
					stdb.executeUpdate(Querydb);
					
					String Query = "SELECT * FROM "+table_name;
					Statement st= conexion.createStatement();
					java.sql.ResultSet resultSet;
					resultSet = st.executeQuery(Query);
					while (resultSet.next()) {
						System.out.println("Codigo: " + resultSet.getString("Codigo")+" "+"Piso "+ resultSet.getString("Piso"));
					}
				
					
				}catch(SQLException ex) {
					System.out.println(ex.getMessage());
					JOptionPane.showMessageDialog(null, "Error en la adquisición de datos");
				}
			}
			
			public void getValuesVentaEjercicio8(Connection conexion,String db, String table_name) {
				try {
					String Querydb = "USE "+db+";";
					Statement stdb = conexion.createStatement();
					stdb.executeUpdate(Querydb);
					
					String Query = "SELECT * FROM "+table_name;
					Statement st= conexion.createStatement();
					java.sql.ResultSet resultSet;
					resultSet = st.executeQuery(Query);
					while (resultSet.next()) {
						System.out.println("Cajero: " + resultSet.getString("Cajero")+" "+"Maquina: "+ resultSet.getString("Maquina")+" "+"Producto: "+ resultSet.getString("Producto"));
					}
				
					
				}catch(SQLException ex) {
					System.out.println(ex.getMessage());
					JOptionPane.showMessageDialog(null, "Error en la adquisición de datos");
				}
			}
			//-------------------------------------------------ELIMINAR REGISTROS--------------------------------------------------------------------
			public void deleteRecordCajerosEjercicio8(Connection conexion,String db, String table_name, int id) {
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