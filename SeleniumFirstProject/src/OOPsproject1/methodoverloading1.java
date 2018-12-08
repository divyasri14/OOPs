package OOPsproject1;

public class methodoverloading1 {
	
	
	
	
	public int  area(int side) {
			int  area = side *side;
			return area;
				
	}
	
	
	public double area(int len,double wid	) {
		double area = len * wid;
		return area;
			
}

	
	public double	 area(double radius) {
		double area = Math.PI * radius*radius;
		return area;
			
}
}
