import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class healthBarBorder here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class healthBarBorder extends Actor
{
    /**
     * Act - do whatever the healthBarBorder wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move();
    }
    private void move(){
        int px = getX();
        int py = getY();
        MyWorld world = (MyWorld) getWorld();
        if (Greenfoot.isKeyDown("right")){
            setLocation(px + 5, py);
        }else if (Greenfoot.isKeyDown("left")){
            setLocation(px - 5, py);
        }else if (Greenfoot.isKeyDown("up")){
            setLocation(px, py - 5);
        }else if (Greenfoot.isKeyDown("down")){
            setLocation(px, py + 5);
        }
    }
}
