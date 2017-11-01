import java.awt.*;
import java.awt.event.*;  
public class calculator extends Frame implements ActionListener
{
	TextField result;
	Button add1=new Button("+");
	Button sub=new Button("-");
	Button mul=new Button("x");
	Button div=new Button("/");
	Button one=new Button("1");
	Button two=new Button("2");
	Button three=new Button("3");
	Button four=new Button("4");
	Button five=new Button("5");
	Button six=new Button("6");
	Button seven=new Button("7");
	Button eight=new Button("8");
	Button nine=new Button("9");
	Button zero=new Button("0");
	Button equalsto=new Button("=");
	Button close=new Button("exit");
	Label l1=new Label("calculator");
		final Frame f1=new Frame();
calculator()
{
	f1.setSize(400,400);
	result=new TextField();
	result.setSize(25,100);
	add1.addActionListener(this);
	sub.addActionListener(this);
	mul.addActionListener(this);
	div.addActionListener(this);
	one.addActionListener(this);
	two.addActionListener(this);
	three.addActionListener(this);
	four.addActionListener(this);
	five.addActionListener(this);
	six.addActionListener(this);
	seven.addActionListener(this);
	eight.addActionListener(this);
	nine.addActionListener(this);
	zero.addActionListener(this);
	equalsto.addActionListener(this);
	
	close.addActionListener(this);
	f1.add(l1);
	f1.add(result);
    f1.add(add1);f1.add(sub);f1.add(mul);f1.add(div);f1.add(close);
    f1.add(one);f1.add(two);f1.add(three);f1.add(four);f1.add(five);f1.add(six);
    f1.add(seven);f1.add(eight);f1.add(nine);f1.add(zero);f1.add(equalsto);
	f1.setLayout(new GridLayout(5,5));
    f1.setVisible(true);
    f1.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e){f1.dispose();}});
}
public int evaluate(String s)
{
	int l=s.length();int res=0;
	for(int i=0;i<=l;i++)
	{
		if(s.charAt(i)=='+')
		{}
	}
	return 0;
	}
public void actionPerformed(ActionEvent e)
{
	String s1=result.getText();
	int value=0;
	if(e.getSource()!=equalsto)
	{
	if(e.getSource()==one){ s1=s1+"1"; }
	if(e.getSource()==two){ s1=s1+"2"; }
	if(e.getSource()==three){ s1=s1+"3"; }
	if(e.getSource()==four){ s1=s1+"4"; }
	if(e.getSource()==five){ s1=s1+"5"; }
	if(e.getSource()==six){ s1=s1+"6"; }
	if(e.getSource()==seven){ s1=s1+"7"; }
	if(e.getSource()==eight){ s1=s1+"8"; }
	if(e.getSource()==nine){ s1=s1+"9"; }
	if(e.getSource()==zero){ s1=s1+"0"; }
    if(e.getSource()==add1){ s1=s1+"+";  }
    if(e.getSource()==sub){ s1=s1+"-"; }  
    if(e.getSource()==mul){ s1=s1+"x"; }  
     if(e.getSource()==div){  s1=s1+"/"; } 
     result.setText(s1);
	}
     if(e.getSource()==equalsto){value=evaluate(s1);result.setText(String.valueOf(value));}
     if(e.getSource()==close){f1.dispose();}
  //    String result1=String.valueOf(c);  
    
}
public static void main(String args[])
{
	calculator a=new calculator();
}
}