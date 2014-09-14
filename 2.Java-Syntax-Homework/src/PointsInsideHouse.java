import java.util.Scanner;

public class PointsInsideHouse {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner userInput = new Scanner(System.in);

		double x1 = 12.5;
		double y1 = 8.5;
		double x2 = 22.5;
		double y2 = 8.5;
		double x3 = 17.5;
		double y3 = 3.5;

		while (true) {

			double x = userInput.nextDouble();
			double y = userInput.nextDouble();
			/* Calculate area of triangle ABC */
			double A = areaOfTriangle(x1, y1, x2, y2, x3, y3);
			/* Calculate area of triangle PBC (point in question: P) */
			double A1 = areaOfTriangle(x, y, x2, y2, x3, y3);
			/* Calculate area of triangle PAC (point in question: P) */
			double A2 = areaOfTriangle(x1, y1, x, y, x3, y3);
			/* Calculate area of triangle PAB (point in question: P) */
			double A3 = areaOfTriangle(x1, y1, x2, y2, x, y);
			/* Check if sum of A1, A2 and A3 is same as A */
			// (A == A1 + A2 + A3)

			if (x < 12.5 || x > 22.5 || y < 3 || y > 13.5) {

				System.out.println("Outside");
			} else {

				if ((x < 20 && x > 17.5) && (y > 8.5)) {

					System.out.println("Outside");
				} else if (A != (A1 + A2 + A3) && y < 8.5) {

					System.out.println("Outside");
				} else {
					System.out.println("Inside");
				}
			}
		}// end while
	}// end of main

	static double areaOfTriangle(double x1, double y1, double x2, double y2,double x3, double y3) {
		return Math.abs((x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2.0);
	}

}// end of class
