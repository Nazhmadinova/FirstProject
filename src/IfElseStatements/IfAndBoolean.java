package IfElseStatements;

import java.util.Scanner;

public class IfAndBoolean {

        public static void main(String[] args) {
            //Given an String, n , perform the following conditional actions:
            //If  n contains "a" and length less than 5, print "A Perfect",
            //If n contains "b", "a" and length between 7 and 10 (both inclusive) print "B Perfect",
            // if not between range and not included "a" then print "Perfect",
            // if "a" included and not between the range, print empty (System.out.println("");
            //If none of them the print "Sorry"

            System.out.println("Please enter:");
            Scanner scanner = new Scanner(System.in);
            String n = scanner.next();

            if(n.contains("a") && n.length()<5){
                System.out.println("A Perfect");
            }else if(n.contains("b")){
                if (n.contains("a")){
                     if(n.length()>=7 && n.length()<=10){
                         System.out.println("B Perfect");
                    }else{
                         System.out.println("");
                     }
                }else if (!(n.contains("a")) && !(n.length()>=7 && n.length()<=10)){
                    System.out.println("Perfect");
                }
            }
            else{
                System.out.println("Sorry");
            }

        }
    }

