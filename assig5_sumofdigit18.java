

import java.util.Scanner;

class assig5_sumofdigit18{

public static void main(String[]argu){

Scanner sc = new Scanner(System.in);

System.out.println("Enter The Num: ");
int a = sc.nextInt();

if(a>0){

if(a<500){
int b,c,d,sum,temp;

temp = a;

b = a%10;
a = a/10;

c = a%10;
a = a/10;


 sum = b+c+a;

System.out.println(" "+a+"+"+b+"+"+c+"= "+sum);



	}
else{
		System.out.println(a+ " Is greater than 500");
	}


	}

else{
	System.out.println("-ve num not allowed");
	}

}





}