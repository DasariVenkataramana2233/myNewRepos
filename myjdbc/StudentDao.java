package myjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class StudentDao {

	static {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
	}

	public Connection getConnection() throws SQLException {

		return DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
	}

	public void insertRecord(StudentDto dto) throws SQLException {

		Connection con = getConnection();

		String sql = "insert into studentinfo (name,tel,hin,eng,math,sci,soc,total,percentage,grade) values ( ?,?,?,?,?,?,?,?,?,?)";

		PreparedStatement ps = con.prepareStatement(sql);

		ps.setString(1, dto.getName());
		ps.setInt(2, dto.getTel());
		ps.setInt(3, dto.getHin());
		ps.setInt(4, dto.getEng());
		ps.setInt(5, dto.getMath());
		ps.setInt(6, dto.getSci());
		ps.setInt(7, dto.getSoc());
		ps.setInt(8, dto.getTotal());
		ps.setDouble(9, dto.getPercentage());
		ps.setString(10, dto.getGrade());

		int n = ps.executeUpdate();

		if (n > 0) {

			System.out.println("row inserted successfully");
		} else {

			System.out.println("not inserted into the table");
		}
	}

	public void updateDetails(StudentDto dto, int id) throws SQLException {

		Connection con = getConnection();

		String sql = "update studentinfo set name=? where id=" + id;

		PreparedStatement ps = con.prepareStatement(sql);

		ps.setString(1, dto.getName());

		int n = ps.executeUpdate();

		if (n > 0) {

			System.out.println("row Updated successfully");
		} else {

			System.out.println("not Updated in the table");
		}
	}

	/*
	 * public void updateAllDetails(StudentDto dto) throws SQLException {
	 * 
	 * Connection con = getConnection();
	 * 
	 * String sql = "update studentinfo set(?,?,?,?,?,?,?,?) where id=?";
	 * 
	 * PreparedStatement ps = con.prepareStatement(sql);
	 * 
	 * int n = ps.executeUpdate();
	 * 
	 * if (n > 0) {
	 * 
	 * System.out.println("row Updated successfully"); } else {
	 * 
	 * System.out.println("not Updated in the table"); }
	 * 
	 * }
	 */

//	public void getElementById(StudentDto dto) throws SQLException {

	public void getElementById(int id) throws SQLException {

		Connection con = getConnection();

		String sql = "select * from studentinfo where id=" + id;

		PreparedStatement ps = con.prepareStatement(sql);

		// ps.setInt(1, dto.getId());

		ResultSet result = ps.executeQuery();

		if (result.next()) {

			int roll_number = result.getInt("id");
			String name = result.getString("name");
			int telugu = result.getInt("tel");
			int hindi = result.getInt("hin");
			int english = result.getInt("eng");
			int maths = result.getInt("math");
			int science = result.getInt("sci");
			int social = result.getInt("soc");
			int total = result.getInt("total");
			double percent = result.getDouble("percentage");
			String grade = result.getString("grade");

			System.out.println(roll_number + " " + name + " " + telugu + " " + hindi + " " + english + " " + maths + " "
					+ science + " " + social + " " + total + " " + percent + " " + grade);

		} else {

			System.out.println(id + " Entered is not in the table ");
		}

	}

	public void getAllElements() throws SQLException {

		Connection con = getConnection();

		String sql = " select * from studentinfo ";

		PreparedStatement ps = con.prepareStatement(sql);

		ResultSet result = ps.executeQuery();

		while (result.next()) {

			int roll_number = result.getInt("id");
			String name = result.getString("name");
			int telugu = result.getInt("tel");
			int hindi = result.getInt("hin");
			int english = result.getInt("eng");
			int maths = result.getInt("math");
			int science = result.getInt("sci");
			int social = result.getInt("soc");
			int total = result.getInt("total");
			double percent = result.getDouble("percentage");
			String grade = result.getString("grade");

			System.out.println(roll_number + " " + name + " " + telugu + " " + hindi + " " + english + " " + maths + " "
					+ science + " " + social + " " + total + " " + percent + " " + grade);

		}

	}

	public void deleteElementById(StudentDto dto) throws SQLException {

		Connection con = getConnection();

		String sql = " delete  from studentinfo where id=?";

		PreparedStatement ps = con.prepareStatement(sql);

		ps.setInt(1, dto.getId());

		int n = ps.executeUpdate();

		if (n > 0) {

			System.out.println("row deleted successfully..check in database");
		} else {

			System.out.println("not deleted yet");
		}
	}

	public void deleteAllElements() throws SQLException {

		Connection con = getConnection();

		String sql = " delete  from studentinfo ";

		PreparedStatement ps = con.prepareStatement(sql);

		int n = ps.executeUpdate();

		if (n > 0) {

			System.out.println("rows deleted successfully..check in database");
		} else {

			System.out.println("not deleted yet atleast row");
		}

	}


}
