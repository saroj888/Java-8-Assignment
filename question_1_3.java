package Assign_4;

public class question_1_3 {

	public static void main(String[] args) 
	{
		question13 quest = new question13();
		quest.implement();
	}
}


class question13
{
	void implement()
	{
		myInterface_3 m1 = (str1,str2) -> str1 + str2;
		System.out.println(m1.perform_3("Saroj ","Gope"));
	}
}

interface myInterface_3
{
	String perform_3(String s1,String s2);
}
