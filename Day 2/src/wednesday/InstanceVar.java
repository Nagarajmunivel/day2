package wednesday;
//instance variable program
public class InstanceVar {
byte a;
short b;
char c;
int d;
float e;
long f;
double g;
String h;
InstanceVar i;
public static void main(String args[])
{
	InstanceVar v=new InstanceVar();
	System.out.println("This is the initial value for byte "+v.a);
	System.out.println("This is the initial value for short "+v.b);
	System.out.println("This is the initial value for char "+v.c);
	System.out.println("This is the initial value for int "+v.d);
	System.out.println("This is the initial value for float "+v.e);
	System.out.println("This is the initial value for long "+v.f);
	System.out.println("This is the initial value for double "+v.g);
	System.out.println("This is the initial value for String "+v.h);
	System.out.println("This is the initial value for Object "+v.i);
}
}
