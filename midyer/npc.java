import greenfoot.*;  // (worldToAppearIn, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class npc here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class npc extends Actor
{
    /**
     * Act - do whatever the npc wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage hannahNPCImg = new GreenfootImage("Hannah.png");
    GreenfootImage nanamiNPCImg = new GreenfootImage("nanami.png");
    GreenfootImage migsNPCImg = new GreenfootImage("migs.png");
    GreenfootImage pranavNPCImg = new GreenfootImage("pranav.png");
    GreenfootImage migtNPCImg = new GreenfootImage("migt.png");
    GreenfootImage andrewgNPCImg = new GreenfootImage("andrewg.png");
    public int name;
    public int worldToAppearIn;
    public int actCycle;
    public int speak = -2;
    public boolean spellGiven = false;

    public npc(int which){
        actCycle = 0;
        if(which == 1){
            hannahNPCImg.scale(150, 140);
            setImage(hannahNPCImg);
            name = 1;
            worldToAppearIn = 1;
        } else if(which == 2){
            nanamiNPCImg.scale(150, 140);
            setImage(nanamiNPCImg);
            name = 2;
            worldToAppearIn = 2;
        } else if(which == 3){
            migsNPCImg.scale(150, 140);
            setImage(migsNPCImg);
            name = 3;
            worldToAppearIn = 4;
        } else if(which == 4){
            pranavNPCImg.scale(150, 140);
            setImage(pranavNPCImg);
            name = 4;
            worldToAppearIn = 5;
        } else if(which == 5){
            migtNPCImg.scale(150, 140);
            setImage(migtNPCImg);
            name = 5;
            worldToAppearIn = 7;
        } else if(which == 6){
            andrewgNPCImg.scale(150, 140);
            setImage(andrewgNPCImg);
            name = 6;
            worldToAppearIn = 8;
        }
    }
    public void act()
    {
        actCycle++;
        giveSpell();
    }
    
    public void giveSpell(){
        if(isTouching(player.class) && spellGiven == false){
            MyWorld myworld = (MyWorld)getWorld();
            myworld.getSpellAccordingToNPC(name);
            spellGiven = true;
            return;
        } else if(spellGiven && actCycle - 375 == speak){
            MyWorld myworld = (MyWorld)getWorld();
            myworld.removeText(name);
        }
    }
    
    public void setSpeak(){
        speak = actCycle;
    }
}
