package Assign_4;

public class question_1_4 {
	public static void main(String[] args) 
	{
		question14 quest = new question14();
		quest.implement();
	}
}

class question14
{
	void implement()
	{
		myInterface m4 = (str) -> str.toUpperCase();
		System.out.println(m4.perform4("Saroj"));
	}
}

interface myInterface{
	String perform4(String str);
}
