package register;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class registration extends Applet implements ActionListener 
{
	Label x;
	Button s,r;
	TextField name,pass;
	public void init()
	{
		x=new Label("REGISTRATION FORM",Label.CENTER);
		s=new Button("SUBMIT");
		r=new Button("RESET");
		name=new TextField("Enter Your Name");
		pass=new TextField("Enter PASSWORD");
		pass.setEchoChar('*');
		add(x);
		add(name);
		add(pass);
		add(s);
		add(r);
		s.addActionListener(this);
		r.addActionListener(this);
		s.setBounds(10,10,50,50);
	}
	
	public void ActionPerformed(ActionEvent ae)
	{
		String st=ae.getActionCommand();
		if(st.equals("SUBMIT"))
		{
			repaint();
		}	
		else
		{
			repaint();
		}
	}
	
	public void run()
	{

	}

	public void paint(Graphics g)
	{
				
		g.drawString("THANK YOU",100,100);
	}

}
