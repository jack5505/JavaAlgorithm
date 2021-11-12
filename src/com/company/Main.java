package com.company;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    static class Student {
        int age;
        String name;

        public Student(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override public String toString() {
            return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
        }
    }

    ;

    public static void main(String[] args) throws ParseException {
        List<Student> list = new ArrayList<>();
        list.add(new Student(12, "allo"));
        list.add(new Student(14, "abcx"));
        list.add(new Student(14, "abccd"));
        list.add(new Student(14, "abceqw"));
        list.add(new Student(17, "bcas"));
        list.add(new Student(9, "zxce"));
        Collections.sort(list, new Comparator<Student>() {
            @Override public int compare(Student o1, Student o2) {
                if (o1.age > o2.age) {
                    return -1;
                } else {
                    if (o1.age < o2.age) {
                        return 1;
                    }
                    return 0;
                }
                // return o1.age - o2.age also sort asecnding
            };
        });
        list.forEach(System.out::println);
    }
}
