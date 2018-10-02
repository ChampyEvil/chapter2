/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.guutong.chapter2;
import java.util.Scanner;

/**
 *
 * @author GuutonG
 */
public class GradeSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int point;
        System.out.print("input point : ");
        point = input.nextInt();
        int toSwitch;
        if(point > 100){
            toSwitch = 0;
        }else if(point >= 80){
            toSwitch = 1;
        }else if(point >= 70){
            toSwitch = 2;
        }else if(point >= 60){
            toSwitch = 3;
        }else if(point >= 50){
            toSwitch = 4;
        }else if(point >= 0){
            toSwitch = 5;
        }else{
            toSwitch = 99;
        }
        
        switch(toSwitch){
            case 1: {System.out.print("Your grade is A");} break;
            case 2: {System.out.print("Your grade is B");} break;
            case 3: {System.out.print("Your grade is C");} break;
            case 4: {System.out.print("Your grade is D");} break;
            case 5: {System.out.print("Your grade is F");} break;
            default: {System.out.print("Wrong Input");}
        }
    }
}
