package com.globallogic.day14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MYJDBC {

	public static void main(String[] args) {

		// checked exception
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String username = "root";
			String password = "root";
			String url = "jdbc:mysql://localhost:3306/buddy";
			Connection con = DriverManager.getConnection(url, username, password);
			Statement st = con.createStatement();
			
			String insertQuery="insert into employee(id,name,fname,salary,deptid) values (10,'pooja','kumar',50000,1)";
			st.execute(insertQuery);

			//update query starts
			
			//delete query starts
			String deleteQuery="delete from employee where id=9";
			st.executeUpdate(deleteQuery);
			
			//delete query ends
			
			
			String updateQuery="update employee set salary=50001 where id=9";
			st.executeUpdate(updateQuery);
			
			//update query ends
			
			
			// Select using executeQuery
						String query = "select * from employee";
						
						ResultSet rs = st.executeQuery(query);
			while(rs.next())
			{
				//rs.getint() 
				    //pass the index 
				    //pass the columnname
				System.out.println("id : "+" "+rs.getInt("id") +" name : "+rs.getString(2) +" fname :  "+rs.getString(3) +" salary : "+rs.getInt(4));
				
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
