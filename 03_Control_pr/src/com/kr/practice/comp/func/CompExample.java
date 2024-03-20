package com.kr.practice.comp.func;

import java.util.Scanner;

public class CompExample {

	Scanner sc = new Scanner(System.in);

	public void practice1() {

		System.out.print("정수 :");
		int num = sc.nextInt();

		if (num > 0) {
			for (int i = 1; i <= num; i++) {
				if (i % 2 == 0) {
					System.out.print("수");
				} else {
					System.out.print("박");
				}
			}

		} else {
			System.out.println("양수가 아닙니다");
		}
	}

	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 :");
		int num = sc.nextInt();
		if (num > 0) {
			for (int i = 1; i <= num; i++) {
				if (i % 2 == 1) {
					System.out.print("박");
				} else if (i % 2 == 0) {
					System.out.print("수");
				}

			}
			sc.close();

		} else {
			System.out.println("양수가 아닙니다");
		}
	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 :");
		String str = sc.nextLine();

		System.out.print("문자:");
		char str1 = sc.nextLine().charAt(0);
		int result = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == str1) {
				result++;
			} else {
				continue;
			}
			System.out.printf("%s안에 포함된 %s 개수 :", str, str1, result);
		}
	}

	public void practice4() {
		Scanner sc = new Scanner(System.in);

		System.out.print("문자열:");
		String str = sc.nextLine();
		System.out.print("문자:");
		char str1 = sc.nextLine().charAt(0);
		int result = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == str1) {
				result++;
			} else {
				continue;
			}
		}
		System.out.printf("%s 안에 포함된  %s 개수 : %d\n", str, str1, result);
		System.out.print("더 하시겠습니까? (y/n):");
		char yesOrNo = sc.nextLine().charAt(0);
		if (yesOrNo == 'y' || yesOrNo == 'y') {

		} else {
			System.out.println("잘못된 대답입니다. 다시 입력해주세요");
		}
	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);

		int random = (int) (Math.random() * 100 + 1);// 99

		int count = 1;
		System.out.println(random);

		while (true) {
			System.out.print("1~100 사이의 난수를 맞춰보세요 :");
			int num = sc.nextInt();// 70=>1~100

			if (num > 0 && num < 101) {
				if (random == num) {
					System.out.println("정답입니다 !!");
					System.out.printf("%d회만에 맞추셨습니다", count);
					break;

				} else if (random > num) {
					System.out.println("UP !");
					count++;
				} else {
					System.out.println("DOWN !");
					count++;
				}
			} else {
				System.out.println("1~100사이의 숫자를 입력해주세요");
			}
		}
	}

	public void practice6() {
		Scanner sc =  new Scanner(System.in);
		
		System.out.print("당신의 이름을 입력해주세요");
		String name = sc.nextLine();
		
		String cp= "";
		int win = 0;
		int defeat =0;
		int tie =0;
		
		while(true) {
			int random = (int)(Math.random() * 3);
			if(random == 0) {
				cp = "가위";
			} else if (random == 1) {
				cp = "바위";
			} else {
				cp ="보";
			}
			System.out.print("가위바위보 :");
			String user =sc.nextLine();
			if ((user.equals("가위")) || (user.equals("바위")) || (user.equals("보"))) {
				System.out.println("컴퓨터 : " + cp);
				System.out.println(name + " : " + user);
				if ((cp.equals("가위") && user.equals("바위")) || (cp.equals("바위") && user.equals("보"))
						|| (cp.equals("보") && user.equals("가위"))) {
					System.out.println("이겼습니다.");
					++win;
				} else if (cp.equals(user)) {
					System.out.println("비겼습니다.");
					++tie;
				} else {
					System.out.println("졌습니다.");
					++defeat;
				}
				continue;
			} else if (user.equals("exit")) {
				System.out.printf("%d전 %d승 %d무 %d패", win + tie + defeat, win, tie, defeat);
				break;

			} else {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
		}

	}
}
