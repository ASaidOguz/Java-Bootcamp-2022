
import java.util.Arrays;
import java.awt.Point;
import java.awt.Point.*;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		System.out.println("Hello Fuckin world");
		
		byte age=30;
		Date now= new Date();
		byte x=1;
		byte y=2;
		System.out.println(now);
         Point point1=new Point( 1,1);
         System.out.println(point1);
         
         Point point2=point1;
         
         point1.x=3;
         point1.y=5;
         
         System.out.println(point2);
         // Using backslash '\' to insert special characters inside string ,
         String message="Hi there \"Folks\"!!";
         // -1 value means it does'nt exist !!
         System.out.println(message.replace("!!","**"));
         //Strings are immutable,
         System.out.println(message);
         // How to write position of file in windows machine, use 2 backslahs to elimate the effect,  
         String File=	"c:\\windows\\...";
         System.out.println(File);
         
         //adding new line on string using "\n",
         String File2=	"c:\\\n windows\\...";
         System.out.println(File2);
         
         //Arrays are reference types ,
         int [] numbers=new int[5];
         numbers[0]=1;
         numbers[1]=2;
         numbers[2]=3;
         numbers[3]=4;
         numbers[4]=5;
         
         int [] shorthandNumbers= {9,2,8,6};
         Arrays.sort(shorthandNumbers);
         System.out.println(Arrays.toString(shorthandNumbers));
        
         
         System.out.println(numbers);
         System.out.println(Arrays.toString(numbers));
         
         int [][] dimen2array=new int[2][3];
         dimen2array[0][0]=1;
        
         System.out.println( Arrays.deepToString(dimen2array));
         
         int [][]shorthanddimen2Array= {{1,2,3},{3,4,5}};
         
         System.out.println(Arrays.deepToString(shorthanddimen2Array));
         
         //for constants we use "final" keyword 
         
         final float PI=3.14F;
         
         System.out.println(PI);
         
         
         // type casting in java ,
         
         double result=(double)10/(double)3;
         
         System.out.println(result);
         
         int x2=1;
         int y2=++x2;
        		 System.out.println(x2);
                 System.out.println(y2);
         
         /* prefix and suffix 2 different effects 
         x2++;
         ++x2;
         shown above */
                 
         // Compound operator,m=m+2 ;
            int m=+2;
                 
         //Implict data casting , it happens when we dont lose data ,
         //byte>short>int>long>float>double
            double p=3.11;
            double l=p+2;
            System.out.println(l);
         //explicit casting ,its forcing to lose data ,
            
          int u=(int)p+2; 
          System.out.println(u);
          
          
          
          //Math.round rounds a float to integer ,
          int NewNumber=Math.round(1.1F);
          System.out.println(NewNumber);
          
          //Math.ceil rounds to ceiling a float but bear in mind this method returns a double 
          //so we made type casting to int,
          NewNumber=(int)Math.ceil(1.1F);
          System.out.println(NewNumber);
          
          //Math.floor rounds a float to lower integer value ,
          Double NewNumber1=1.1D;
          NewNumber=(int)Math.floor(NewNumber1);
          System.out.println(NewNumber);
          
          //Math.max returns the greater number like compare and we can use min as well
          //to get the lowest number between numbers,
          
          int result1=Math.max(1, 2);
          System.out.println(result1);
          
          //Math.random generates random number ,
          
          int result2=(int)(Math.random()*100);
          System.out.println(result2);
          
          //Numberformat ,we cant create new object from it cause its abstract class ,
          //We sue factory methods instead of creating object with new we get the object 
          //from factory
          
          NumberFormat currency=NumberFormat.getCurrencyInstance();
          
          String munney=currency.format(1234567.8);
          System.out.println(munney);
          
          //We can make "method" chaining to create multiple chain of methods,
          
          String newResult=NumberFormat.getPercentInstance().format(0.01);
          System.out.println(newResult);
          
          //How to read input from user "scan" method, lets create scanner object,
          //Scanner take 1 token which means only 1 word where it seperated with space ,
          //If we need to entire line to be scanned we use nextLine() method .
          Scanner scanner =new Scanner(System.in);
          int Age= scanner.nextByte();
          
          System.out.println("You are "+Age);
          //Created another object and we can trim the white spaces in front and end ,
          Scanner scanner1=new Scanner(System.in);
          System.out.print("Your comment:");
          String Fullline=scanner1.nextLine().trim();
          
          System.out.println(Fullline);
          scanner.close();
          scanner1.close();
          
          
          
          
        
                 
                 
                 
         
         
         
         
         
	}

}
