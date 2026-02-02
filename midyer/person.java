import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class person extends Actor
{
    
    /**
     * Act - do whatever the person wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move();
        if(isAtEdge()){
            System.out.println("alo");
            MyWorld world = (MyWorld) getWorld();
            world.nextWorld();
        }
    }
    
    private void move(){
        int px = getX();
        int py = getY();
        MyWorld world = (MyWorld) getWorld();
        if (Greenfoot.isKeyDown("right")){
            setLocation(px + 5, py);
        }if (Greenfoot.isKeyDown("left")){
            setLocation(px - 5, py);
        }if (Greenfoot.isKeyDown("up")){
            setLocation(px, py - 5);
        }if (Greenfoot.isKeyDown("down")){
            setLocation(px, py + 5);
        }
    }
    
    public int getpx(){
        return getX();
    }
    
    public int getpy(){
        return getY();
    }
}
