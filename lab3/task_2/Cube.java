public class Cube extends threeDShapes{
	public int height;
	Cube(){
		this.height = 0;
	}
	Cube(int height){
		this.height = height;
	}
	public double volume(){
		return this.height*this.height*this.height;
	}
	public double surfaceArea(){
		return this.height*this.height*6;
	}
	public double halfOfVolume(){
		return this.height*this.height*this.height/2;
	}
}