package Main;

import java.text.DecimalFormat;

public class Payroll {

	public double ComputeSSS(double totalPay) {
		double computedSSS = 0;
		
		if(totalPay <= 3250) {
			computedSSS = 135;
		}else if(totalPay > 3250 && totalPay < 3750) {
			computedSSS = 175.50;
		}else if(totalPay > 3750 && totalPay < 4250) {
			computedSSS = 180.00;
		}else if(totalPay > 4250 && totalPay < 4750) {
			computedSSS = 202.50;
		}else if(totalPay > 4750 && totalPay < 5250) {
			computedSSS = 225.00;
		}else if(totalPay > 5250 && totalPay < 5750) {
			computedSSS = 247.50;
		}else if(totalPay > 5750 && totalPay < 6250) {
			computedSSS = 270.00;
		}else if(totalPay > 6250 && totalPay < 6750) {
			computedSSS = 292.50;
		}else if(totalPay > 6750 && totalPay < 7250) {
			computedSSS = 315.00;
		}else if(totalPay > 7250 && totalPay < 7750) {
			computedSSS = 337.50;
		}else if(totalPay > 7750 && totalPay < 8250) {
			computedSSS = 360.00;
		}else if(totalPay > 8250 && totalPay < 8750) {
			computedSSS = 382.50;
		}else if(totalPay > 8750 && totalPay < 9250) {
			computedSSS = 405.00;
		}else if(totalPay > 9250 && totalPay < 9750) {
			computedSSS = 427.50;
		}else if(totalPay > 9750 && totalPay < 10250) {
			computedSSS = 450.00;
		}else if(totalPay > 10250 && totalPay < 10750) {
			computedSSS = 427.50;
		}else if(totalPay > 10750 && totalPay < 11250) {
			computedSSS = 495.00;
		}else if(totalPay > 11250 && totalPay < 11750) {
			computedSSS = 517.50;
		}else if(totalPay > 11750 && totalPay < 12250) {
			computedSSS = 540.00;
		}else if(totalPay > 12250 && totalPay < 12750) {
			computedSSS = 562.50;
		}else if(totalPay > 12250 && totalPay < 13250) {
			computedSSS = 585.00;
		}else if(totalPay > 13250 && totalPay < 13750) {
			computedSSS = 607.50;
		}else if(totalPay > 13750 && totalPay < 14250) {
			computedSSS = 630.00;
		}else if(totalPay > 14250 && totalPay < 14750) {
			computedSSS = 652.50;
		}else if(totalPay > 14750 && totalPay < 15250) {
			computedSSS = 675.00;
		}else if(totalPay > 15250 && totalPay < 15750) {
			computedSSS = 697.50;
		}else if(totalPay > 15750 && totalPay < 16250) {
			computedSSS = 720.00;
		}else if(totalPay > 16250 && totalPay < 16750) {
			computedSSS = 7742.50;
		}else if(totalPay > 16750 && totalPay < 17250) {
			computedSSS = 765.00;
		}else if(totalPay > 17250 && totalPay < 17750) {
			computedSSS = 787.50;
		}else if(totalPay > 17750 && totalPay < 18250) {
			computedSSS = 810.00;
		}else if(totalPay > 18250 && totalPay < 18750) {
			computedSSS = 832.50;
		}else if(totalPay > 18750 && totalPay < 19250) {
			computedSSS = 855.00;
		}else if(totalPay > 19250 && totalPay < 19750) {
			computedSSS = 877.50;
		}else if(totalPay > 19750 && totalPay < 20250) {
			computedSSS = 900.00;
		}else if(totalPay > 20250 && totalPay < 20750) {
			computedSSS = 922.50;
		}else if(totalPay > 20750 && totalPay < 21250) {
			computedSSS = 945.00;
		}else if(totalPay > 21250 && totalPay < 21750) {
			computedSSS = 967.50;
		}else if(totalPay > 21750 && totalPay < 22250) {
			computedSSS = 990.00;
		}else if(totalPay > 22250 && totalPay < 22750) {
			computedSSS = 1012.50;
		}else if(totalPay > 22750 && totalPay < 23250) {
			computedSSS = 1035.00;
		}else if(totalPay > 23250 && totalPay < 23750) {
			computedSSS = 1057.00;
		}else if(totalPay > 23750 && totalPay < 24250) {
			computedSSS = 1080.00;
		}else if(totalPay > 24250 && totalPay < 24750) {
			computedSSS = 1102.50;
		}else if(totalPay > 24750) {
			computedSSS = 1125;
		}
		
		return computedSSS;
		
	}
	
	public double ComputePagIbig(double totalPay) {
		double pagIbig = 0;
		
		if(totalPay == 0) {
			pagIbig = 0;
		}else if (totalPay > 1000 && totalPay < 1500) {
			pagIbig = (totalPay - 1000)*0.01;
		}else if (totalPay > 1500) {
			pagIbig = (totalPay - 1500)*0.02;
		}
		
		return pagIbig;
	}
	
	public double ComputeWTax(double totalPay) {
		double wtax = 0;
		
		if(totalPay <= 20832) {
			wtax = 0;
		}else if(totalPay > 20833 && totalPay < 33333) {
			wtax = (totalPay - 20833)*0.2;
		}else if(totalPay > 33333 && totalPay < 66667) {
			wtax = 2500 + (totalPay - 33333)*0.25;
		}else if(totalPay > 66667 && totalPay < 1666677) {
			wtax = 10833 + (totalPay - 66667)*0.3;
		}else if(totalPay > 166667 && totalPay < 666667) {
			wtax = 40833.33 + (totalPay - 166667)*0.32;
		}else if(totalPay > 666667) {
			wtax = 200833.33 + (totalPay - 666667)*0.32;					
		}
		return wtax;
	}
	
	public double ComputePhilHealth(double totalPay) {
		return  totalPay*0.015;	
	}

	public void ProcessPayroll(
			double total_whours, 
			double total_overtime, 
			double ratePerHour,
			double totalAllowance) 
	{
		
		DecimalFormat df = new DecimalFormat("#,###.00");
		
		// Calculate OT Salary
		double overTimePay = 1.5 * ratePerHour * total_overtime;
		
		// Calculate Regular Salary 
		double regularPay = total_whours * ratePerHour;
		
		double grossPay = overTimePay + regularPay;
		
		// Compute for SSS
		double sssAmount = ComputeSSS(grossPay);
		
		// Compute for Pag-ibig
		double pagIbigAmount = ComputePagIbig(grossPay);
		
		// Compute for PhilHealth
		
		double phicAmount = ComputePhilHealth(grossPay);
		
		
		// Compute for WTax
		double wTaxAmount = ComputeWTax(grossPay - (sssAmount + phicAmount + pagIbigAmount));
		
		double baseSalary = grossPay;
		
		double totalDeductions = sssAmount + phicAmount + pagIbigAmount + wTaxAmount;
		
		double taxableIncome = baseSalary - totalDeductions;
		
		double withHoldingTax = wTaxAmount;
		
		double netSalary = taxableIncome - withHoldingTax + totalAllowance;
					
	
		System.out.println("----------------------------------------------------------");
		System.out.println("| PAYSLIP INFORMATION ");
		System.out.println("----------------------------------------------------------");
		System.out.printf("| %-20s | %-31s |", "TOTAL REGULAR HOURS WORKED", df.format(total_whours));
		System.out.printf("%n");
		System.out.printf("| %-20s | %-31s |", "TOTAL OVERTIME HOURS WORKED", df.format(total_overtime));
		System.out.printf("%n");
		System.out.printf("| %-20s | PHP %-27s |", "HOURLY RATE", df.format(ratePerHour));
		System.out.printf("%n");
		System.out.printf("| %-20s | PHP %-27s |", "REGULAR PAY", df.format(regularPay));
		System.out.printf("%n");
		System.out.printf("| %-20s | PHP %-27s |", "OVERTIME PAY", df.format(overTimePay));
		System.out.printf("%n");
		System.out.printf("| %-20s | PHP %-27s |", "SALARY", df.format(baseSalary));
		System.out.printf("%n");
		System.out.println("----------------------------------------------------------");
		System.out.println("|DEDUCTIONS                                              |");
		System.out.println("----------------------------------------------------------");
		System.out.printf("| %-20s | PHP %-27s |", "SSS", df.format(sssAmount));
		System.out.printf("%n");
		System.out.printf("| %-20s | PHP %-27s |", "PHILHEALTH", df.format(phicAmount));
		System.out.printf("%n");
		System.out.printf("| %-20s | PHP %-27s |", "PAG-IBIG", df.format(pagIbigAmount));
		System.out.printf("%n");
		System.out.printf("| %-20s | PHP %-27s |", "TAXABLE INCOME", df.format(taxableIncome));
		System.out.printf("%n");
		System.out.printf("| %-20s | PHP %-27s |", "WITHHOLDING TAX", df.format(withHoldingTax));
		System.out.printf("%n");
		System.out.printf("| %-20s | PHP %-27s |", "TOTAL DEDUCTIONS", df.format(totalDeductions));
		System.out.printf("%n");
		System.out.println("----------------------------------------------------------");
		System.out.println("|ALLOWANCES                                              |");
		System.out.println("----------------------------------------------------------"); 
		System.out.printf("| %-20s | PHP %-27s |", "TOTAL ALLOWANCES", df.format(totalAllowance));
		System.out.printf("%n");
		System.out.println("(Clothing+Rice+Phone) "); 
		System.out.println("__________________________________________________________");
		System.out.printf("| %-20s | PHP %-27s |", "NET SALARY (SALARY + ALLOWANCES) ", df.format(netSalary));
		System.out.printf("%n");
		System.out.println("----------------------------------------------------------");
		System.out.println();

	}

}

