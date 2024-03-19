package Problem67AddBinary;

import java.util.ArrayList;
import java.util.List;

class Solution {
//    public String addBinary(String aStr, String bStr) {
//        List<String> sumStr = new ArrayList<>();
//        int carry = 0;
//        int i = aStr.length() - 1;
//        int j = bStr.length() - 1;
//        while (i >= 0 || j >= 0) {
//            int sum = 0;
//            int a = i < 0 ? 0 : Integer.parseInt(aStr[i]);
//            int b = j < 0 ? 0 : Integer.parseInt(bStr[i]);
//
//            if (a == 0 && b == 0) {
//                sum = carry;
//                carry = 0;
//            } else if (a == 0 || b == 0) {
//                if (carry) {
//                    sum = 0;
//                    carry = 1;
//                } else {
//                    sum = 1;
//                }
//            } else {
//                sum = carry;
//                carry = 1;
//            }
//            sumStr.add(sum);
//            i--;
//            j--;
//        }
//        if (carry) {
//            sumStr.add(carry);
//        }
//
//        char[] sumStr2 = new char[sumStr.length];
//
//        for (int k = 0; k < sumStr.length; k++) {
//            sumStr2[sumStr.length - k - 1] = sumStr.get(k);
//        }
//        return new String(sumStr2);
//    }
//
//    public static void main(String[] args) {
//        new Solution().addBinary("11", "1");
//    }
}
