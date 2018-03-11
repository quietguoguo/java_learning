public class ArryTest{
	public static void main(String[] args){
		Person[] students = new Person[2];
		students[0].age = 15;
		students[0].height = 159;
                students[1].age = 17;
                students[1].height = 169;
//		Person zhang = students[0];
//		Person liu = students[1];
//		liu.info();
		students[1].info();
	}
}
