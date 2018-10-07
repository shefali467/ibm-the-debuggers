package ibm;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class log2 {
	static long start;
	static long obj;
	static long exec_time,code_line=0,prfrmnce;
	static int error=0,exceptn=0;
	static{
		init();
	}
	
	private final static Logger logger = Logger.getLogger(log2.class);
	
	 static Logger getLogger()
	{
		return logger;
	}
	static void gen(int... n)
	{
		
		
		int len=n.length;
		StackTraceElement[] stackl=Thread.currentThread().getStackTrace();
		Logger log=log2.getLogger();
		for(StackTraceElement ste:stackl)
		{
			for(int i=0;i<len;i++) {
			log.debug("Class Name :"+ste.getClassName()+"| Line Number :"+ste.getLineNumber()+"| n="+n[i]);
			code_line++;
		}}
	}
	public static void m1(String... args) throws Exception {
   
		try {
		    start = System.currentTimeMillis();
		   
			log3.m2(args);	
			
		}catch(Exception e) {
			long end = System.currentTimeMillis(); 
	        obj=end-start;
			logger.error(e.toString());
			logger.error("\nFinal Execution Time Taken:--"+obj+"ms");
			exec_time=obj;
			exceptn=10;
		}catch(Error er) {
			long end = System.currentTimeMillis(); 
			obj=end-start;
			logger.error(er.toString());
			logger.error("\nFinal Execution Time Taken:--"+obj+"ms");
			exec_time=obj;
			error=10;
		}	
		long end = System.currentTimeMillis(); 
		obj=end-start;
		logger.error("\nFinal Execution Time Taken:--"+obj+"ms");
		prfrmnce=exec_time+code_line;
		exec_time=obj;
	
		graph.m3(null);
		return;
	}

	/**
	 * method to init log4j configurations
	 */
	private static void init() {
		PropertyConfigurator.configure("log4j.properties");
	}

}

































//import java.io.File;
//import java.io.FileWriter;
//
//import org.apache.log4j.Logger;
//public class log2 {
//    static Logger logger = Logger.getLogger(log2.class);
//    public static void main(String[] args) {    
//    	try {
//    	FileWriter fw = new FileWriter(new 
//				File("C:\\Users\\Lenovo\\eclipse\\java-photon2\\eclipse\\ibm\\src\\ibm\\execptions.log"));
//		fw.write("drg");
//		fw.close();
//        logger.debug("This is debug message");
//        logger.info("This is info message");
//        logger.warn("This is warn message");
//        logger.fatal("This is fatal message");
//        logger.error("This is error message");
//        System.out.println("Logic executed successfully....");
//    	}
//    	catch(Exception e) {
//    		logger.fatal("Unable to open file.", e);
//    	}
//    }
//}






