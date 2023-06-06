package ch01;
import java.util.Scanner;
public class array01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int playerMagicDamage = 3;
        int playerStabDamage = 1;
        int monsterMaxHp = 10;
        int monsterHp = monsterMaxHp;
        int monsterHealAmount = 2;
        
        int turns = 1;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("몬스터가 나타났습니다!");

        while (monsterHp > 0) {
            System.out.println("\n" + turns + "턴째입니다.");
            System.out.println("행동을 선택하세요.");
            System.out.println("1. 마법 공격 (공격력 " + playerMagicDamage + ")");
            System.out.println("2. 찌르기 공격 (공격력 " + playerStabDamage + ")");
            int playerAction = scanner.nextInt();
            
            if (playerAction == 1) {
                monsterHp -= playerMagicDamage;
                System.out.println("몬스터에게 " + playerMagicDamage + "의 데미지를 주었습니다.");
            } else if (playerAction == 2) {
                monsterHp -= playerStabDamage;
                System.out.println("몬스터에게 " + playerStabDamage + "의 데미지를 주었습니다.");
            } else {
                System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
                continue;
            }

            if (monsterHp <= 0) {
                System.out.println("몬스터를 물리쳤습니다! 게임을 종료합니다.");
                break;
            }
            
            if (turns % 5 == 0) {
                monsterHp += monsterHealAmount;
                System.out.println("몬스터가 " + monsterHealAmount + "의 체력을 회복합니다.");
            }
            
            System.out.println("현재 몬스터의 체력: " + monsterHp);
            
            
            turns++;
        }
    }
}
		
