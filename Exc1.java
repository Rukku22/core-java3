package project4;

import java.util.Scanner;

public class Exc1 {

	public static void main(String[] args) throws CustomException {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter id to find");
		int id=scn.nextInt();
		Pojo p1=new Pojo("ruk",67);
		Pojo p2=new Pojo("mus",78);
		Pojo p3=new Pojo("hus",89);
		if(id==p1.id||id==p2.id||id==p3.id) {
			System.out.println("welcome to office");
		}
		else {
			throw new CustomException("given employee id is invalid,please enter valid id");
		}
		
		

	}

}
