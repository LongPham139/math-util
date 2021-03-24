/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.longpt.mathutil.test;

import static com.longpt.mathutil.MathUtility.*;//t muốn các hàm biến
import java.sql.SQLException;
                                       //trong class này gõ trực tiếp luôn 
                                       //ko cần class chấm 
                                       //chỉ static mới làm đc điều này
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Long Pham
 */
public class MathUtilityTest {
    
    @Test
    public void testFactorialGivenRightArgumentResultGoodResult(){
        int n = 5;          //tui muốn test 5! có đúng là 
        long expected = 120;//120 hay ko

        long actual = getFactorial(n);
        assertEquals(expected, actual);
        
        //mình test tiếp các TH khác 
        //Đúng đầu vào, đúng đầu ra 
        //khỏi cần biến trung gian 
        assertEquals(720, getFactorial(6));
        assertEquals(24, getFactorial(4));
        assertEquals(6, getFactorial(3));
        assertEquals(1, getFactorial(1));
        assertEquals(1, getFactorial(0)); 
    }
    
    //điều gì xảy ra nếu ta đưa vào tham số cà chớn, âm hoặc lớn hơn 20
    //theo thiết kế của hàm đưa vào cà chớn sẽ ném ra ngoại lệ 
    //và ta cần TEST XEM, NGOẠI LỆ CÓ ĐC NÉM RA KO NẾU TA CÀ CHỚN 
    //TỨC LÀ THẤY XUẤT HIỆN NGOẠI LỆ NẾU CÓ CÀ CHỚN ĐƯA VÀO -> HÀM ĐÚNG 
    //THẤY NGOAI LỆ KHI CÓ CÀ CHỚN MÌNH LẠI MỪNG VÌ HÀM ĐÃ CHẠY KO ĐÚNG 
    
    @Test(expected = IllegalArgumentException.class)
    //có đúng là khi chạy hàm này thì ném ra ngoại lệ tên là IllegalArgu....
    //nếu đúng nó ném ra ngoại lệ cùng tên, code đúng rồi, Xanh thoy
    public void testFactorialWrongArgumentThrowsException(){
        //mình test tình huống hàm phải ném ra ngoại lệ nếu tham số cà chớn 
        //ngoại lệ là ko phải là value để so sánh, ko dùng assertEquals()
        //ta phải dùng chiêu khác. JUnit 4 khác JUnit 5 ở chỗ bắt ngoại lệ 
        //Kì 5 đi dự thính môn SWT301 của tui: DI, Lambda Expression liên quan
        //JUnit 5                       Dependency Injection/ SOLID
        getFactorial(-5);
        getFactorial(21);
        getFactorial(40);
        
        
    }
}
