import java.util.Scanner;
class starTriangle
{
    int width;
    starTriangle()
    {
        width = 3;
    }
    starTriangle(int width)
    {
        this.width = width;
    }
    public static String f(int width)
    {
        String res = "";
        for (int i=1; i<=width ; i++)
        {
            for (int j =1;j<=i ; j++ ) 
            {
                res += ("*");
            }
            res += ("\n");
        }
        return (res);
    }
    public String ToString()
    {
        String r = f(width);
        return ("triangle is: \n"+r);
    }
    
}
class triangle
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int wwidth = input.nextInt();
       
        starTriangle small = new starTriangle(wwidth);
        System.out.println(small.ToString());
    }
    
}   