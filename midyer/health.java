import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class health here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class health extends Actor
{
    /**
     * Act - do whatever the health wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private final Color green = new Color(119, 198, 110);
    private final Color yellow = new Color(255, 238, 140);
    private final Color red = new Color(120, 6, 6);
    GreenfootImage img = new GreenfootImage(250, 20);
    int previousHealth = 100;
    int nowHealth = 100; 
    
    public health(){
        img.setColor(green);
        img.fillRect(40, 300, 250, 20);
        setImage(img);
    }
    
    public void act()
    {
        move();
        nowHealth = getHealth();
        if(nowHealth != previousHealth){
            draw();
        }
    }
    // total health is 500
    private void draw(){
        if(nowHealth < 167){
            img.setColor(red);
        } else if (nowHealth < 334){
            img.setColor(yellow);
        } else{
            img.setColor(green);
        }
        img.fillRect(getX(), getY(), (previousHealth - nowHealth)/2,20);
        setImage(img);
        previousHealth = nowHealth;
    }
    
    private int getHealth(){
        MyWorld world = (MyWorld)getWorld();
        return world.health();
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
