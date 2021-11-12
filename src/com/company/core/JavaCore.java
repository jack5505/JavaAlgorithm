package com.company.core;

import java.util.Set;
import javax.swing.JButton;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class JavaCore {
    enum E{
        A,B
    }
    interface salom{

    }
    public static void main(String[] args) {
        // this only works for reference types which all inherit from Object
        Class c = "foo".getClass();
        System.out.println(c);
        Class tt = Test.A.getClass();
        System.out.println(tt);
        Class in = Show.class;
        System.out.println(in);
        Class annotation = See.class;
        System.out.println(annotation);
        // System.out.println(c);
        // Class console = System.console().getClass();
        System.out.println(Set.class);
        Class bool = boolean.class;
        System.out.println(bool);
        System.out.println(Double.TYPE);
        System.out.println(void.class);
        System.out.println(Void.TYPE);
        Class superName = JButton.class.getSuperclass();
        System.out.println(superName);
        Class<?> classes [] = JButton.class.getClasses();
        System.out.println("------------------");
        for (int i = 0; i < classes.length; i++) {
            System.out.println(classes[i].getName());
        }

    }
}
