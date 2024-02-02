package basketball;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Shot5 extends JFrame implements ActionListener{
	JButton jb1 = new JButton("버튼1");
	JButton jb2 = new JButton("버튼2");
	Connection conn;
	Statement stmt;
	public Shot5() {
		String url = "jdbc:mysql://localhost:3306/firm";
		String id = "root";
		String pass = "mysql";
		try {
			conn = DriverManager.getConnection(url,id,pass);
			stmt = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = this.getContentPane();
		con.setLayout(new FlowLayout());
		con.add(jb1);  //con.add(jb1);
		con.add(jb2);  //con.add(jb2);
		this.setLocation(500, 400);
		this.setSize(400, 300);
		this.setVisible(true);
		
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
					System.out.println("jb1");
				
			}
		});
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
					System.out.println("jb2");
			}
		});
		
	}
	
	public static void main(String[] args) {
		new Shot5();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	
}
	
	
	


