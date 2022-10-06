package Assign_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class question_4 
{
	public static void main(String[] args) 
	{
		question4 ques4 = new question4();
		ques4.implement();
	}
}

class Employee
{
	String first_name,mid_name,last_name,city;
	long salary;
	
	public Employee(String first_name,String mid_name,String last_name,String city,long salary)
	{
		this.first_name = first_name;
		this.mid_name = mid_name;
		this.last_name = last_name;
		this.city = city;
		this.salary = salary;
	}
}

class question4
{
	void implement()
	{
		List<Integer> list = new ArrayList<Integer>();
		for(int i=1;i<5;i++)
		{
			list.add(i);
		}
		
		Employee[] emp = {
				new Employee("Saroj","Kumar","Gope","Noida", 1000),
				new Employee("Alpha","Kumar","Pandey","Delhi",1500),
				new Employee("Manoj","Kumar","Chandra","Raipur",2000),
				new Employee("Asit","Kumar","modi","Delhi",2500),
				new Employee("Prafull","Chandra","Gupta","Delhi",5100),
		};
		
		
		List<Employee> list_1 = Arrays.asList(emp);
		List<Employee> l = list_1.stream().filter((e) -> (e.salary < 3000 && e.city == "Delhi"))
				.collect(Collectors.toList());
		
		List<String> ans = new ArrayList<String>();
		for(Employee i:l)
		{
			ans.add(i.first_name);
			
		}
		ans = ans.stream().distinct().collect(Collectors.toList());
		for(String s:ans)
		{
			System.out.println(s);
		}
	}
}
