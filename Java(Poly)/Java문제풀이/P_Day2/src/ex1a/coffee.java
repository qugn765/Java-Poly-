package ex1a;

import java.util.Scanner;

public class coffee {

	public static void main(String[] args) {
		int coffee = 2000;
		double parttime = 10000 / 60.0;
		int coffeetime = 3;
		double rate = 0.66;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ŀ���� ������ �Է����ּ��� : ");
		
		int inputcoffee = scanner.nextInt();
		int bonus = (inputcoffee / 10);
		int input2coffee = inputcoffee - bonus;
		double money = (input2coffee * coffee * rate) - (parttime * 3 * inputcoffee);
		
		System.out.println("�� Ŀ��  ����  : " + inputcoffee + "��");
		System.out.println("�� ���ʽ�Ŀ��  : " + bonus + "��");
		System.out.println("�� ���  �ð�  : " + inputcoffee * 3 + "��");
		System.out.println("�� ����  �ݾ�  : " + input2coffee * coffee + "��");
		System.out.println("�� ��      ��  : " + (int)money + "��");
		
	}

}