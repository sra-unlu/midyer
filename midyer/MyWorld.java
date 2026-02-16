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
    public npc hannah = new npc(1);
    public spells pencilAttack = new spells(1);
    public npc nanami = new npc(2);
    public spells bcaWifi = new spells(2);
    public npc migs = new npc(3);
    public spells chemHw = new spells(3);
    public npc pranav = new npc(4);
    public spells cleaningUpUpUp = new spells(4);
    public npc migt = new npc(5);
    public spells showerAttack = new spells(5);
    public npc andrewg = new npc(6);
    public spells polymorphisimUnit = new spells(6);
    public villian reyyan = new villian(1);
    public villian dharma = new villian(2);
    public villian thomas = new villian(3);
    public villian zohar = new villian(4);
    public int wtai1 = reyyan.worldToAppearIn;
    public int wtai2 = dharma.worldToAppearIn;
    public MyWorld(){    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1);
        // System.out.println("start");
        addObject(p, 40, 300); 
        addObject(new darkness(), 40, 300);
        addObject(new health(), 40, 300);
        setPaintOrder(spells.class, textBox.class, darkness.class, healthBarBorder.class, health.class, player.class, villian.class, npc.class);
    }
    
    public void nextWorld(){
        world++;
        // setImage(worldsArr[world]);
        if(world == reyyan.worldToAppearIn){
            addObject(reyyan, 900, 300);
            p.isVillian = true;
        } else if (world - 1 == reyyan.worldToAppearIn){
            removeObject(reyyan);
        }
        if(world == dharma.worldToAppearIn){
            addObject(dharma, 900, 300);
            p.isVillian = true;
        }  else if (world - 1 == dharma.worldToAppearIn){
            removeObject(dharma);
        }if(world == hannah.world){
            addObject(hannah, 900, 300);
            
        }  else if (world - 1 == hannah.world){
            removeObject(hannah);
        }if(world == nanami.world){
            addObject(nanami, 900, 300);
            
        }  else if (world - 1 == nanami.world){
            removeObject(nanami);
        }if(world == migs.world){
            addObject(migs, 900, 300);
            
        }  else if (world - 1 == migs.world){
            removeObject(migs);
        }if(world == pranav.world){
            addObject(pranav, 900, 300);
            
        }  else if (world - 1 == pranav.world){
            removeObject(pranav);
        }if(world == migt.world){
            addObject(migt, 900, 300);
            
        }  else if (world - 1 == migt.world){
            removeObject(migt);
        }if(world == andrewg.world){
            addObject(andrewg, 900, 300);
            
        }  else if (world - 1 == andrewg.world){
            removeObject(andrewg);
        }
    }
    
    public void getSpellAccordingToNPC(int self){
        if(self == 1){
            addObject(pencilAttack, 500, 300);
            addObject(new textBox(), 500, 75);
        } else if(self == 2){
            addObject(bcaWifi, 500, 300);
            addObject(new textBox(), 500, 75);
        } else if(self == 3){
             addObject(chemHw, 500, 300);
             addObject(new textBox(), 500, 75);
        } else if(self == 4){
             addObject(cleaningUpUpUp, 500, 300);
             addObject(new textBox(), 500, 75);
        } else if(self == 5){
            addObject(showerAttack, 500, 300);
            addObject(new textBox(), 500, 75);
        }else if (self == 6){
             addObject(polymorphisimUnit, 500, 300);
             addObject(new textBox(), 500, 75);
        }
    }
    
    public int health(){
        return p.health;
    }
    
    
    /*
     * Code for high score font change and drawing from block blast
        Font font = new Font("Rockwell",60);
        img.setFont(font);
        img.setColor(new Color (255,255,255));
        img.drawString("" + MyWorld.shownScore, x, img.getHeight() / 2);
        font = new Font("Rockwell",20);
        img.setFont(font);
        img.drawString("High Score: " + MyWorld.highScore, img.getWidth() / 2 - 90, img.getHeight() / 2 - 80);
        setImage(img);
    **/
}
