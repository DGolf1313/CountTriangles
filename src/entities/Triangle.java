package entities;

public class Triangle {

	public Triangle(int sideA, int sideB, int sideC) {
		// TODO Auto-generated constructor stub
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}
	public int getSideA() {
		return sideA;
	}
	public void setSideA(int sideA) {
		this.sideA = sideA;
	}
	public int getSideB() {
		return sideB;
	}
	public void setSideB(int sideB) {
		this.sideB = sideB;
	}
	public int getSideC() {
		return sideC;
	}
	public void setSideC(int sideC) {
		this.sideC = sideC;
	}
	private int sideA;
	private int sideB;
	private int sideC;
	
	
}
