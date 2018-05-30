package com.javacctvnews;

import org.junit.Test;

/**
 * Author：javacctvnews@163.com
 * Create：2018/5/29 23:46
 * Desc：
 */

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }

    @Test
    public void test001() {
        String str = "abcdefg";
        StringBuffer sb = new StringBuffer();
        sb.append(str);
        sb.reverse();
        String reverseStr = sb.toString();
        System.out.println(reverseStr);
    }
    
    @Test
    public void test002() {
    	int[] arr = {2,3,7,4,6,6};
    	for(int i=0;i<arr.length;i++){
    		for (int j = i+1; j < arr.length-i; j++) {
    			System.out.println(arr[i]+"-->"+arr[j]);
				if(arr[i]+arr[j]==9){
					System.out.println("["+i+" "+j+"]");
				}
			}
    	}
    	
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
