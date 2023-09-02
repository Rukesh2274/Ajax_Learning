package com.bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class SearchBean {
	
	public HashSet SearchByCourse(String pCourse)
	{
		HashSet<Student> hs = new HashSet<Student>();
		Connection con;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Training","root","Rukesh2274");
			PreparedStatement ps = con.prepareStatement("select * from student6 where course=?");
			ps.setString(1, pCourse);
			ResultSet rs = ps.executeQuery();
			Student s;
			while(rs.next())
			{
				s = new Student();
				s.setRno(rs.getInt("Rno"));
				s.setName(rs.getString("name"));
				s.setaddress(rs.getString("address"));
				s.setcourse(rs.getString("course"));
				hs.add(s);
				
			}
		}
		catch(ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		return hs;
	}

}
