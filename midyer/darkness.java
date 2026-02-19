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
    private boolean changingWorld = false;
    
    private int actCycle = 0;
    private GreenfootImage darkness;
    
    private int time = 0;
    
    int[][] villiansAlrDone = new int[3][4];
    public darkness(){
        darkness = getImage();
        darkness.setTransparency(235);
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
        villiansAlrDone[2][0] = -2;
        villiansAlrDone[2][1] = -2;
        villiansAlrDone[2][2] = -2;
        villiansAlrDone[2][3] = -2;
    }
    
    public void act()
    {
        actCycle++;
        move();
        MyWorld myWorld = (MyWorld) getWorld();
        if(myWorld.world == 3){
            int latestFull = latestFull(0);
            if(latestFull == -1){
                    darkness.scale(darkness.getWidth() + 1000, darkness.getHeight() + 250);
                    villiansAlrDone[0][0] = actCycle;
                } else if(latestFull == 0 && actCycle - 15 == villiansAlrDone[0][0]){
                    darkness.scale(darkness.getWidth() + 1000, darkness.getHeight() + 250);
                    villiansAlrDone[0][1] = actCycle;
                } else if(latestFull == 1 && actCycle - 15 == villiansAlrDone[0][1]){
                    darkness.scale(darkness.getWidth() + 1000, darkness.getHeight() + 250);
                    villiansAlrDone[0][2] = actCycle;
                } else if(latestFull == 2 && actCycle - 15 == villiansAlrDone[0][2]){
                    darkness.scale(darkness.getWidth() + 1000, darkness.getHeight() + 250);
                    villiansAlrDone[0][3] = actCycle;
                }
            
        } else if(myWorld.world == 6){
            int latestFull = latestFull(1);
            if(latestFull == -1){
                    darkness.scale(darkness.getWidth() + 1000, darkness.getHeight() + 250);
                    villiansAlrDone[1][0] = actCycle;
                } else if(latestFull == 0 && actCycle - 15 == villiansAlrDone[1][0]){
                    darkness.scale(darkness.getWidth() + 1000, darkness.getHeight() + 250);
                    villiansAlrDone[1][1] = actCycle;
                } else if(latestFull == 1 && actCycle - 15 == villiansAlrDone[1][1]){
                    darkness.scale(darkness.getWidth() + 1000, darkness.getHeight() + 250);
                    villiansAlrDone[1][2] = actCycle;
                } else if(latestFull == 2 && actCycle - 15 == villiansAlrDone[1][2]){
                    darkness.scale(darkness.getWidth() + 1000, darkness.getHeight() + 250);
                    villiansAlrDone[1][3] = actCycle;
                }
        } else if(myWorld.world == 9){
            int latestFull = latestFull(2);
            if(latestFull == -1){
                    darkness.scale(darkness.getWidth() + 1000, darkness.getHeight() + 250);
                    villiansAlrDone[2][0] = actCycle;
                } else if(latestFull == 0 && actCycle - 15 == villiansAlrDone[2][0]){
                    darkness.scale(darkness.getWidth() + 1000, darkness.getHeight() + 250);
                    villiansAlrDone[2][1] = actCycle;
                } else if(latestFull == 1 && actCycle - 15 == villiansAlrDone[2][1]){
                    darkness.scale(darkness.getWidth() + 1000, darkness.getHeight() + 250);
                    villiansAlrDone[2][2] = actCycle;
                } else if(latestFull == 2 && actCycle - 15 == villiansAlrDone[2][2]){
                    darkness.scale(darkness.getWidth() + 1000, darkness.getHeight() + 250);
                    villiansAlrDone[2][3] = actCycle;
                }
            
        } else {
            if(darkness.getWidth() > 2000 || darkness.getHeight() > 1200){
                if (actCycle % 15 == 0) {
                    int newWidth = Math.max(2000, darkness.getWidth() - 1000);
                    int newHeight = Math.max(1200, darkness.getHeight() - 250);
                    darkness.scale(newWidth, newHeight);
                }
            }
        }
        if(getX() > 959 && !changingWorld){
            changingWorld = true;

            MyWorld world = (MyWorld) getWorld();
            world.nextWorld();
            setLocation(40, 300);
            world.resetWorldTrigger();
        }
        if (getX() <= 959) {
            changingWorld = false;
        }
    }
    
    private void move(){
        int px = getX();
        int py = getY();
        MyWorld world = (MyWorld) getWorld();
        if (Greenfoot.isKeyDown("right")){
            setLocation(px + 5, py);
        } else if (Greenfoot.isKeyDown("left")){
            setLocation(px - 5, py);
        } else if (Greenfoot.isKeyDown("up")){
            setLocation(px, py - 5);
            if(py < 100) {
                setLocation(px, py + 5);
            }
        } else if (Greenfoot.isKeyDown("down")){
            setLocation(px, py + 5);
            if(py > 450){
                setLocation(px, py - 5);
            }
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
