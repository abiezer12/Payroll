import java.math.BigDecimal;
import java.util.Currency;
import java.util.Scanner;

public class payroll{

//main function
public static void main(String[] Args) {       

    int days;
    double sss;
    double salary;
    double tax;
    double grosssalary;
    double loan;
    int hhr; 
    double hot;
    double rate;
    
Scanner scan = new Scanner(System.in);


System.out.print("Name : ");
String name = scan.nextLine();

System.out.print("Type F if Full Time, Type P if Part Time \nLetter : ");
String input = scan.nextLine();

//Variables

Double rph = 200.00;
Double per = 2.0;

//Currency Sysmbols

Currency cur = Currency.getInstance("PHP");
String sym = cur.getSymbol();

// If Statements If, Else If, Else

if (input.equals("F")) {

    System.out.println("How many days have you worked? ");
    days = scan.nextInt();
    System.out.println("How many Hours did you worked Overtime?");
    hot = scan.nextDouble();
    System.out.println("How much is your SSS?");
    sss = scan.nextDouble();
    System.out.println("How much is your loan?");
    loan = scan.nextDouble();
    
grosssalary = ((rph  * 8) * days )+( hot*(rph*per));
    tax = grosssalary * 0.1;
    salary = grosssalary - tax - sss - loan ;
    
    System.out.println("\n \n \n \n \n");
  
  
    System.out.println("Name: " + name);
    System.out.println("Days: " + days);
    System.out.println("overtime: " + hot + "hrs");
    System.out.println("SSS: "+sym+" " + sss);
    System.out.println("Tax: "+sym+" " + tax);
    System.out.println("Loan: "+sym+" " + loan);
    System.out.println("RPH: "+sym+" " + rph);
    System.out.println("Gross Salary: "+sym+" " + grosssalary);
    System.out.println("Salary: "+sym+" " + salary);

}

else if (input.equals("P")){

System.out.println("Rate per Hour: " );
rate = scan.nextInt();
    
System.out.println("Number of Hours spent in Work : ");
hhr = scan.nextInt();

System.out.println("Number of Hours spent in OT : ");
hot = scan.nextDouble();

System.out.println("How much is your loan?");
loan = scan.nextDouble();


//compute

grosssalary  = hot*(rate*per)+(rate*hhr);
    tax = grosssalary  * 0.1;
    salary = grosssalary - tax - loan;



System.out.println("\n \n \n \n \n");

    System.out.println("Name: " + name);
    System.out.println("Rate: "+sym+ " " + rate);
    System.out.println("hours: " + hhr);
    System.out.println("Tax: "+sym+" " + tax);
    System.out.println("Loan: "+sym+" " + loan);
    System.out.println("Gross Wages: "+sym+" " + grosssalary);
    System.out.println("Wages: "+sym+" " + salary);


}

else {
System.out.println("Please type *F* or *P*");
}

}
}
