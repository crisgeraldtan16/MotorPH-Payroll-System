package Main;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;


import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class Attendance {

	private double computeTimeDifference(String ptime1, String ptime2) {
		
		String time1 = "00:00";
		String time2 = "00:00";
		
		
		if (ptime1.length() == 4) {
			time1 = "0"+ptime1;
		}else {
			time1 = ptime1;
		}
		
		if (ptime2.length() == 4) {
			time2 = "0"+ptime2;
		}else {
			time2 = ptime2;
		}
		
		
		double timeDifference = Duration.between(LocalTime.parse(time1), LocalTime.parse(time2)).toMinutes() / 60.0;
		
		return timeDifference;
	}
	
	
	public void ReadAttendanceLogsNoPayrollGenerate(String empId) throws CsvValidationException, IOException {
		try {
			CSVReader reader = new CSVReader(new FileReader("attendance_logs.csv"));
			
			String[] att_logs;
			
			double totalHours = 0;
			
			System.out.printf("| %-20s", "-".repeat(100));
			System.out.println();
			System.out.printf("| ATTENDANCE LOGS %n");
			System.out.printf("| %-20s", "-".repeat(100));
			System.out.println();
			
			
			System.out.printf("| %-10s | %-10s | %-10s | %-10s | %-10s  ", "ID Number", "Att. Date", "Time-In",
					"Time-Out", "Total Work Hrs.");
			System.out.println();

			while ((att_logs = reader.readNext()) != null) {
				if (att_logs[0].equals(empId)) {
					double timediff = computeTimeDifference(att_logs[4], att_logs[5]);
					System.out.printf("| %-10s | %-10s | %-10s | %-10s | %-10s  ", att_logs[0], att_logs[3],
							att_logs[4], att_logs[5], timediff);
					System.out.println();
					System.out.printf("| %-20s", "-".repeat(100));
					System.out.println();

					totalHours += timediff;
				}

			}	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void ReadAttendanceLogs() throws CsvValidationException, IOException {
		try {
			CSVReader reader = new CSVReader(new FileReader("attendance_logs.csv"));
			
			String[] att_logs;
			
			double totalHours = 0;
			
			System.out.printf("| %-20s", "-".repeat(100));
			System.out.println();
			System.out.printf("| ATTENDANCE LOGS %n");
			System.out.printf("| %-20s", "-".repeat(100));
			System.out.println();
			
			
			System.out.printf("| %-10s | %-10s | %-10s | %-10s | %-10s  ", "ID Number", "Att. Date", "Time-In", "Time-Out", "Total Work Hrs.");
			System.out.println();
			
			while((att_logs = reader.readNext()) != null) {
//				
				double timediff = computeTimeDifference(att_logs[4], att_logs[5]);
				
				System.out.printf("| %-10s | %-10s | %-10s | %-10s | %-10s  ", att_logs[0], att_logs[3], att_logs[4], att_logs[5], timediff);
				System.out.println();
				System.out.printf("| %-20s", "-".repeat(100));
				System.out.println();
				
				totalHours += timediff;
			}
			
			System.out.println(totalHours);
						
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void ReadAttendanceLogsByEmployeeID(String empId, 
			String pStartDate, 
			String pEndDate,
			Double otHours,
			Double hourlyRate,
			Double totalAllowance) throws Exception {
		try {
			
			if (pStartDate == "") {
				throw new Exception("Invalid Start Date");
			}
			
			if (pEndDate == "") {
				throw new Exception("Invalid End Date");
			}
			
			CSVReader reader = new CSVReader(new FileReader("attendance_logs.csv"));
			
			Payroll payroll = new Payroll();
			
			String[] att_logs;
			double totalHours = 0;
			
			
			Date startDate;
			Date endDate;
			Date loopDate;
			
			System.out.printf("| %-20s", "-".repeat(100));
			System.out.println();
			System.out.printf("| ATTENDANCE LOGS %n");
			System.out.printf("| %-20s", "-".repeat(100));
			System.out.println();
			
			
			System.out.printf("| %-10s | %-10s | %-10s | %-10s | %-10s  ", "ID Number", "Att. Date", "Time-In", "Time-Out", "Total Work Hrs.");
			System.out.println();
			
			while((att_logs = reader.readNext()) != null) {
			
				if (att_logs[0].equals(empId)) {
					
					startDate = new SimpleDateFormat("MM/dd/yyyy").parse(pStartDate);
					endDate = new SimpleDateFormat("MM/dd/yyyy").parse(pEndDate);
					loopDate = new SimpleDateFormat("MM/dd/yyyy").parse( att_logs[3]);
					
					// Modify start date to subtract 1 day
					Calendar c = Calendar.getInstance();
					c.setTime(startDate);
					c.add(Calendar.DATE, -1);
					
					// Modify end date to add 1 day
					Calendar e = Calendar.getInstance();
					e.setTime(endDate);
					e.add(Calendar.DATE, 1);
					
					if (loopDate.after(c.getTime()) && loopDate.before(e.getTime())) {
						
						double timediff = computeTimeDifference(att_logs[4], att_logs[5]);
						
						System.out.printf("| %-10s | %-10s | %-10s | %-10s | %-10s  ", att_logs[0], att_logs[3], att_logs[4], att_logs[5], timediff);
						System.out.println();
						System.out.printf("| %-20s", "-".repeat(100));
						System.out.println();	
						
						totalHours += timediff;
					}
					
				
				}				
			}
			
			//Generate Payroll
			payroll.ProcessPayroll(totalHours, 0, 100.0, 1200);
			
//			System.out.println(totalHours);
						
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
