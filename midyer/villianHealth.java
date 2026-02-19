import greenfoot.*;

public class villianHealth extends Actor
{
    private final Color green = new Color(119, 198, 110);
    private final Color yellow = new Color(255, 238, 140);
    private final Color red = new Color(120, 6, 6);

    private GreenfootImage img = new GreenfootImage(250, 20);

    private int previousHealth = 100;
    private int nowHealth = 100;
    public int vil;

    public villianHealth(int v){
        vil = v;
        img.setColor(green);
        img.fillRect(0, 0, 100, 10);
        setImage(img);
    }

    public void act()
    {
        nowHealth = getHealth();
        if(nowHealth <= 0){
            MyWorld mw = (MyWorld)getWorld();
            mw.killMe(vil);
        }
        if(nowHealth != previousHealth){
            draw();
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
        return world.vilHealth();
    }
}
