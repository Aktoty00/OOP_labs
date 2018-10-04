public class Cylinder extends threeDShapes{
	public int height;
	public int radius;
	Cylinder(){
		this.radius = 0;
		this.height = 0;
	}
	Cylinder(int radius,int height){
		this.radius = radius;
		this.height = height;
	}
	public double volume(){
		return Math.PI*this.radius*this.radius*this.height;
	}
	public double surfaceArea(){
		return (2*Math.PI*this.radius*this.radius) + (2*Math.PI* this.radius*this.height);
	}
	public double halfOfVolume(){
		return (Math.PI*this.radius*this.radius*this.height)/2;
	}
}