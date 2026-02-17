import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class collision here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class collision extends Actor
{
    /**
     * Act - do whatever the collision wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage collision;
    
    public collision() {
        collision = getImage();
        collision.setTransparency(0);
        collision.scale(1000, 55);
        setImage(collision);
    }
    public void act()
    {
        // Add your action code here.
    }
}
