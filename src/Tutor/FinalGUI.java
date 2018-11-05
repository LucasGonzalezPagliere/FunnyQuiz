package Tutor;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FinalGUI {
	
	
	static JFrame frame;
	static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	static double width = screenSize.getWidth();
	static double height = screenSize.getHeight();
	
	
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public static void Results(){
		
		
		frame = new JFrame("Finished!");
		
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		try {
			UIManager.setLookAndFeel(  UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		frame.setBounds((int)(width/2)-298, (int)(height/2)-305, 596, 610);
		
		
		
		frame.setAlwaysOnTop(true);
		frame.setUndecorated(true);
		frame.getContentPane().setLayout(null);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(20, 109, 37, 378);
		//String value = "" + getScore(1);
		//value.substring(0,3);
		//System.out.println("Math Value: " +value);
		
		//progressBar.setValue(Integer.parseInt(value));
		progressBar.setValue(getScore(1));
		progressBar.setOrientation(SwingConstants.VERTICAL);
		frame.getContentPane().add(progressBar);
       
		
		JLabel lblMath = new JLabel("Math");
		lblMath.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblMath.setBounds(10, 26, 60, 36);
		frame.getContentPane().add(lblMath);
		
		JLabel lblHistory = new JLabel("History");
		lblHistory.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblHistory.setBounds(107, 26, 76, 36);
		frame.getContentPane().add(lblHistory);
		
		JLabel lblCommonKnowledge = new JLabel("Common Knowledge");
		lblCommonKnowledge.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblCommonKnowledge.setBounds(205, 31, 204, 27);
		frame.getContentPane().add(lblCommonKnowledge);
		
		JLabel lblScience = new JLabel("Parenting Skills");
		lblScience.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblScience.setBounds(429, 29, 157, 30);
		frame.getContentPane().add(lblScience);
		
		//String value1 = "" + getScore(2);
		//value1.substring(0,3);
		//System.out.println("History Value: " +value1);
		
		JProgressBar progressBar_1 = new JProgressBar();
		progressBar_1.setValue(getScore(2));
		progressBar_1.setOrientation(SwingConstants.VERTICAL);
		progressBar_1.setBounds(124, 109, 37, 378);
		frame.getContentPane().add(progressBar_1);
		
		//String value2 = "" + getScore(3);
		//value2.substring(0,3);
		//System.out.println("Common Knowledge Value: " +value2);
		JProgressBar progressBar_2 = new JProgressBar();
		progressBar_2.setValue(getScore(3));
		
		
		progressBar_2.setOrientation(SwingConstants.VERTICAL);
		progressBar_2.setBounds(286, 109, 37, 378);
		frame.getContentPane().add(progressBar_2);
		
		//String value3 = "" + getScore(4);
		//value3.substring(0,3);
		//System.out.println("Parenting Value: " +value3);
		
		JProgressBar progressBar_3 = new JProgressBar();
		progressBar_3.setValue(getScore(4));
		progressBar_3.setOrientation(SwingConstants.VERTICAL);
		progressBar_3.setBounds(488, 109, 37, 378);
		frame.getContentPane().add(progressBar_3);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
			}
		});
		btnClose.setBounds(247, 576, 89, 23);
		frame.getContentPane().add(btnClose);
		
		
		JLabel lblMath_1 = new JLabel(String.valueOf(getScore(1))+ "%");
		lblMath_1.setBounds(20, 531, 46, 14);
		frame.getContentPane().add(lblMath_1);
		
		JLabel lblHistory_1 = new JLabel(String.valueOf(getScore(2))+ "%");
		lblHistory_1.setBounds(124, 531, 46, 14);
		frame.getContentPane().add(lblHistory_1);
		
		JLabel lblCommon = new JLabel(String.valueOf(getScore(3))+ "%");
		lblCommon.setBounds(290, 531, 46, 14);
		frame.getContentPane().add(lblCommon);
		
		JLabel lblParenting = new JLabel(String.valueOf(getScore(4)) + "%");
		lblParenting.setBounds(500, 531, 46, 14);
		frame.getContentPane().add(lblParenting);
		
		
		frame.setVisible(true);
	}
	
	
	
	
	
	public static int getScore(int group){
		
		
		double percentRight = 0;
		int finalPercent = 0;
		switch (group){
		case 1: 
			double total = 0;
			for(int i = 0;i<5; i++){
				
				total += Code.WrongOrRight.get(i);

			}
			percentRight = ((total/5)*100);
			System.out.println("Case 1 :" + total);
			
			finalPercent = (int)Math.round(percentRight);
			
			
			break;
		case 2:
			double total2 = 0;
			for(int i = 5;i<10; i++){
				
				total2 += Code.WrongOrRight.get(i);

			}
			percentRight = ((total2/5)*100);
			System.out.println("Case 2 :" + total2);
			finalPercent = (int)Math.round(percentRight);
			break;
		case 3:
			double total3 = 0;
			for(int i = 10;i<15; i++){
				
				total3 += Code.WrongOrRight.get(i);

			}
			percentRight = ((total3/5)*100);
			System.out.println("Case 3 :" + percentRight);
			finalPercent = (int)Math.round(percentRight);
			break;
		case 4:
			double total4 = 0;
			for(int i = 15;i<20; i++){
				
				total4 += Code.WrongOrRight.get(i);

			}
			percentRight = ((total4/5)*100);
			System.out.println("Case 4 total = " + total4);
			System.out.println("Case 4 total percent = " + (total4/5)*100);
			System.out.println("Case 4 :" + percentRight);
			finalPercent = (int)Math.round(percentRight);
			break;
			
		}
			
				return finalPercent;
			
		
		
	
		
		
	}
}
