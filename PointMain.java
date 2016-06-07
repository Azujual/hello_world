import java.text.DecimalFormat;

public class PointMain {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.00");

		//System.out.println(df.format(180.0)); // prints 180.0
		//System.out.println(df.format(0.0)); // prints .0 BUT I want 0.0
		// TODO Auto-generated method stub
		Point p1 = new Point(10,20);
		Point p2 = new Point(15,15);
		Point p3 = new Point(5,5);
		
		double d1 = p1.distance(p2);
		double d2 = p2.distance(10,20);
		double d3 = p3.distance(50,50);
		
		System.out.println("Result: " + df.format(d1));
		System.out.println("Result: " + df.format(d2));
		System.out.println("Result: " + df.format(d3));
		
		System.out.println();
		
		Point3D v1 = new Point3D( 10, 20, 10);
		Point3D v2 = new Point3D( 15, 15, 20);
		Point3D v3 = new Point3D( 5, 5, 10);
		
		double w1 = v1.distance(v2);
		double w2 = v2.distance( 10, 20, 10);
		double w3 = v3.distance( 50, 50, 50);
		
		System.out.println("Result 3D 1: " + df.format(w1));
		System.out.println("Result 3D 2: " + df.format(w2));
		System.out.println("Result 3D 3: " + df.format(w3));
		
		System.out.println("Color Point " + p1.COLOR);
		System.out.println("Color Point3D " + v1.COLOR);
		
		//p1.COLOR = 3;
		
	}

}
