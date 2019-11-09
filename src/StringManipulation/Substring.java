package StringManipulation;

import java.util.Scanner;
//Given a string, we'll say that the front is the first 3 chars of the string.
// If the string length is less than 3,
// the front is whatever is there. Return a new string which is 3 copies of the front.

public class Substring {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        String str =i.nextLine();
        String front;

            if (str.length() >= 3) {
                front = str.substring(0, 3);
            } else {
                front = str;
            }

            System.out.println(front + front + front);
        }

    }
// * Given a non-empty string and an int n, return a new string where the char at index n has been removed.
//public String missingChar(String str, int n) {
//  String front = str.substring(0,n);
//  String end =str.substring(n+1); // Start this substring at n+1 to omit the char
//  return front+end;
//}

//* Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start.
// The string length will be at least 2.
// public String right2(String str) {
//  if (str.length()<=2) return str;
//  String right2 =str.substring(str.length()-2);
//  String left =str.substring(0,str.length()-2);
//  return right2+left;
//}

//Given a string, return a version without both the first and last char of the string.
// The string may be any length, including 0.
//withoutEnd2("Hello") → "ell"
//withoutEnd2("abc") → "b"
//withoutEnd2("ab") → ""
//withoutEnd2("a") → ""
//withoutEnd2("") → ""
//withoutEnd2("coldy") → "old"
//withoutEnd2("java code") → "ava cod"
//
// public String withouEnd2(String str) {
//  if (str.length()==0){
//    return str;
//  }else if(str.length()==1){
//    return str.substring(0,0);
//  }
//  else{
//  return  str.substring(1, (str.length()-1));
//  }
//}