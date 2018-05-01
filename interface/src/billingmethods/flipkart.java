package billingmethods;
import java.util.*;

interface mensware
{
	
	public int mchoice();
}

interface womensware
{
	
	public int wchoice();
}

interface childware
{
	
	public int cchoice();
}

class bill implements mensware,womensware,childware
 {
	  int qcs=0,qcp=0,qcf=0;
	  int qws=0,qwp=0,qwf=0;
	  int qms=0,qmp=0,qmf=0;
	  Scanner in=new Scanner(System.in);
	  int c,ac;
	  static int i=0;
	  String app;
	  static String s[]=new String[12];
	  public int p;
		
	public int mchoice()
	{
		System.out.println("\nEnter what you want to buy : 1.)Shirt\n2.)Pants\n3.)Footwear\n");
		c=in.nextInt();
		s[i]="MENSWARE ";
		if(c==1)
		{
			System.out.println("\nEnter what you want to buy : 1.)CASUAL\n2.)FORMAL\n");
			ac=in.nextInt();
			s[i]+="SHIRT ";
			if(ac==1){
				System.out.println("\nEnter quantity for $700 each : ");
				qms=in.nextInt();
				app=Integer.toString(qms);
				s[i]+="CASUAL ";
				s[i]+=app;
				p= (700*qms);
				s[i]+=" ";
				app=Integer.toString(p);
				s[i]+=app;
			}

			else if(ac==2){
				System.out.println("\nEnter quantity for $1000 each : ");
				qms=in.nextInt();
				app=Integer.toString(qms);
				s[i]+="FORMAL ";
				s[i]+=app;
				p= (1000*qms);
				app=Integer.toString(p);
				s[i]+=" ";
				s[i]+=app;
			}
		}
		else if(c==2)
		{
			System.out.println("\nEnter quantity for $1200 each : ");
				qmp=in.nextInt();
				app=Integer.toString(qmp);
				s[i]+="PANTS ";
				s[i]+=app;
				p= (1200*qmp);
				app=Integer.toString(p);
				s[i]+=" ";
				s[i]+=app;

		}
		else if(c==3)
		{
			System.out.println("\nEnter quantity for $400 each : ");
				qmf=in.nextInt();
				app=Integer.toString(qmf);
				s[i]+="SHOES ";
				s[i]+=app;
				p= (400*qmf);
				app=Integer.toString(p);
				s[i]+=" ";
				s[i]+=app;
		}
		i++;
		return p;
	}

	public int wchoice()
	{
		System.out.println("\nEnter what you want to buy : \n1.)Shirt\n2.)Pants\n3.)Footwear\n");
		c=in.nextInt();
		s[i]="WOMENSWARE ";
		if(c==1)
		{
			s[i]+="SHIRT ";
			System.out.println("\nEnter what you want to buy : 1.)CASUAL\n2.)FORMAL\n");
			ac=in.nextInt();
			if(ac==1){
				System.out.println("\nEnter quantity for $600 each : ");
				qws=in.nextInt();
				app=Integer.toString(qws);
				s[i]+="CASUAL ";
				s[i]+=app;
				p= (600*qws);
				app=Integer.toString(p);
				s[i]+=" ";
				s[i]+=app;
			}

			else if(ac==2){
				System.out.println("\nEnter quantity for $1100 each : ");
				qws=in.nextInt();
				app=Integer.toString(qws);
				s[i]+="FORMAL ";
				s[i]+=app;
				p= (1100*qws);
				app=Integer.toString(p);
				s[i]+=" ";
				s[i]+=app;
			}
		}
		else if(c==2)
		{
			System.out.println("\nEnter quantity for $1200 each : ");
				qwp=in.nextInt();
				app=Integer.toString(qwp);
				s[i]+="PANTS ";
				s[i]+=app;
				p= (1200*qwp);
				app=Integer.toString(p);
				s[i]+=" ";
				s[i]+=app;
		}
		else if(c==3)
		{
			System.out.println("\nEnter quantity for $200 each : ");
				qwf=in.nextInt();
				app=Integer.toString(qwf);
				s[i]+="SHOES ";
				s[i]+=app;
				p= (200*qwf);
				app=Integer.toString(p);
				s[i]+=" ";
				s[i]+=app;
		}
		i++;
		return p;
	}

	public int cchoice()
	{
		System.out.println("\nEnter what you want to buy : 1.)Shirt\n2.)Pants\n3.)Footwear\n");
		c=in.nextInt();
		s[i]="CHILDWARE ";
		if(c==1)
		{
			System.out.println("\nEnter what you want to buy : 1.)CASUAL\n2.)FORMAL\n");
			ac=in.nextInt();
			s[i]="SHIRT ";
			if(ac==1){
				System.out.println("\nEnter quantity for $350 each : ");
				qcs=in.nextInt();
				app=Integer.toString(qcs);
				s[i]+="CASUAL ";
				s[i]+=app;
				p= (350*qcs);
				app=Integer.toString(p);
				s[i]+=" ";
				s[i]+=app;
			}

			else if(ac==2){
				System.out.println("\nEnter quantity for $500 each : ");
				qcs=in.nextInt();
				app=Integer.toString(qcs);
				s[i]+="FORMAL ";
				s[i]+=app;
				p= (500*qcs);
				app=Integer.toString(p);
				s[i]+=" ";
				s[i]+=app;
			}
		}
		else if(c==2)
		{
			System.out.println("\nEnter quantity for $600 each : ");
				qcp=in.nextInt();
				app=Integer.toString(qcp);
				s[i]+="PANTS ";
				s[i]+=app;
				p= (600*qcp);
				app=Integer.toString(p);
				s[i]+=" ";
				s[i]+=app;
		}
		else if(c==3)
		{
			System.out.println("\nEnter quantity for $100 each : ");
				qcf=in.nextInt();
				app=Integer.toString(qcf);
				s[i]+="SHOES ";
				s[i]+=app;
				p= (100*qcf);
				app=Integer.toString(p);
				s[i]+=" ";
				s[i]+=app;
		}
		i++;
		return p;
	}
}


public class flipkart extends bill {
	int x=1,n;
	int total=0;
	public void disp() 
	{
		Scanner ne=new Scanner(System.in);
		

		bill m=new bill();
		bill w=new bill();
		bill c=new bill();
		while(x!=0)
		{  
			System.out.println("\nEnter what you want to buy :\n1.)MENSWARE\n2.)WOMENSWARE\n3.)CHILDWARE\n");
			n=ne.nextInt();
			if(n==1)
			{
				total+=m.mchoice();
			}
			if(n==2)
			{
				total+=w.wchoice();
			}
			if(n==3)
			{
				total+=c.cchoice();
			}	
			System.out.println("\nIF you want to exit press 0 : ");
			x=ne.nextInt();				
		}
		System.out.println("********************************* B I L L ***********************************");
		for(x=0;s[x]!=null;x++)
		{
			System.out.println(s[x]);
		}
		System.out.println("******************************************************************************");
		System.out.println("\n\t\tTotal : "+total);
	}
		public void discount()
		{
			if(total>15000)
			{
				total=total*90/100;
			}
			else if(total>10000)
			{
				total=total*93/100;
			}
			else if(total>15000)
			{
				total=total*95/100;
			}

			System.out.println("\n\t\tFINAL Total after discount if applicable : "+total);	
	
		}
}
