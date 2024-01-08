package leolyoo;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		String[] forms = new String[] { "가위", "바위", "보" }; // 0:가위, 1:바위, 2:보
		String input = "";
		Random random = new Random();
		try (Scanner scanner = new Scanner(System.in)) {
			while (!input.equals("나가기")) {
				System.out.println("--------------------");
				System.out.print("가위, 바위, 보, 나가기 중 하나를 입력: ");
				input = scanner.next();

				if (input.equals("나가기")) {
					break;
				} else if (input.equals(forms[0])) { // 가위
					int computer = random.nextInt(3);
					System.out.println("컴퓨터: " + forms[computer]);
					if (computer == 0) { // 가위
						System.out.println("[무승부]");
					} else if (computer == 1) { // 바위
						System.out.println("[패배]");
					} else if (computer == 2) { // 보
						System.out.println("[승리]");
					}
				} else if (input.equals(forms[1])) { // 바위
					int computer = random.nextInt(3);
					System.out.println("컴퓨터: " + forms[computer]);
					if (computer == 0) { // 가위
						System.out.println("[승리]");
					} else if (computer == 1) { // 바위
						System.out.println("[무승부]");
					} else if (computer == 2) { // 보
						System.out.println("[패배]");
					}
				} else if (input.equals(forms[2])) { // 보
					int computer = random.nextInt(3);
					System.out.println("컴퓨터: " + forms[computer]);
					if (computer == 0) { // 가위
						System.out.println("[패배]");
					} else if (computer == 1) { // 바위
						System.out.println("[승리]");
					} else if (computer == 2) { // 보
						System.out.println("[무승부]");
					}
				} else {
					System.out.println("잘못된 입력입니다.");
				}
			}
		} catch (Exception e) {
			System.out.println("오류: " + e.toString());
		}
		System.out.println("프로그램을 종료합니다.");
	}
}