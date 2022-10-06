package Assign_4;


public class question_2 {
	public static void main(String[] args) 
	{
		quest qu = new quest();
		qu.implement();
	}
}

class quest
{
	void implement()
	{
		myInterface1 m1 = new quest()::add;
		myInterface1 m2 = new quest()::substract;
		myInterface1 m3 = quest::multiply;
		System.out.println("Addition is :" +m1.perform(3,9));
		System.out.println("Substarction is :" +m2.perform(3,9));
		System.out.println("Multiplicaton is :" +m3.perform(3,9));	
	}
	Integer add(int a,int b)
	{
		return a+b;
	}
	
	Integer substract(int a,int b)
	{
		return a-b;
	}
	static Integer multiply(int a,int b)
	{
		return a*b;
	}
}
interface myInterface1{
	Integer perform(int a,int b);
}



