package bl.com.empwageprogram;

public class EmpWageProgram {

	public static void main(String[] args) {
		//variables
				int is_full_time =1;
				int is_part_time = 2;
				int  empHrs=8;
				int Wsa =0;
				int emp_rate_per_hour = 20;
				int empWage = 20;
				
				//use random method check employee is present or not
				double empCheck = Math.floor(Math.random()* 10)%3;
				if (empCheck == is_full_time)
					System.out.println("Employee is present");
				else
					System.out.println("Employee is not present");
				
				//calculate employee wage 
				if (empCheck == is_full_time)
					empHrs = 12;
				else if (empCheck == is_part_time)
					empHrs = 8;
				else
					empHrs = 0;
				empWage = empHrs * emp_rate_per_hour;
				System.out.println("Emp Wage : " + empWage);
		}
	}

