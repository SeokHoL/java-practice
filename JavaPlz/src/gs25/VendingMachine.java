package gs25;
//자판기

public class VendingMachine {
	
	
	//음료수 객체배열
	Beverage[] beverages= new Beverage[3];  
	
	
	void init() {  //음료 세팅
		beverages[0] =new Beverage();    //객체생성
		beverages[0].name ="콜라";
		beverages[0].price=1000;
		
		beverages[1] =new Beverage(); 	//객체생성
		beverages[1].name="사이다";
		beverages[1].price=1200;
		
		beverages[2] =new Beverage();  	//객체생성
		beverages[2].name ="커피";
		beverages[2].price=800;

	}
	
	void printAllBeverages() {         //모든메뉴 출력
		
		for(int i =0; i <beverages.length; i++) {
			System.out.println(i+"."+beverages[i].name+":"+beverages[i].price);
		}
		
		//출력 :0.콜라 :1000
		//출력 :1.사이다 :1200
		//출력 :2.커피 :800
	}
	int totalMoney =0;              //총 금액 
	
	void setInputedMoney(int money) {       //투입된 금액
		totalMoney =totalMoney + money;     //총금액은  총금액 + 투입된 금액
		System.out.println("현재 투입된 금액은"+totalMoney+"원입니다.");      //총금액표시
		
	}
	String getBeverage(int no) {          //매뉴번호를 선택하면 음료수가 나오는 메소드
		Beverage target =beverages[no];   //Beverage 클래스의 target변수선언 ->beverages[]에 들어오는 인덱스번호의맞는 음료수이름을 target에 넣어줌          
		int remainderMoney =0;            //잔돈

		
		//잔액이 부족한경우
		if(totalMoney <target.price) {    //총금액이 음료수의가격보다 작을경우
			System.out.println("잔액이 부족합니다");
		}
		else {  //메뉴금액과 투입된 금액이 같거나 클경우 
			System.out.println(target.name + "를 뽑으셨습니다");
			remainderMoney =totalMoney -target.price;     //잔돈은 총금액-메뉴금액
			totalMoney = remainderMoney;              	  //잔돈을 총금액에 넣어줌	
			//잔액출력
			System.out.println("잔액은"+ remainderMoney +"원입니다.");
		}
		
		
		return target.name;	 //뽑은 음료수 이름을 리턴해준다
	}
	
}
