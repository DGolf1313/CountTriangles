import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import entities.Triangle;

class UnitTestTriangle {
	
	@Test
	public void assertThatCorrectTrianglesAreFound() {
		Integer[] testArray1 = {4,6,3,7};
		
		List<Triangle> testArray1Triangles = Application.determineNumberOfTriangles(testArray1);
		
		assertEquals("testArray1 should have had only 1 triangle", 3, testArray1Triangles.size());
		
		Integer[] testArray2 = {10,21,22,100,101,200,300};
		List<Triangle> testArray2Triangles  = Application.determineNumberOfTriangles(testArray2);
		assertEquals("testArray2 should have had only 1 triangle", 6, testArray2Triangles.size());
		
	}

}
