package javaPrograming.weekE_1;

import java.io.*;
import java.util.*;

class CircleTest{
	public static void main (String [] args)throws Exception{
		if(args.length<1){
			System.out.println("[Usage] java CircleTest 결과가 저장될 파일 명");
			System.exit(1);
		}else{
			

			File f1 = new File("원의 반지름과 넓이.java");
			File f2 = new File(args[0]);
			
			if(f1.exists()==false){
				System.out.printf("\"%s\" 파일이 존재하지 않습니다. 확인해주세요. \n", f1.getName());
				System.exit(2);
			}
			if(f2.exists()==true){
				System.out.printf("\"%s\" 파일이 이미 존재합니다. 새로운 파일명을 입력해주세요. \n", f2.getName());
				System.exit(2);
			}
			
			PrintWriter pw = new PrintWriter(f2);
			Scanner sc = new Scanner(f1);
			int r;
			double area, result;
			int i =0;
			
			while(sc.hasNext()==true){
			i++;
			r = Integer.parseInt(sc.next().substring(4));
			area = Double.parseDouble(sc.next().substring(3));
			result = r*r*3.14;
			if(result==area){
				pw.println(String.format("%d번째 원의 넓이는 제대로 구해졌습니다: 반지름(%d), 넓이(%.2f)", i, r, area));
			}else{
				pw.println(String.format("%d번째 원의 넓이는 잘 못 구했습니다: 반지름이 %d일 경우, 넓이는 %.2f가 아니라 %.2f입니다.", i, r, area, result));
			}
			
			}
			System.out.printf("결과파일(%s) 생성완료. 확인바랍니다. \n", f2.getName());//f1.getName()해도 무방
		
		sc.close();
		pw.close();
		}
	}
}