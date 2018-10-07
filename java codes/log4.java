package ibm;


public class log4 {

    public static void m5(String[] args) {

    	//We will find the factorial of this number
        int number = 6;
        int fact = 1;
        for(int i = 1; i <= number; i++)
        {
            fact = fact * i;
            System.out.println("n="+fact);
            main2.gen(fact);
            
        }
        System.out.println("Factorial of "+number+" is: "+fact);
    }
}