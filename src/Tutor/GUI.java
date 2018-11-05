package Tutor;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SpringLayout;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Shape;
import java.awt.Toolkit;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.geom.RoundRectangle2D;

public class GUI {

	//hape s = new RoundRectangle2D.Float(00, 20, 596, 610, 596, 610);
	 
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	double width = screenSize.getWidth();
	double height = screenSize.getHeight();
	
	
	Code engine = new Code();
	
	
	JFrame frame;
	Thread t = new Thread(new BackGroundThread());
	
	public static JLabel contentPane_1;
	public GUI(){
		Starter();
	}
	
	public void Starter(){
		
		frame = new JFrame();
		
		frame.setBounds((int)(width/2)-298, (int)(height/2)-305, 596, 610);
		
		
		
		frame.setUndecorated(true);
		frame.getContentPane().setLayout(null);
		
		JButton btnClose = new JButton("");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
			}
		});
		btnClose.setBounds(31, 472, 157, 80);
		frame.getContentPane().add(btnClose);
		
		btnClose.setOpaque(false);
		 btnClose.setContentAreaFilled(false);
		 btnClose.setBorderPainted(false);
		
		JButton btnBegin = new JButton("");
		btnBegin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				BackGroundThread.loop = false;
				
				engine.CallNextQuestion();
				frame.dispose();
			}
		});
		btnBegin.setBounds(421, 472, 157, 80);
		frame.getContentPane().add(btnBegin);
		
		btnBegin.setOpaque(false);
		btnBegin.setContentAreaFilled(false);
		btnBegin.setBorderPainted(false);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		contentPane_1 = new JLabel();
		contentPane_1.setBounds(0, 0, 596, 610);
	//	contentPane_1.setHorizontalAlignment(0);
		contentPane_1.setIcon(new ImageIcon(GUI.class.getResource("/Pics/BackGroundQuiz1.png")));
		contentPane_1.setLayout(new SpringLayout());
		frame.getContentPane().add(contentPane_1);
		//frame.setBackground(new ImageIcon(GUIXlass.class.getResource("/Images/BACKGROUND.png")));
		//ame.setShape(s);
		t.start();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
