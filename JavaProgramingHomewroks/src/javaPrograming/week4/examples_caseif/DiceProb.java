package javaPrograming.week4.examples_caseif;

import java.util.*;

public class DiceProb{
	public static void main (String [] args){
		
		Random rn = new Random();
		
		int diceNum = rn.nextInt(6)+1;
		
		switch(diceNum){
		
        case 1: 
            System.out.println("��");
            break;
			
        case 2:
            System.out.println("��");
            break;
		
        case 3 :
            System.out.println("��");
            break;
			
        case 4 :
            System.out.println("��");
            break;
			
		case 5 :
            System.out.println("��");
            break;	
			
		case 6 :
            System.out.println("��");
            break;
    }
		
		
}
}