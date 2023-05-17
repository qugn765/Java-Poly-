package JDBC04Grades;

import java.io.*;
import java.sql.*;

public class Insertgrades {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException{
		Class.forName("com.mysql.cj.jdbc.Driver");  // JDBC ����̹�
		Connection k05_conn = DriverManager.getConnection("jdbc:mysql://192.168.23.54:3306/kopo05", "root" , "1234"); 
		// JDBC����̹��� �̿��ؼ� user�� password�� �Է��� �����ͺ��̽��� ����
		Statement k05_stmt = k05_conn.createStatement(); // JDBC�� �Է��� ��ü�� ����

		String k05_name = ""; // �̸��� �������� ����
		String k05_QueryTxt = " "; // mysql�� ������� ��ɾ� ���庯��
		int k05_kor; // ��������
		int k05_eng; // ��������
		int k05_mat; // ��������
		int k05_Linecnt = 1; // Line�� ���� ���� ����
		for(int k05_i = 1; k05_i <= 1000; k05_i++) {
			k05_name = String.format("ȫ�浿%04d",k05_i); // ȫ�浿1, ȫ�浿2 .... 
			k05_kor = (int)(Math.random() *100); // ������ 0~100������ �����ϰ� �̾Ƴ�
			k05_eng = (int)(Math.random() *100); // ������ 0~100������ �����ϰ� �̾Ƴ�
			k05_mat = (int)(Math.random() *100); // ������ 0~100������ �����ϰ� �̾Ƴ�

			k05_QueryTxt = String.format("insert into grades(" + "studentid,"+ "name,"
					+ "kor," +"eng,"+ "mat)"
					+ "values(" +"'%s','%s','%s','%s','%s');",
					k05_i, k05_name, k05_kor, k05_eng, k05_mat);
			// mysql�� �Է��� ������ �ۼ��ϴ� ����
			// table�� ���¿� �°� table(fieldname1,..... ,fieldname10) valuse(value1,......value10)�̷����·�
			// data�� table�� insert into ��ɾ�� �����ϱ� ���� ��ɾ ����

			k05_stmt.execute(k05_QueryTxt); // mysql�� ��ɾ������ ����
			System.out.printf("%d��° �׸� Insert OK [%s]\n", k05_Linecnt, k05_QueryTxt);
			// ����ɶ����� ���° �׸��� ���������� ������ ������ ���
			k05_Linecnt++; // ������ �����Ҷ����� 1���߰�

		}	
		k05_stmt.close(); // ������ �߻������ʱ� ���� ��ü�ݱ�
		k05_conn.close(); // ������ �߻������ʱ� ���� ������� 
	}
}


