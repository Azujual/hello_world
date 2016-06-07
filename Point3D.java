
class Point3D extends Point{
	int z;
	final int COLOR = 2;
	
	Point3D (int x, int y, int z){
		super(x,y); //obrashenie k konstruktoru super classa
		//this.x = x;
		//this.y = y;
		this.z = z;
	}
	
	Point3D(){
		this(-1,-1,-1);
	}
	
	double distance(int x, int y, int z){
		int dx = this.x - x;
		int dy = this.y - y;
		int dz = this.z - z;
		return Math.sqrt(dx * dx + dy * dy + dz * dz);
	}
	
	double distance(Point3D p) {
		return distance( p.x, p.y, p.z);
	}
	
}
