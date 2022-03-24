//import javax.sevenBwing.JFrame;
//import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ArithmeticCalculator implements ActionListener{  
	
	JFrame jf; 
    JLabel displayLabel; 
    JButton sevenB;
    JButton eightB;
    JButton nineB;
    JButton fourB;
    JButton fiveB ;
    JButton sixB ;
    JButton oneB ;
    JButton twoB ;
    JButton threeB ;
    JButton dotB ;
    JButton zeroB;
    JButton equalB;
    JButton divB ;
    JButton multiB;
    JButton subB;
    JButton addB;
    JButton clearB;
    
    boolean isOperatorClicked=false;
    String oldvalue, newvalue ;
    float oldvalueF, newvalueF, resultofadd,resultofmulti,resultofsub,resultofdiv ;
    int count;
    
	public Calculator() {
		jf = new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(600,600);
		jf.setLocation(300, 150);
	 
		
		
		displayLabel=new JLabel( );// for display bar
		displayLabel.setBounds(30, 50, 540, 40);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT); 
        displayLabel.setFont(new Font("Arial",Font.BOLD, 25)); 

		displayLabel.setBackground(Color.white);
		displayLabel.setOpaque(true);
		
		jf.add(displayLabel);
		
	    sevenB =new JButton("7"); 
		                                  
		sevenB.setBounds(30, 130, 60, 60);
	    jf.add(sevenB);
	    sevenB.setFont(new Font("Helvetica",Font.BOLD,30));
	    sevenB.addActionListener(this);
	    
	    eightB =new JButton("8");
		eightB.setBounds(130, 130, 60, 60);
	    jf.add(eightB);
	    eightB.setFont(new Font("Helvetica",Font.BOLD,30));
	    eightB.addActionListener(this);
	    
	    nineB =new JButton("9");
		nineB.setBounds(230, 130, 60, 60);
	    jf.add(nineB);
	    nineB.setFont(new Font("Helvetica",Font.BOLD,30));
	    nineB.addActionListener(this);
	    
	    fourB =new JButton("4");
		fourB.setBounds(30, 210, 60, 60);
	    jf.add(fourB);
	    fourB.setFont(new Font("Helvetica",Font.BOLD,30));
	    fourB.addActionListener(this);
	    
	    fiveB =new JButton("5");
		fiveB.setBounds(130, 210, 60, 60);
	    jf.add(fiveB);
	   fiveB.setFont(new Font("Helvetica",Font.BOLD,30));
	    fiveB.addActionListener(this);
	    
	    sixB =new JButton("6");
		sixB.setBounds(230, 210, 60, 60);
	    jf.add(sixB);
	    sixB.setFont(new Font("Helvetica",Font.BOLD,30));
	    sixB.addActionListener(this);
	    
	    oneB =new JButton("1");
		oneB.setBounds(30, 290, 60, 60);
	    jf.add(oneB); 
	    oneB.setFont(new Font("Helvetica",Font.BOLD,30));
	    oneB.addActionListener(this);
	    
	    twoB =new JButton("2");
		twoB.setBounds(130, 290, 60, 60);
	    jf.add(twoB);
	    twoB.setFont(new Font("Helvetica",Font.BOLD,30));
	    twoB.addActionListener(this);
	    
	    threeB =new JButton("3");
		threeB.setBounds(230, 290, 60, 60);
	    jf.add(threeB);
	    threeB.setFont(new Font("Helvetica",Font.BOLD,30));
	    threeB.addActionListener(this);
	    
	    dotB =new JButton(".");
		dotB.setBounds(30, 370, 60, 60);
	    jf.add(dotB);
	    dotB.setFont(new Font("Helvetica",Font.BOLD,30));
		dotB.addActionListener(this);
		
		
		zeroB =new JButton("0");
		zeroB.setBounds(130, 370, 60, 60);
	    jf.add(zeroB);
	    zeroB.setFont(new Font("Helvetica",Font.BOLD,30));
		zeroB.addActionListener(this);
		
		
		equalB =new JButton("=");
		equalB.setBounds(230, 370, 60, 60);
	    jf.add(equalB);
	    equalB.setFont(new Font("Helvetica",Font.BOLD,30));
	    equalB.addActionListener(this);
	    
	    divB = new JButton("/");
	    divB.setBounds(330, 130,60, 60);
	    jf.add(divB);
	    divB.setFont(new Font("Helvetica",Font.BOLD,30));
	    divB.addActionListener(this);
	    
	    multiB= new JButton("x");
	    multiB.setBounds(330, 210, 60, 60);
	    jf.add(multiB);
	    multiB.setFont(new Font("Helvetica",Font.BOLD,30));
	    multiB.addActionListener(this);
	    
	    subB=new JButton("-");
	    subB.setBounds(330, 290, 60, 60);
	    jf.add(subB);
	    subB.setFont(new Font("Helvetica",Font.BOLD,30));
	    subB.addActionListener(this);
	    
	    addB=new JButton("+");
	    addB.setBounds(330, 370, 60, 60);
	    jf.add(addB);
	    addB.setFont(new Font("Helvetica",Font.BOLD,30));
	    addB.addActionListener(this);
	    
	    clearB=new JButton("C");
	    clearB.setBounds(420, 130, 60, 60);
		jf.add(clearB);
		clearB.setFont(new Font("Helvetica",Font.BOLD,30));
		clearB.addActionListener(this);
	    
	    
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
public static void main(String args[]) {
new Calculator();
	
}
@Override
public void actionPerformed(ActionEvent e) { 
	
	if(e.getSource()==sevenB) {
	       if(isOperatorClicked) {
	    	   displayLabel.setText("7");
	    	   isOperatorClicked=false;
	       }else {
	    	   displayLabel.setText(displayLabel.getText()+"7");
	       }
		  
		  
	  }else if(e.getSource()==eightB) {
		  if(isOperatorClicked) {
	    	   displayLabel.setText("8");
	    	   isOperatorClicked=false;
	       }else {
	    	   displayLabel.setText(displayLabel.getText()+"8");
	       }
	  }else if(e.getSource()==nineB){
		  if(isOperatorClicked) {
	    	   displayLabel.setText("9");
	    	   isOperatorClicked=false;
	       }else {
	    	   displayLabel.setText(displayLabel.getText()+"9");
	       }
	  }else if (e.getSource()==fourB) {
		  if(isOperatorClicked) {
	    	   displayLabel.setText("4");
	    	   isOperatorClicked=false;
	       }else {
	    	   displayLabel.setText(displayLabel.getText()+"4");}
	  }else if (e.getSource()==fiveB) {
		  if(isOperatorClicked) {
	    	   displayLabel.setText("5");
	    	   isOperatorClicked=false;
	       }else {
	    	   displayLabel.setText(displayLabel.getText()+"5");}
	  }else if (e.getSource()==sixB) {
		  if(isOperatorClicked) {
	    	   displayLabel.setText("6");
	    	   isOperatorClicked=false;
	       }else {
	    	   displayLabel.setText(displayLabel.getText()+"6");}
	  }else if (e.getSource()==threeB) {
		  if(isOperatorClicked) {
	    	   displayLabel.setText("3");
	    	   isOperatorClicked=false;
	       }else {
	    	   displayLabel.setText(displayLabel.getText()+"3");}
	  }else if (e.getSource()==twoB) {
		  if(isOperatorClicked) {
	    	   displayLabel.setText("2");
	    	   isOperatorClicked=false;
	       }else {
	    	   displayLabel.setText(displayLabel.getText()+"2");}
	  }else if (e.getSource()==oneB) {
		  if(isOperatorClicked) {
	    	   displayLabel.setText("1");
	    	   isOperatorClicked=false;
	       }else {
	    	   displayLabel.setText(displayLabel.getText()+"1");
	       }
	  }else if (e.getSource()==dotB) {
		  displayLabel.setText(displayLabel.getText()+".");
	  }else if (e.getSource()==zeroB) {
		  if(isOperatorClicked) {
	    	   displayLabel.setText("0");
	    	   isOperatorClicked=false;
	       }else {
	    	   displayLabel.setText(displayLabel.getText()+"0");}
	  }else if (e.getSource()==equalB) {
		if(count==1) {
			displayLabel.setText(resultofadd+""); 
		}else if(count==2) {
			displayLabel.setText(resultofsub+""); 
			}else if(count==3) {
				displayLabel.setText(resultofmulti+""); 
			}else if(count==4) {
				displayLabel.setText(resultofsub+""); 
			}
		// +""   will convert float value into string
		
	  }else if (e.getSource()==divB){
			 isOperatorClicked=true;
				oldvalueF=Float.parseFloat(oldvalue); 
				 newvalueF=Float.parseFloat(newvalue); 
		
			 oldvalue=displayLabel.getText();
			 
			 newvalue=displayLabel.getText();
				count=4;
				 resultofdiv=oldvalueF/newvalueF;
			 
		  }else if (e.getSource()==addB) {
		 isOperatorClicked=true;
			oldvalueF=Float.parseFloat(oldvalue); 
			 newvalueF=Float.parseFloat(newvalue); 
		 oldvalue=displayLabel.getText();
		 
		 newvalue=displayLabel.getText();
		 count=1;
			
			 resultofadd=oldvalueF+newvalueF;
		 
	  }else if (e.getSource()==subB){
			 isOperatorClicked=true;
			 oldvalueF=Float.parseFloat(oldvalue); 
			 newvalueF=Float.parseFloat(newvalue); 
			 oldvalue=displayLabel.getText();
			 
			 newvalue=displayLabel.getText();
				count=2;
				 resultofsub=oldvalueF-newvalueF;
			 
		  }else if (e.getSource()==multiB){
				 isOperatorClicked=true;
				 oldvalueF=Float.parseFloat(oldvalue); 
				 newvalueF=Float.parseFloat(newvalue); 
				 oldvalue=displayLabel.getText();
				 
				  newvalue=displayLabel.getText();
				  count=3;
										 resultofmulti=oldvalueF*newvalueF;
				 
			  }else if(e.getSource()==clearB) {
		  displayLabel.setText(""); 
	  }

	
}
}

