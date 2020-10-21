package codeSolving;

import java.util.Scanner;

public class AreaOfPolygon {

	/*
	 * In elementary geometry, a polygon is a plane figure that is described by a
	 * finite number of straight line segments connected to form a closed polygonal
	 * chain or polygonal circuit. The solid plane region, the bounding circuit, or
	 * the two together, may be called a polygon.
	 */

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Input the number of sides on the polygon: ");
		int ns = input.nextInt();
		System.out.print("Input the length of one of the sides: ");
		double side = input.nextDouble();
		System.out.print("The area is: " + polygonArea(ns, side) + "\n");
		input.close();
	}

	public static double polygonArea(int ns, double side) {
		return (ns * (side * side)) / (4.0 * Math.tan((Math.PI / ns)));
	}
}
