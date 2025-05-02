package Main;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Scanner;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class EmployeeInformation {
    private String employeeID;
    private String firstName;
    private String lastName;
    private String birthday;
    private String address;
    private String phoneNumber;
    private String position;
    private double basicSalary;
    private double hourlyRate;

    // Getter and Setter for employeeID
    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    // Getter and Setter for firstName
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter and Setter for lastName
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Getter and Setter for birthday
    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    // Getter and Setter for address
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Getter and Setter for phoneNumber
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Getter and Setter for position
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    // Getter and Setter for basicSalary
    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        if (basicSalary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative");
        }
        this.basicSalary = basicSalary;
    }

    // Getter and Setter for hourlyRate
    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        if (hourlyRate < 0) {
            throw new IllegalArgumentException("Hourly rate cannot be negative");
        }
        this.hourlyRate = hourlyRate;
    }

    public void GenerateSalary(String idNumber) throws Exception {
        Scanner scanner = new Scanner(System.in);

        Payroll payroll = new Payroll();
        Attendance attendance = new Attendance();

        // Get the Existing Record of Employee

        CSVReader reader = new CSVReader(new FileReader("employee_data.csv"));

        String[] employeeRecord;

        try {
            while ((employeeRecord = reader.readNext()) != null) {
                if (employeeRecord[0].equals(idNumber)) {
                    String startDate;
                    String endDate;

                    System.out.println("----------------------------------------------------------");
                    System.out.println("|INPUT PAYROLL START AND END DATE |");
                    System.out.println("----------------------------------------------------------");

                    System.out.print("ENTER PAYROLL START DATE <MM/dd/yyyy>:  ");
                    startDate = scanner.nextLine();

                    System.out.print("ENTER PAYROLL END DATE <MM/dd/yyyy>:  ");
                    endDate = scanner.nextLine();

                    double totalAllowance = Double.parseDouble(employeeRecord[14]) + Double.parseDouble(employeeRecord[15]) + Double.parseDouble(employeeRecord[16]);
                    double hourlyRate = Double.parseDouble(employeeRecord[18]);

                    // payroll.ProcessPayroll(totalHoursWorked, totalOvertimeWorked, hourlyRate, totalAllowance);
                    attendance.ReadAttendanceLogsByEmployeeID(idNumber, startDate, endDate, 0.0, hourlyRate, totalAllowance);

                }
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public void GetEmployeesByID(String idNumber) throws CsvValidationException, IOException, ParseException {
        try {
            DecimalFormat df = new DecimalFormat("#,###.00");
            CSVReader reader = new CSVReader(new FileReader("employee_data.csv"));

            Attendance attendance = new Attendance();

            String[] employeeRecord;

            while ((employeeRecord = reader.readNext()) != null) {
                if (employeeRecord[0].equals(idNumber)) {

                    System.out.printf("| %-20s", "-".repeat(100));
                    System.out.println();
                    System.out.printf("| EMPLOYEE INFORMATION %n");
                    System.out.printf("| %-20s", "-".repeat(100));
                    System.out.println();
                    System.out.printf("| %-20s : %-80s ", "EMPLOYEE NO.", employeeRecord[0]);
                    System.out.printf("%n");
                    System.out.printf("| %-20s : %-80s ", "LAST NAME", employeeRecord[1]);
                    System.out.printf("%n");
                    System.out.printf("| %-20s : %-80s ", "FIRST NAME", employeeRecord[2]);
                    System.out.printf("%n");
                    System.out.printf("| %-20s : %-80s ", "BIRTHDAY", employeeRecord[3]);
                    System.out.printf("%n");
                    System.out.printf("| %-20s : %-80s ", "ADDRESS", employeeRecord[4]);
                    System.out.printf("%n");
                    System.out.printf("| %-20s : %-80s ", "PHONE NUMBER", employeeRecord[5]);
                    System.out.printf("%n");
                    System.out.printf("| %-20s", "-".repeat(100));
                    System.out.println();
                    System.out.printf("| GOVERNMENT ID NUMBERS %n");
                    System.out.printf("| %-20s", "-".repeat(100));
                    System.out.println();
                    System.out.printf("| %-20s | %-80s ", "SSS NO.", employeeRecord[6]);
                    System.out.printf("%n");
                    System.out.printf("| %-20s | %-80s ", "PHILHEALTH NO.", employeeRecord[7]);
                    System.out.printf("%n");
                    System.out.printf("| %-20s | %-80s ", "TIN NO.", employeeRecord[8]);
                    System.out.printf("%n");
                    System.out.printf("| %-20s | %-80s ", "PAG-IBIG NO.", employeeRecord[9]);
                    System.out.printf("%n");
                    System.out.printf("| %-20s", "-".repeat(100));
                    System.out.println();
                    System.out.printf("| EMPLOYEE HISTORY |%n");
                    System.out.printf("| %-20s", "-".repeat(100));
                    System.out.println();
                    System.out.printf("| %-20s | %-80s ", "STATUS", employeeRecord[10]);
                    System.out.printf("%n");
                    System.out.printf("| %-20s | %-80s ", "POSITION", employeeRecord[11]);
                    System.out.printf("%n");
                    System.out.printf("| %-20s | %-80s ", "IMMIDIATE SUPERVISOR", employeeRecord[12]);
                    System.out.printf("%n");
                    System.out.printf("| %-20s", "-".repeat(100));
                    System.out.println();
                    System.out.printf("| SALARY INFORMATION %n");
                    System.out.printf("| %-20s", "-".repeat(100));
                    System.out.println();

                    System.out.printf("| %-20s | %-80s ", "BASIC SALARY", df.format(Double.parseDouble(employeeRecord[13])));
                    System.out.printf("%n");
                    System.out.printf("| %-20s | %-80s ", "GROSS SEMI-MONTHLY", df.format(Double.parseDouble(employeeRecord[14])));
                    System.out.printf("%n");
                    System.out.printf("| %-20s | %-80s ", "GROSS SEMI-MONTHLY", df.format(Double.parseDouble(employeeRecord[17])));
                    System.out.printf("%n");
                    System.out.printf("| %-20s | %-80s ", "HOURLY RATE", df.format(Double.parseDouble(employeeRecord[18])));
                    System.out.printf("%n");
                    System.out.printf("| %-20s", "-".repeat(100));
                    System.out.println();
                    System.out.printf("| ALLOWANCES AND BENEFITS %n");
                    System.out.printf("| %-20s", "-".repeat(100));
                    System.out.println();
                    System.out.printf("%n");
                    System.out.printf("| %-20s | %-80s ", "RICE SUBSIDY", df.format(Double.parseDouble(employeeRecord[14])));
                    System.out.printf("%n");
                    System.out.printf("| %-20s | %-80s ", "PHONE ALLOWANCE", df.format(Double.parseDouble(employeeRecord[15])));
                    System.out.printf("%n");
                    System.out.printf("| %-20s | %-80s ", "CLOTHING ALLOWANCE", df.format(Double.parseDouble(employeeRecord[16])));
                    System.out.printf("%n");

                }

            }

            // List Attendance Logs by Employee ID
            attendance.ReadAttendanceLogsNoPayrollGenerate(idNumber);

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void ReadEmployees() throws CsvValidationException, IOException {
        try {

            CSVReader reader = new CSVReader(new FileReader("employee_data.csv"));

            String[] employeeRecord;

            System.out.printf("| %-20s", "-".repeat(100));
            System.out.println();
            System.out.printf("| EMPLOYEE LISTING %n");
            System.out.printf("| %-20s", "-".repeat(100));
            System.out.println();

            // System.out.printf("| %-20s | %-10s : %-10s | %-10s", "EMPLOYEE NO.", "LAST NAME", "FIRST NAME", "POSITION");
            // System.out.println();
            while ((employeeRecord = reader.readNext()) != null) {

                System.out.printf("| %-10s | %-20s | %-20s | %-10s", employeeRecord[0], employeeRecord[1], employeeRecord[2], employeeRecord[11]);
                System.out.println();
                System.out.printf("| %-20s", "-".repeat(100));
                System.out.println();
            }

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public void GeneratePayrollSummaryPerEmployee() throws CsvValidationException, IOException {
        try {

            CSVReader reader = new CSVReader(new FileReader("employee_data.csv"));

            String[] employeeRecord;

            System.out.printf("| %-20s", "-".repeat(150));
            System.out.println();
            System.out.printf("| PAYROLL COMPUTATION PER EMPLOYEE %n");
            System.out.printf("| %-20s", "-".repeat(150));
            System.out.println();

            while ((employeeRecord = reader.readNext()) != null) {

                System.out.printf("| %-10s | %-25s | %-15s | %-25s | %-15s | %-15s | %-15s ",
                        employeeRecord[0],
                        employeeRecord[1] + ", " + employeeRecord[2],
                        employeeRecord[13],
                        employeeRecord[17],
                        employeeRecord[14],
                        employeeRecord[15],
                        employeeRecord[16]);
                System.out.println();
                System.out.printf("| %-20s", "-".repeat(150));
                System.out.println();

                // System.out.printf("| %-10s | %-15s | %-15s | %-25s | %-10s | %-10s",
                // employeeRecord[13],
                // employeeRecord[14],
                // employeeRecord[15],
                // employeeRecord[16],
                // employeeRecord[17],
                // employeeRecord[18]);
                // System.out.println();
                // System.out.printf("| %-20s", "-".repeat(150));
                // System.out.println();
                // System.out.println();
            }

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
