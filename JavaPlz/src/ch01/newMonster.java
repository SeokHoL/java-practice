package ch01;
import java.util.Scanner;
public class newMonster {

	public static void main(String[] args) {
        int magicDamage = 3;
        int stabDamage = 1;
        int monsterHp = 10;
        int monsterHeal = 2;
        int turns = 1;

        System.out.println("몬스터 출현!");

        Scanner scanner = new Scanner(System.in);
        while (monsterHp > 0) {
            displayTurnInfo(turns, magicDamage, stabDamage);
            int playerChoice = getPlayerChoice(scanner);
            monsterHp = attackMonster(monsterHp, playerChoice, magicDamage, stabDamage);
            displayMonsterHp(monsterHp);

            if (isMonsterDead(monsterHp)) {
                System.out.println("몬스터를 물리쳤습니다.");
                break;
            } else if (isMonsterHealTurn(turns)) {
                monsterHp += monsterHeal;
                System.out.printf("5턴이므로 몬스터가 체력 %d를 회복합니다.\n", monsterHeal);
            }

            turns++;
        }

        scanner.close();
    }

    private static void displayTurnInfo(int turns, int magicDamage, int stabDamage) {
        System.out.printf("%d번째 턴\n", turns);
        System.out.printf("1.마법공격 (공격력:%d)\n", magicDamage);
        System.out.printf("2.찌르기공격 (공격력:%d)\n", stabDamage);
    }

    private static int getPlayerChoice(Scanner scanner) {
        int playerChoice;
        do {
            System.out.print("선택하세요: ");
            playerChoice = scanner.nextInt();
            if (playerChoice != 1 && playerChoice != 2) {
                System.out.println("잘못된 입력입니다.");
            }
        } while (playerChoice != 1 && playerChoice != 2);
        return playerChoice;
    }

    private static int attackMonster(int monsterHp, int playerChoice, int magicDamage, int stabDamage) {
        int damage = playerChoice == 1 ? magicDamage : stabDamage;
        monsterHp -= damage;
        System.out.printf("몬스터에게 %d의 데미지를 주었습니다.\n", damage);
        return monsterHp;
    }

    private static void displayMonsterHp(int monsterHp) {
        System.out.printf("현재 몬스터의 체력: %d\n", monsterHp);
    }

    private static boolean isMonsterDead(int monsterHp) {
        return monsterHp <= 0;
    }

    private static boolean isMonsterHealTurn(int turns) {
        return turns % 5 == 0;
    }


	}


