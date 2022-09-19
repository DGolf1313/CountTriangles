import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import entities.Triangle;

public class Application {

	public static void main(String[] args) {
		//Integer array 
		Integer[] arrayTriangleValues = {45,23,3,6,29,7,9,22,4};
		//45,29,23,6,3
		
		determineNumberOfTriangles(arrayTriangleValues);
	}
	
	public static List<Triangle> determineNumberOfTriangles(Integer[] sides) {
		//List of triangles
		List<Triangle> listOfValidTriangles = new LinkedList<>();
		
		int numTriaglesCreated = 0;
			
		//Sort the array
		Arrays.sort(sides, Collections.reverseOrder());
		for(int a = 0; a < sides.length; a++)
		
		//Print the new order of the array
		System.out.print(sides[a] + " ");
		System.out.println();
		System.out.println();
		
		for(int i = 0; i < sides.length; i++){
			for(int j = i + 1; j < sides.length; j++) {
				for(int k = j + 1; k < sides.length; k++) {
					if( sides[i] < (sides[j] + sides[k])){
						Triangle triangle = new Triangle(sides[i], sides[j], sides[k]);
						listOfValidTriangles.add(triangle);
						numTriaglesCreated++;
					}
				}
			}  
		}
		System.out.println("The following triangle combination(s) could be made: ");
		for(int t = 0; t < listOfValidTriangles.size(); t++) {
			System.out.print(listOfValidTriangles.get(t).getSideA() + ", ");
			System.out.print(listOfValidTriangles.get(t).getSideB() + ", ");
			System.out.print(listOfValidTriangles.get(t).getSideC());
			System.out.println();
			
		}
		System.out.println();
		System.out.println("The number of Triangles created was: " + numTriaglesCreated);
		return listOfValidTriangles;
	}
}
