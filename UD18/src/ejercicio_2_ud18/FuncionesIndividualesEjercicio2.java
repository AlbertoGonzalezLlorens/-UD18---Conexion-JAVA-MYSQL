package ejercicio_2_ud18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.JOptionPane;


public class FuncionesIndividualesEjercicio2 {
	
	public void FuncionesIndividualesEjercicio2() {
		
	}
	
	//-------------------------------------------------CREAR TABLAS EJERCICIO 2 UD18--------------------------------------------------------
				public static void createTableDepartamentosEjercicio2(Connection conexion,String db, String name) {
					try {
						String Querydb = "USE " +db+";";
						Statement stdb= conexion.createStatement();
						stdb.executeUpdate(Querydb);
						
						String Query = "CREATE TABLE " + name+"(Codigo INT PRIMARY KEY AUTO_INCREMENT, Nombre NVARCHAR(100), Presupuesto INT)";
						Statement st = conexion.createStatement();
						st.executeUpdate(Query);
						System.out.println("Tabla creada");
						}catch(SQLException ex) {
						System.out.println(ex.getMessage());
						System.out.println("Error creando tabla.");
					}
					
				}
				
				public static void createTableEmpleadosEjercicio2(Connection conexion,String db, String name) {
					try {
						String Querydb = "USE " +db+";";
						Statement stdb= conexion.createStatement();
						stdb.executeUpdate(Querydb);
						
						String Query = "CREATE TABLE " + name+"(Dni VARCHAR(8) PRIMARY KEY, Nombre NVARCHAR(100), Apellidos NVARCHAR(255), Departamento INT, FOREIGN KEY (Departamento) REFERENCES Departamentos(Codigo) ON DELETE SET NULL ON UPDATE CASCADE)";
						Statement st = conexion.createStatement();
						st.executeUpdate(Query);
						System.out.println("Tabla creada");
						}catch(SQLException ex) {
						System.out.println(ex.getMessage());
						System.out.println("Error creando tabla.");
					}
					
				}
			
			//-------------------------------------------------INTRODUCIR DATOS EJERCICIO 1 UD18-----------------------------------------------------
			public static void insertDataDepartamentosEjercicio2(Connection conexion,String db, String table_name,String name, int presupuesto) {
				try {
					String Querydb = "USE "+db+";";
					Statement stdb = conexion.createStatement();
					stdb.executeUpdate(Querydb);
					
					String Query = "INSERT INTO "+table_name+"  (Nombre, Presupuesto) VALUE("
							+"\""+name+"\", "
							+"\""+presupuesto+"\");";
					
					Statement st = conexion.createStatement();
					st.executeUpdate(Query);
					
					System.out.println("Datos almacenados correctamente");
					
				}catch(SQLException ex) {
					System.out.println(ex.getMessage());
					JOptionPane.showMessageDialog(null, "Error en el almacenamiento");
				}
			}
			
			public void insertDataEmpleadosEjercicio2(Connection conexion,String db, String table_name, String dni, String name, String apellido, int id) {
				try {
					String Querydb = "USE "+db+";";
					Statement stdb = conexion.createStatement();
					stdb.executeUpdate(Querydb);
					
					String Query = "INSERT INTO "+table_name+"  (Dni,Nombre,Apellidos,Departamento) VALUE("
							+"\""+dni+"\", "
							+"\""+name+"\", "
							+"\""+apellido+"\", "
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
			
			public static void getValuesDepartamentosEjercicio2(Connection conexion,String db, String table_name) {
				try {
					String Querydb = "USE "+db+";";
					Statement stdb = conexion.createStatement();
					stdb.executeUpdate(Querydb);
					
					String Query = "SELECT * FROM "+table_name;
					Statement st= conexion.createStatement();
					java.sql.ResultSet resultSet;
					resultSet = st.executeQuery(Query);
					
					while (resultSet.next()) {
						System.out.println("Codigo: " + resultSet.getString("Codigo")+" "+"Nombre: "+ resultSet.getString("Nombre")+" "+"Presupuesto: "+ resultSet.getString("Presupuesto"));
					}
				
					
				}catch(SQLException ex) {
					System.out.println(ex.getMessage());
					JOptionPane.showMessageDialog(null, "Error en la adquisición de datos");
				}
			}
			
			public static void getValuesEmpleadosEjercicio2(Connection conexion,String db, String table_name) {
				try {
					String Querydb = "USE "+db+";";
					Statement stdb = conexion.createStatement();
					stdb.executeUpdate(Querydb);
					
					String Query = "SELECT * FROM "+table_name;
					Statement st= conexion.createStatement();
					java.sql.ResultSet resultSet;
					resultSet = st.executeQuery(Query);
					while (resultSet.next()) {
						System.out.println("Dni: " + resultSet.getString("Dni")+" "+"Nombre: "+ resultSet.getString("Nombre")+" "+"Apellidos: "+ resultSet.getString("Apellidos")+" "+"Departamento: "+ resultSet.getString("Departamento"));
					}
				
					
				}catch(SQLException ex) {
					System.out.println(ex.getMessage());
					JOptionPane.showMessageDialog(null, "Error en la adquisición de datos");
				}
			}
			//-------------------------------------------------ELIMINAR REGISTROS--------------------------------------------------------------------
			public void deleteRecordDepartamentosEjercicio2(Connection conexion,String db, String table_name, int ID) {
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
