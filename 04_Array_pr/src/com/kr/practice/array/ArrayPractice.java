package com.kr.practice.array;

import java.util.Arrays;
import java.util.Scanner;

import javax.lang.model.util.Elements.Origin;

public class ArrayPractice {
	public void practice1() {

		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print((arr[i] + ""));
		}

	}

	public void practice2() {

		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 10 - i;
			System.out.print(arr[i] + "");

		}

	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 :");
		int size = sc.nextInt();

		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print((arr[i] + " "));

		}
	}

	public void practice4() {

		String[] arr = { "사과", "귤", "포도", "복숭아", "참외" };
		System.out.println(arr[1]);

	}

	public void practice5() {

		Scanner sc = new Scanner(System.in);

		System.out.print("문자열 : ");
		String str = sc.nextLine();

		char[] arr = new char[str.length()];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
		}

		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);

		int count = 0;

		System.out.print(str + "에" + ch + " 가 존재하는 위치(인덱스) : ");

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ch) {
				System.out.print(i + " ");
				count++;
			}

		}

		System.out.println();
		System.out.println(ch + " 개수 : " + count);

	}

	public void practice6() {

		Scanner sc = new Scanner(System.in);
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();

		char[] week = { '월', '화', '수', '목', '금', '토', '일' };

		if (num >= 0 && num < 7) {
			System.out.println(week[num] + "요일");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}

	}

	public void practice7() {

		Scanner scanner = new Scanner(System.in);

		System.out.print("정수를 입력하세요: ");
		int n = scanner.nextInt();

		int[] arr = new int[n];
		int sum = 0;

		for (int i = 0; i < n; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값: ");
			arr[i] = scanner.nextInt();
			sum += arr[i];
		}

		System.out.print("배열의 값: ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println("\n총 합: " + sum);

	}

	public void practice8() {

		Scanner sc = new Scanner(System.in);
		int n;

		while (true) {
			System.out.print("정수: ");
			n = sc.nextInt();
			if (n % 2 == 1 && n >= 3) {
				break;
			} else {
				System.out.println("다시 입력하세요.");
			}
		}

		int[] arr = new int[n];
		for (int i = 0; i < n / 2; i++) {
			arr[i] = i + 1;
		}
		for (int i = n / 2; i < n; i++) {
			arr[i] = n / 2 + 1 - (i - n / 2);
		}

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public void practice9() {
		
		
		/*
		 * 사용자가 입력한 값이 배열에 있는지 검색하여
           있으면 “OOO 치킨 배달 가능“, 없으면 “OOO 치킨은 없는 메뉴입니다“를 출력하세요.
            단, 치킨 메뉴가 들어가있는 배열은 본인 스스로 정하세요.
		 * 
		 * 
		 * 
		 * 
		 */Scanner sc = new Scanner(System.in);
	      // 배열 생성 
	      String[] chickens = {"황금올리브","허니콤보","뿌링클"};
	      
	      //int count = 0;
	      boolean flag = false; // 현재 플래그라는 박스에 펄스가 있음 (치킨이 없는 것 )
	      
	      System.out.print("치킨 이름을 입력하세요 : " );
	      String chicken = sc.nextLine();
	      
	      for(int i=0; i<chickens.length; i++) {
	         if(chickens[i].equals(chicken)) {
	            //count++;
	            flag = true; //( 치킨이 있는 것 )
	         }

	      }
	      
	      if(flag == true) { //치킨이 있는경우  // if(count == 1) 로 풀수도 있음 
	         System.out.println(chicken +"치킨 배달 가능");
	      }else { // 치킨이 없는 경우 
	         System.out.println(chicken + "치킨 배달 불가");
	      }
	   }
		
	public void practice10() {
		/*
		 * 주민등록번호 성별자리 이후부터 *로 가리고 출력하세요. 단, 원본 배열 값은 변경 없이 배열 복사본으로 변경하세요.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호(-포함) : ");
		String str = sc.nextLine();

		char[] arr = new char[14];
		for (int i = 0; i < arr.length; i++) {

			if (i > 7) {
				arr[i] = '*';
			} else {
				arr[i] = str.charAt(i);
			}
			System.out.print(arr[i]);
		}

	}

	public void practice11() {
		int[] arr = new int[10];
	    for(int i = 0; i < arr.length; i++) {
	        int random = (int)(Math.random()* 10 +1);
	        arr[i] = random;
	    }
	    for(int i = 0; i < arr.length; i++) {
	        System.out.print(arr[i] + " ");
	    }
	}

	public void practice12() {
		 int[] arr = new int[10];

		    for(int i = 0; i < arr.length; i++) {
		        int random = (int)(Math.random() * 10 + 1);
		        arr[i] = random;
		    }
		    int max = arr[0];
		    int min = arr[0];

		    for(int i = 0; i < arr.length-1; i++) {
		        if(arr[i] >= max) {
		            max = arr[i]; 
		        }
		        if(arr[i] <= min) {
		            min = arr[i];
		        }
		    }
		    for(int i = 0; i < arr.length; i++) {
		        System.out.print(arr[i]+ " ");
		    }
		    System.out.println();
		    System.out.println("최대 값 : " + max);
		    System.out.println("최소 값 : " + min);
		}

	public void practice13() {
		
		int[] arr = new int[10];
	    for(int i = 0; i < arr.length; i++) {
	        arr[i] = (int)(Math.random()*10+1);
	        for(int j = 0; j < i; j++){
	            if(arr[i] == arr[j]) {
	                i--;	// 랜덤한수를 다시 만드는 코드
	            }
	        }
	    }
	    for(int i = 0; i < arr.length; i++) {
	        System.out.print(arr[i] + " ");
	    }
	}

	public void practice14() {

		int[] arr = new int[6];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 45 + 1);
			for (int j = 0; j < i; j++) {
				if (arr[j] == arr[i]) {
					i--;
					break;
				}
			}

		}
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");

	}

	public void practice15() {
		
		/*
		 * 문자열을 입력 받아 문자열에 어떤 문자가 들어갔는지 배열에 저장하고
          문자의 개수와 함께 출력하세요.
		 * 
		 * 
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 :");
		String Str = sc.nextLine();
		
		char[]arr = new char[Str.length()];
		int count =0;
		for(int i=0; i<arr.length; i++) {
			arr[i]=Str.charAt(i);
			
			boolean flag =true;
			
			for(int j=0; j<i; j++) {
				if(arr[i]== arr[j]) {
					flag = false;
				}
			}
			if(flag) {
				if(i==0) {
					System.out.print(arr[i]);
				}else {	
				System.out.print( ","+ arr[i]);
				
			}
			count++;
			}
		}
		System.out.println("\n문자개수:"+ count);
	}
		
	
				
		
		

	

	public void practice16() {

		Scanner sc = new Scanner(System.in);

		System.out.print("배열의 크기를 입력하세요 : ");
		int num = sc.nextInt();

		sc.nextLine();

		String[] origin = new String[num];

		// 배열 복사
		String[] copy = origin;

		for (int i = 0; i < origin.length; i++) {
			System.out.printf("%d번째 문자열 : ", i + 1);
			origin[i] = sc.nextLine();
		}

		while (true) {
			System.out.print("더 값을 입력하시겠습니까? (Y/N)");
			char ch = sc.nextLine().charAt(0);

			if (ch == 'y' || ch == 'Y') { // 더입력하고 싶은 경우

				System.out.print("더 입력하고싶은 개수 : ");
				num = sc.nextInt();

				sc.nextLine();

				copy = Arrays.copyOf(origin, origin.length + num);

				for (int i = origin.length; i < copy.length; i++) {
					System.out.printf("%d번째 문자열", i + 1);
					copy[i] = sc.nextLine();
				}

				// 젤 중요!!
				origin = copy;

			} else if (ch == 'n' || ch == 'N') { // 끝내고 싶은 경우

				// 이따 출력
				System.out.print("[");
				for (int i = 0; i < copy.length; i++) {
					if (i == copy.length - 1) {
						System.out.printf("%s", copy[i]);
					} else {
						System.out.printf("%s, ", copy[i]);
					}
				}
				System.out.print("]");
				break;

			} else { // 잘못입력한 경우
				System.out.println("잘못입력하셨습니다. 다시 입력하세요");
			}
		}

	}
}
    