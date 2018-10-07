package ibm;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

public class graph extends JFrame {
	static long x,y,z,p,q,r;
	static int m,n,s,t;
	

  private static final long serialVersionUID = 1L;

  public graph(String appTitle) {
    super(appTitle);

    // Create Dataset
    CategoryDataset dataset = createDataset();
    
    //Create chart
    JFreeChart chart=ChartFactory.createBarChart(
        "Analysing Code(DEBUGGING)", //Chart Title
        "Comparision Parameters", // Category axis
        "Range", // Value axis
        dataset,
        PlotOrientation.VERTICAL,
        true,true,false
       );

    ChartPanel panel=new ChartPanel(chart);
    setContentPane(panel);
  }

  private CategoryDataset createDataset() {
    DefaultCategoryDataset dataset = new DefaultCategoryDataset();
    System.out.println("2");
    long x= log2.exec_time;
	   long y=log2.code_line;
	   long z=log2.prfrmnce;
	   int m=log2.error;
	   int n= log2.exceptn;
    // Population in 2005
    long p= main2.exec_time;
	   long q= main2.code_line;
	   long r= main2.prfrmnce;
	   int s= main2.error;
	   int t= main2.exceptn;
   
   dataset.addValue(x, "factorial-recursion", "Execution Time");
   dataset.addValue(x, "factorial-recursion", "Execution Time");
    dataset.addValue(p, "factorial- loop", "Execution Time");

    dataset.addValue(z, "factorial-recursion", "Performance");
    dataset.addValue(z, "factorial-recursion", "Performance");
    dataset.addValue(r, "factorial- loop", "Performance");

    dataset.addValue(y, "factorial-recursion", "line of code");
   dataset.addValue(y, "factorial-recursion", "line of code");
   dataset.addValue(q, "factorial- loop", "line of code");
    
   dataset.addValue(m, "factorial-recursion", "error");
    dataset.addValue(m, "factorial-recursion", "error");
    dataset.addValue(s, "factorial- loop", "error");

    dataset.addValue(n, "factorial-recursion", "exeption");
    dataset.addValue(n, "factorial-recursion", "exeption");
    dataset.addValue(t, "factorial- loop", "exeption");


    return dataset;
  }
   
  public static void m3(String... args) throws Exception {

	  
	      graph example=new graph("Graphical Representation");
	      example.setSize(900, 600);
	      example.setLocationRelativeTo(null);
	      example.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	      example.setVisible(true);
	    return;
  }
}