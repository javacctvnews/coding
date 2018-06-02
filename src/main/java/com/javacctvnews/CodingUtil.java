package com.javacctvnews;

import org.junit.Test;

/**
 * Author：javacctvnews@163.com
 * Create：2018/5/29 23:46
 * Desc：
 */

public class CodingUtil {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }


    @Test
    public void test01() throws Exception {
        int[] arr = {2, 3, 7, 4, 6, 6};
        int i1 = removeDuplicates(arr);
        System.out.println(i1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }


    public int removeDuplicates(int[] nums) {
        int len = 1;
        int temp = nums[0];
        for (int i = 1; i <= nums.length - 1; i++) {
            if (temp != nums[i]) {
                temp = nums[i];
                nums[temp - 1] = nums[i];
                len++;
            }
        }
        return len;
    }

    public String test001() {
        String str = "abcdefg";
        StringBuffer sb = new StringBuffer();
        sb.append(str);
        sb.reverse();
        return sb.toString();
    }

    public int[] test002() {
        int[] arr = {2, 3, 7, 4, 6, 6};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length - i; j++) {
                if (arr[i] + arr[j] == 9) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public static String parseByte2HexStr(byte buf[]) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < buf.length; i++) {
            String hex = Integer.toHexString(buf[i] & 0xFF);
            if (hex.length() == 1) {
                hex = '0' + hex;
            }
            sb.append(hex.toUpperCase());
        }
        return sb.toString();
    }


}
