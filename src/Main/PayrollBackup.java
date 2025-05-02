package Main;

import java.util.Scanner;
import java.text.DecimalFormat;

public class PayrollBackup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("----------------------------------------------------------");
			System.out.println("|                MOTORPH PAYROLL SYSTEM                  |");
			System.out.println("----------------------------------------------------------");
			
			// Employee 1 Database
					final int Standard_Work = 40;
					int EmpNo = 10001;
					String LName = "Crisostomo";String FName = "Jose";String Bday = "February 14, 1988";
					String Add = "17/85 Stracke Via Suite 042,"; String Add_2 = "Poblacion,"; String Add_3 = "Las Pi�as 4783 Dinagat Islands";
					String PNo = "918-621-603";String SSS = "49-1632020-8";String PHealth = "49-1632020-8";
					String TIN = "317-674-022-000";String Pibig = "441093369646";String Stat = "Regular";
					String Pos = "HR Manager";String ISup = "N/A";double BSalary = 62670;double RSub = 1500;
					double PAll = 1000;double CAll = 1000;double GSM = 31335;double HRate = 373.04;
					double OtRate = 559.71;double totalPay = 0;double overtimePay = 0;double regularPay = 0;
					
			// Employee 2 Database
					final int Standard_Work2 = 40;
					int EmpNo2 = 10002;
					String LName2 = "Mata";String FName2 = "Christian";String Bday2 = "October 21, 1987";
					String Add2 = "90 O'Keefe Spur Apt. 379,"; String Add2_2 = "Catigbian 2772 Sulu";String PNo2 = "783-776-744";
					String SSS2 = "49-2959312-6";String PHealth2 = "824187961962";String TIN2 = "103-100-522-000";
					String Pibig2= "631052853464";String Stat2 = "Regular";String Pos2 = "Account Team Leader";
					String ISup2 = "Romualdez, Fredrick";double BSalary2 = 42975;double RSub2 = 1500;double PAll2 = 800;
					double CAll2 = 800;double GSM2 = 21488;double HRate2 = 255.80;double OtRate2 = 383.7;double totalPay2 = 0;
					double overtimePay2 = 0;double regularPay2 = 0;
					
			// Employee 3 Database
					final int Standard_Work3 = 40;
					int EmpNo3 = 10003;
					String LName3 = "San Jose";String FName3 = "Brad ";String Bday3 = "March 15, 1996";
					String Add3 = "99 Strosin Hills, Poblacion,"; String Add2_3 = "Bislig 5340 Tawi-Tawi";String PNo3 = "797-009-261";
					String SSS3 = "40-2400714-1";String PHealth3 = "239192926939";String TIN3 = "672-474-690-000";
					String Pibig3= "210850209964";String Stat3 = "Regular";String Pos3 = "HR Team Leader";
					String ISup3 = "Crisostomo, Jose";double BSalary3 = 42975;double RSub3 = 1500;double PAll3 = 800;
					double CAll3 = 800;double GSM3 = 21488;double HRate3 = 255.80;double OtRate3 = 383.7;
					double totalPay3 = 0;double overtimePay3 = 0;double regularPay3 = 0;

			int userSelected;
			do {
				userSelected = MenuData();
				switch(userSelected) {
				case 1:
					System.out.println("Employee Information is selected.");
					DecimalFormat df = new DecimalFormat(".00");
					System.out.printf("----------------------------------------------------------%n");
					System.out.printf("|                      MotorPH Employees                 |%n");
					System.out.printf("----------------------------------------------------------%n");
					System.out.println("|                10001 - Crisostomo, Jose                |");
					System.out.println("|                10002 - Mata, Christian                 |");
					System.out.println("|                10003 - San Jose, Brad                  |");
					System.out.printf("----------------------------------------------------------%n");
					System.out.println("|Enter Employee No. :                                    |");
					userSelected = scanner.nextInt();
					System.out.printf("----------------------------------------------------------%n");
					System.out.println();
					
					if(userSelected == 10001) {
						System.out.printf("----------------------------------------------------------%n");
						System.out.printf("|                    EMPLOYEE INFORMATION                |%n");
						System.out.printf("----------------------------------------------------------%n");
						System.out.printf("| %-20s | %-31s |", "EMPLOYEE NO.", EmpNo);
						System.out.printf("%n");
						System.out.printf("| %-20s | %-31s |", "LAST NAME", LName);
						System.out.printf("%n");
						System.out.printf("| %-20s | %-31s |", "FIRST NAME", FName);
						System.out.printf("%n");
						System.out.printf("| %-20s | %-31s |", "BIRTHDAY", Bday);
						System.out.printf("%n");
						System.out.printf("| %-20s | %-31s |", "ADDRESS", Add);
						System.out.printf("%n");
						System.out.printf("| %-21s  %-31s |", "", Add_2);
						System.out.printf("%n");
						System.out.printf("| %-21s  %-31s |", "", Add_3);
						System.out.printf("%n");
						System.out.printf("| %-20s | %-31s |", "PHONE NUMBER", PNo);
						System.out.printf("%n");
						System.out.printf("----------------------------------------------------------%n");
						System.out.printf("|                   GOVERNMENT ID NUMBERS                |%n");
						System.out.printf("----------------------------------------------------------%n");
						System.out.printf("| %-20s | %-31s |", "SSS NO.", SSS);
						System.out.printf("%n");
						System.out.printf("| %-20s | %-31s |", "PHILHEALTH NO.", PHealth);
						System.out.printf("%n");
						System.out.printf("| %-20s | %-31s |", "TIN NO.", TIN);
						System.out.printf("%n");
						System.out.printf("| %-20s | %-31s |", "PAG-IBIG NO.", Pibig);
						System.out.printf("%n");
						System.out.printf("----------------------------------------------------------%n");
						System.out.printf("|                     EMPLOYEE HISTORY                   |%n");
						System.out.printf("----------------------------------------------------------%n");
						System.out.printf("| %-20s | %-31s |", "STATUS", Stat);
						System.out.printf("%n");
						System.out.printf("| %-20s | %-31s |", "POSITION", Pos);
						System.out.printf("%n");
						System.out.printf("| %-20s | %-31s |", "IMMIDIATE SUPERVISOR", ISup);
						System.out.printf("%n");
						System.out.printf("----------------------------------------------------------%n");
						System.out.printf("|                     SALARY INFORMATION                 |%n");
						System.out.printf("----------------------------------------------------------%n");
						System.out.printf("| %-20s | %-31s |", "BASIC SALARY", df.format(BSalary));
						System.out.printf("%n");
						System.out.printf("| %-20s | %-31s |", "GROSS SEMI-MONTHLY", df.format(BSalary));
						System.out.printf("%n");
						System.out.printf("| %-20s | %-31s |", "OVERTIME RATE", df.format(OtRate));
						System.out.printf("%n");
						System.out.printf("----------------------------------------------------------%n");
						System.out.printf("|                 ALLOWANCES AND BENEFITS                |%n");
						System.out.printf("----------------------------------------------------------%n");
						System.out.printf("%n");
						System.out.printf("| %-20s | %-31s |", "RICE SUBSIDY", df.format(RSub));
						System.out.printf("%n");
						System.out.printf("| %-20s | %-31s |", "PHONE ALLOWANCE", df.format(PAll));
						System.out.printf("%n");
						System.out.printf("| %-20s | %-31s |", "CLOTHING ALLOWANCE", df.format(CAll));
						System.out.printf("%n");
						System.out.printf("| %-20s | %-31s |", "GROSS SEMI-MONTHLY", df.format(BSalary));
						System.out.printf("%n");
						System.out.println("----------------------------------------------------------");
						System.out.println("");
						
					}else {
						System.out.println("");
						
					if(userSelected == 10002) {
						System.out.printf("----------------------------------------------------------%n");
						System.out.printf("|                    EMPLOYEE INFORMATION                |%n");
						System.out.printf("----------------------------------------------------------%n");
						System.out.printf("| %-20s | %-31s |", "EMPLOYEE NO.", EmpNo2);
						System.out.printf("%n");
						System.out.printf("| %-20s | %-31s |", "LAST NAME", LName2);
						System.out.printf("%n");
						System.out.printf("| %-20s | %-31s |", "FIRST NAME", FName2);
						System.out.printf("%n");
						System.out.printf("| %-20s | %-31s |", "BIRTHDAY", Bday2);
						System.out.printf("%n");
						System.out.printf("| %-20s | %-31s |", "ADDRESS", Add2);
						System.out.printf("%n");
						System.out.printf("| %-21s  %-31s |", "", Add2_2);
						System.out.printf("%n");
						System.out.printf("| %-20s | %-31s |", "PHONE NUMBER", PNo2);
						System.out.printf("%n");
						System.out.printf("----------------------------------------------------------%n");
						System.out.printf("|                   GOVERNMENT ID NUMBERS                |%n");
						System.out.printf("----------------------------------------------------------%n");
						System.out.printf("| %-20s | %-31s |", "SSS NO.", SSS2);
						System.out.printf("%n");
						System.out.printf("| %-20s | %-31s |", "PHILHEALTH NO.", PHealth2);
						System.out.printf("%n");
						System.out.printf("| %-20s | %-31s |", "TIN NO.", TIN2);
						System.out.printf("%n");
						System.out.printf("| %-20s | %-31s |", "PAG-IBIG NO.", Pibig2);
						System.out.printf("%n");
						System.out.printf("----------------------------------------------------------%n");
						System.out.printf("|                     EMPLOYEE HISTORY                   |%n");
						System.out.printf("----------------------------------------------------------%n");
						System.out.printf("| %-20s | %-31s |", "STATUS", Stat2);
						System.out.printf("%n");
						System.out.printf("| %-20s | %-31s |", "POSITION", Pos2);
						System.out.printf("%n");
						System.out.printf("| %-20s | %-31s |", "IMMIDIATE SUPERVISOR", ISup2);
						System.out.printf("----------------------------------------------------------%n");
						System.out.printf("|                     SALARY INFORMATION                 |%n");
						System.out.printf("----------------------------------------------------------%n");
						System.out.printf("| %-20s | %-31s |", "BASIC SALARY", df.format(BSalary2));
						System.out.printf("%n");
						System.out.printf("| %-20s | %-31s |", "GROSS SEMI-MONTHLY", df.format(BSalary2));
						System.out.printf("%n");
						System.out.printf("| %-20s | %-31s |", "OVERTIME RATE", df.format(OtRate2));
						System.out.printf("%n");
						System.out.printf("----------------------------------------------------------%n");
						System.out.printf("|                 ALLOWANCES AND BENEFITS                |%n");
						System.out.printf("----------------------------------------------------------%n");
						System.out.printf("| %-20s | %-31s |", "RICE SUBSIDY", df.format(RSub2));
						System.out.printf("%n");
						System.out.printf("| %-20s | %-31s |", "PHONE ALLOWANCE", df.format(PAll2));
						System.out.printf("%n");
						System.out.printf("| %-20s | %-31s |", "CLOTHING ALLOWANCE", df.format(CAll2));
						System.out.printf("%n");
						System.out.printf("%n");
						System.out.println("----------------------------------------------------------");
						System.out.println("");
						
					if(userSelected == 10003) {
						System.out.printf("----------------------------------------------------------%n");
						System.out.printf("|                    EMPLOYEE INFORMATION                |%n");
						System.out.printf("----------------------------------------------------------%n");
						System.out.printf("| %-20s | %-31s |", "EMPLOYEE NO.", EmpNo3);
						System.out.printf("%n");
						System.out.printf("| %-20s | %-31s |", "LAST NAME", LName3);
						System.out.printf("%n");
						System.out.printf("| %-20s | %-31s |", "FIRST NAME", FName3);
						System.out.printf("%n");
						System.out.printf("| %-20s | %-31s |", "BIRTHDAY", Bday3);
						System.out.printf("%n");
						System.out.printf("| %-20s | %-31s |", "ADDRESS", Add3);
						System.out.printf("%n");
						System.out.printf("| %-21s  %-31s |", "", Add2_3);
						System.out.printf("%n");
						System.out.printf("| %-20s | %-31s |", "PHONE NUMBER", PNo3);
						System.out.printf("%n");
						System.out.printf("----------------------------------------------------------%n");
						System.out.printf("|                   GOVERNMENT ID NUMBERS                |%n");
						System.out.printf("----------------------------------------------------------%n");
						System.out.printf("| %-20s | %-31s |", "SSS NO.", SSS3);
						System.out.printf("%n");
						System.out.printf("| %-20s | %-31s |", "PHILHEALTH NO.", PHealth3);
						System.out.printf("%n");
						System.out.printf("| %-20s | %-31s |", "TIN NO.", TIN3);
						System.out.printf("%n");
						System.out.printf("| %-20s | %-31s |", "PAG-IBIG NO.", Pibig3);
						System.out.printf("%n");
						System.out.printf("----------------------------------------------------------%n");
						System.out.printf("|                     EMPLOYEE HISTORY                   |%n");
						System.out.printf("----------------------------------------------------------%n");
						System.out.printf("| %-20s | %-31s |", "STATUS", Stat3);
						System.out.printf("%n");
						System.out.printf("| %-20s | %-31s |", "POSITION", Pos3);
						System.out.printf("%n");
						System.out.printf("| %-20s | %-31s |", "IMMIDIATE SUPERVISOR", ISup3);
						System.out.printf("%n");
						System.out.printf("----------------------------------------------------------%n");
						System.out.printf("|                     SALARY INFORMATION                 |%n");
						System.out.printf("----------------------------------------------------------%n");
						System.out.printf("| %-20s | %-31s |", "BASIC SALARY", df.format(BSalary3));
						System.out.printf("%n");
						System.out.printf("| %-20s | %-31s |", "GROSS SEMI-MONTHLY", df.format(BSalary3));
						System.out.printf("%n");
						System.out.printf("| %-20s | %-31s |", "OVERTIME RATE", df.format(OtRate3));
						System.out.printf("%n");
						System.out.printf("----------------------------------------------------------%n");
						System.out.printf("|                 ALLOWANCES AND BENEFITS                |%n");
						System.out.printf("----------------------------------------------------------%n");
						System.out.printf("%n");
						System.out.printf("| %-20s | %-31s |", "RICE SUBSIDY", df.format(RSub3));
						System.out.printf("%n");
						System.out.printf("| %-20s | %-31s |", "PHONE ALLOWANCE", df.format(PAll3));
						System.out.printf("%n");
						System.out.printf("| %-20s | %-31s |", "CLOTHING ALLOWANCE", df.format(CAll3));
						System.out.printf("%n");
						System.out.printf("%n");
						System.out.println("----------------------------------------------------------");
						System.out.println("");
					}
					}
					}
					break;
				case 2:
					System.out.println("Generate Salary  is selected.");
					System.out.println();
					System.out.printf("----------------------------------------------------------%n");
					System.out.printf("|                      MotorPH Employees                 |%n");
					System.out.printf("----------------------------------------------------------%n");
					System.out.println("|                10001 - Crisostomo, Jose                |");
					System.out.println("|                10002 - Mata, Christian                 |");
					System.out.println("|                10003 - San Jose, Brad                  |");
					System.out.printf("----------------------------------------------------------%n");
					System.out.print("Select Employee : ");
					userSelected = scanner.nextInt();
					DecimalFormat df2 = new DecimalFormat(".00");
					
					if(userSelected == 10001) {
						
						 
					    System.out.printf("----------------------------------------------------------%n");
						System.out.printf("|                       GENERATE SALARY                  |%n");
						System.out.printf("----------------------------------------------------------%n");
						System.out.printf("| %-20s | %-31s |", "EMPLOYEE NO.", EmpNo);
						System.out.printf("%n");
						System.out.printf("| %-20s | %-31s |", "LAST NAME", LName);
						System.out.printf("%n");
						System.out.printf("| %-20s | %-31s |", "FIRST NAME", FName);
						System.out.printf("%n");
						System.out.printf("| %-20s | %-31s |", "STATUS", Stat);
						System.out.printf("%n");
						System.out.printf("| %-20s | %-31s |", "POSITION", Pos);
						System.out.printf("%n");
						System.out.println("----------------------------------------------------------");
						System.out.println("|TIME IN AND OUT                                         |");
						System.out.println("----------------------------------------------------------");
						
						// Number of hours worked calculator
						int day1;
						System.out.print("September 5, 2022      | ");
						day1 = scanner.nextInt();
						int day2;
						System.out.print("September 6, 2022      | ");
						day2 = scanner.nextInt();
						int day3;
						System.out.print("September 7, 2022      | ");
						day3 = scanner.nextInt();
						int day4;
						System.out.print("September 8, 2022      | ");
						day4 = scanner.nextInt();
						int day5;
						System.out.print("September 9, 2022      | ");
						day5 = scanner.nextInt();
						int day6;
						System.out.print("September 10, 2022     | ");
						day6 = scanner.nextInt();
						
						
						
						int total_Whours = day1 + day2 + day3 + day4 + day5 + day6;
						
						if(total_Whours > Standard_Work) {
							double overtime = total_Whours - Standard_Work;
							overtimePay = 1.5 * HRate * overtime;
						}
						// Calculate Regular Salary 
						regularPay = Standard_Work * HRate;
						// Total Salary
						 totalPay = overtimePay + regularPay;
						 
						    double tax = 0;
							double sss = 0;
							double philHealth = 0;
							double pagIbig = 0;
							double netSalary = 0;
							double salary = 0;
							double totalDeductions = 0;
							double taxableIncome = 0;
							double withholdingTax = 0;
							double totalAllowance = RSub + PAll + CAll;
							int overTime = total_Whours - Standard_Work;
							
							// SSS Deduction
							
							if(totalPay <= 3250) {
								sss = 135;
							}else if(totalPay > 3250 && totalPay < 3750) {
								sss = 175.50;
							}else if(totalPay > 3750 && totalPay < 4250) {
								sss = 180.00;
							}else if(totalPay > 4250 && totalPay < 4750) {
								sss = 202.50;
							}else if(totalPay > 4750 && totalPay < 5250) {
								sss = 225.00;
							}else if(totalPay > 5250 && totalPay < 5750) {
								sss = 247.50;
							}else if(totalPay > 5750 && totalPay < 6250) {
								sss = 270.00;
							}else if(totalPay > 6250 && totalPay < 6750) {
								sss = 292.50;
							}else if(totalPay > 6750 && totalPay < 7250) {
								sss = 315.00;
							}else if(totalPay > 7250 && totalPay < 7750) {
								sss = 337.50;
							}else if(totalPay > 7750 && totalPay < 8250) {
								sss = 360.00;
							}else if(totalPay > 8250 && totalPay < 8750) {
								sss = 382.50;
							}else if(totalPay > 8750 && totalPay < 9250) {
								sss = 405.00;
							}else if(totalPay > 9250 && totalPay < 9750) {
								sss = 427.50;
							}else if(totalPay > 9750 && totalPay < 10250) {
								sss = 450.00;
							}else if(totalPay > 10250 && totalPay < 10750) {
								sss = 427.50;
							}else if(totalPay > 10750 && totalPay < 11250) {
								sss = 495.00;
							}else if(totalPay > 11250 && totalPay < 11750) {
								sss = 517.50;
							}else if(totalPay > 11750 && totalPay < 12250) {
								sss = 540.00;
							}else if(totalPay > 12250 && totalPay < 12750) {
								sss = 562.50;
							}else if(totalPay > 12250 && totalPay < 13250) {
								sss = 585.00;
							}else if(totalPay > 13250 && totalPay < 13750) {
								sss = 607.50;
							}else if(totalPay > 13750 && totalPay < 14250) {
								sss = 630.00;
							}else if(totalPay > 14250 && totalPay < 14750) {
								sss = 652.50;
							}else if(totalPay > 14750 && totalPay < 15250) {
								sss = 675.00;
							}else if(totalPay > 15250 && totalPay < 15750) {
								sss = 697.50;
							}else if(totalPay > 15750 && totalPay < 16250) {
								sss = 720.00;
							}else if(totalPay > 16250 && totalPay < 16750) {
								sss = 7742.50;
							}else if(totalPay > 16750 && totalPay < 17250) {
								sss = 765.00;
							}else if(totalPay > 17250 && totalPay < 17750) {
								sss = 787.50;
							}else if(totalPay > 17750 && totalPay < 18250) {
								sss = 810.00;
							}else if(totalPay > 18250 && totalPay < 18750) {
								sss = 832.50;
							}else if(totalPay > 18750 && totalPay < 19250) {
								sss = 855.00;
							}else if(totalPay > 19250 && totalPay < 19750) {
								sss = 877.50;
							}else if(totalPay > 19750 && totalPay < 20250) {
								sss = 900.00;
							}else if(totalPay > 20250 && totalPay < 20750) {
								sss = 922.50;
							}else if(totalPay > 20750 && totalPay < 21250) {
								sss = 945.00;
							}else if(totalPay > 21250 && totalPay < 21750) {
								sss = 967.50;
							}else if(totalPay > 21750 && totalPay < 22250) {
								sss = 990.00;
							}else if(totalPay > 22250 && totalPay < 22750) {
								sss = 1012.50;
							}else if(totalPay > 22750 && totalPay < 23250) {
								sss = 1035.00;
							}else if(totalPay > 23250 && totalPay < 23750) {
								sss = 1057.00;
							}else if(totalPay > 23750 && totalPay < 24250) {
								sss = 1080.00;
							}else if(totalPay > 24250 && totalPay < 24750) {
								sss = 1102.50;
							}else if(totalPay > 24750) {
								sss = 1125;
							}
						
							// Pag-IBIG Contribution
							
							if(totalPay == 0) {
								pagIbig = 0;
							}else if (totalPay > 1000 && totalPay < 1500) {
								pagIbig = (totalPay - 1000)*0.01;
							}else if (totalPay > 1500) {
								pagIbig = (totalPay - 1500)*0.02;
							}
								
								
							// WITHHOLDING TAX
								
							if(totalPay <= 20832) {
								tax = totalPay - totalPay;
							}else if(totalPay > 20833 && totalPay < 33333) {
								tax = (totalPay - 20833)*0.2;
							}else if(totalPay > 33333 && totalPay < 66667) {
								tax = 2500 + (totalPay - 33333)*0.25;
							}else if(totalPay > 66667 && totalPay < 1666677) {
								tax = 10833 + (totalPay - 66667)*0.3;
							}else if(totalPay > 166667 && totalPay < 666667) {
								tax = 40833.33 + (totalPay - 166667)*0.32;
							}else if(totalPay > 666667) {
								tax = 200833.33 + (totalPay - 666667)*0.32;					
							}
							
							// PhilHealth Contribution	
							philHealth = totalPay - (totalPay*0.015);
							
							
							salary = totalPay;
							totalDeductions = sss + (totalPay - philHealth) + pagIbig;
							taxableIncome = salary - totalDeductions;
							withholdingTax = tax;
							netSalary  = taxableIncome - withholdingTax + totalAllowance;
							
							
						System.out.println("----------------------------------------------------------");
						System.out.println("|HOURS WORKED SALARY                                     |");
						System.out.println("----------------------------------------------------------");
						System.out.printf("| %-20s | %-31s |", "OVERTIME", overTime + " Hour/s");
						System.out.printf("%n");
						System.out.printf("| %-20s | %-31s |", "TOTAL HOURS WORKED", df2.format(total_Whours));
						System.out.printf("%n");
						System.out.printf("| %-20s | PHP %-27s |", "HOURLY RATE", df2.format(HRate));
						System.out.printf("%n");
						System.out.printf("| %-20s | PHP %-27s |", "REGULAR PAY", df2.format(regularPay));
						System.out.printf("%n");
						System.out.printf("| %-20s | PHP %-27s |", "OVERTIME PAY", df2.format(overtimePay));
						System.out.printf("%n");
						System.out.printf("| %-20s | PHP %-27s |", "SALARY", df2.format(overtimePay + regularPay));
						System.out.printf("%n");
						System.out.println("----------------------------------------------------------");
						System.out.println("|DEDUCTIONS                                              |");
						System.out.println("----------------------------------------------------------");
						System.out.printf("| %-20s | PHP %-27s |", "SSS", df2.format(sss));
						System.out.printf("%n");
						System.out.printf("| %-20s | PHP %-27s |", "PHILHEALTH", df2.format(totalPay - philHealth));
						System.out.printf("%n");
						System.out.printf("| %-20s | PHP %-27s |", "PAG-IBIG", df2.format(pagIbig));
						System.out.printf("%n");
						System.out.println("|                                                        |");
						System.out.printf("| %-20s | PHP %-27s |", "TOTAL DEDUCTIONS", df2.format(totalDeductions));
						System.out.printf("%n");
						System.out.println("|                                                        |");
						System.out.printf("| %-20s | PHP %-27s |", "TAXABLE INCOME", df2.format(taxableIncome));
						System.out.printf("%n");
						System.out.println("|                                                        |");
						System.out.printf("| %-20s | PHP %-27s |", "WITHHOLDING TAX", df2.format(withholdingTax));
						System.out.printf("%n");
						System.out.println("----------------------------------------------------------");
						System.out.println("|ALLOWANCES                                              |");
						System.out.println("----------------------------------------------------------");
						System.out.printf("| %-20s | PHP %-27s |", "RICE SUBSIDY", df2.format(RSub/4));// Divided in 4 weeks
						System.out.printf("%n");
						System.out.printf("| %-20s | PHP %-27s |", "PHONE ALLOWANCE", df2.format(PAll/4));// Divided in 4 weeks
						System.out.printf("%n");
						System.out.printf("| %-20s | PHP %-27s |", "CLOTHING ALLOWANCE", df2.format(CAll/4));// Divided in 4 weeks
						System.out.printf("%n");
						System.out.println("|                                                        |");
						System.out.printf("| %-20s | PHP %-27s |", "TOTAL ALLOWANCES", df2.format(totalAllowance/4));// Divided in 4 weeks
						System.out.printf("%n");
						System.out.println("|                                                        |");
						System.out.println("__________________________________________________________");
						System.out.printf("| %-20s | PHP %-27s |", "NET SALARY", df2.format(netSalary));
						System.out.printf("%n");
						System.out.println("----------------------------------------------------------");
						System.out.println();
						System.out.println();
						
					}else {
				    	System.out.println();
						
					if(userSelected == 10002) {
						
						System.out.printf("----------------------------------------------------------%n");
					    System.out.printf("|                       GENERATE SALARY                  |%n");
					    System.out.printf("----------------------------------------------------------%n");
						System.out.printf("| %-20s | %-31s |", "EMPLOYEE NO.", EmpNo2);
						System.out.printf("%n");
						System.out.printf("| %-20s | %-31s |", "LAST NAME", LName2);
						System.out.printf("%n");
						System.out.printf("| %-20s | %-31s |", "FIRST NAME", FName2);
						System.out.printf("%n");
						System.out.printf("| %-20s | %-31s |", "STATUS", Stat2);
						System.out.printf("%n");
						System.out.printf("| %-20s | %-31s |", "POSITION", Pos2);
						System.out.printf("%n");
						System.out.println("----------------------------------------------------------");
						System.out.println("|TIME IN AND OUT                                         |");
						System.out.println("----------------------------------------------------------");
						
						// Number of hours worked calculator
						int day1_2;
						System.out.println("September 5, 2022 : ");
						day1_2 = scanner.nextInt();
						int day2_2;
						System.out.println("September 6, 2022 : ");
						day2_2 = scanner.nextInt();
						int day3_2;
						System.out.println("September 7, 2022 : ");
						day3_2 = scanner.nextInt();
						int day4_2;
						System.out.println("September 8, 2022 : ");
						day4_2 = scanner.nextInt();
						int day5_2;
						System.out.println("September 9, 2022 : ");
						day5_2 = scanner.nextInt();
						int day6_2;
						System.out.println("September 10, 2022 : ");
						day6_2 = scanner.nextInt();
						
						int total_Whours2 = day1_2 + day2_2 + day3_2 + day4_2 + day5_2 + day6_2;
						
						if(total_Whours2 > Standard_Work2) {
							int overtime2 = total_Whours2 - Standard_Work2;
							overtimePay2 = 1.5 * HRate2 * overtime2;
						}
						// Calculate Regular Salary 
						regularPay2 = Standard_Work2 * HRate2;
						// Total Salary
						totalPay2 = overtimePay2 + regularPay2;
						
						double tax2 = 0;
						double sss2 = 0;
						double philHealth2 = 0;
						double pagIbig2 = 0;
						double netSalary2 = 0;
						double salary2 = 0;
						double totalDeductions2 = 0;
						double taxableIncome2 = 0;
						double withholdingTax2 = 0;
						double totalAllowance2= RSub2 + PAll2 + CAll2;
						int overTime2 = total_Whours2 - Standard_Work2;
						
						// SSS Deduction
						
						if(totalPay2 <= 3250) {
							sss2 = 135;
						}else if(totalPay2 > 3250 && totalPay2 < 3750) {
							sss2 = 175.50;
						}else if(totalPay2 > 3750 && totalPay2 < 4250) {
							sss2 = 180.00;
						}else if(totalPay2 > 4250 && totalPay2 < 4750) {
							sss2 = 202.50;
						}else if(totalPay2 > 4750 && totalPay2 < 5250) {
							sss2 = 225.00;
						}else if(totalPay2 > 5250 && totalPay2 < 5750) {
							sss2 = 247.50;
						}else if(totalPay2 > 5750 && totalPay2 < 6250) {
							sss2 = 270.00;
						}else if(totalPay2 > 6250 && totalPay2 < 6750) {
							sss2 = 292.50;
						}else if(totalPay2 > 6750 && totalPay2 < 7250) {
							sss2 = 315.00;
						}else if(totalPay2 > 7250 && totalPay2 < 7750) {
							sss2 = 337.50;
						}else if(totalPay2 > 7750 && totalPay2 < 8250) {
							sss2 = 360.00;
						}else if(totalPay2 > 8250 && totalPay2 < 8750) {
							sss2 = 382.50;
						}else if(totalPay2 > 8750 && totalPay2 < 9250) {
							sss2 = 405.00;
						}else if(totalPay2 > 9250 && totalPay2 < 9750) {
							sss2 = 427.50;
						}else if(totalPay2 > 9750 && totalPay2 < 10250) {
							sss2 = 450.00;
						}else if(totalPay2 > 10250 && totalPay2 < 10750) {
							sss2 = 427.50;
						}else if(totalPay2 > 10750 && totalPay2 < 11250) {
							sss2 = 495.00;
						}else if(totalPay2 > 11250 && totalPay2 < 11750) {
							sss2 = 517.50;
						}else if(totalPay2 > 11750 && totalPay2 < 12250) {
							sss2 = 540.00;
						}else if(totalPay2 > 12250 && totalPay2 < 12750) {
							sss2 = 562.50;
						}else if(totalPay2 > 12250 && totalPay2 < 13250) {
							sss2 = 585.00;
						}else if(totalPay2 > 13250 && totalPay2 < 13750) {
							sss2 = 607.50;
						}else if(totalPay2 > 13750 && totalPay2 < 14250) {
							sss2 = 630.00;
						}else if(totalPay2 > 14250 && totalPay2 < 14750) {
							sss2 = 652.50;
						}else if(totalPay2 > 14750 && totalPay2 < 15250) {
							sss2 = 675.00;
						}else if(totalPay2 > 15250 && totalPay2 < 15750) {
							sss2 = 697.50;
						}else if(totalPay2 > 15750 && totalPay2 < 16250) {
							sss2 = 720.00;
						}else if(totalPay2 > 16250 && totalPay2 < 16750) {
							sss2 = 7742.50;
						}else if(totalPay2 > 16750 && totalPay2 < 17250) {
							sss2 = 765.00;
						}else if(totalPay2 > 17250 && totalPay2 < 17750) {
							sss2 = 787.50;
						}else if(totalPay2 > 17750 && totalPay2 < 18250) {
							sss2 = 810.00;
						}else if(totalPay2 > 18250 && totalPay2 < 18750) {
							sss2 = 832.50;
						}else if(totalPay2 > 18750 && totalPay2 < 19250) {
							sss2 = 855.00;
						}else if(totalPay2 > 19250 && totalPay2 < 19750) {
							sss2 = 877.50;
						}else if(totalPay2 > 19750 && totalPay2 < 20250) {
							sss2 = 900.00;
						}else if(totalPay2 > 20250 && totalPay2 < 20750) {
							sss2 = 922.50;
						}else if(totalPay2 > 20750 && totalPay2 < 21250) {
							sss2 = 945.00;
						}else if(totalPay2 > 21250 && totalPay2 < 21750) {
							sss2 = 967.50;
						}else if(totalPay2 > 21750 && totalPay2 < 22250) {
							sss2 = 990.00;
						}else if(totalPay2 > 22250 && totalPay2 < 22750) {
							sss2 = 1012.50;
						}else if(totalPay2 > 22750 && totalPay2 < 23250) {
							sss2 = 1035.00;
						}else if(totalPay2 > 23250 && totalPay2 < 23750) {
							sss2 = 1057.00;
						}else if(totalPay2 > 23750 && totalPay2 < 24250) {
							sss2 = 1080.00;
						}else if(totalPay2 > 24250 && totalPay2 < 24750) {
							sss2 = 1102.50;
						}else if(totalPay2 > 24750) {
							sss2 = 1125;
						}
					
						// Pag-IBIG Contribution
						
						if(totalPay2 == 0) {
							pagIbig2 = 0;
						}else if (totalPay2 > 1000 && totalPay2 < 1500) {
							pagIbig2 = (totalPay2 - 1000)*0.01;
						}else if (totalPay2 > 1500) {
							pagIbig2 = (totalPay2 - 1500)*0.02;
						}
							
							
						// WITHHOLDING TAX
							
						if(totalPay2 <= 20832) {
							tax2 = totalPay2 - totalPay2;
						}else if(totalPay2 > 20833 && totalPay2 < 33333) {
							tax2 = (totalPay2 - 20833)*0.2;
						}else if(totalPay2 > 33333 && totalPay2 < 66667) {
							tax2 = 2500 + (totalPay2 - 33333)*0.25;
						}else if(totalPay2 > 66667 && totalPay2 < 1666677) {
							tax2 = 10833 + (totalPay2 - 66667)*0.3;
						}else if(totalPay2 > 166667 && totalPay2 < 666667) {
							tax2 = 40833.33 + (totalPay2 - 166667)*0.32;
						}else if(totalPay2 > 666667) {
							tax2 = 200833.33 + (totalPay2 - 666667)*0.32;					
						}
						
						// PhilHealth Contribution	
						philHealth2 = totalPay2 - (totalPay2*0.015);
						
						
						salary2 = totalPay2;
						totalDeductions2 = sss2 + (totalPay2 - philHealth2) + pagIbig2;
						taxableIncome2 = salary2 - totalDeductions2;
						withholdingTax2 = tax2;
						netSalary2  = taxableIncome2 - withholdingTax2 + totalAllowance2;
						
						
						System.out.println("----------------------------------------------------------");
						System.out.println("|HOURS WORKED SALARY                                     |");
						System.out.println("----------------------------------------------------------");
						System.out.printf("| %-20s | %-31s |", "OVERTIME", overTime2 + " Hour/s");
						System.out.printf("%n");
						System.out.printf("| %-20s | %-31s |", "TOTAL HOURS WORKED", df2.format(total_Whours2));
						System.out.printf("%n");
						System.out.printf("| %-20s | PHP %-27s |", "HOURLY RATE", df2.format(HRate2));
						System.out.printf("%n");
						System.out.printf("| %-20s | PHP %-27s |", "REGULAR PAY", df2.format(regularPay2));
						System.out.printf("%n");
						System.out.printf("| %-20s | PHP %-27s |", "OVERTIME PAY", df2.format(overtimePay2));
						System.out.printf("%n");
						System.out.printf("| %-20s | PHP %-27s |", "SALARY", df2.format(overtimePay2 + regularPay2));
						System.out.printf("%n");
						System.out.println("----------------------------------------------------------");
						System.out.println("|DEDUCTIONS                                              |");
						System.out.println("----------------------------------------------------------");
						System.out.printf("| %-20s | PHP %-27s |", "SSS", df2.format(sss2));
						System.out.printf("%n");
						System.out.printf("| %-20s | PHP %-27s |", "PHILHEALTH", df2.format(totalPay2 - philHealth2));
						System.out.printf("%n");
						System.out.printf("| %-20s | PHP %-27s |", "PAG-IBIG", df2.format(pagIbig2));
						System.out.printf("%n");
						System.out.println("|                                                        |");
						System.out.printf("| %-20s | PHP %-27s |", "TOTAL DEDUCTIONS", df2.format(totalDeductions2));
						System.out.printf("%n");
						System.out.println("|                                                        |");
						System.out.printf("| %-20s | PHP %-27s |", "TAXABLE INCOME", df2.format(taxableIncome2));
						System.out.printf("%n");
						System.out.println("|                                                        |");
						System.out.printf("| %-20s | PHP %-27s |", "WITHHOLDING TAX", df2.format(withholdingTax2));
						System.out.printf("%n");
						System.out.println("----------------------------------------------------------");
						System.out.println("|ALLOWANCES                                              |");
						System.out.println("----------------------------------------------------------");
						System.out.printf("| %-20s | PHP %-27s |", "RICE SUBSIDY", df2.format(RSub2/4));// Divided in 4 weeks
						System.out.printf("%n");
						System.out.printf("| %-20s | PHP %-27s |", "PHONE ALLOWANCE", df2.format(PAll2/4));// Divided in 4 weeks
						System.out.printf("%n");
						System.out.printf("| %-20s | PHP %-27s |", "CLOTHING ALLOWANCE", df2.format(CAll2/4));// Divided in 4 weeks
						System.out.printf("%n");
						System.out.println("|                                                        |");
						System.out.printf("| %-20s | PHP %-27s |", "TOTAL ALLOWANCES", df2.format(totalAllowance2/4));// Divided in 4 weeks
						System.out.printf("%n");
						System.out.println("|                                                        |");
						System.out.println("__________________________________________________________");
						System.out.printf("| %-20s | PHP %-27s |", "NET SALARY", df2.format(netSalary2));
						System.out.printf("%n");
						System.out.println("----------------------------------------------------------");
						System.out.println();
						System.out.println();
			
					    }else {
					    	System.out.println();
					    	
					    if(userSelected == 10003) {
					    	System.out.printf("----------------------------------------------------------%n");
							System.out.printf("|                       GENERATE SALARY                  |%n");
							System.out.printf("----------------------------------------------------------%n");
							System.out.printf("| %-20s | %-31s |", "EMPLOYEE NO.", EmpNo3);
							System.out.printf("%n");
							System.out.printf("| %-20s | %-31s |", "LAST NAME", LName3);
							System.out.printf("%n");
							System.out.printf("| %-20s | %-31s |", "FIRST NAME", FName3);
							System.out.printf("%n");
							System.out.printf("| %-20s | %-31s |", "STATUS", Stat3);
							System.out.printf("%n");
							System.out.printf("| %-20s | %-31s |", "POSITION", Pos3);
							System.out.printf("%n");
							System.out.println("----------------------------------------------------------");
							System.out.println("|TIME IN AND OUT                                         |");
							System.out.println("----------------------------------------------------------");
						    
							// Number of hours worked calculator
							int day1_3;
							System.out.println("September 5, 2022 : ");
							day1_3 = scanner.nextInt();
							int day2_3;
							System.out.println("September 6, 2022 : ");
							day2_3 = scanner.nextInt();
							int day3_3;
							System.out.println("September 7, 2022 : ");
							day3_3 = scanner.nextInt();
							int day4_3;
							System.out.println("September 8, 2022 : ");
							day4_3 = scanner.nextInt();
							int day5_3;
							System.out.println("September 9, 2022 : ");
							day5_3 = scanner.nextInt();
							int day6_3;
							System.out.println("September 10, 2022 : ");
							day6_3 = scanner.nextInt();
						    
							int total_Whours3 = day1_3 + day2_3 + day3_3 + day4_3 + day5_3 + day6_3;
							
							if(total_Whours3 > Standard_Work3) {
								int overtime3 = total_Whours3 - Standard_Work3;
								overtimePay3 = 1.5 * HRate3 * overtime3;
							}
							// Calculate Regular Salary 
							regularPay3 = Standard_Work3 * HRate3;
							// Total Salary
							totalPay3 = overtimePay3 + regularPay3;
							
							double tax3 = 0;
							double sss3 = 0;
							double philHealth3 = 0;
							double pagIbig3 = 0;
							double netSalary3 = 0;
							double salary3 = 0;
							double totalDeductions3 = 0;
							double taxableIncome3 = 0;
							double withholdingTax3 = 0;
							double totalAllowance3 = RSub3 + PAll3 + CAll3;
							int overTime3 = total_Whours3 - Standard_Work3;
							
							// SSS Deduction
							
							if(totalPay3 <= 3250) {
								sss3 = 135;
							}else if(totalPay3 > 3250 && totalPay3 < 3750) {
								sss3 = 175.50;
							}else if(totalPay3 > 3750 && totalPay3 < 4250) {
								sss3 = 180.00;
							}else if(totalPay3 > 4250 && totalPay3 < 4750) {
								sss3 = 202.50;
							}else if(totalPay3 > 4750 && totalPay3 < 5250) {
								sss3 = 225.00;
							}else if(totalPay3 > 5250 && totalPay3 < 5750) {
								sss3 = 247.50;
							}else if(totalPay3 > 5750 && totalPay3 < 6250) {
								sss3 = 270.00;
							}else if(totalPay3 > 6250 && totalPay3 < 6750) {
								sss3 = 292.50;
							}else if(totalPay3 > 6750 && totalPay3 < 7250) {
								sss3 = 315.00;
							}else if(totalPay3 > 7250 && totalPay3 < 7750) {
								sss3 = 337.50;
							}else if(totalPay3 > 7750 && totalPay3 < 8250) {
								sss3 = 360.00;
							}else if(totalPay3 > 8250 && totalPay3 < 8750) {
								sss3 = 382.50;
							}else if(totalPay3 > 8750 && totalPay3 < 9250) {
								sss3 = 405.00;
							}else if(totalPay3 > 9250 && totalPay3 < 9750) {
								sss3 = 427.50;
							}else if(totalPay3 > 9750 && totalPay3 < 10250) {
								sss3 = 450.00;
							}else if(totalPay3 > 10250 && totalPay3 < 10750) {
								sss3 = 427.50;
							}else if(totalPay3 > 10750 && totalPay3 < 11250) {
								sss3 = 495.00;
							}else if(totalPay3 > 11250 && totalPay3 < 11750) {
								sss3 = 517.50;
							}else if(totalPay3 > 11750 && totalPay3 < 12250) {
								sss3 = 540.00;
							}else if(totalPay3 > 12250 && totalPay3 < 12750) {
								sss3 = 562.50;
							}else if(totalPay3 > 12250 && totalPay3 < 13250) {
								sss3 = 585.00;
							}else if(totalPay3 > 13250 && totalPay3 < 13750) {
								sss3 = 607.50;
							}else if(totalPay3 > 13750 && totalPay3 < 14250) {
								sss3 = 630.00;
							}else if(totalPay3 > 14250 && totalPay3 < 14750) {
								sss3 = 652.50;
							}else if(totalPay3 > 14750 && totalPay3 < 15250) {
								sss3 = 675.00;
							}else if(totalPay3 > 15250 && totalPay3 < 15750) {
								sss3 = 697.50;
							}else if(totalPay3 > 15750 && totalPay3 < 16250) {
								sss3 = 720.00;
							}else if(totalPay3 > 16250 && totalPay3 < 16750) {
								sss3 = 7742.50;
							}else if(totalPay3 > 16750 && totalPay3 < 17250) {
								sss3 = 765.00;
							}else if(totalPay3 > 17250 && totalPay3 < 17750) {
								sss3 = 787.50;
							}else if(totalPay3 > 17750 && totalPay3 < 18250) {
								sss3 = 810.00;
							}else if(totalPay3 > 18250 && totalPay3 < 18750) {
								sss3 = 832.50;
							}else if(totalPay3 > 18750 && totalPay3 < 19250) {
								sss3 = 855.00;
							}else if(totalPay3 > 19250 && totalPay3 < 19750) {
								sss3 = 877.50;
							}else if(totalPay3 > 19750 && totalPay3 < 20250) {
								sss3 = 900.00;
							}else if(totalPay3 > 20250 && totalPay3 < 20750) {
								sss3 = 922.50;
							}else if(totalPay3 > 20750 && totalPay3 < 21250) {
								sss3 = 945.00;
							}else if(totalPay3 > 21250 && totalPay3 < 21750) {
								sss3 = 967.50;
							}else if(totalPay3 > 21750 && totalPay3 < 22250) {
								sss3 = 990.00;
							}else if(totalPay3 > 22250 && totalPay3 < 22750) {
								sss3 = 1012.50;
							}else if(totalPay3 > 22750 && totalPay3 < 23250) {
								sss3 = 1035.00;
							}else if(totalPay3 > 23250 && totalPay3 < 23750) {
								sss3 = 1057.00;
							}else if(totalPay3 > 23750 && totalPay3 < 24250) {
								sss3 = 1080.00;
							}else if(totalPay3 > 24250 && totalPay3 < 24750) {
								sss3 = 1102.50;
							}else if(totalPay3 > 24750) {
								sss3 = 1125;
							}
						
							// Pag-IBIG Contribution
							
							if(totalPay3 == 0) {
								pagIbig3 = 0;
							}else if (totalPay3 > 1000 && totalPay3 < 1500) {
								pagIbig3 = (totalPay3 - 1000)*0.01;
							}else if (totalPay3 > 1500) {
								pagIbig3 = (totalPay3 - 1500)*0.02;
							}
								
								
							// WITHHOLDING TAX
								
							if(totalPay3 <= 20832) {
								tax3 = totalPay3 - totalPay3;
							}else if(totalPay3 > 20833 && totalPay3 < 33333) {
								tax3 = (totalPay3 - 20833)*0.2;
							}else if(totalPay3 > 33333 && totalPay3 < 66667) {
								tax3 = 2500 + (totalPay3 - 33333)*0.25;
							}else if(totalPay3 > 66667 && totalPay3 < 1666677) {
								tax3 = 10833 + (totalPay3 - 66667)*0.3;
							}else if(totalPay3 > 166667 && totalPay3 < 666667) {
								tax3 = 40833.33 + (totalPay3 - 166667)*0.32;
							}else if(totalPay3 > 666667) {
								tax3 = 200833.33 + (totalPay3 - 666667)*0.32;					
							}
							
							// PhilHealth Contribution	
							philHealth3 = totalPay3 - (totalPay3*0.015);
							
							
							salary3 = totalPay3;
							totalDeductions3 = sss3 + (totalPay3 - philHealth3) + pagIbig3;
							taxableIncome3 = salary3 - totalDeductions3;
							withholdingTax3 = tax3;
							netSalary3  = taxableIncome3 - withholdingTax3 + totalAllowance3;
							
							
						System.out.println("----------------------------------------------------------");
						System.out.println("|HOURS WORKED SALARY                                     |");
						System.out.println("----------------------------------------------------------");
						System.out.printf("| %-20s | %-31s |", "OVERTIME", overTime3 + " Hour/s");
						System.out.printf("%n");
						System.out.printf("| %-20s | %-31s |", "TOTAL HOURS WORKED", df2.format(total_Whours3));
						System.out.printf("%n");
						System.out.printf("| %-20s | PHP %-27s |", "HOURLY RATE", df2.format(HRate3));
						System.out.printf("%n");
						System.out.printf("| %-20s | PHP %-27s |", "REGULAR PAY", df2.format(regularPay3));
						System.out.printf("%n");
						System.out.printf("| %-20s | PHP %-27s |", "OVERTIME PAY", df2.format(overtimePay3));
						System.out.printf("%n");
						System.out.printf("| %-20s | PHP %-27s |", "SALARY", df2.format(overtimePay3 + regularPay3));
						System.out.printf("%n");
						System.out.println("----------------------------------------------------------");
						System.out.println("|DEDUCTIONS                                              |");
						System.out.println("----------------------------------------------------------");
						System.out.printf("| %-20s | PHP %-27s |", "SSS", df2.format(sss3));
						System.out.printf("%n");
						System.out.printf("| %-20s | PHP %-27s |", "PHILHEALTH", df2.format(totalPay3 - philHealth3));
						System.out.printf("%n");
						System.out.printf("| %-20s | PHP %-27s |", "PAG-IBIG", df2.format(pagIbig3));
						System.out.printf("%n");
						System.out.println("|                                                        |");
						System.out.printf("| %-20s | PHP %-27s |", "TOTAL DEDUCTIONS", df2.format(totalDeductions3));
						System.out.printf("%n");
						System.out.println("|                                                        |");
						System.out.printf("| %-20s | PHP %-27s |", "TAXABLE INCOME", df2.format(taxableIncome3));
						System.out.printf("%n");
						System.out.println("|                                                        |");
						System.out.printf("| %-20s | PHP %-27s |", "WITHHOLDING TAX", df2.format(withholdingTax3));
						System.out.printf("%n");
						System.out.println("----------------------------------------------------------");
						System.out.println("|ALLOWANCES                                              |");
						System.out.println("----------------------------------------------------------");
						System.out.printf("| %-20s | PHP %-27s |", "RICE SUBSIDY", df2.format(RSub3/4));// Divided in 4 weeks
						System.out.printf("%n");
						System.out.printf("| %-20s | PHP %-27s |", "PHONE ALLOWANCE", df2.format(PAll3/4));// Divided in 4 weeks
						System.out.printf("%n");
						System.out.printf("| %-20s | PHP %-27s |", "CLOTHING ALLOWANCE", df2.format(CAll3/4));// Divided in 4 weeks
						System.out.printf("%n");
						System.out.println("|                                                        |");
						System.out.printf("| %-20s | PHP %-27s |", "TOTAL ALLOWANCES", df2.format(totalAllowance3/4));// Divided in 4 weeks
						System.out.printf("%n");
						System.out.println("|                                                        |");
						System.out.println("__________________________________________________________");
						System.out.printf("| %-20s | PHP %-27s |", "NET SALARY", df2.format(netSalary3));
						System.out.printf("%n");
						System.out.println("----------------------------------------------------------");
						System.out.println();
						System.out.println();
						
					    }else {
					    	System.out.println();
					}
					}
					}
					break;
				case 3:
					//break;
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
			System.out.println("----------------------------------------------------------");
			System.out.println("|Select your option:                                     |");
			System.out.println("----------------------------------------------------------");
			System.out.println("|1|Employee Information                                 1|");
			System.out.println("|2|Salary Generator                                     2|");
			System.out.println("|0|Exit                                                 5|");
			System.out.println("----------------------------------------------------------");
			System.out.print("Your selected option is: ");
			//System.out.println();
			//System.out.println("----------------------------------------------------------");
			selection = sc.nextInt();
			return selection;
			
		}

	}

