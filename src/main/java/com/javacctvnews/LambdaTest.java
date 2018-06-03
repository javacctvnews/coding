package com.javacctvnews;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Author：javacctvnews@163.com
 * Create：2018/6/3 16:30
 * Desc：
 */

public class LambdaTest {

    @Test
    public void test001(){

        Person p1 = new Person("张三",90);
        Person p2 = new Person("李四",70);
        Person p3 = new Person("王五",80);

        Person[] persons = {p1, p2, p3};
        Arrays.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Integer.compare(o1.score,o2.score);
            }
        });
        System.out.println(Arrays.toString(persons));
    }

    @Test
    public void test002() {

        Person p1 = new Person("张三", 90);
        Person p2 = new Person("李四", 70);
        Person p3 = new Person("王五", 80);

        Person[] persons = {p1, p2, p3};
        Arrays.sort(persons, (o1, o2) -> {
            return Integer.compare(o1.score, o2.score);
        });
        System.out.println("lambda:" + Arrays.toString(persons));
    }

    class Person{
        private String name;
        private int score;

        public Person() {
        }

        public Person(String name, int score) {
            this.name = name;
            this.score = score;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", score=" + score +
                    '}';
        }
    }

}
