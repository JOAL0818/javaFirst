/*1.Day13(기본출력)
  	3개의 수 입력/입력한 수 3개, 입력한 수들의 합 출력
  2.Day14-1)(출력,io패키지이용)
  	세개의 숫자입력/입력한수,입력한 수들의 합 출력
  3.Day14-2)(출력util패키지 이용)
   	학생이름,세과목 점수입력/입력한 이름,점수,합 출력
*/

//1.Day13(기본출력) : 3개의 수 입력/입력한 수 3개, 입력한 수들의 합 출력
/*import java.io.*;

public class SuInput {

 public static void main(String[] args) throws IOException {

    int a, b, c;
   
      System.out.print("a=?"); a = System.in.read()-48; System.in.read(); // 이건 숫자 한 자리만 받을 수 있는 방법
      System.in.read();
      
      System.out.print("b=?"); b = System.in.read()-48; System.in.read();
      System.in.read();
      
      System.out.print("c=?"); c = System.in.read()-48; System.in.read();
      System.in.read();
     

    System.out.print(name + "(이)가 입력한 수는" + a + "," + b + "," + c + "입니다.\n");
    System.out.print(name + "(이)가 입력한 수의 합은 = " + (a + b + c) + "입니다.");
 }

}*/

//2.Day14-1)(출력,io패키지이용) : 세개의 숫자입력/입력한수,입력한 수들의 합 출력
/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.io.*; // 위의 세 줄 대신 이 한 줄을 써도 됨.

public class SuInput {

 public static void main(String[] args) throws IOException {

    int a, b, c;
    String name;
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));


    System.out.println("세개의 숫자를 입력하세요.");
    a = Integer.parseInt(input.readLine()); //파싱의 방법을 알아두자. 
    b = Integer.parseInt(input.readLine());
    c = Integer.parseInt(input.readLine());
    

    System.out.print("입력한 수는" + a + "," + b + "," + c + "입니다.\n");
    System.out.print("입력한 수의 합은 = " + (a + b + c) + "입니다.");
 }

}*/


//3.Day14-2)(출력util패키지 이용) : 학생이름,세과목 점수입력/입력한 이름,점수,합 출력

import java.util.Scanner;
//다른 패키지이기 때문에 자바io가 아니라 다른 것을 씀.

public class SuInput {

   public static void main(String[] args){

      int a, b, c;
      String name;
      // BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

      Scanner sc = new Scanner(System.in);

      System.out.println("학생의 이름과 세 과목의 점수를 입력하세요.");
      // a = Integer.parseInt(input.readLine()); //파싱의 방법을 알아두자. : 패키지가 달라, 이상황에서는 이걸 쓸 수 없다.
     
      name = sc.next();
      a = sc.nextInt(); // next뒤에 Int가 있으면 파싱의 기능이 생긴다. 
     //a=Integer.parseInt(sc.next()); 도 가능. - 이건 next다음 int가 없기에 앞에 파싱을 하는것.
      b = sc.nextInt();
      c = sc.nextInt(); // 네트워크 프로그램이라면 이 방식을 쓰지 않는다.

 
      System.out.print(name + "학생이 입력한 점수는 " + a + ", " + b + ", " + c + " 입니다.\n");
      System.out.print(name + "학생이 입력한 점수의 합은 " + (a + b + c) + " 입니다.");
   }

}




