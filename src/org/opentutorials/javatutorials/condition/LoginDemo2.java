package org.opentutorials.javatutorials.condition;

public class LoginDemo2 {
    public static void main(String[] args) {
        String id = args[0];
        String password = args[0];
        if(id.equals("egoing")){
            if(password.equals("11111")){
                System.out.println("right");
            } else{
                System.out.println("wrong");
            }
        }else{
            System.out.println("wrong");
        }
    }
}
