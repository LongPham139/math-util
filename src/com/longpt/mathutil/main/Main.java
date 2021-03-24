/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.longpt.mathutil.main;

import com.longpt.mathutil.MathUtility;
import java.util.Scanner;

/**
 *
 * @author Long Pham
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        System.out.println("Hello GitHub!!!!");
//        System.out.println("This is 1st!!");
//        Scanner sc = new Scanner(System.in);
//        MathUtility mu = new MathUtility();
//        System.out.println("Input number you want to factorial: ");
//        int number = Integer.parseInt(sc.nextLine());
//        Long resullt = mu.getFactorial(number);
//        System.out.println(resullt);
//        tui muốn test 5! có phải 120 không 
        int n = 5;
        long expected = 120;//hy vong 120 trả về
        long actual = MathUtility.getFactorial(n);//thực tế hàm chạy là mấy vậy???
        //mình so sánh để biết đúng và sai???
        System.out.println("5! expected: " + expected
                            + "; actual: " + actual);
        
        //tui muốn test 0! có phải bằng 1 
        n = 0;
        expected = 1;
        actual = MathUtility.getFactorial(n);
        System.out.println("0! expected: " + expected
                            + "; actual: " + actual);
    }

}
//VIẾT XONG CODE THÌ PHẢI TEST THUIIII- NGUYÊN TẮC PHẢI THEO 
//TEST NGAY TỪNG HÀM TỪNG CLASS TRC KHI RAP CHÚNG VỚI CÁC CLASS KHÁC
//TEST NGAY khi xong hàm, xong class 
//đc gọi là test mức độ 1. mức unit Test(test mức đơn vị code)
//Làm sao để test. Có nhiều cách 
//1. Cách 1: sout(gọi hàm()) để in ra kết quả xử lý của hàm (OOP)
//2. Cách 2: JOptionPane cho Desk App
//3. Cách 3: Ghi ra LOG file, ra 1 trang web (JW)
//3 cách này thì đều phải dùng mắt để xem kết quả, và tự kết luận đúng sai
//đúng: tức là hàm chạy ra 1 giá trị - ACTUAL VALUE
//                      và ta thấy ACTUAL VALUE khớp, bằng với cái giá 
//trị mà ta mong đợi, ta tính trc = tay, gọi là EXPECTED VALUE
//ví dụ 5! thì ta hy vọng expected hàm trả về 120
//      nhưng khốn nạn thay, hàm trả về đúng 120-actual
//hàm chạy đúng cho 5!

//*sai: tui test 6!, expected = 720, khốn nạn 
//CÁCH 4: MÁY ƠI SO SÁNH GIÙM VÀ KẾT LUẬN GIÙM TAO LUÔN VÌ MÀY 
//CÓ CÁC PHÉP TOÁN SO SÁNH MÀ 
//CON NGƯỜI KO CẦN NHÌN TỪNG DÒNG KẾT QUẢ TRẢ VỀ ĐỂ LUẬN ĐÚNG SAI
//MÁY SẼ LO CHO 
//NẾU TẤT CẢ TÌNH HUỐNG CHẠY HÀM ĐỀU ĐÚNG --> HÀM ĐÚNG --> MÀU XANH
//HẦU HẾT TÌNH HUỐNG CHẠY HÀM ĐỀU ĐÚNG, CÓ 1 CÁI SAI -> HÀM SAI 
//                                                   -> MÀU ĐỎ
//ĐỎ CHỈ CẦN 1 THG SAI 
//XANH: TẤT CẢ PHẢI ĐỀU ĐÚNG 

//MUỐN LÀM ĐC ĐIỀU NÀY TA CẦN THƯ VIỆN PHỤ TRỢ GIÚP CHO JAVA XANH ĐỎ 
//ĐIỀU NÀY CŨNG CÓ BÊN C# PHP, JS, RUBY...
//JAVA: JUnit, TestNG
//C# : NUnit, xUnit, MSTest
//PHP : PHPUnit
//...
