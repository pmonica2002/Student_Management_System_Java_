package Operations;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import Connection.Connection_sql;
import java.util.List;
import Modelclass.Student;
import java.util.ArrayList;

public class DisplayOperation {
	public static void displayoperation() {
		try {

			Statement stmt = CreateOperation.gettable().createStatement();

			String sql = "SELECT * FROM Students";
			ResultSet rs = stmt.executeQuery(sql);

			List<Student> students = new ArrayList<>();

			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("fname");
				int age = rs.getInt("age");
				String grade = rs.getString("grade");

				Student student = new Student(id, name, age, grade);
				students.add(student);
			}

			if (students.isEmpty()) {
				System.out.println("No students found.");
			} else {
				System.out.println("Student List:");
				for (Student student : students) {
					System.out.println("ID: " + student.getId());
					System.out.println("Name: " + student.getName());
					System.out.println("Age: " + student.getAge());
					System.out.println("Grade: " + student.getGrade());
					System.out.println("--------------------");
				}
			}
			rs.close();
			stmt.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
