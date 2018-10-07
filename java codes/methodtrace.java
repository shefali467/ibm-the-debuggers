package ibm;
import javax.swing.*;



import java.io.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.*;
public class methodtrace extends JFrame implements ActionListener 
{ 
	private static final long serialVersionUID = 1L;
	JFrame f;   
	TextArea area;  
	JButton b,b1,b2,b3;
	JButton tr;
	methodtrace(){
    JFrame f= new JFrame("Method-Trace Analyser[IBM HACKATHON]"); 
    f.getContentPane().setBackground(Color.DARK_GRAY);
    tr=new JButton("Trace file");  
    tr.setBounds(350,40,1200,35); 
    tr.setFont(new Font("serif", Font.BOLD, 25));
    tr.setBackground(Color.ORANGE);
    area=new TextArea();  
    area.setFont(new Font("serif", Font.BOLD, 18));
    area.setBounds(350,70,1200,800); 
    b=new JButton("Run code1");  
    b.setBounds(50,100,200,60);
    b.setFont(new Font("serif", Font.BOLD, 20));
    b.setToolTipText("click here to run(Factorial-recurssion) ");
    b.addActionListener(this);
    b1=new JButton("ReRun code1");  
    b1.setBounds(50,250,200,60);  
    b1.setFont(new Font("serif", Font.BOLD, 20));
    b1.setToolTipText("click here to rerun the code with different input ");
    b1.addActionListener(this);
    b2=new JButton("Run code2");  
    b2.setBounds(50,450,200,60);
    b2.setFont(new Font("serif", Font.BOLD, 20));
    b2.setToolTipText("click here to run(Factorial-for loop)with hardcore input(6)");
    b2.addActionListener(this);
    b3=new JButton("open trace files");  
    b3.setBounds(50,650,200,60);
    b3.setFont(new Font("serif", Font.BOLD, 20));
    b3.setToolTipText("open all trace file");
    b3.addActionListener(this);
    f.add(b);f.add(b1);f.add(b2);f.add(b3);
     f.add(area);
    f.add(tr);
    f.setSize(1600,900);  
    f.setLayout(null);  
    f.setVisible(true);  
    } 
	
	
	public void actionPerformed(ActionEvent e)
	
	{  
		
		if(e.getSource()==b)
	{
		String input =JOptionPane.showInputDialog(f,"Enter low value input ");   
		
		
		try {log2.m1(input);} catch (Exception e2) {e2.printStackTrace();}
		
		
}
		
		    if(e.getSource()==b1) 
	{
		    	
        	String input1 =JOptionPane.showInputDialog(f,"Enter different input");   
    		
    		
    			try {log2.m1(input1);} catch (Exception e2) {e2.printStackTrace();}
    		
    	}		
    		    

    		if(e.getSource()==b2) 
    {
             try {main2.m4(null);} catch (Exception e1) {e1.printStackTrace();}
			
		}		
        
        if(e.getSource()==b3)
     {
        
		    JFileChooser fc=new JFileChooser();    
		    int i=fc.showOpenDialog(this);    
		    if(i==JFileChooser.APPROVE_OPTION){    
		        File f=fc.getSelectedFile();    
		        String filepath=f.getPath();    
		        try{  
		        BufferedReader br=new BufferedReader(new FileReader(filepath));    
		        String s1="",s2="";                         
		        while((s1=br.readLine())!=null){    
		        s2+=s1+"\n";    
		        }    
		        area.setText(s2);    
		        br.close();    
		        }catch (Exception ex) {ex.printStackTrace();}                 
		    
       }
    }
  }

		
public static void main(String[] a) 
{  
	new methodtrace();
}
}
