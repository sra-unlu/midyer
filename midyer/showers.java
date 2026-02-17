import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class showers here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class showers extends Actor
{
    /**
     * Act - do whatever the showers wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(!isTouching(villian.class)){
            setLocation(getX() + 5, getY());
            MyWorld mw = (MyWorld)getWorld();
            mw.changeVHealth(-50);
        } else{
            MyWorld mw = (MyWorld)getWorld();
            mw.killMe(5);
        }
    }
}
