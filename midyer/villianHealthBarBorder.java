import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class villianHealthBarBorder here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class villianHealthBarBorder extends Actor
{
    /**
     * Act - do whatever the villianHealthBarBorder wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage b;

    public villianHealthBarBorder(){
        b = getImage();
        b.scale(110, 20);
        setImage(b);
    }
}
