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
    	String str = "abcdefg";
    	StringBuffer sb = new StringBuffer();
    	sb.append(str);
    	sb.reverse();
    	String reverseStr = sb.toString();
    	System.out.println(reverseStr);
    }
    
    
    


}
