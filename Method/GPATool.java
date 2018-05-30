/*
* 绩点计算
*/
import java.util.*;
public class GPATool{
	public static void show(){
		System.out.println("-------绩点计算-------");
	}
	
	public static void main(String[] args){
		test t = new test();
		test.show();
		
		while(true){
		
		Scanner in = new Scanner(System.in);
		
		float creditMedical = 3;
		float creditOOP = 2;
		float creditOOPTest = 2;
		float creditSQL = 4;
		float creditDigitCircuit = 3;
		float creditMath = 3;
		float creditEnglish = 4;
		float creditComputerOrgan = 4;
		
		System.out.print("医学概论成绩:" + " ");
		float M = in.nextFloat();
		System.out.print("面向对象成绩:" + " ");
		float OOP = in.nextFloat();
		System.out.print("面向对象实验成绩:" + " ");
		float OOPT = in.nextFloat();
		System.out.print("数据库成绩:" + " ");
		float SQL = in.nextFloat();
		System.out.print("数字电路成绩:" + " ");
		float DC = in.nextFloat();
		System.out.print("数学成绩:" + " ");
		float Math = in.nextFloat();
		System.out.print("英语成绩:" + " ");
		float Eng = in.nextFloat();
		System.out.print("计算机组成成绩:" + " ");
		float Com = in.nextFloat();
		
		float GpMed = ((float)M - (float)50) * (float)0.1;
		float GpOOP = ((float)OOP - (float)50) * (float)0.1;
		float GpOOPT = ((float)OOPT - (float)50) * (float)0.1;
		float GpSQL = ((float)SQL - (float)50) * (float)0.1;
		float GpDC = ((float)DC - (float)50) * (float)0.1;
		float GpMath = ((float)Math - (float)50) * (float)0.1;
		float GpEng = ((float)Eng - (float)50) * (float)0.1;
		float GpComputer = ((float)Com - (float)50) * (float)0.1;
		System.out.println("医学概论绩点" +  GpMed);
		
		float CgpMed = creditMedical * GpMed;
		float CgpOOP = creditOOP * GpOOP;
		float CgpOOPT = creditOOPTest * GpOOPT;
		float CgpSQL = creditSQL * GpSQL;
		float CgpDC = creditDigitCircuit * GpDC;
		float CgpMath = creditMath * GpMath;
		float CgpEng = creditEnglish * GpEng;
		float CgpComputer = creditComputerOrgan * GpComputer;
		System.out.println("医学概论学分绩点" +  CgpMed);
		
		float SumCgp = 1 + CgpMed + CgpOOP + CgpOOPT + CgpSQL + CgpDC + CgpMath + CgpEng + CgpComputer;
		System.out.println("学分绩点和" +  SumCgp);
		float SumC = 1 + creditMedical + creditOOP + creditOOPTest + creditSQL + creditDigitCircuit + creditMath + creditEnglish + creditComputerOrgan; 
		System.out.println("学分和" +  SumC);
		
		float Cgpa = SumCgp / SumC;
		System.out.println("平均绩点为：" + Cgpa);
		}
	}
}