package Tutor;

import javax.swing.ImageIcon;

public class BackGroundThread implements Runnable {

	static boolean loop = true;
	static int speed = 500;
	
	
	@Override
	public void run() {
		while(true)
			while(loop){
				
				try {
					Thread.sleep(speed);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				GUI.contentPane_1.setIcon(new ImageIcon(GUI.class.getResource("/Pics/BackGroundQuiz2.png")));
				
				
				
				try {
					Thread.sleep(speed);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				GUI.contentPane_1.setIcon(new ImageIcon(GUI.class.getResource("/Pics/BackGroundQuiz3.png")));
				
				try {
					Thread.sleep(speed);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				GUI.contentPane_1.setIcon(new ImageIcon(GUI.class.getResource("/Pics/BackGroundQuiz4.png")));
				
				
				try {
					Thread.sleep(speed);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				GUI.contentPane_1.setIcon(new ImageIcon(GUI.class.getResource("/Pics/BackGroundQuiz1.png")));
				
				
				
				
				
				
				
				
				
				
				
			}
		
	}

}
