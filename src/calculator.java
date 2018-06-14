import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="Cal" width=400 height=400></applet>
 */
public class calculator extends Applet implements ActionListener
{

	Button one,two,three,four,five,six,seven,eight,nine,zero,dot,sqrt;
	String msg="";
	int v1,v2,result;
	TextField t1;
	Button b[]=new Button[10];
	Button add,sub,mul,div,clear,mod,EQ;
	char OP;
	public void init()
	{
		Color k=new Color(120,89,90);
		setBackground(k);
		t1=new TextField(10);
		setLayout(null);
		for (int i = 0; i < 10; i++)
		{
		 b[i]=new Button(""+i);	
		}
	add=new Button("+");
	sub=new Button("-");
    mul=new Button("*");
    div=new Button("/");
    mod=new Button("%");
    clear=new Button("clear");
    EQ=new Button("=");
    
    t1.addActionListener(this);
    
    add(t1);
    one=new Button("1");
    two=new Button("2");
    three=new Button("3");
    four=new Button("4");
    five=new Button("5");
    six=new Button("6");
    seven=new Button("7");
    eight=new Button("8");
    nine=new Button("9");
    zero=new Button("0"); 
    dot=new Button(".");
    sqrt=new Button("sqrt");
    
    one.setBounds(50,65,50,30);
    two.setBounds(105,65,50,30);
    three.setBounds(160,65,50,30);
    four.setBounds(215,65,50,30);
    five.setBounds(50,100,50,30);
    six.setBounds(105,100,50,30);
    seven.setBounds(160,100,50,30);
    eight.setBounds(215,100,50,30);
    nine.setBounds(50,135,50,30);
    zero.setBounds(105,135,50,30);
    t1.setBounds(50,30,215,30);
    add.setBounds(160,135,50,30);
    sub.setBounds(215,135,50,30);
    mul.setBounds(50,170,50,30);
    div.setBounds(105,170,50,30);
    mod.setBounds(160,170,50,30);
    clear.setBounds(215,170,50,65);
    EQ.setBounds(50,205,50,30);
    dot.setBounds(105,205,50,30);
    sqrt.setBounds(160,205,50,30);
    
    add(one);
    add(two);
    add(three);
    add(four);
    add(five);
    add(six);
    add(seven);
    add(eight);
    add(nine);
    add(zero);
    add(add);
    add(mul);
    add(sub);
    add(div);
    add(mod);
    add(clear);
    add(EQ);
    add(dot);
    add(sqrt);
    
    one.addActionListener(this);
    two.addActionListener(this);
    three.addActionListener(this);
    four.addActionListener(this);
    five.addActionListener(this);
    five.addActionListener(this);
    six.addActionListener(this);
    seven.addActionListener(this);
    eight.addActionListener(this);
    nine.addActionListener(this);
    zero.addActionListener(this);
    dot.addActionListener(this);
    sqrt.addActionListener(this);
    add.addActionListener(this);
    sub.addActionListener(this);
    mul.addActionListener(this);
    div.addActionListener(this);
    mod.addActionListener(this);
    clear.addActionListener(this);
    EQ.addActionListener(this);
    
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
	  String str=e.getActionCommand();
	  char ch=str.charAt(0);
	  if(Character.isDigit(ch))
	  {
		  t1.setText(t1.getText()+str);
	  }
	  else if(str.equals("+"))
	  {
		  v1=Integer.parseInt(t1.getText());
		  OP='+';
		  t1.setText("");		  
	  }
	  else if(str.equals("-"))
	  {
		  v1=Integer.parseInt(t1.getText());
		  OP='-';
		  t1.setText("");
	  }
	  else if(str.equals("*"))
	  {
		  v1=Integer.parseInt(t1.getText());
		  OP='*';
		  t1.setText("");
	  }
	  else if(str.equals("/"))
	  {
		  v1=Integer.parseInt(t1.getText());
		  OP='/';
		  t1.setText("");
	  }
	  else if(str.equals("%"))
	  {
		  v1=Integer.parseInt(t1.getText());
		  OP='%';
		  t1.setText("");
	  }
	  if(str.equals("="))
	  {
		  v2=Integer.parseInt(t1.getText());
		  if(OP=='+')
			  result=v1+v2;
		  else if(OP=='*')
			  result=v1*v2;
		  else if(OP=='/')
			  result=v1/v2;
		  else if(OP=='%')
			  result=v1%v2;
		  t1.setText(""+result);
	  }
	  if(str.equals("clear"))
	  {
		  t1.setText("");
	  }
	  
	}
	
}
















