import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import entities.Triangle;

public class Application {

	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter a list of numbers (seperated by commas with no spaces) to calculate how many triangles can be made.  Ex: 3,6,1,2");
			String stringTriangleValues = scanner.nextLine();
			String[] numberString = stringTriangleValues.split(",");
			Integer[] arrayTriangleValues = new Integer[numberString.length];
			for(int i = 0;i < numberString.length;i++)
			{
				arrayTriangleValues[i] = Integer.parseInt(numberString[i]);
			}
			
			determineNumberOfTriangles(arrayTriangleValues);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
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
