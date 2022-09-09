package bl.com.empwageprogram;

public class EmpWageProgram {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Program");
		
		int fulltime = 1;
		double check =  Math.floor(Math.random() * 10) %2;
		
		if(check == fulltime){
			System.out.println("Emp is present");
		}
		else {
			System.out.println("Emp is not present");
		}
	}
}
