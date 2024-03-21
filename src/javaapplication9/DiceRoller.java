/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

/**
 *
 * @author hp
 */
import java.util.*;
public class DiceRoller{
//String name;
//int hight;
//int weight;
//    
//    student( String name,int hight,int wight){
////        this key word is used to represent class name
//        this.name=name;
//        this.hight=hight;
//        this.weight =weight;
//    }
//    void cat(){
//    System.out.println(this.name+ " is eating");}
//    
     Random random;
        int number =0;
    DiceRoller(){
         Random random = new Random();
        
        roll( random,number);
        
    }
    void roll( Random random, int number){
       number = random.nextInt()+1;
       System.out.println(number);
        
        
    }

public string generateRandomNumber(){
/***
write code here
**/

}
}
