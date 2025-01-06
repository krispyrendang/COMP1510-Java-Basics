package ca.bcit.comp1510.lab10;

/** Simulates two objects colliding.
 * @author Taswinder Singh Dhaliwal Set 1C
 * @version 1.0
 */
public class Collisions {
    
    /** Constant used for the program.*/
    public static final int HUNDK = 100000;
    
    /** Constant used for the program.*/
    public static final int TWOMIL = 2000000;

    /** Constant used for the program.*/
    public static final int THREE = 3;
    
    /** Drives the program.
     * @param args unused.
     */
    public static void main(String[] args) {
        RandomWalker part1 = new RandomWalker(HUNDK, TWOMIL, -THREE, 0);
        RandomWalker part2 = new RandomWalker(HUNDK, TWOMIL, THREE, 0);
        int maxDistP1 = 0;
        int maxDistP2 = 0;
        
        for (int i = 0; i < HUNDK; i++) {
            
            part1.takeStep();
            part2.takeStep();
            
            
            if (maxDistP1 < part1.getMDist()) {
                maxDistP1 = part1.getMDist();
            }
            
            if (maxDistP2 < part2.getMDist()) {
                maxDistP2 = part2.getMDist();
            }
            
            if (samePosition(part1, part2)) {
                break;
            }
            
        }
            
        System.out.println("Particle 1 max distance: " + maxDistP1 
            + "\nParticle 2 max distance: " + maxDistP2);
        
    }
    
    /** Checks if 2 objects are on the same x,y coordinates.
     *  @param one - RandomWalker object 1.
     *  @param two - RandomWalker object 2.
     *  @return boolean value if the check is true.*/
    public static boolean samePosition(RandomWalker one, RandomWalker two) {
        if ((one.getPosX() == two.getPosX()) 
            && (one.getPosY() == two.getPosY())) {
            
            return true;            
        }
        
        return false;
        
    }

}
