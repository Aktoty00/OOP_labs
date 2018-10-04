public class Sphere extends threeDShapes{
	public int radius;
	Sphere(){
		this.radius = 0;
	}
	Sphere(int radius){
		this.radius = radius;
	}
	public double volume(){
		return Math.PI*this.radius*this.radius*this.radius*4/3;
	}
	public double surfaceArea(){
		return 4 * Math.PI*this.radius*this.radius;
	}
	public double halfOfVolume(){
		return  Math.PI*this.radius*this.radius*this.radius *2/3;
	}
}