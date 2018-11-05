package Tutor;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class QuesGUI {
	
	
	
	static JFrame Qframe;
	static Code engine = new Code();
	static Thread fade = new Thread(new FadeAwayThread());
	private static JTextArea textArea;
	private static JButton option1;
	private static JButton option2;
	private static JButton option3;
	private static JButton option4;
	static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	static double width = screenSize.getWidth();
	static double height = screenSize.getHeight();
	
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public static void NextQuestionGUI(String question, String choice1,String choice2, String choice3, String choice4){
		if(!FadeAwayThread.started)
		fade.start();
		//WHEN A BUTTON IS SELECTED, MAKE FadeAwayThread.nextClick = true;,,, IT WILL DISPOSE FRAME AND CALL THE NEXT ONE
		

		
		
		
		
		Qframe = new JFrame();
		Qframe.getContentPane().setBackground(Color.BLUE);
		Qframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
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
		
		
		Qframe.setBounds((int)(width/2)-298, (int)(height/2)-305, 596, 610);
		
		
		
		Qframe.setAlwaysOnTop(true);
		Qframe.setUndecorated(true);
		Qframe.getContentPane().setLayout(null);
		
		textArea = new JTextArea(question);
		textArea.setBounds(123, 72, 350, 200);
		Qframe.getContentPane().add(textArea);
		
		option1 = new JButton(choice1);
		option1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				engine.AnswerCheck(1);
				FadeAwayThread.nextClick = true;
			}
		});
		option1.setBounds(123, 367, 350, 23);
		Qframe.getContentPane().add(option1);
		
		option2 = new JButton(choice2);
		option2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				engine.AnswerCheck(2);
				FadeAwayThread.nextClick = true;
			}
		});
		option2.setBounds(123, 416, 350, 23);
		Qframe.getContentPane().add(option2);
		
		option3 = new JButton(choice3);
		option3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				engine.AnswerCheck(3);
				FadeAwayThread.nextClick = true;
			}
		});
		option3.setBounds(123, 468, 350, 23);
		Qframe.getContentPane().add(option3);
		
		option4 = new JButton(choice4);
		option4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				engine.AnswerCheck(4);
				FadeAwayThread.nextClick = true;
			}
		});
		option4.setBounds(123, 520, 350, 23);
		Qframe.getContentPane().add(option4);
		
		JButton btnQuit = new JButton("Quit");
		btnQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FadeAwayThread.nextClick = false;
				Qframe.dispose();
			}
		});
		btnQuit.setBounds(255, 576, 89, 23);
		Qframe.getContentPane().add(btnQuit);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Qframe.setVisible(true);
	}
}
