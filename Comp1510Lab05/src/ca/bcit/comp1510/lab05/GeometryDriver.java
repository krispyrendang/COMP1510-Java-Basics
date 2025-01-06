package ca.bcit.comp1510.lab05;

import java.text.DecimalFormat;
import java.util.Scanner;

/** GeometryDriver - calculates values of different shapes.
 * @author Tas
 * @version 1.0
 *
 */
public class GeometryDriver {

    /** Drives the program.
     * @param args unused.
     */
    public static void main(String[] args) {
        int x;
        int y;
        int z;
        int r;
        int e;
        int h;
        Scanner scan = new Scanner(System.in);
        DecimalFormat fmt = new DecimalFormat("0.###");

        //sphere calculations
        System.out.println("Enter x, y and z coordinates for a sphere, "
                + "followed by the radius");
        x = scan.nextInt();
        y = scan.nextInt();
        z = scan.nextInt();
        r = scan.nextInt();
        Sphere sphere1 = new Sphere(x, y, z, r);
        System.out.println("volume of sphere:" + fmt.format(sphere1.volume()) 
            + ", surface area of sphere:" + fmt.format(sphere1.surfaceArea()));
                
        //cube calculations
        System.out.println("Enter x, y and z coordinates for a cube, "
            + "followed by the edge length");
        x = scan.nextInt();
        y = scan.nextInt();
        z = scan.nextInt();
        e = scan.nextInt();
        Cube cube1 = new Cube(x, y, z, e);
        System.out.println("volume of cube: " + fmt.format(cube1.volume()) 
            + ", surface area of cube: " + fmt.format(cube1.surfaceArea()) 
            + ", face diagonal of cube: " + fmt.format(cube1.face()) 
            + ", space diagonal of cube: " + fmt.format(cube1.space()));
        
        //Cone calculations
        System.out.println("Enter enter the radius and height for a "
            + "right circular cone");
        r = scan.nextInt();
        h = scan.nextInt();
        Cone cone1 = new Cone(r, h);
        System.out.println("volume of cone:" + fmt.format(cone1.volume()) 
            + ", slant height cone:" + fmt.format(cone1.slantH()) 
            + ", surface area of cone:" + fmt.format(cone1.surfaceArea()));
                
        scan.close();
    }

}
