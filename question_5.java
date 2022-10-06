package Assign_4;

public class question_5 {

	public static void main(String[] args) 
	{
		question5 ques_5 = new question5();
		ques_5.implement();
	}
}

class question5 implements myInterface_5
{
	public void perform()
	{
		System.out.println("Overriding Invoked.");
	}
	
	void implement()
	{
		question5 ques_5 = new question5();
		ques_5.perform();
	}
}


interface myInterface_5{
	default void perform()
	{ 
		System.out.println("Default Invoked.");
	}
}
