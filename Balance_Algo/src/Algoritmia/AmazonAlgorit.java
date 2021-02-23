package Algoritmia;

import java.awt.Paint;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AmazonAlgorit {

	public static void main(String[] args) {
		int totalRestaurants = 3;
		int[] a = {1,2};
		int[] b = {3,4};
		int[] c = {1,-1};
		List<int[]> allLocations = new ArrayList<>();
		allLocations.add(a);
		allLocations.add(b);
		allLocations.add(c);
		int numRestaurants = 2;
		AmazonAlgorit newA = new AmazonAlgorit();
		newA.nearestVegetarianRestaurant(totalRestaurants, allLocations, numRestaurants);

	}
	
	
	public List<int[]> nearestVegetarianRestaurant(int totalRestaurants, List<int[]> allLocations, int numRestaurants){
		
		
		for(int[] location : allLocations) {
			System.out.println(location[0] + " " + location[1]);
			
		}
		
		Collections.sort(allLocations, new Comparator<int[]>() {
			
						@Override
						public int compare(int[] arg0, int[] arg1) {
							int[] result1 = {(int) Math.pow(arg0[0],2) + (int) Math.pow(arg0[1],2)};
							int[] result2 = {(int) Math.pow(arg1[0],2) + (int) Math.pow(arg1[1],2)};
							
							return Arrays.compare(result1, result2);
						}
						
					});
		
		for(int[] location : allLocations) {
				System.out.println(location[0] + " " + location[1]);
				
		}
		return null;
	}

}
