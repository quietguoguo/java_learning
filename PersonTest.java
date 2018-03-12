class Person
{
	public String name;
	public static int age;
}
class PersonTest
{
	public static void main(String[] args)
	{
//		System.out.println(Person.age+" "+Person.name);
		Person p = new Person();
		
		System.out.println(p.age);
		System.out.println(p.name);
		p.age=500;
		p.name="king";
//              System.out.println(Person.age+" "+Person.name);
		System.out.println(p.age+" "+p.name);
		Person p2 = new Person();
//               System.out.println(Person.age+" "+Person.name);
                System.out.println(p2.age+" "+p2.name);
	}
}
