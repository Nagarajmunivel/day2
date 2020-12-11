package friday;
//Arithemetic and Assignment
public class Operators1 {
	int a,b,c=100,d=10,e=50;
public static void main(String args[])
{
	Operators1 o=new Operators1();
	o.a+=10;
	System.out.println(o.a);
	o.b-=10;
	System.out.println(o.b);
	o.c%=3;
	System.out.println(o.c);
	o.d*=20;
	System.out.println(o.d);
	o.e/=2;
	System.out.println(o.e);
	
	System.out.println("Comparasion operator "+(o.e==o.c));

}
}
