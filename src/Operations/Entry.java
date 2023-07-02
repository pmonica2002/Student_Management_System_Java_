package Operations;

import Connection.Connection_sql;

import java.util.Scanner;

public class Entry {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		Connection_sql sql = new Connection_sql();
		sql.createConnection();

		CreateOperation co = new CreateOperation();
		DeleteOperation dop = new DeleteOperation();
		DisplayOperation dis = new DisplayOperation();
		InsertOperation iop = new InsertOperation();

		while (true) {
			System.out.println("CRUD OPERATION");
			System.out.println("***OPERATIONS***");
			System.out.println("1.CREATE OPERATION");
			System.out.println("2.INSERT OPERATION");
			System.out.println("3.DELETE OPERATION");
			System.out.println("4.DISPLAY OPERATION");
			System.out.println("5.EXIT OPERATION");
			System.out.print("SELECT THE OPERATION :");
			System.out.println();

			int option = sc.nextInt();

			if (option == 1) {
				co.createoperation();

			} else if (option == 2) {
				iop.insertoperation();

			} else if (option == 3) {
				dop.deleteoperation();

			} else if (option == 4) {
				dis.displayoperation();

			} else if (option == 5) {
				System.out.println("Thank you!");
				System.out.println();
				return;

			} else {
				System.out.println("Sorry! Invalid Operation");
				System.out.println();
			}
		}

	}

}
