package loginsystem;
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.time.LocalDate;

public class LoginFrame extends JFrame implements ActionListener{
	
	ImageIcon Logo = new ImageIcon(new ImageIcon("202-2024687_profile-icon-for-the-politics-category-profile-icon.png").getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH));
	ImageIcon ShowImgPass = new ImageIcon(new ImageIcon("ShowPass-removebg-preview.png").getImage().getScaledInstance(25, 30, Image.SCALE_SMOOTH));
	ImageIcon HideImgPass = new ImageIcon(new ImageIcon("HidePass-removebg-preview.png").getImage().getScaledInstance(25, 30, Image.SCALE_SMOOTH));
	Toolkit ToolK = getToolkit();
	Dimension Size = ToolK.getScreenSize();
	
	JTextField User = new JTextField();
	JPasswordField Pass = new JPasswordField();
	JButton Login = new JButton();
	JButton SignUp = new JButton();
	JButton Cancel = new JButton();

	String FinalUser, FinalPass, FinalName;
	LocalDate DateCreate;
	
	void LoginFrameDesign(){	
		setSize(500, 350);
		setLocation(Size.width/2 - getWidth()/2, Size.height/2 - getHeight()/2);
		getContentPane().setBackground(Color.decode("#F5F5DC"));
		setResizable(false);
		setTitle("Account Login");
		setIconImage(Logo.getImage());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Labels - SideBar
		JLabel Box = new JLabel();
		JLabel TextSide = new JLabel();
		JLabel LogoSide = new JLabel();
		JLabel New = new JLabel();
		JLabel BioSide = new JLabel();

		
		//Labels - Main
		JLabel LogText = new JLabel();
		JLabel UserText = new JLabel();
		JLabel PassText = new JLabel();
		
		JButton ShowPass = new JButton();
		
		//Design
		//SidebarDesign
		Box.setBounds(0, 0, 150, 400);
		Box.setBackground(Color.decode("#f56942"));
		Box.setOpaque(true);
		Box.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 4, Color.decode("#f78b6d")));
		
		TextSide.setBounds(23, 2, 150, 50);
		TextSide.setText("Welcome!");
		TextSide.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 23));
		TextSide.setForeground(Color.WHITE);
		
		LogoSide.setBounds(25, 48, 100, 100);
		LogoSide.setIcon(Logo);
		
		New.setBounds(28, 145, 150, 50);
		New.setText("New Here?");
		New.setFont(new Font("SansSerif", Font.BOLD, 18));
		New.setForeground(Color.WHITE);
		
		BioSide.setBounds(18, 185, 150, 50);
		BioSide.setText("<html> &nbsp;&nbsp;&nbsp;&nbsp;Create your  <br> account for <u><font color = #0000EE>Free</color></u>! </html>");
		BioSide.setFont(new Font("SansSerif", Font.PLAIN, 15));
		BioSide.setForeground(Color.WHITE);
		BioSide.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		BioSide.addMouseListener(new java.awt.event.MouseAdapter() {
			 
		    public void mouseClicked(MouseEvent e) {
					int SignUpConf = JOptionPane.showConfirmDialog(null, "Create new account? (Previous account will be removed once created)", "Sign Up Form", JOptionPane.YES_NO_OPTION);
					if(SignUpConf == JOptionPane.YES_OPTION) {
						Register Reg = new Register();
						Reg.FinalUser = FinalUser;
						Reg.FinalPass = FinalPass;
						Reg.FinalName = FinalName;
		 				Reg.DateCreate = DateCreate;
						Reg.RegisterDesign();
						dispose();
					}
					
		    }
		 
		    public void mouseEntered(MouseEvent e) {
		    	BioSide.setText("<html> &nbsp;&nbsp;&nbsp;&nbsp;Create your  <br> account for <b><u><font color = #7ad2f5>Free</color></u></b>! </html>");
		    }
		    public void mouseExited(MouseEvent e) {
		    	BioSide.setText("<html> &nbsp;&nbsp;&nbsp;&nbsp;Create your  <br> account for <u><font color = #0000EE>Free</color></u>! </html>");
		    }
		});
		
		SignUp.setBounds(15, 250, 120, 35);
		SignUp.setText("Sign Up");
		SignUp.setFont(new Font("SanSerif", Font.BOLD | Font.ITALIC, 16));
		SignUp.setForeground(Color.white);
		SignUp.setBackground(Color.decode("#f56942"));
		SignUp.setOpaque(true);
		SignUp.setBorder(BorderFactory.createLineBorder(Color.white, 1));
		SignUp.setFocusable(false);
		SignUp.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		SignUp.addActionListener(this);
		SignUp.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	SignUp.setBackground(Color.decode("#f72525"));
		    	SignUp.setForeground(Color.black);
		    }
		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	SignUp.setBackground(Color.decode("#f56942"));
		    	SignUp.setForeground(Color.white);
		    }
		});
		
		//Login
		
		LogText.setBounds(170, 13, 250, 50);
		LogText.setText("Login");
		LogText.setFont(new Font("SansSerif", Font.BOLD, 26));
		
		UserText.setBounds(170, 53, 250, 50);
		UserText.setText("Username");
		UserText.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 17));
		
		User.setBounds(170, 90, 277, 35);
		User.setFont(new Font("SansSerif", Font.PLAIN, 18));
		User.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.BLACK));
		User.setBackground(Color.decode("#F5F5DC"));
		User.addKeyListener(new java.awt.event.KeyAdapter() {
		    public void keyPressed(java.awt.event.KeyEvent e) {
		    if (e.getKeyCode() == KeyEvent.VK_ENTER ) {
		    	Pass.requestFocus();
		     } else if (e.getKeyCode() == KeyEvent.VK_DOWN ) {
		    	Pass.requestFocus();
		    }
		  }
		});
		
		
		PassText.setBounds(170, 128, 250, 50);
		PassText.setText("Password");
		PassText.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 17));
		
		Pass.setBounds(170, 165, 250, 35);
		Pass.setFont(new Font("SansSerif", Font.BOLD, 18));
		Pass.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.BLACK));
		Pass.setBackground(Color.decode("#F5F5DC"));
		Pass.setEchoChar('∗');
		Pass.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent e) {
		     if(e.getKeyCode() == KeyEvent.VK_ENTER) {
		 			if((User.getText().equals(null) || User.getText().equals("")) && (new String(Pass.getPassword()).equals(null) || new String(Pass.getPassword()).equals(""))) {
		 				JOptionPane.showMessageDialog(null, "Please enter your username and password", "Unsuccessful Login", JOptionPane.WARNING_MESSAGE);
		 			} else if(User.getText().equals(null) || User.getText().equals("")){
		 				JOptionPane.showMessageDialog(null, "Please enter your username", "Unsuccessful Login", JOptionPane.WARNING_MESSAGE);
		 			} else if(new String(Pass.getPassword()).equals(null) || new String(Pass.getPassword()).equals("")){
		 				JOptionPane.showMessageDialog(null, "Please enter your password", "Unsuccessful Login", JOptionPane.WARNING_MESSAGE);
		 			} else if(User.getText().equals(FinalUser) && new String(Pass.getPassword()).equals(FinalPass)) {
		 				JOptionPane.showMessageDialog(null, "Successfully Logged In!", "Successful Login", JOptionPane.INFORMATION_MESSAGE);
		 				Dashboard Home = new Dashboard();
		 				Home.FinalUser = FinalUser;
		 				Home.FinalPass = FinalPass;
		 				Home.FinalName = FinalName;
		 				Home.DateCreate = DateCreate;
		 				Home.DashboardDesign();
		 				dispose();
		 			} else {
		 				JOptionPane.showMessageDialog(null, "Incorrect username or password", "Incorrect Account Details", JOptionPane.ERROR_MESSAGE);
		 			}
		 		} else  if (e.getKeyCode() == KeyEvent.VK_UP ) {
	 		    	User.requestFocus();
	 		    }
		     }
		});
		
		ShowPass.setIcon(HideImgPass);
		ShowPass.setBounds(420, 165, 27, 34);
		ShowPass.setBackground(Color.decode("#F5F5DC"));
		ShowPass.setOpaque(true);
		ShowPass.setBorder(BorderFactory.createLineBorder(Color.decode("#7a8a99"), 1));
		ShowPass.setFocusable(false);
		ShowPass.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.BLACK));
		ShowPass.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		ShowPass.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mousePressed(java.awt.event.MouseEvent evt) {
		    	ShowPass.setIcon(ShowImgPass);
		    	Pass.setEchoChar((char)0);
		    	Pass.setFont(new Font("SansSerif", Font.PLAIN, 18));
		    }
		    public void mouseReleased(java.awt.event.MouseEvent evt) {
		    	ShowPass.setIcon(HideImgPass);
		    	Pass.setEchoChar('∗');
		    	Pass.setFont(new Font("SansSerif", Font.BOLD, 18));
		    }
		});
		
		Login.setText("Login");
		Login.setBounds(170, 235, 133, 35);
		Login.setFont(new Font("SanSerif", Font.BOLD, 16));
		Login.setForeground(Color.black);
		Login.setBackground(Color.decode("#bbf5b8"));
		Login.setOpaque(true);
		Login.setBorder(BorderFactory.createLineBorder(Color.black, 0));
		Login.setFocusable(false);
		Login.addActionListener(this);
		Login.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Login.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	Login.setBackground(Color.decode("#02bf34"));
		    	Login.setForeground(Color.white);
		    }
		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	Login.setBackground(Color.decode("#bbf5b8"));
		    	Login.setForeground(Color.black);
		    }
		});
		
		Cancel.setText("Cancel");
		Cancel.setBounds(315, 235, 132, 35);
		Cancel.setFont(new Font("SanSerif", Font.BOLD, 16));
		Cancel.setForeground(Color.black);
		Cancel.setBackground(Color.decode("#f5b8b8"));
		Cancel.setOpaque(true);
		Cancel.setBorder(BorderFactory.createLineBorder(Color.black, 0));
		Cancel.setFocusable(false);
		Cancel.addActionListener(this);
		Cancel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Cancel.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	Cancel.setBackground(Color.decode("#f72525"));
		    	Cancel.setForeground(Color.white);
		    }
		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	Cancel.setBackground(Color.decode("#f5b8b8"));
		    	Cancel.setForeground(Color.black);
		    }
		});
		//Add
		add(Box);
		Box.add(TextSide);
		Box.add(LogoSide);
		Box.add(New);
		Box.add(BioSide);
		Box.add(SignUp);
		
		add(LogText);
		add(UserText);
		add(User);
		add(PassText);
		add(Pass);
		add(ShowPass);
		add(Login);
		add(Cancel);
		
		setLayout(null);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		//SIGNUP SIDE BAR
		if(e.getSource() == SignUp) {
			int SignUpConf = JOptionPane.showConfirmDialog(this, "Create new account? (Previous account will be removed once created)", "Sign Up Form", JOptionPane.YES_NO_OPTION);
			if(SignUpConf == JOptionPane.YES_OPTION) {
				Register Reg = new Register();
				Reg.FinalUser = FinalUser;
				Reg.FinalPass = FinalPass;
				Reg.FinalName = FinalName;
 				Reg.DateCreate = DateCreate;
				Reg.RegisterDesign();
				dispose();
			}
			
		}
		
		//CHECKS USER, AND PASS
		if(e.getSource() == Login) {
			if((User.getText().equals(null) || User.getText().equals("")) && (new String(Pass.getPassword()).equals(null) || new String(Pass.getPassword()).equals(""))) {
				JOptionPane.showMessageDialog(this, "Please enter your username and password", "Unsuccessful Login", JOptionPane.WARNING_MESSAGE);
			} else if(User.getText().equals(null) || User.getText().equals("")){
				JOptionPane.showMessageDialog(this, "Please enter your username", "Unsuccessful Login", JOptionPane.WARNING_MESSAGE);
			} else if(new String(Pass.getPassword()).equals(null) || new String(Pass.getPassword()).equals("")){
				JOptionPane.showMessageDialog(this, "Please enter your password", "Unsuccessful Login", JOptionPane.WARNING_MESSAGE);
			} else if(User.getText().equals(FinalUser) && new String(Pass.getPassword()).equals(FinalPass)) {
				JOptionPane.showMessageDialog(this, "Successfully Logged In!", "Successful Login", JOptionPane.INFORMATION_MESSAGE);
				Dashboard Home = new Dashboard();
				Home.FinalUser = FinalUser;
				Home.FinalPass = FinalPass;
				Home.FinalName = FinalName;
				Home.DateCreate = DateCreate;
				Home.DashboardDesign();
				dispose();
			} else {
				JOptionPane.showMessageDialog(this, "Incorrect username or password", "Incorrect Account Details", JOptionPane.ERROR_MESSAGE);
			}
		}
		
		//CANCEL
		if (e.getSource() == Cancel) {
			int CancelConf= JOptionPane.showConfirmDialog(this, "Reset login session?", "Cancel Login", JOptionPane.YES_NO_OPTION);
			if (CancelConf == JOptionPane.YES_OPTION) {
				User.setText("");
				Pass.setText("");
				int Quit= JOptionPane.showConfirmDialog(this, "Quit session?", "Quit", JOptionPane.YES_NO_OPTION);
				if (Quit == JOptionPane.YES_OPTION) {
					dispose();
				}
			}
		}
	}
	
}
