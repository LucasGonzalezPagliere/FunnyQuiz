package Tutor;

import java.util.ArrayList;
import java.util.Arrays;

public class Code {
	
	//QuesGUI QuestionFrame = new QuesGUI();
	
	static int QuestionIndex = 0;
	
	//In this arraylist, 1 represents CORRECT, and 0 represents INCORRECT
	static ArrayList<Integer> WrongOrRight = new ArrayList<Integer>();
	
	
	ArrayList<String> Questions = new ArrayList<>(Arrays.asList("Solve For X. \nx + 7 = 10  ", "Solve For X. \nx/2 = 10  ",
			"Which of the following is an even number?" , "(150 + 50)*2 = ?","10% of 100 is?","Who was the first black \npresident in the US?","What year did WWII Begin?","Who was the first President\n of the United States?",
			"Did slavery ever happen in the U.S.?","Did the French ever have a revolution?",
			"What do you cut food with?","How many times a day should you \nwash your teeth?",
			"What do you wear on your feet \nto protect them?","Which of the following would get you\narrested?","What should you do if you get a small cut?",
			"What should a newborn baby drink?", "What should you do if a baby is crying?", "Which of the following is the best \nplace for a baby to sleep?", "What should you do if your child is \nmisbehaving?", "Which of these following morals is best \nsuited for a young child?"));
	
	
	
	ArrayList<String> Options1 = new ArrayList<>(Arrays.asList("x = 3", "x = 44", 
			"17.9" , "350","25","LeBron James","2001","Abrahan Lincoln","Sadly, yes","Not sure",
			"A stripper pole","3","Sunscreen","Pooping and forgetting to flush","Spit on the wound and pray viciously", "Milk and water", "Cry with it", "IHOP bathroom", "Lecture and/or discipline him accordingly", "When you are mad hit and bite anyone in sight"));
	
	
	ArrayList<String> Options2 = new ArrayList<>(Arrays.asList("x = 19", "x = 19",
			"14.77" , "400","15","Bill Clinton","1939","George Washington","Nope","No but, they might have one soon",
			"A radio","15","Plastic Wrap","Making ugly faces at your family","Wash it off and put a Band-Aid on it", "Whiskey" , "Try to see why it is crying and/or comfort it", "Crib", "Shout at him furiously for at least 25 minutes", "Driving fast is good to impress girls"));
	
	
	ArrayList<String> Options3 = new ArrayList<>(Arrays.asList("x = 0.17", "x = 20",
			"8" , "420","10","Terry Crews","1999","George Bush","Probably not","Yes",
			"A tree branch","5","Carpet","Crying at night","Amputate the limb the cut is on", "Orange Juice and water", "'Take out the Trash'", "The roof, it likes the stars", "Buy him a new toy", "Treat people how you would like to be treated"));
	
	
	ArrayList<String> Options4 = new ArrayList<>(Arrays.asList("x = 10", "x = 10",
			"9" , "600","100","Barack Obama","2020","Bill Gates","No, only in Africa","Yes, but it was just a hoax",
			"A Knife","1","Shoes","Punching an officer","Take a large dosage of Morphine", "Soda", "Give it muscle relaxants", "The cold floor", "Lock him in the bathroom for two days", "If you can't get what you want, cry until you do"));
	
	
	
	
	ArrayList<Integer> AnswerKey = new ArrayList<>(Arrays.asList(1, 3,
			3 , 2  ,  3  ,  4  ,  2  ,  2  ,1 ,  3,
			4,   
			1,   
			4,     
			4, 
			2, 1, 2, 2,1,3));
	
	
	public void CallNextQuestion(){

		
		String sentQuestion = Questions.get(QuestionIndex);
		
		
		
		
		String Op1 = Options1.get(QuestionIndex);
		String Op2 = Options2.get(QuestionIndex);
		String Op3 = Options3.get(QuestionIndex);
		String Op4 = Options4.get(QuestionIndex);
		
		
		QuestionIndex++;
		
		QuesGUI.NextQuestionGUI(sentQuestion, Op1, Op2, Op3, Op4);
		
		
		
		
		
	}
	
	
	public void AnswerCheck(int optionSelected){
		
		
		if(optionSelected == AnswerKey.get(QuestionIndex-1)){
			
			WrongOrRight.add(1);
		}else{
			WrongOrRight.add(0);
		}
		System.out.println(WrongOrRight);
		System.out.println(QuestionIndex);
	
		
	}
	
	
	public void Finalize(){
		
		QuesGUI.Qframe.dispose();
		
		
		
		FinalGUI.Results();
		
		
		
		
	}
	
	

}
