/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.longpt.mathutil;

/**
 *
 * @author Long Pham
 */
public class MathUtility {
    //Class này ch 1 nhóm hàm toán học, fake từ class chuẩn 
    //java.util.Math của JDK
    //vì là đồ xài chung cho nên sẽ là Static

    public static final double PI = 3.1415;

    //hàm tính n!
    //Vì giai thừa tăng rất nhanh, 21! tràn kiểu long
    //kiểu long chịu đc 10^18 18 con số 0. Lớn hơn nữa là thua
    //âm giai thừa ko tính đc 
    //hàm chỉ nhận từ 0..20! --> long
    //0! = 1! = 1;
//    public static long getFactorial(int n) {
//        if(n < 0 || n > 20)
//            throw new IllegalArgumentException("Invalid argument. "
//                    + "n must be between 0..20");
//        if(n == 0||n == 1)
//            return 1; //khỏi mất công tính, return ngay
//            //sống sót đến đoạn này n = 2..20
//        long result = 1;
//        for (int i = 2; i <= n; i++) {
//            result *= i;
//        }
//        return result;
//    }
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) 
            throw new IllegalArgumentException("Invalid argument. "
                    + "n must be between 0..20");
        
        if (n == 0 || n == 1)
            return 1; //khỏi mất công tính, return ngay
                  //sống sót đến đoạn này n = 2..20
        return n * getFactorial(n-1);
    }

}
