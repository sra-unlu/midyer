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
    GreenfootImage hannahNPCImg = new GreenfootImage("ppl3.png");
    GreenfootImage nanamiNPCImg = new GreenfootImage("ppl3.png");
    GreenfootImage migsNPCImg = new GreenfootImage("ppl3.png");
    GreenfootImage pranavNPCImg = new GreenfootImage("ppl3.png");
    GreenfootImage migtNPCImg = new GreenfootImage("ppl3.png");
    GreenfootImage andrewgNPCImg = new GreenfootImage("ppl3.png");
    public int name;
    public int worldToAppearIn;
    public int actCycle;
    public int speak = -2;
    public boolean spellGiven = false;

    public npc(int which){
        actCycle = 0;
        if(which == 1){
            setImage(hannahNPCImg);
            name = 1;
            worldToAppearIn = 2;
        } else if(which == 2){
            setImage(nanamiNPCImg);
            name = 2;
            worldToAppearIn = 3;
        } else if(which == 3){
            setImage(migsNPCImg);
            name = 3;
            worldToAppearIn = 5;
        } else if(which == 4){
            setImage(pranavNPCImg);
            name = 4;
            worldToAppearIn = 6;
        } else if(which == 5){
            setImage(migtNPCImg);
            name = 5;
            worldToAppearIn = 8;
        } else if(which == 6){
            setImage(andrewgNPCImg);
            name = 6;
            worldToAppearIn = 9;
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
        } else if(spellGiven && actCycle - 75 == speak){
            MyWorld myworld = (MyWorld)getWorld();
            myworld.removeText(name);
        }
    }
    
    public void setSpeak(){
        speak = actCycle;
    }
}
