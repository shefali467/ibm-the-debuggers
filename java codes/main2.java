package ibm;

import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;
import org.apache.log4j.PropertyConfigurator;


public class main2 {
	static long start;
	static long obj;
	static long exec_time,code_line=0,prfrmnce;
	static int error=0,exceptn=0;
	static{
		init();
	}
	
	 private static final Logger logger = LogManager.getLogger(main2.class.getName());
	
	 static Logger getLogger()
	{
		return logger;
	}
	static void gen(int... n)
	{
		int len=n.length;
		StackTraceElement[] stackl=Thread.currentThread().getStackTrace();
		Logger log=main2.getLogger();
		for(StackTraceElement ste:stackl)
		{
			for(int i=0;i<len;i++) {
			log.debug("Class Name :"+ste.getClassName()+"| Line Number :"+ste.getLineNumber()+"| n="+n[i]);
			code_line++;
		}}
	}
	public static void m4(String[] args) throws Exception {
   
		try {
		    start = System.currentTimeMillis();
			log4.m5(null);	
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
	}

	/**
	 * method to init log4j2 configurations
	 */
	private static void init() {
		PropertyConfigurator.configure("log4j2.properties");
	}

}








































