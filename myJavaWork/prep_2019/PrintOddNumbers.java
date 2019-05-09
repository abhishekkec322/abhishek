package prep_2019;

import java.util.ArrayList;
import java.util.List;

public class PrintOddNumbers {
	
	public static void main(String args[]) {
		
		System.out.println(oddNumbers(2,8).size());
		
	}
	
	
	static List<Integer> oddNumbers(int l, int r){
				
		List <Integer> ls = new ArrayList();
		
		for(int i=l; i<=r; i++) {
			
			if(i%2!=0)
				ls.add(i);				
		}			
		return ls;
		
	}
	
	//HackerRank print
	/*public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int l = Integer.parseInt(bufferedReader.readLine().trim());

        int r = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> res = oddNumbers(l, r);

        bufferedWriter.write(
            res.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}*/

}
