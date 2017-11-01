import java.awt.*;
import java.awt.event.*;  
public class calculator extends Frame implements ActionListener
{
	TextField result,v1,v2;
	Button add1=new Button("+");
	Button sub=new Button("-");
	Button mul=new Button("x");
	Button div=new Button("/");
	Button close=new Button("exit");
	Label l1=new Label("Value1");
	Label l2=new Label("Value2");
	Label l3=new Label("Result");
		final Frame f1=new Frame();
calculator()
{
	f1.setSize(800,700);
	add1.setBounds(30,190,80,40);
	sub.setBounds(230,190,80,40);
	div.setBounds(30,240,80,40);
	mul.setBounds(230,240,80,40);
	close.setBounds(140,290,80,40);
	v1=new TextField();
	v2=new TextField();
	result=new TextField();
	v1.setBounds(250,50,170,20); 
	v2.setBounds(250,100,170,20);
	result.setBounds(250,150,170,20);  
	l1.setBounds(60,50,170,20); 
	l2.setBounds(60,100,170,20);
	l3.setBounds(60,150,170,20);  
	f1.add(l1);f1.add(l2);f1.add(l3);
	add1.addActionListener(this);
	sub.addActionListener(this);
	mul.addActionListener(this);
	div.addActionListener(this);
	close.addActionListener(this);
	f1.add(v1);f1.add(v2);f1.add(result);
	f1.add(add1);f1.add(sub);f1.add(mul);f1.add(div);f1.add(close);
	f1.setLayout(null);
    f1.setVisible(true);
    f1.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e){f1.dispose();}});
}
public void actionPerformed(ActionEvent e)
{
	String s1=v1.getText();  
    String s2=v2.getText();  
    int a=Integer.parseInt(s1);  
    int b=Integer.parseInt(s2);  
    int c=0;  
    if(e.getSource()==add1){ c=a+b; }
    else if(e.getSource()==sub){ c=a-b;  }  
    else if(e.getSource()==mul){ c=a*b;   }  
    else if(e.getSource()==div){   c=a/b;  } 
    else if(e.getSource()==close){f1.dispose();}
    String result1=String.valueOf(c);  
    result.setText(result1); 
}
public static void main(String args[])
{
	calculator a=new calculator();
}
}