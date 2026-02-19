import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class chemTests here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class chemTests extends attack
{
    /**
     * Act - do whatever the chemTests wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(!isTouching(villian.class)){
            setLocation(getX() + 5, getY());
            MyWorld mw = (MyWorld)getWorld();
            if(mw.world > 8){
                mw.changeDoubleVHealth(-9);
            }
            mw.changeVHealth(-9);
        } else{
            MyWorld mw = (MyWorld)getWorld();
            mw.killMe(3);
        }
    }
}
