package Tutor;

public class FadeAwayThread implements Runnable {

	static boolean nextClick = false;
	static int speed = 70;
	static boolean started = false;
	
	Code engine = new Code();
	@Override
	public void run() {
		while(true){
			started = true;
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			if(nextClick){
				
				try {
					Thread.sleep(speed);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				QuesGUI.Qframe.setOpacity(0.9f);
				try {
					Thread.sleep(speed);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				QuesGUI.Qframe.setOpacity(0.8f);
				
				try {
					Thread.sleep(speed);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				QuesGUI.Qframe.setOpacity(0.7f);
				try {
					Thread.sleep(speed);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				QuesGUI.Qframe.setOpacity(0.6f);
				try {
					Thread.sleep(speed);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				QuesGUI.Qframe.setOpacity(0.5f);
				try {
					Thread.sleep(speed);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
				QuesGUI.Qframe.setOpacity(0.4f);
				try {
					Thread.sleep(speed);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				QuesGUI.Qframe.setOpacity(0.3f);
				try {
					Thread.sleep(speed);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				QuesGUI.Qframe.setOpacity(0.2f);
				try {
					Thread.sleep(speed);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				QuesGUI.Qframe.setOpacity(0.1f);
				try {
					Thread.sleep(speed);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				QuesGUI.Qframe.dispose();
				
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				nextClick=false;
				
				//CHANGE TO 20 WHEN ARRAYLISTS ARE FIXED
				if(Code.QuestionIndex == 20)
				engine.Finalize();
				
				else{
				engine.CallNextQuestion();
		
				}
	
}}}
}