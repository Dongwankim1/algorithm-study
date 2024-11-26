package org.example;

import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

public class Main2 {
    public static class Node{
        public int x;
        public int y;
        public int count;

        Node(int x,int y,int count){
            this.x = x;
            this.y = y;
            this.count = count;
        }
    }
    public static int answer = Integer.MAX_VALUE;
    public static void main(String[] args) throws Exception {

       User user = new User();
       user.setId("2");
       user.setUserName("2");

        User user2 = new User();
        user2.setId("2");
        user2.setUserName("4");

        System.out.println(user.equals(user2));
        System.out.println(diff(user,user2,User.class));
    }


    public static boolean diff(User target1, User target2, Class<User> targetClass) {
        try {
            for (PropertyDescriptor pd : Introspector.getBeanInfo(targetClass, Object.class).getPropertyDescriptors()) {
                Object value1 = pd.getReadMethod().invoke(target1);
                Object value2 = pd.getReadMethod().invoke(target2);

                boolean isNotEqualValue = (value1 == value2) || (value1 != null && value1.equals(value2));
                if (!isNotEqualValue) {
                  return false;
                }
            }
        } catch (IntrospectionException | InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        return true;
    }
}


/**
 *  while((line = bf.readLine())!=null){
 *             String[] k = line.split(" ");
 *             Integer A = Integer.parseInt(k);
 *             Integer B = Integer.parseInt(k);
 *             System.out.println(A+B);
 *         }
 *
 */