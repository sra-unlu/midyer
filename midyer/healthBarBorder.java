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
    private player p;
    
    private GreenfootImage b;

    public healthBarBorder(player playerRef){
        p = playerRef;

        b = getImage();
        b.scale(110, 20);
        setImage(b);
    }

    public void act() {
        followPlayer();
    }

    private void followPlayer(){
        if (p != null) {
            setLocation(p.getX(), p.getY() - 70);
        }
    }
    
    
}
