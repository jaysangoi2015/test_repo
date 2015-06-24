
public class TestClass {

	public static void main(String[] args) {
		int []a = {1};
		increment(a);
		System.out.println(a[a.length-1]);
		
	}
	
	
	static void increment(int[] i)
	{
		i[i.length-1] ++;
	}
}
