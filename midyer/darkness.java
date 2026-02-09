import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class darkness here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class darkness extends Actor
{
    /**
     * Act - do whatever the darkness wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int actCycle = 0;
    private GreenfootImage darkness = new GreenfootImage("dark.png");
    // first array is for each villian
    // second is for which act cycle it ran in
    int[][] villiansAlrDone = new int[2][4];
    public darkness(){
        darkness.scale(2000, 1200);
        setImage(darkness);
        villiansAlrDone[0][0] = -2;
        villiansAlrDone[0][1] = -2;
        villiansAlrDone[0][2] = -2;
        villiansAlrDone[0][3] = -2;
        villiansAlrDone[1][0] = -2;
        villiansAlrDone[1][1] = -2;
        villiansAlrDone[1][2] = -2;
        villiansAlrDone[1][3] = -2;
    }
    public void act()
    {
        actCycle++;
        move();
        MyWorld myWorld = (MyWorld) getWorld();
        if(myWorld.world == myWorld.wtai1 || myWorld.world == myWorld.wtai2){
            int latestFull = latestFull(0);
            if(latestFull == -1){
                darkness.scale(darkness.getWidth() + 1600, darkness.getHeight() + 100);
                villiansAlrDone[0][0] = actCycle;
            } else if(latestFull == 0 && actCycle - 15 == villiansAlrDone[0][0]){
                darkness.scale(darkness.getWidth() + 1600, darkness.getHeight() + 100);
                villiansAlrDone[0][1] = actCycle;
            } else if(latestFull == 1 && actCycle - 15 == villiansAlrDone[0][1]){
                darkness.scale(darkness.getWidth() + 1600, darkness.getHeight() + 100);
                villiansAlrDone[0][2] = actCycle;
            } else if(latestFull == 2 && actCycle - 15 == villiansAlrDone[0][2]){
                darkness.scale(darkness.getWidth() + 1600, darkness.getHeight() + 100);
                villiansAlrDone[0][3] = actCycle;
            }
        }
        if(getX() > 959){
            darkness.scale(2000,1200);
            setLocation(40, 300);
        }
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
    
    private int latestFull(int villian){
        if(villiansAlrDone[villian][3] != -2){
            return 3;
        } else if(villiansAlrDone[villian][2] != -2){
            return 2;
        } else if(villiansAlrDone[villian][1] != -2){
            return 1;
        } else if(villiansAlrDone[villian][0] != -2){
            return 0;
        } else{
            return -1;
        }
    }
}
