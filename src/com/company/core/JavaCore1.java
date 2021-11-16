package com.company.core;

import javax.swing.JButton;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class JavaCore1 {
    /**
     * A class may be declared with one or more modifiers which affect its runtime behavior:
     *
     * Access modifiers: public, protected, and private
     * Modifier requiring override: abstract
     * Modifier restricting to one instance: static
     * Modifier prohibiting value modification: final
     * Modifier forcing strict floating point behavior: strictfp
     * Annotations
     *
     */

    /***
     * Not all modifiers are allowed on all classes,
     * for example an interface cannot be final and an enum cannot be abstract. java.lang.reflect.Modifier contains declarations for all possible modifiers.
     * It also contains methods which may be used to decode the set of modifiers returned by Class.getModifiers().
     */
    private static String test = "";
    public static void main(String[] args) {
        Class<?> items[] = JButton.class.getClasses();
        System.out.println(items.length);
        showUP(items);

    }
    static void  showUP(Class ... items){
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i]);
        }
    }
}
