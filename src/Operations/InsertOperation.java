package Operations;

import java.sql.PreparedStatement;
import java.util.Scanner;
import Modelclass.Student;
import Connection.Connection_sql;

public class InsertOperation {
	public static void insertoperation() {
		try {

			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter student ID: ");
			int id = scanner.nextInt();

			scanner.nextLine();

			System.out.print("Enter student name: ");
			String name = scanner.nextLine();
			System.out.print("Enter student age: ");

			int age = scanner.nextInt();
			scanner.nextLine();
			System.out.print("Enter student grade: ");
			String grade = scanner.nextLine();

			Student student = new Student(id, name, age, grade);

			String sql = "INSERT INTO Students (id, fname, age, grade) VALUES (?, ?, ?, ?)";
			PreparedStatement pstmt = CreateOperation.gettable().prepareStatement(sql);
			pstmt.setInt(1, student.getId());
			pstmt.setString(2, student.getName());
			pstmt.setInt(3, student.getAge());
			pstmt.setString(4, student.getGrade());
			pstmt.executeUpdate();

			System.out.println("Student inserted successfully.");
			pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
