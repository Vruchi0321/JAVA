package activities;

public class Emp_5 
{
	String name;
	int age;
	double salary;

	public static void main(String[] args) 
	{
		Emp_5 e1 =new Emp_5();
		e1.name = "Vruchika";
		e1.age = 23;
		e1.salary = 80.000;
		
		Emp_5 e2 =new Emp_5();
		e2.name = "pranali";
		e2.age = 67;
		e2.salary = 70.000;
		
		Emp_5 e3 =new Emp_5();
		e3.name = "pranal";
		e3.age = 20;
		e3.salary = 70.000;
		
		System.out.println("Name :"+e1.name +  " " + "age:"+e1.age +" " + "salary:" +e1.salary );
		System.out.println("Name :"+e2.name + " " + "age:"+e2.age +" " + "salary:" +e2.salary );
		System.out.println("Name :"+e3.name + " "+  "age:"+e3.age +" " + "salary:" +e3.salary );
	}

}
