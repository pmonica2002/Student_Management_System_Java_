package Operations;

import java.sql.PreparedStatement;
import java.util.Scanner;
import Connection.Connection_sql;

public class DeleteOperation {
	public static void deleteoperation() {
		try {

			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter student ID to delete: ");
			int id = scanner.nextInt();
			scanner.nextLine();
			String sql = "DELETE FROM Students WHERE id = ?";
			PreparedStatement pstmt = CreateOperation.gettable().prepareStatement(sql);
			pstmt.setInt(1, id);
			int rowsAffected = pstmt.executeUpdate();

			if (rowsAffected > 0) {
				System.out.println("Student deleted successfully.");
			} else {
				System.out.println("Student with ID " + id + " not found.");
			}
			pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
