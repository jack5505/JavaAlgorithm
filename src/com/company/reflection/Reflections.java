package com.company.reflection;

import com.company.generics.Person;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author Sabirov Jakhongir
 */
public class Reflections {
    public static void main(String[] args) throws NoSuchMethodException {
        Method method  = String.class.getMethod("replaceAll", String.class, String.class);
        try {
            Person person1 = Person.class.newInstance();
            System.out.println(person1.toString());
            Person person = Person.class.getConstructor(String.class).newInstance("jack");
            System.out.println(person.getName());
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
