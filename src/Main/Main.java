package Main;

import java.util.Scanner;

import com.opencsv.exceptions.CsvValidationException;

import java.io.IOException;
import java.text.DecimalFormat;
import java.text.ParseException;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	
			Scanner scanner = new Scanner(System.in);
			EmployeeInformation empInfo = new EmployeeInformation();
			
			Attendance attlogs = new Attendance();
			
			System.out.printf("| %-20s", "-".repeat(40));
			System.out.println();
			System.out.println("| MOTORPH PAYROLL SYSTEM ");
			System.out.printf("| %-20s", "-".repeat(40));
			System.out.println();
			
			int userSelected;
			do {
				userSelected = MenuData();
				switch(userSelected) {
				case 1:
					System.out.println("EMPLOYEE LISTING MENU SELECTED.");
					empInfo.ReadEmployees();
					System.out.print("|ENTER EMPLOYEE NUMBER : ");
					userSelected = scanner.nextInt();
					
					empInfo.GetEmployeesByID(String.valueOf(userSelected));
					
					System.out.printf("| %-20s", "-".repeat(40));
					System.out.println();
					break;
				case 2:
					System.out.println("WELCOME TO EMPLOYEE SALARY GENERATION.");
					empInfo.ReadEmployees();
					System.out.print("ENTER EMPLOYEE # : ");
					userSelected = scanner.nextInt();
					empInfo.GenerateSalary(String.valueOf(userSelected));
					break;
				case 3:
//					System.out.println("PAYROLL SUMMARY");
//					empInfo.GeneratePayrollSummaryPerEmployee();
//					System.out.printf("| %-20s", "-".repeat(40));
//					System.out.println();
					
					break;
				default:
					break;
				}
			}
			while(userSelected > 0);

		}

		public static int MenuData()
		{
			int selection;
			Scanner sc = new Scanner (System.in);
			System.out.printf("| %-20s", "-".repeat(40));
			System.out.println();
			System.out.println("| SYSTEM MENU ");
			System.out.printf("| %-20s", "-".repeat(40));
			System.out.println();
			System.out.println("|1|EMPLOYEE LISTING ");
			System.out.println("|2|SALARY GENERATOR ");
			System.out.println("|0|EXIT ");
			System.out.printf("| %-20s", "-".repeat(40));
			System.out.println();
			System.out.print("ENTER MENU NUMBER : ");
			selection = sc.nextInt();
			return selection;
			
		}

	}

