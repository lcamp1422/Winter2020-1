package hw6;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create instance of Random class 
        Random rand = new Random(); 
  
        int N = 500;
        
        //Set: TreeSet
        
        Set<Integer> ts = new TreeSet<Integer>();
        
        while(ts.size()<500){
        	// Generate random integers in range 0 to 999 
            int rand_int1 = rand.nextInt((1000 - 100) + 1) + 100;
            ts.add(rand_int1);
        }
        
        System.out.println(ts);
        //System.out.println(ts.size());
        
        Object[] my500RandomNums = ts.toArray();
        System.out.println(my500RandomNums[N-1]);
  
	}

}
