import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class computer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class computer extends vilAttack
{
    /**
     * Act - do whatever the computer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(!isTouching(player.class)){
            setLocation(getX() - 5, getY());
            
        } else{
            MyWorld mw = (MyWorld)getWorld();
            mw.changeHealth(-9);
            mw.killMe(12);
        }
    }
}
