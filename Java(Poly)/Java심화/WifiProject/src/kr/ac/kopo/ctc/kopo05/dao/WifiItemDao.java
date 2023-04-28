package kr.ac.kopo.ctc.kopo05.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import kr.ac.kopo.ctc.kopo05.domain.WifiItem;

public class WifiItemDao {

	public WifiItem create(WifiItem wifiItem) {

		return null;
	}

	public WifiItem selectOne(int id) {

		return null;
	}

	public List<WifiItem> selectAll() throws IOException {
		List<WifiItem> wifiItemArr = new ArrayList<>();
		File k05_f = new File("C:\\Users\\KBH\\Input\\PublicWifi.txt");
		BufferedReader k05_br = new BufferedReader(new FileReader(k05_f));
		// �������������������.csv ������ k05_f��� ��ü����

		String k05_readtxt; // �����͸� ����ϱ����� ������ ���� ����

		k05_readtxt = k05_br.readLine();
		String[] k05_field_name = k05_readtxt.split("\t"); // ù��° ���� ,������ ������ fieldname�� ����

		int k05_LineCnt = 1;
		while ((k05_readtxt = k05_br.readLine()) != null) {
			WifiItem wifiItem = new WifiItem();
			String[] k05_field = k05_readtxt.split("\t"); // �ι�°�������� ������ ���پ� �迭������
			System.out.printf("**[%d��° �׸�]****************************\n", k05_LineCnt);
			System.out.printf("%s : %s\n", k05_field_name[9], k05_field[9]); // 9��° ���� �ּ����
			System.out.printf("%s : %s\n", k05_field_name[13], k05_field[13]); // 13��° ���� �������
			System.out.printf("%s : %s\n", k05_field_name[14], k05_field[14]); // 14��° ���� �浵���

			wifiItem.setId(Integer.parseInt(k05_field[0]));
			wifiItem.setInstallation_Location_Name(k05_field[1]);
			wifiItem.setInstallation_Location_Details(k05_field[2]);
			wifiItem.setInstallation_City_Name(k05_field[3]);
			wifiItem.setInstallation_District_Name(k05_field[4]);
			wifiItem.setInstallation_Facility_Type(k05_field[5]);
			wifiItem.setService_Provider_Name(k05_field[6]);
			wifiItem.setWifi_Ssid(k05_field[7]);
			wifiItem.setDate_Of_Installation(k05_field[8]);
			wifiItem.setRoad_Name_Address(k05_field[9]);
			wifiItem.setLot_number_Address(k05_field[10]);
			wifiItem.setManagement_Agency_Name(k05_field[11]);
			wifiItem.setManagement_Agency_Phone_Number(k05_field[12]);
			wifiItem.setLatitude(Double.parseDouble(k05_field[13]));
			wifiItem.setLongitude(Double.parseDouble(k05_field[14]));
			wifiItem.setCreated(k05_field[15]);
			wifiItemArr.add(wifiItem);
			k05_LineCnt++;
		}

		return wifiItemArr;
	}

	public WifiItem update(int id, WifiItem wifiItem) {

		return null;
	}

	public WifiItem delete(int id) {

		return null;
	}

	/*
	 * public String[] field_Name() throws IOException { File k05_f = new
	 * File("C:\\Users\\KBH\\Input\\PublicWifi.txt"); BufferedReader k05_br = new
	 * BufferedReader(new FileReader(k05_f)); // �������������������.csv ������ k05_f��� ��ü����
	 * 
	 * String k05_readtxt; // �����͸� ����ϱ����� ������ ���� ����
	 * 
	 * k05_readtxt = k05_br.readLine(); String[] k05_field_name =
	 * k05_readtxt.split("\t"); // ù��° ���� ,������ ������ fieldname�� ����
	 * 
	 * return k05_field_name; }
	 */
}
