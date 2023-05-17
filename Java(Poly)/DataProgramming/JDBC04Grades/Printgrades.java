package JDBC04Grades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Printgrades {

   public static void main(String[] args) throws ClassNotFoundException, SQLException {

      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.54:3306/kopo05", "root", "1234");
      Statement stmt = conn.createStatement();
      Statement stmt2 = conn.createStatement();
      Statement stmt3 = conn.createStatement();

      int k05_count = 1; // 페이지를 표시해줄 변수선언
      int k05_limitnumer1 = 0;  // limit 0,30 에 써줄 변수
      int k05_limitnumer2 = 30; // limit 0,30 에 써줄 변수
      float k05_totalcnt = 0;
      float k05_avg_total = 0;
      for (int i = 0; i < 1000 / 30 + 1; i++) {

         ResultSet rset = stmt.executeQuery(
               "SELECT name, kor, eng, mat, (kor+eng+mat),(kor+eng+mat)/3 from grades limit "
                     + k05_limitnumer1 + ",30;");
         System.out.println("======================================== page" 
                     + k05_count + " ============================================");
         System.out.println("이름\t\t국어\t\t영어\t\t수학\t\t총점\t\t평균");
         float k05_cnt = 0;
         float k05_avg_page = 0;
         while (rset.next()) {
        	 System.out.printf("%-10s\t%-10s\t%-10s\t%-10s\t%-10s\t%-10s\n",
           		  rset.getString(1),rset.getString(2),rset.getString(3),rset.getString(4),rset.getString(5),rset.getString(6));
        	 k05_avg_total += Double.parseDouble(rset.getString(6));
        	 k05_avg_page += Double.parseDouble(rset.getString(6));
        	 k05_cnt++;
        	 k05_totalcnt++;
         }
         System.out.println("============================================================================================");
         // 학생들의 성적을 받아와서 그것들을 출력해주는 반복문
         // limit 뒷부분을 30으로 고정해서 30개씩만 출력하게함
         
         ResultSet rset2 = stmt2.executeQuery(
                 "select sum(page.kor) ,sum(page.eng) ,sum(page.mat),sum(page.eng + page.kor + page.mat)"
                       + ",avg(page.eng + page.kor + page.mat)/3 from (select * from grades limit " + k05_limitnumer1
                        + ", 30) as page");

           while (rset2.next()) {
        	  System.out.println("현재페이지");
              System.out.printf("       총점     %-10s\t%-10s\t%-10s\t%-10s\t%-10s\n",
            		  rset2.getString(1),rset2.getString(2),rset2.getString(3),rset2.getString(4),k05_avg_page);
              System.out.printf("       평균     %-10s\t%-10s\t%-10s\t%-10s\t%-10s\n",
            		  rset2.getInt(1) / k05_cnt,rset2.getInt(2) / k05_cnt,rset2.getInt(3) / k05_cnt,rset2.getInt(4) / k05_cnt,rset2.getString(5));

           }
           // 현재 페이지의 학생들의 성적들을 sum을 통해서 구함
           // limit 뒷부분을 30으로 고정해서 30개씩만 계산하게 함
           
           
         ResultSet rset3 = stmt3.executeQuery(
               "select sum(total.kor) ,sum(total.eng) ,sum(total.mat),sum(total.eng + total.kor + total.mat)"
                     + ",avg(total.eng + total.kor + total.mat)/3 from (select * from grades limit 0,"
                     + k05_limitnumer2 + ") as total");

         while (rset3.next()) {
        	 System.out.println("누적페이지");
             System.out.printf("       총점     %-10s\t%-10s\t%-10s\t%-10s\t%-10s\n",
           		  rset3.getString(1),rset3.getString(2),rset3.getString(3),rset3.getString(4),k05_avg_total);
             System.out.printf("       평균     %-10s\t%-10s\t%-10s\t%-10s\t%-10s\n",
           		  rset3.getInt(1) / k05_totalcnt,rset3.getInt(2) / k05_totalcnt,rset3.getInt(3) / k05_totalcnt,rset3.getInt(4) / k05_totalcnt,rset3.getString(5));
         }
         // 누적 페이지의 학생들의 성적들을 sum을 통해서 구함
         // limit 앞부분을 0으로 고정해서 처음부터 현재페이지까지 계산하게함
         

         System.out.println("============================================================================================");
         k05_count++;
         k05_limitnumer1 += 30;
         k05_limitnumer2 += 30;
      }

      stmt.close();
      stmt2.close();
      conn.close();

   }
}