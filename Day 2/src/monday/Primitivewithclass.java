package monday;
class abc{
public double showdouble()
{
	return Double.MAX_VALUE;
	
}
public char showchar()
{
	return Character.MAX_VALUE;
}
boolean showboolean()
{
	return Boolean.TRUE;
}
}
public class Primitivewithclass {
public static void main(String args[])
{
	abc obj=new abc();
	System.out.println(obj.showdouble());
	System.out.println(obj.showchar());
	System.out.println(obj.showboolean());
}
}
