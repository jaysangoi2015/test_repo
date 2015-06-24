import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class TestSubString {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String input;
		int i = 1;
		input = reader.readLine();
		if(input ==null)
		{
			System.out.println("N is not present");
			System.exit(1);
		}
		
		
		int n = Integer.parseInt(input.trim());
		
		input = reader.readLine();
		if(input ==null)
		{
			System.out.println("K,L,M are not present");
			System.exit(1);
		}
		
		String [] st =  input.split("\t");
		
		int k = Integer.parseInt(st[0]);
		int l = Integer.parseInt(st[1]);
		int m = Integer.parseInt(st[2]);
		
		
		input = reader.readLine();
		
		if(input ==null)
		{
			System.out.println("Input String is not present");
			System.exit(1);
		}
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		int currentSubStriglength = k;
		
		String temp;
		
		String str = input;
		
		while(currentSubStriglength<=l)
		{
			for(i=0;i<=n-currentSubStriglength;i++)
			{
				temp = str.substring(i,i+currentSubStriglength);
				if(map.get(temp) == null)
				{
					map.put(temp, 0);
				}
				
				map.put(temp, map.get(temp)+1);
				
			}
			currentSubStriglength++;
		}
		int max = getMax(map);
		
		System.out.println("Done : "+max);
		
	}
	
	private static int getMax(Map<String, Integer> map)
	{
		int max = 0;
		int temp;
		Set<String> keys = map.keySet();
		for(String key:keys)
		{
			temp = map.get(key);
			if(temp > max)
			{
				max = temp;
			}
		}
		
		return max;
	}
	
}
