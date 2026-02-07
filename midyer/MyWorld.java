import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public player p = new player();
    private GreenfootImage[] worldsArr = new GreenfootImage[10];
    public int world = 0;
    villian v1 = new villian(1, 2);
    villian v2 = new villian(2, 5);
    public int wtai1 = v1.worldToAppearIn;
    public int wtai2 = v2.worldToAppearIn;
    public MyWorld(){    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1);
        // System.out.println("start");
        addObject(p, 40, 300); 
        addObject(new darkness(), 40, 300);
    }
    
    public void nextWorld(){
        world++;
        // setImage(worldsArr[world]);
        if(world == v1.worldToAppearIn){
            addObject(v1, 900, 300);
            p.isVillian = true;
        } else if (world - 1 == v1.worldToAppearIn){
            removeObject(v1);
        }
        if(world == v2.worldToAppearIn){
            addObject(v2, 900, 300);
            p.isVillian = true;
        }  else if (world - 1 == v1.worldToAppearIn){
            removeObject(v2);
        }
    }
    

}
