/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postclient;

import java.util.Scanner;

/**
 *
 * @author Евгений
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
        String operation = sc.nextLine();
        System.out.println(calc(operation));
        }
    }
    public static String calc(String operation){
        if(!operation.matches("\\d0?(\\+|-|\\*|/)\\d0?")){
        throw new NumberFormatException();
    }
        String[] st = operation.split("(\\+|-|\\*|/)");
        String first = st[0];
        String second = st[1];
        
        
        
        int firstNumber = Integer.parseInt(first);
        int secondNumber = Integer.parseInt(second);
        
        if(firstNumber > 10 || firstNumber < 1 || secondNumber > 10 || secondNumber < 1){
            throw new NumberFormatException();
        }
        if(operation.contains("+")){
            return "" + (firstNumber + secondNumber);
        } else if(operation.contains("-")){
            return "" + (firstNumber - secondNumber);
        }else if(operation.contains("*")){
            return "" + (firstNumber * secondNumber);
        }else {
            return "" + (firstNumber / secondNumber);
        }
        
        
    }
}
