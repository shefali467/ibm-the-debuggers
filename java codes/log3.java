package ibm;

 class log3{  
	 static int factorial(int n){    
	  if (n == 0)    
	    return 1;    
	  else    
		  System.out.println("n="+n);
	      log2.gen(n);
	    return(n * factorial(n-1));    
	  
	 }    
	 public static void m2(String... args){  
	  
	  int fact =1;
	  if(args!=null) {
//It is the number to calculate factorial  
		  int number=Integer.parseInt(args[0]);
	  fact = factorial(number);   
	  System.out.println("Factorial of "+number+" is: "+fact);
	  return;
	 }  
	  
	}}  
