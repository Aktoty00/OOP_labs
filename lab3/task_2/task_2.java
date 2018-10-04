import java.util.Scanner;
class task_2{
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        int radius = input.nextInt();
        int height = input.nextInt();

        Cylinder cylinder = new Cylinder(radius,height);
        System.out.println("Cylinder_volume: " + cylinder.volume());
        System.out.println("Cylinder_surfaceArea: " + cylinder.surfaceArea());
        System.out.println("Cylinder_halfOfVolume : " + cylinder.halfOfVolume());

        Sphere sphere = new Sphere(radius);
        System.out.println("Sphere_volume: " + sphere.volume());
        System.out.println("Sphere_surfaceArea: " + sphere.surfaceArea());
        System.out.println("Sphere_halfOfVolume : " + sphere.halfOfVolume());

        Cube cube = new Cube(height);
        System.out.println("Cube_volume: " + cube.volume());
        System.out.println("Cube_surfaceArea: " + cube.surfaceArea());
        System.out.println("Cube_halfOfVolume : " + cube.halfOfVolume());
    }
}   
