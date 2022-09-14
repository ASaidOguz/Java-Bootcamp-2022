
public class firstJavaPro {

	public static void main(String[] args) {
	
		 System.out.println("Hello World");
		 int num1=7;
		 int num2=12;
		 
		 int total=num1+num2;
		 
		 System.out.println(total);
		 
		 double tremor=9.5;
		 char Letter='A';
		 String MyName="Ahmet";
		 
		 // We r making new brand cat with same expertise in cat class ..
		
		 Cat myCat= new Cat();
		 Cat yurCat=new Cat();
		
		 myCat.Age=2;
		 myCat.name="Karaman";
		 
		 yurCat.Age=2;
		 yurCat.name=MyName;
		 
         yurCat.luckyChar='P';
         yurCat.Owner=	"Ahmet";
         yurCat.OwnerAge=37;
		 myCat.meow(yurCat.Owner);
		 
		 Cat.DingDong();
		 burp();

	}
	
	private static void burp() {
		
		System.out.println("buuurrp");
	}

}
