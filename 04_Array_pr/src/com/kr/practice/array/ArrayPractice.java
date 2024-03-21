package com.kr.practice.array;

import java.util.Scanner;

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
	