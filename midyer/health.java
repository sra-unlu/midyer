import greenfoot.*;

public class health extends Actor
{
    private player p;

    private final Color green = new Color(119, 198, 110);
    private final Color yellow = new Color(255, 238, 140);
    private final Color red = new Color(120, 6, 6);

    private GreenfootImage img = new GreenfootImage(250, 20);

    private int previousHealth = 100;
    private int nowHealth = 100;

    public health(player playerRef){
        p = playerRef;

        img.setColor(green);
        img.fillRect(0, 0, 100, 10);
        setImage(img);
    }

    public void act()
    {
        followPlayer();

        nowHealth = getHealth();
        if(nowHealth != previousHealth){
            draw();
        }
    }

    private void followPlayer(){
        if(p != null){
            setLocation(p.getX() + 75, p.getY() - 65);
        }
    }

    private void draw(){
        img.clear();

        if(nowHealth < 30){
            img.setColor(red);
        } else if (nowHealth < 60){
            img.setColor(yellow);
        } else{
            img.setColor(green);
        }

        int width = nowHealth;
        img.fillRect(0, 0, width, 10);

        setImage(img);
        previousHealth = nowHealth;
    }

    private int getHealth(){
        MyWorld world = (MyWorld)getWorld();
        return world.health();
    }
}
