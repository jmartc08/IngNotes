package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {
	private Object[][] tabla;
	private Statement s;
	private Connection con;

	public Conexion(){
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
			String url = "jdbc:mysql://127.0.0.1:3306/IngNotes";
			con = DriverManager.getConnection(url, "root","");
			s = con.createStatement();
		} catch (Exception e) {
		}
	}

	public Object[][] getData(String sql){
		tabla = consulta(sql);
		return tabla;
	}
	
	private Object[][] consulta(String sql){
		Object[][] tabla = null;
		ResultSet rs = null;
		try{
			int rows = 0;
			//Cuento las filas
			rs = s.executeQuery(sql);
			while (rs.next()){
				rows++;
			}

			rs = s.executeQuery(sql);//Una manera de que el cursor de la tabla vuelva al principio
			int cols = rs.getMetaData().getColumnCount();//Saco el n�mero de columnas de los metadatos
			tabla= new Object[rows][cols];
			int i=1;
			while(rs.next()) {
				Object[] lectura = new Object[cols];
				for(int j=0; j<cols; j++){
					lectura[j]=rs.getString(j+1);
					if(lectura[j].equals("")) break;
					else tabla[i-1][j]=lectura[j];
				}
				i++;
			}
		}
		catch (Exception e){
		}
		return tabla;
	}

	public void setData(String sql) {
		try {
			s.execute(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
