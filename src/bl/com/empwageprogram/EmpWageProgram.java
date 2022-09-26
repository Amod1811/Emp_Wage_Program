package bl.com.empwageprogram;

public class EmpWageProgram {

	public static void main(String[] args) {
		//variables
				int fullTime =1;
				int  empHrs=8;
				int Wsa =0;
				int emp_Rate_Per_Hour = 20;
				int empWage = 20;
				
				//use random method check employee is present or not
				double empCheck = Math.floor(Math.random()* 10)%2;
				if (empCheck == fullTime)
					System.out.println("Employee is present");
				else
					System.out.println("Employee is not prsent");
				
				//calculate employee wage 
				if (empCheck == fullTime)
					empHrs = 12;
				empWage = empHrs * emp_Rate_Per_Hour;
				System.out.println("Emp Wage : " + empWage);
						
		}
	}

