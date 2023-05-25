import java.util.*;
public class Scientific_Calculator {
	static Scanner in=new Scanner(System.in);

	public static void main(String[] args) {char ch='y';
	System.out.println("-------------------------------------------Scientific Calculator----------------------------------------------");
		Scientific_Calculator ob=new Scientific_Calculator();
		while(ch=='y'||ch=='Y') {
			System.out.println("Press 1 for addition\nPress 2 for subtraction\nPress 3 for multiplication\nPress 4 to find quotient\nPress 5 to find remainder\nPress 6 to find the X^power of a number\nPress 7 to find the square root of a number\nPress 8 to find 1/x of a number\nPress 9 to find natural log of a number\nPress 10 to find log base 10 of a number\nPress 11 to find e^x of a number\nPress 12 to convert degree to radian\nPress 13 to find sine of an angle\nPress 14 to find cosine of an angle\nPress 15 to find tangent of an angle\nPress 16 to find absolute of a number\n\nEnter your choice-----------------------------------------------------------------------------------------------------------");
			int choice=in.nextInt();
			switch(choice) {
			case 1:
				ob.add();
				break;
			case 2:
				ob.sub();
				break;
			case 3:
				ob.pro();
				break;
			case 4:
				ob.div();
				break;
			case 5:
				ob.rem();
				break;
			case 6:
				ob.power();
				break;
			case 7:
				ob.sqroot();
				break;
			case 8:
				ob.frac();
				break;
			case 9:
				ob.natlog();
				break;
			case 10:
				ob.logten();
				break;
			case 11:
				ob.expn();
				break;
			case 12:
				ob.degtorad();
				break;
			case 13:
				ob.sine();
				break;
			case 14:
				ob.cosine();
				break;
			case 15:
				ob.tangent();
				break;
			case 16:
				ob.absolute();
				break;
				default:
					System.out.println("Error!!\tWrong choice, please enter a valid choice");
			}
			System.out.println("Press (y/Y) to continue with calculator or press any other key to exit");
			ch=in.next().charAt(0);
		}
		System.out.println("Thank you!!\tHave a good day---------------------------------------------------------------------------------");
	}
	void add() {
		char ch='y';
		while(ch=='y'||ch=='Y') {
			System.out.println("Enter the two numbers for addition");
			double a=in.nextDouble();
			double b=in.nextDouble();
			System.out.println("Sum ("+a+"+"+b+") = "+(a+b));
			System.out.println("Press (y/Y) to continue\nTo exit press any other key");
			ch=in.next().charAt(0);
		}
	}
	void sub() {
		char ch='y';
		while(ch=='y'||ch=='Y') {
			System.out.println("Enter the two numbers for subtraction");
			double a=in.nextDouble();
			double b=in.nextDouble();
			System.out.println("Difference ("+a+"-"+b+") = "+(a-b));
			System.out.println("Press (y/Y) to continue\nTo exit press any other key");
			ch=in.next().charAt(0);
		}
	}
	void pro() {
		char ch='y';
		while(ch=='y'||ch=='Y') {
			System.out.println("Enter the two numbers for multiplication");
			double a=in.nextDouble();
			double b=in.nextDouble();
			System.out.println("Product ("+a+"*"+b+") = "+(a*b));
			System.out.println("Press (y/Y) to continue\nTo exit press any other key");
			ch=in.next().charAt(0);
		}
	}
	void div() {
		char ch='y';
		while(ch=='y'||ch=='Y') {
			System.out.println("Enter the two numbers for division");
			double a=in.nextDouble();
			double b=in.nextDouble();
			System.out.println("Quotient ("+a+"/"+b+") = "+(a/b));
			System.out.println("Press (y/Y) to continue\nTo exit press any other key");
			ch=in.next().charAt(0);
		}
	}
	void rem() {
		char ch='y';
		while(ch=='y'||ch=='Y') {
			System.out.println("Enter the two numbers for remainder");
			double a=in.nextDouble();
			double b=in.nextDouble();
			System.out.println("Remainder ("+a+"%"+b+") = "+(a-b));
			System.out.println("Press (y/Y) to continue\nTo exit press any other key");
			ch=in.next().charAt(0);
		}
	}
	void power() {
		char ch='y';
		while(ch=='y'||ch=='Y') {
			System.out.println("Enter the number");
			double a=in.nextDouble();
			System.out.println("Enter the value of power");
			double b=in.nextDouble();
			System.out.println("Result ("+a+"^"+b+") = "+Math.pow(a, b));
			System.out.println("Press (y/Y) to continue\nTo exit press any other key");
			ch=in.next().charAt(0);
		}
	}
	void sqroot() {
		char ch='y';
		while(ch=='y'||ch=='Y') {
			System.out.println("Enter the two number to generate square root");
			double a=in.nextDouble();
			System.out.println("Square root of "+a+" = "+Math.sqrt(a));
			System.out.println("Press (y/Y) to continue\nTo exit press any other key");
			ch=in.next().charAt(0);
		}
	}
	void expn() {
		char ch='y';
		while(ch=='y'||ch=='Y') {
			System.out.println("Enter the number to find e^x");
			double a=in.nextDouble();
			System.out.println("e^"+a+" = "+Math.exp(a));
			System.out.println("Press (y/Y) to continue\nTo exit press any other key");
			ch=in.next().charAt(0);
		}
	}
	void frac() {
		char ch='y';
		while(ch=='y'||ch=='Y') {
			System.out.println("Enter the number to find 1/x");
			double a=in.nextDouble();
			System.out.println("1/"+a+" = "+(1/a);
			System.out.println("Press (y/Y) to continue\nTo exit press any other key");
			ch=in.next().charAt(0);
		}
	}
	void natlog() {
		char ch='y';
		while(ch=='y'||ch=='Y') {
			System.out.println("Enter the number to find natural logarithm");
			double a=in.nextDouble();
			System.out.println("Natural logarithm of "+a+" = "+Math.log(a));
			System.out.println("Press (y/Y) to continue\nTo exit press any other key");
			ch=in.next().charAt(0);
		}
	}
	void logten() {
		char ch='y';
		while(ch=='y'||ch=='Y') {
			System.out.println("Enter the number to find the log10 value");
			double a=in.nextDouble();
			System.out.println("Log 10 of "+a+" = "+Math.log10(a));
			System.out.println("Press (y/Y) to continue\nTo exit press any other key");
			ch=in.next().charAt(0);
		}
	}
	void degtorad() {
		char ch='y';
		while(ch=='y'||ch=='Y') {
			System.out.println("Enter the degree to find it's radian value");
			double a=in.nextDouble();
			System.out.println("Radian of "+a+" degree = "+Math.toRadians(a));
			System.out.println("Press (y/Y) to continue\nTo exit press any other key");
			ch=in.next().charAt(0);
		}
	}
	void sine() {
		char ch='y';
		while(ch=='y'||ch=='Y') {
			System.out.println("Enter the angle in degrees to find it's sine value");
			double a=in.nextDouble();
			double rad=Math.toRadians(a);
			System.out.println("Sine of "+a+" degree = "+Math.sin(rad));
			System.out.println("Press (y/Y) to continue\nTo exit press any other key");
			ch=in.next().charAt(0);
		}
	}
	void cosine() {
		char ch='y';
		while(ch=='y'||ch=='Y') {
			System.out.println("Enter the angle in degrees to find it's cosine value");
			double a=in.nextDouble();
			double rad=Math.toRadians(a);
			System.out.println("Cosine of "+a+" degree = "+Math.cos(rad));
			System.out.println("Press (y/Y) to continue\nTo exit press any other key");
			ch=in.next().charAt(0);
		}
	}
	void tangent() {
		char ch='y';
		while(ch=='y'||ch=='Y') {
			System.out.println("Enter the angle in degrees to find it's tangent value");
			double a=in.nextDouble();
			double rad=Math.toRadians(a);
			System.out.println("Tangent of "+a+" degree = "+Math.tan(rad));
			System.out.println("Press (y/Y) to continue\nTo exit press any other key");
			ch=in.next().charAt(0);
		}
	}
	void absolute() {
		char ch='y';
		while(ch=='y'||ch=='Y') {
			System.out.println("Enter the number to find it's value");
			double a=in.nextDouble();
			System.out.println("Absolute of "+a+" = "+Math.abs(a));
			System.out.println("Press (y/Y) to continue\nTo exit press any other key");
			ch=in.next().charAt(0);
		}
	}
}