package ch01;
import java.util.Scanner;
public class Moster {
	   public static int attackMonster(int player,int magicDamage, int stabDamage, int monsterHp) {
		      int damage =0;         //데미지값을 선언
		      String attackType ="";  //문자값을 선언
		      int afterMonsterHp=0;   // 몬스터체력-공격 값을 받을 변수 선언
		      if(player ==1) {
		         damage = magicDamage;
		         attackType ="마법공격";
		      }
		      
		      else if (player ==2) {
		         damage =stabDamage;
		         attackType ="찌르기 공격";
		      }
		      System.out.printf("몬스터에게 %s로, %d의 데미지를 주었습니다.\n",attackType,damage);
		      if(player == 1) {                    
		         afterMonsterHp = monsterHp-damage;     // 몬스터체력 - 마법공격 을 afterMonsterHp에 대입한다
		         Print(afterMonsterHp);                 // Print 메소드 함수를 호출
		         return afterMonsterHp;                 // afterMonsterHp 값을 반환
		      }
		      else{
		         afterMonsterHp = monsterHp-damage;    // 몬스터체력 - 찌르기공격 을 afterMonsterHp에 대입한다
		         Print(afterMonsterHp);                // Print 메소드 함수를 호출
		         return afterMonsterHp;                // afterMonsterHp 값을 반환
		      }
		   }
		   
		   public static void Print(int monsterHp) {   
		      if (monsterHp <=0) {                        //몬스터체력이 0이면 출력문을 출력하고 종료
		          System.out.println("몬스터를 물리쳤습니다.\n");
		          
		       }
		       else {
		          System.out.printf("현재 몬스터체력:%d\n",monsterHp); //0이 아닐시 몬스터체력을 출력함
		       }
		}
		   

		   public static void main(String[] args) {
		      // TODO Auto-generated method stub
		      
		      int magicDamage =3;   //마법공격
		      int stabDamage =1;    //찌르기공격
		      int monsterHp=10;     //몬스터체력
		      int monsterHeal =2;   //몬스터 5턴마다 +2 체력회복
		      int turns =1;         //턴을 넘김    
		      int player = 0;       //플레이어 변수선언
		      Scanner input = new Scanner(System.in);  
		      System.out.println("몬스터 출현!");
		      
		      while (monsterHp > 0) {     // 몬스터 체력이 0보다 작으면 탈출
		         System.out.printf("%d번째 턴\n",turns  ); //턴 1
		         System.out.printf("1.마법공격 (공격력:%d)\n",magicDamage);//3
		         System.out.printf("2.찌르기공격 (공격력:%d)\n",stabDamage);// 1
		      
		         while (true) {  //1 과 2를 입력하지않으면 다시 반복
		          player=input.nextInt(); 
		         if(player == 1|| player ==2) {
		            break;
		         }
		         else {
		             System.out.println("잘못된 입력입니다\n");
		          }
		          
		         
		      }
		         monsterHp=attackMonster(player,magicDamage,stabDamage,monsterHp); //메소드를 호출하고 monsterHp 반환값을 받음
		         
		         if (monsterHp <= 0) {       //몬스터체력이 0보다작거나 같으면 break
		                   break;
		               }

		         if (turns %5 ==0) {     //5 턴마다 몬스터 체력이 +2 증가
		            System.out.printf("5턴이므로 몬스터가 체력%d를 회복합니다\n",monsterHeal);
		            monsterHp +=monsterHeal;      //기존 몬스터체력 +2를 해줌
		         }
		         
		         
		         turns++;    //턴을 진행시킴
		      }
		      input.close(); 
		      
		      
		   }

		}