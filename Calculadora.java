import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Calculadora extends JFrame implements ActionListener{
 	
	private JLabel label1;
	private JButton boton0,boton1,boton2,boton3,boton4,boton5,boton6,boton7,boton8,boton9;
	private JButton botonsum,botonres,botonmul,botondiv,botoncl,botonresultado,botonpunto;
	String inter="";
	float num1, num2;
	int operacion,resultado;

public Calculadora(){
	setLayout(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setTitle("Calculadora");
		
	label1=new JLabel("");
	label1.setBounds(10,10,170,25);
	add(label1);
	boton7 =new JButton ("7");	
	boton7.setBounds(10,40,50,40);
	add(boton7);
	boton7.addActionListener(this);

	boton8 =new JButton ("8");	
	boton8.setBounds(70,40,50,40);
	add(boton8);
	boton8.addActionListener(this);

	botondiv =new JButton ("/");	
	botondiv.setBounds(190,40,50,40);
	add(botondiv);
	botondiv.addActionListener(this);
	
	boton9 =new JButton ("9");	
	boton9.setBounds(130,40,50,40);
	add(boton9);
	boton9.addActionListener(this);
	
	boton4 =new JButton ("4");	
	boton4.setBounds(10,90,50,40);
	add(boton4);
	boton4.addActionListener(this);

	boton5 =new JButton ("5");	
	boton5.setBounds(70,90,50,40);
	add(boton5);
	boton5.addActionListener(this);

	boton6 =new JButton ("6");	
	boton6.setBounds(130,90,50,40);
	add(boton6);
	boton6.addActionListener(this);

	botonmul =new JButton ("X");	
	botonmul.setBounds(190,90,50,40);
	add(botonmul);
	botonmul.addActionListener(this);

	boton1 =new JButton ("1");	
	boton1.setBounds(10,140,50,40);
	add(boton1);
	boton1.addActionListener(this);

	boton2 =new JButton ("2");	
	boton2.setBounds(70,140,50,40);
	add(boton2);
	boton2.addActionListener(this);

	boton3 =new JButton ("3");	
	boton3.setBounds(130,140,50,40);
	add(boton3);
	boton3.addActionListener(this);

	botonres = new JButton ("-");	
	botonres.setBounds(190,140,50,40);
	add(botonres);
	botonres.addActionListener(this);

	boton0 =new JButton ("0");	
	boton0.setBounds(10,190,50,40);
	add(boton0);
	boton0.addActionListener(this);

	botonpunto =new JButton (".");	
	botonpunto.setBounds(70,190,50,40);
	add(botonpunto);
	botonpunto.addActionListener(this);

	botonresultado =new JButton ("=");	
	botonresultado.setBounds(130,190,50,40);
	add(botonresultado);
	botonresultado.addActionListener(this);

	botonsum =new JButton ("+");	
	botonsum.setBounds(190,190,50,40);
	add(botonsum);
	botonsum.addActionListener(this);

	botoncl = new JButton("CL");
	botoncl.setBounds(190,10,50,25);
	add(botoncl);
	botoncl.addActionListener(this);
}

public void actionPerformed(ActionEvent e){
       
      	      
	if(e.getSource()== boton0){
	     if(resultado==1){
		inter=("0");
		resultado=0;
		label1.setText("0");
	    } if(resultado ==0){
		if(inter ==("0")){
		     label1.setText("0");
		}else{
		       inter =inter +0;
		       label1.setText(inter);
		}
	       }
	}
	if(e.getSource()== boton1){
	    if(resultado==1){
		inter=("0");
		resultado=0; 
		label1.setText("1");
		inter=("1");
	      }if(resultado ==0){ 	
		if(inter ==("0")){
		label1.setText("1");
		inter=("1");
	      }else{
		inter=inter + 1;
		label1.setText(inter);
	         	 }	    
	}
}
	if(e.getSource()== boton2){
	       if(resultado==1){
		inter=("0");
		resultado=0; 
		label1.setText("2");
		inter=("2");
	      }if(resultado ==0){
		if(inter ==("0")){
		label1.setText("2");
		inter=("2");
	}else{
		inter=inter +2;
		label1.setText(inter);
	         	 }	    
	}
	}
	if(e.getSource()== boton3){
	       if(resultado==1){
		inter=("0");
		resultado=0; 
		label1.setText("3");
		inter=("3");
	      }if(resultado ==0){
		if(inter ==("0")){
		label1.setText("3");
		inter=("3");
	}else{
		inter=inter + 3;
		label1.setText(inter);
	         	 }	    
	}
	}
	if(e.getSource()== boton4){
	       if(resultado==1){
		inter=("0");
		resultado=0; 
		label1.setText("4");
		inter=("4");
	      }if(resultado ==0){
		if(inter ==("0")){
		label1.setText("4");
		inter=("4");
	}else{
		inter=inter + 4;
		label1.setText(inter);
	         	 }	    
	}
	}
	if(e.getSource()== boton5){
	       if(resultado==1){
		inter=("0");
		resultado=0; 
		label1.setText("5");
		inter=("5");
	      }if(resultado ==0){
		if(inter ==("0")){
		label1.setText("5");
		inter=("5");
	}else{
		inter=inter + 5;
		label1.setText(inter);
	         	 }	    
	}
	}
	if(e.getSource()== boton6){
	       if(resultado==1){
		inter=("0");
		resultado=0; 
		label1.setText("6");
		inter=("6");
	      }if(resultado ==0){
		if(inter ==("0")){
		label1.setText("6");
		inter=("6");
	}else{
		inter=inter + 6;
		label1.setText(inter);
	         	 }	    
	}
	}
	if(e.getSource()== boton7){
	       if(resultado==1){
		inter=("0");
		resultado=0; 
		label1.setText("7");
		inter=("7");
	      }if(resultado ==0){
		if(inter ==("0")){
		label1.setText("7");
		inter=("7");
	}else{
		inter=inter + 7;
		label1.setText(inter);
	         	 }	    
	}
	}
	if(e.getSource()== boton8){
	       if(resultado==1){
		inter=("0");
		resultado=0; 
		label1.setText("8");
		inter=("8");
	      }if(resultado ==0){
		if(inter ==("0")){
		label1.setText("8");
		inter=("8");
	}else{
		inter=inter + 8;
		label1.setText(inter);
	         	 }	    
	}
	}
	if(e.getSource()== boton9){
	       if(resultado==1){
		inter=("0");
		resultado=0; 
		label1.setText("9");
		inter=("9");
	      }if(resultado == 0){
		if(inter =="0"){
		label1.setText("9");
		inter=("9");
	}else{
		inter=inter +9;
		label1.setText(inter);
	         	 }	    
	}
	}
	if (e.getSource()== botonresultado){
		if (e.getSource()== botonresultado){
		if(operacion ==0){
			label1.setText("0");
			num1=0;
			num2=0;
			inter=("0");
			operacion=0;
			resultado=1;
		
		}
		
		if(operacion ==1){
			inter=label1.getText();
			num1=Float.parseFloat(inter);
			num2=num1+num2;
			inter=Float.toString(num2);
			label1.setText(inter);
			num1=0;
			num2=0;
			operacion=0;
			resultado=1;	
					
		}
		if(operacion==2){
			inter=label1.getText();
			num1=Float.parseFloat(inter);
			num2=num2-num1;
			inter=Float.toString(num2);
			label1.setText(inter);
			num1=0;
			num2=0;				
			operacion=0;
			resultado=1;	
			
		}
		if(operacion==3){
			inter=label1.getText();
			num1=Float.parseFloat(inter);
			num2=num1*num2;
			inter=Float.toString(num2);
			label1.setText(inter);
			num1=0;
			num2=0;
			operacion=0;
			resultado=1;
						
		}
		if(operacion==4){
			
			num1=Float.parseFloat(inter);
			num2=num2/num1;
			inter=Float.toString(num2);
			label1.setText(inter);
			num1=0;
			num2=0;
			operacion=0;
			resultado=1;	
			}					
		}
		if(e.getSource() == botoncl){
	                	num1=0;				
			num2=0;
			inter=("0");
			operacion=0;
			resultado=0;
			label1.setText(inter);
	}
		if (e.getSource()== botonpunto){
		if (inter.contains(".")){		
		 	
		}else{
			inter =inter +(".");
			label1.setText(inter);
		}
	}
		if (e.getSource()== botonsum){
		if(operacion ==0){
			inter=label1.getText();
			num2=Float.parseFloat(inter);
			num1=0;
			inter=("0");
			label1.setText(inter);
			operacion=1;
			resultado=0;
		}	
		if(operacion == 1){
			inter=label1.getText();
			num1=Float.parseFloat(inter);
			num2=num1+num2;
			num1=0;
			inter=("0");
			operacion=1;
			label1.setText(inter);
			resultado=0;
		}
		if(operacion == 2){
			inter=label1.getText();
			num1=Float.parseFloat(inter);
			num2=num2 - num1;
			num1=0;
			operacion=2;
			inter=("0");
			label1.setText(inter);
			resultado=0;
		}
			
		if(operacion == 3){
			inter=label1.getText();
			num1=Float.parseFloat(inter);
			num2=num1*num2;
			num1=0;
			inter=("0");
			label1.setText(inter);
			operacion=1;
			resultado=0;
		}
		if(operacion == 4){
			
			num1=Float.parseFloat(inter);
			num2=num2/num1;
			num1=0;
			operacion=1;
			inter=("0");
			label1.setText(inter);	
		                resultado=0;
			}
		}
		if (e.getSource()== botonres){
		if(operacion ==0){
			inter=label1.getText();
			num2=Float.parseFloat(inter);
			num1=0;
			inter=("0");
			label1.setText(inter);
			operacion=2;
			resultado=0;
		}	
		if(operacion == 1){
			inter=label1.getText();
			num1=Float.parseFloat(inter);
			num2=num1+num2;
			num1=0;
			inter=("0");
			operacion=2;
			label1.setText(inter);
			resultado=0;
		}
		if(operacion == 2){
			inter=label1.getText();
			num1=Float.parseFloat(inter);
			num2=num2 - num1;
			num1=0;
			operacion=2;
			inter=("0");
			label1.setText(inter);
			resultado=0;
		}
		if(operacion == 3){
			inter=label1.getText();
			num1=Float.parseFloat(inter);
			num2=num1*num2;
			num1=0;
			inter=("0");
			operacion=2;
			label1.setText(inter);	
			resultado=0;
		}
		if(operacion == 4){
			inter=label1.getText();
			num1=Float.parseFloat(inter);
			num2=num2/num1;
			num1=0;
			operacion=2;
			inter=("0");
			label1.setText(inter);	
		                resultado=0;
			}
		}
		if (e.getSource()== botonmul){	
		if(operacion ==0){
			inter=label1.getText();
			num2=Float.parseFloat(inter);
			num1=0;
			inter=("0");
			label1.setText(inter);
			operacion=3;
			resultado=0;
		}
		if(operacion == 1){
			inter=label1.getText();
			num1=Float.parseFloat(inter);
			num2=num1+num2;
			num1=0;
			inter=("0");
			operacion=3;
			label1.setText(inter);
			resultado=0;
		}	
		if(operacion == 2){
			inter=label1.getText();
			num1=Float.parseFloat(inter);
			num2=num2 - num1;
			num1=0;
			operacion=3;
			inter=("0");
			label1.setText(inter);
			resultado=0;
		}
		if(operacion == 3){
			inter=label1.getText();
			num1=Float.parseFloat(inter);
			num2=num1*num2;
			num1=0;
			inter=("0");
			operacion=3;
			label1.setText(inter);	
			resultado=0;
		}
		if(operacion == 4){
			inter=label1.getText();
			num1=Float.parseFloat(inter);
			num2=num2/num1;
			num1=0;
			operacion=3;
			inter=("0");
			label1.setText(inter);	
			resultado=0;
		}
		}
		if (e.getSource()== botondiv){
		if(operacion ==0){
			inter=label1.getText();
			num2=Float.parseFloat(inter);
			num1=0;
			inter=("0");
			label1.setText(inter);
			operacion=4;
			resultado=0;
		}
		if(operacion == 1){
			inter=label1.getText();
			num1=Float.parseFloat(inter);
			num2=num1+num2;
			num1=0;
			inter=("0");
			operacion=4;
			label1.setText(inter);
			resultado=0;
		}
		if(operacion == 2){
			inter=label1.getText();
			num1=Float.parseFloat(inter);
			num2=num2 - num1;
			num1=0;
			operacion=4;
			inter=("0");
			label1.setText(inter);
			resultado=0;
		}
		if(operacion == 3){
			inter=label1.getText();
			num1=Float.parseFloat(inter);
			num2=num1*num2;
			num1=0;
			inter=("0");
			operacion=4;
			label1.setText(inter);	
			resultado=0;
		}
		if(operacion == 4){
			inter=label1.getText();
			num1=Float.parseFloat(inter);
			num2=num2/num1;
			num1=0;
			operacion=4;
			inter=("0");
			label1.setText(inter);	
		    resultado=0;
			}
		

		}
	} 
}
public static void main(String args[]){
 	Calculadora calculadora1 = new Calculadora();
	calculadora1.setBounds(0,0,270,280);
	calculadora1.setVisible(true);
	calculadora1.setResizable(false);
	calculadora1.setTitle("Calculadora");
	calculadora1.setLocationRelativeTo(null);
 }
}
