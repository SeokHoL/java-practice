package gs25;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		VendingMachine vm = new VendingMachine();    //VendingMachine vm변수 생성
		vm.init();   //음료메뉴세팅
		
		vm.printAllBeverages();            //모든메뉴출력
		//출력 :0.콜라 :1000
		//출력 :1.사이다 :1200
		//출력 :2.커피 :800
		
		Scanner input = new Scanner(System.in);  
		System.out.println("돈을 넣어주세요 :");
		int money = input.nextInt();
		
		vm.setInputedMoney(money);
		//출력: 현재 투입된 금액은 money원입니다
		
		System.out.println("메뉴번호를 선택해주세요:");
		int number = input.nextInt();
		
		vm.getBeverage(number);
		//출력:  를 뽑으셨습니다. 
		//잔액: 잔액은 원입니다.
			
		
		
		System.out.println("돈을 추가투입하시겠습니까?:");   
		int addmoney=input.nextInt();
		vm.setInputedMoney(addmoney);
		
		System.out.println("메뉴번호를 선택해주세요:");
		int number2 = input.nextInt();
		vm.getBeverage(number2);
		//출력:  를 뽑으셨습니다. 
		//잔액: 잔액은 원입니다.
		
	}

}
