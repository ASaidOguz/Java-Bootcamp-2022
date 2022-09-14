import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int x=1;
		int y=1;
		System.out.println(x==y);
		
		int temprature =27;
		boolean isWarm=temprature>20 &&temprature<30;
		System.out.println("Is it warm ? "+isWarm);
        Scanner scanner=new Scanner(System.in);
		System.out.print("What's your income : ");
        int Income=scanner.nextInt();
		scanner.close();
		boolean hashighIncome=inCome(Income);
		
		boolean hasGoodCredit=true;
		boolean hasCriminalRecord=false;
		boolean isEligible=(hasGoodCredit||hashighIncome)&& !hasCriminalRecord;
		
		System.out.println("He is "+isEligible);
		System.out.println("He has high income ? "+hashighIncome);
		
		String Name=Income>120_000 ? "Rich fuck":"Poor fella";
		
		System.out.println("He is a "+Name);
		
		FizzBuzz(Income);
		
		
		
		
		
	}
	public static boolean inCome(int i) {
		
		int income=120_000;
		if (i>income)
			return true;
		return false;
		
		
		
	}
	public static void FizzBuzz(int num) {
		int fizz=3;
		int buzz=5;
		if (num%fizz==0) {
			if(num%buzz==0)
				{System.out.println("FizzBuzz");}
			else{System.out.println("Fizz");}
		}else if (num%buzz==0)
		{System.out.println("Buzz");}else {
		System.out.println(num);}
		
		
	}
}



