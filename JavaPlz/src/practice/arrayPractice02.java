package practice;

public class arrayPractice02 {
	String name;
	String breeds;
	double weight;
	
	void claw() {
		System.out.println("할퀴기!");
	}
	void meow() {
		System.out.println("야옹~");
	}
	

	public static void main(String[] args) {
		
	
		Cat c = new Cat();
		
		c.name ="네로";
		c.breeds ="페르시안";
		c.weight = 4.37;
		
		System.out.printf("이름: %s\n",c.name);
		System.out.printf("품종: %s\n",c.breeds);
		System.out.printf("체중: %s\n",c.weight);

	}

}
