import java.awt.*;
import java.awt.event.*;
class Lab8P1 extends Frame implements  ActionListener{
	Label label;
	Lab8P1(){
	
		super("Demonstration of MenuBar");
		
		MenuBar mb = new MenuBar();
		setMenuBar(mb);
		BorderLayout bl = new BorderLayout();
		setLayout(bl);
		label = new Label();
		label.setFont(new font("Arial",Font.BOLD,40));
		label.setAlignment(label.CENTER);
		add(label,bl.CENTER);
		Menu file = new Menu("File");
		String[] menus ={"File","Edit","Help"};
		String[][] mi ={
			{"Open","Save","CLose"},
			{"Cut","Copy","Paste"},
			{"License","About","Update"},
			
		};
		int x =0,y =0;
		for(String s : menus){
			y = 0;
			Menu m = new Menu(s);
			for(int i=0;i<3;i++){
				MenuItem mmi=new MenuItem(mi[x][y]);
				mmi.addActionListener(this);
				m.add(mmi);
				y++;
				}  
				x++;                                                                                       
		mb.add(m); 
		}
	
	setSize(500,500);
	setVisible(true);
	addWindowListener(
		new WindowAdapter(){
		public void windowClosing(WindowEvent we){
			dispose();
			}
		}
		);
		
		}
	public void actionperformed(ActionEvent ae){
		String mstr = ae.getActionCommmand();
		if(mstr.equal("Close"));
		System.exit(0);
		}
		else{
			label.setText(mstr);
			}
			
		
		
	public static void main(String...args){
	new Lab8P1()
	};
	}
	

	
