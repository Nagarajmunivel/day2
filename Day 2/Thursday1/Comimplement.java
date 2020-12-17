import java.util.Comparator;
public class Comimplement implements Comparator<Integer> {

	@Override
	public int compare(Integer a, Integer b) {
		// TODO Auto-generated method stub
		
		if (a%10>b%10)
			return 1;
		else
			return -1;
		
		
	}

	



}
