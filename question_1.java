package Assign_4;


class Person{
	void implement() {
//		myInterface a2 = (x) -> x+1;
		System.out.println(a2.perform(10));
	}
}

interface myInterface{
	Integer perform(int a);
//}

class question_1
{
	public static void main(String[] args)
	{
		Person p = new Person();
		p.implement();
	}
}
