package loginsystem;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Dashboard extends JFrame implements ActionListener{
	
	ImageIcon Logo = new ImageIcon(new ImageIcon("202-2024687_profile-icon-for-the-politics-category-profile-icon.png").getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH));
	ImageIcon Menu = new ImageIcon(new ImageIcon("download__4_-removebg-preview.png").getImage().getScaledInstance(30, 25, Image.SCALE_SMOOTH));
	ImageIcon Home = new ImageIcon(new ImageIcon("Home.png").getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));
	ImageIcon Acc = new ImageIcon(new ImageIcon("InfoAcc.png").getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));
	ImageIcon LogOut = new ImageIcon(new ImageIcon("Logout.png").getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH));
	ImageIcon Profile = new ImageIcon(new ImageIcon("profile.png").getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH));
	
	JButton HomeLogo = new JButton();
	JButton AccLogo = new JButton();
	JButton LogoutLogo = new JButton();
	
	Toolkit ToolK = getToolkit();
	Dimension Size = ToolK.getScreenSize();
	
	String FinalUser, FinalPass, FinalName, DateCreate;
	void DashboardDesign(){
		setSize(500, 350);
		setLocation(Size.width/2 - getWidth()/2, Size.height/2 - getHeight()/2);
		getContentPane().setBackground(Color.decode("#F5F5DC"));
		setResizable(false);
		setTitle("Dashboard");
		setIconImage(Logo.getImage());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Labels - SideBar
		JLabel Box = new JLabel();
		JButton MenuLogo = new JButton();
		
		//Main Components
		JLabel Welcome = new JLabel();
		JLabel Name = new JLabel();
		JLabel PFP = new JLabel();
		JLabel Announce = new JLabel();
		JLabel Lorem = new JLabel();
		
		//Design
		//SidebarDesign
		Box.setBounds(0, 0, 50, 400);
		Box.setBackground(Color.decode("#f56942"));
		Box.setOpaque(true);
		Box.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 4, Color.decode("#f78b6d")));
		
		MenuLogo.setBounds(0, 0, 50, 50);
		MenuLogo.setIcon(Menu);
		MenuLogo.setHorizontalAlignment(JLabel.CENTER);
		MenuLogo.setBackground(Color.decode("#f56942"));
		MenuLogo.setOpaque(true);
		MenuLogo.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 4, Color.decode("#f78b6d")));
		MenuLogo.setFocusable(false);
		MenuLogo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		MenuLogo.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseClicked(java.awt.event.MouseEvent evt) {
		    	int a = Box.getWidth();
	    			if(a == 50) {
	    				Box.setBounds(0, 0, 150, 400);
	    				HomeLogo.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 4, Color.decode("#f78b6d")));
	    				MenuLogo.setText("  Menu    ");
	    				MenuLogo.setHorizontalTextPosition(JLabel.RIGHT);
	    				MenuLogo.setIconTextGap(10);
	    				MenuLogo.setBounds(0, 0, 150, 50);
	    				MenuLogo.setFont(new Font("SansSerif", Font.BOLD, 21));
	    				MenuLogo.setForeground(Color.WHITE);
	    				
	    				HomeLogo.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 4, Color.decode("#fa6941")));
	    				HomeLogo.setText("   Home    ");
	    				HomeLogo.setHorizontalTextPosition(JLabel.RIGHT);
	    				HomeLogo.setIconTextGap(0);
	    				HomeLogo.setBounds(0, 50, 150, 50);
	    				HomeLogo.setFont(new Font("SansSerif", Font.BOLD, 21));
	    				HomeLogo.setForeground(Color.WHITE);
	    				
	    				AccLogo.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 4, Color.decode("#f78b6d")));
	    				AccLogo.setText("  Account  ");
	    				AccLogo.setHorizontalTextPosition(JLabel.RIGHT);
	    				AccLogo.setIconTextGap(3);
	    				AccLogo.setBounds(0, 100, 150, 50);
	    				AccLogo.setFont(new Font("SansSerif", Font.BOLD, 19));
	    				AccLogo.setForeground(Color.WHITE);
	    				
	    				LogoutLogo.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 4, Color.decode("#f78b6d")));
	    				LogoutLogo.setText("  Log Out   ");
	    				LogoutLogo.setHorizontalTextPosition(JLabel.RIGHT);
	    				LogoutLogo.setIconTextGap(1);
	    				LogoutLogo.setBounds(0, 150, 150, 50);
	    				LogoutLogo.setFont(new Font("SansSerif", Font.BOLD, 19));
	    				LogoutLogo.setForeground(Color.WHITE);
	    				//Open
	    			}
	    			if(a == 150) {
	    				Box.setBounds(0, 0, 50, 400);
	    				MenuLogo.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 4, Color.decode("#f78b6d")));
	    				MenuLogo.setText("");
	    				MenuLogo.setIconTextGap(0);
	    				MenuLogo.setBounds(0, 0, 50, 50);
	    				
	    				HomeLogo.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 4, Color.decode("#fa6941")));
	    				HomeLogo.setText("");
	    				HomeLogo.setIconTextGap(0);
	    				HomeLogo.setBounds(0, 50, 50, 50);
	    				
	    				AccLogo.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 4, Color.decode("#f78b6d")));
	    				AccLogo.setText("");
	    				AccLogo.setIconTextGap(0);
	    				AccLogo.setBounds(0, 100, 50, 50);
	    				
	    				LogoutLogo.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 4, Color.decode("#f78b6d")));
	    				LogoutLogo.setText("");
	    				LogoutLogo.setIconTextGap(0);
	    				LogoutLogo.setBounds(0, 150, 50, 50);
	    				//Close
	    			}
		    	}
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	MenuLogo.setBackground(Color.decode("#eb0707"));
		    	MenuLogo.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 4, Color.decode("#fa6941")));
		    }
		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	MenuLogo.setBackground(Color.decode("#f56942"));
		    	MenuLogo.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 4, Color.decode("#f78b6d")));
		    }
		});
		
		HomeLogo.setBounds(0, 50, 50, 50);
		HomeLogo.setIcon(Home);
		HomeLogo.setHorizontalAlignment(JLabel.CENTER);
		HomeLogo.setBackground(Color.decode("#eb0707"));
		HomeLogo.setOpaque(true);
		HomeLogo.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 4, Color.decode("#fa6941")));
		HomeLogo.setFocusable(false);
		HomeLogo.addActionListener(this);
		HomeLogo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		HomeLogo.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	HomeLogo.setBackground(Color.decode("#eb0707"));
		    	HomeLogo.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 4, Color.decode("#fa6941")));
		    }
		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	HomeLogo.setBackground(Color.decode("#eb0707"));
		    	HomeLogo.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 4, Color.decode("#fa6941")));
		    }
		});
		
		AccLogo.setBounds(0, 100, 50, 50);
		AccLogo.setIcon(Acc);
		AccLogo.setHorizontalAlignment(JLabel.CENTER);
		AccLogo.setBackground(Color.decode("#f56942"));
		AccLogo.setOpaque(true);
		AccLogo.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 4, Color.decode("#f78b6d")));
		AccLogo.setFocusable(false);
		AccLogo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		AccLogo.addActionListener(this);
		AccLogo.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	AccLogo.setBackground(Color.decode("#eb0707"));
		    	AccLogo.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 4, Color.decode("#fa6941")));
		    }
		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	AccLogo.setBackground(Color.decode("#f56942"));
		    	AccLogo.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 4, Color.decode("#f78b6d")));
		    }
		});
		
		LogoutLogo.setBounds(0, 150, 50, 50);
		LogoutLogo.setIcon(LogOut);
		LogoutLogo.setHorizontalAlignment(JLabel.CENTER);
		LogoutLogo.setBackground(Color.decode("#f56942"));
		LogoutLogo.setOpaque(true);
		LogoutLogo.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 4, Color.decode("#f78b6d")));
		LogoutLogo.setFocusable(false);
		LogoutLogo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		LogoutLogo.addActionListener(this);
		LogoutLogo.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	LogoutLogo.setBackground(Color.decode("#eb0707"));
		    	LogoutLogo.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 4, Color.decode("#fa6941")));
		    }
		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	LogoutLogo.setBackground(Color.decode("#f56942"));;
		    	LogoutLogo.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 4, Color.decode("#f78b6d")));
		    }
		});
		
		//MAIN HOME-DASHBOARD
		Welcome.setBounds(70, 13, 250, 50);
		Welcome.setText("WELCOME,");
		Welcome.setFont(new Font("SansSerif", Font.BOLD, 26));
		
		Name.setBounds(70, 50, 350, 50);
		Name.setText(FinalName);
		Name.setFont(new Font("SansSerif", Font.PLAIN, 16));
		
		Announce.setBounds(70, 100, 350, 50);
		Announce.setText("Announcements: ");
		Announce.setFont(new Font("SansSerif", Font.ITALIC, 16));
		
		Lorem.setBounds(70, 130, 380, 150);
		Lorem.setText("<html> <p text-align: justify>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Lorem ipsum dolor sit amet, consectetur adipiscing elit. In luctus enim et nisi congue sodales. Nam rutrum tristique tortor et feugiat. Suspendisse ut accumsan felis. Suspendisse maximus ut lorem a venenatis. Aenean suscipit vestibulum quam. Nullam rhoncus, risus ut facilisis ullamcorper, massa est dapibus turpis, et sollicitudin nibh sapien non diam. Aenean sollicitudin non augue vitae scelerisque. Phasellus porta cursus mi eget fringilla. </p> </html>");
		Lorem.setFont(new Font("SansSerif", Font.PLAIN, 12));
		
		PFP.setBounds(330, 25, 100, 100);
		PFP.setIcon(Profile);
		
		//Add
		add(Box);
		Box.add(MenuLogo);
		Box.add(HomeLogo);
		Box.add(AccLogo);
		Box.add(LogoutLogo);
		
		add(Welcome);
		add(Name);
		add(PFP);
		add(Announce);
		add(Lorem);
		
		setLayout(null);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == AccLogo) {
			AccountInfo Acc = new AccountInfo();
			Acc.FinalUser = FinalUser;
			Acc.FinalPass = FinalPass;
			Acc.FinalName = FinalName;
			Acc.DateCreate = DateCreate;
			Acc.AccountInfoDesign();
			dispose();
		} 
		
		if (e.getSource() == LogoutLogo) {
			int LogOutConf= JOptionPane.showConfirmDialog(this, "Log Out of session?", "Logout", JOptionPane.YES_NO_OPTION);
			if (LogOutConf == JOptionPane.YES_OPTION) {
				LoginFrame Log = new LoginFrame();
				Log.FinalUser = FinalUser;
				Log.FinalPass = FinalPass;
				Log.FinalName = FinalName;
				Log.DateCreate = DateCreate;
				Log.LoginFrameDesign();
				dispose();
			}
		}
	}
}
