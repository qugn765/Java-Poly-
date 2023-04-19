/**
 * package Example03;
 * 
 * public class priceCalc {
 * 
 * public static void main(String[] args) { double k05_Price = 1234; // 초기 세전
 * double k05_consumerPrice = 0; double k05_beforePrice = 0; double k05_tax = 0;
 * k05_beforePrice = (k05_Price / 110 * 100); //올림 반올림 하지않은 세전가격 k05_tax =
 * k05_Price / 110 * 10; // 올림 반올림 하지않은 세금
 * 
 * k05_consumerPrice = k05_beforePrice + k05_tax; System.out.println("#1 소비자
 * 가격(세전가격+세금) : " + k05_consumerPrice); // 내림 반올림 올림 하지않은 소비자가격(세전가격 + 세금) 출력
 * 
 * k05_consumerPrice = (k05_beforePrice + (k05_beforePrice * 0.1));
 * System.out.println("#2 소비자가격(세전가격+(세전가격*세율) : " + k05_consumerPrice); // 내림
 * 반올림 올림 하지않은 소비자가격(세전가격 + 세전가격*세율) 출력
 * 
 * k05_consumerPrice = k05_beforePrice * (1+0.1); System.out.println("#3
 * 소비자가격(세전가격*(1+세율)) : " + k05_consumerPrice); // 내림 반올림 올림 하지않은
 * 소비자가격(세전가격*(1+세율)) 출력
 * 
 * k05_beforePrice = (k05_consumerPrice / (1+0.1)); System.out.println("#4
 * 세전가격(소비자가격/(1+세율)) : " + k05_beforePrice); // 내림 반올림 올림 하지않은
 * 세전가격(소비자가격/(1+세율)) 출력
 * 
 * k05_beforePrice = k05_consumerPrice / (1+0.1); System.out.println("#4-1
 * (int)세전가격(소비자가격/(1+세율)) : "+ (int)k05_beforePrice); // 정수형으로 세전가격 출력 뒤에 소수점은
 * 버림처리가 됨
 * 
 * k05_tax = k05_Price - k05_beforePrice; System.out.println("#5 세금(소비자가격 -
 * 세전가격) : " + k05_tax); // double형으로 세전가격 계산후에 소비자가격 - 세전가격으로 세금출력
 * 
 * k05_tax = (int)(k05_tax + 0.99999); System.out.println("#5-1 세금(소비자가격 - 세전가격)
 * : " + k05_tax); // 정수형으로 세전가격계산후에 소비자가격 - 세전가격으로 세금출력, 세전가격을 내림처리하였으므로 세금은
 * 올림처리되어있음 }
 * 
 * }
 * 
 * 
 */