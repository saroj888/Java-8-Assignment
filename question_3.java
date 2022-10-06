package Assign_4;

public class question_3 {

	public static void main(String[] args) 
	{
		quest_1 qu = new quest_1();
		qu.implement_1();
	}
}


class quest_1{
	void implement_1()
	{
		Runnable rn = () -> { System.out.println("Task 2"); };
		new Thread(rn).start();
		}
	}