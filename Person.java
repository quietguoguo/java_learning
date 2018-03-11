class Person{
	public int age;
	public int height;
	public void info(){
		System.out.println("年龄:"+age+"\n身高:"+height);
	}
	Person(int age,int height){
		this.age=age;
		this.height=height;
	}
	Persion(){
		this.age=0;
		this.height=10;
	}
}
