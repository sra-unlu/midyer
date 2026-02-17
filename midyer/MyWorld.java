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
    player p = new player();
    
    private int health = 100;
    
    private GreenfootImage[] worldsArr = new GreenfootImage[10];
    public int world = 0;
    public int worldsForHallways = 0;
    private int totalWorlds = 5;
    private boolean worldChanging = false;
    public int lastAttacked = 2;
    
    public npc hannah = new npc(1);
    public pencilAttack pencilAttack = new pencilAttack();

    public npc nanami = new npc(2);
    public bcaWifi bcaWifi = new bcaWifi();

    public npc migs = new npc(3);
    public chemTest chemTest = new chemTest();

    public npc pranav = new npc(4);
    public cleaningUpUpUp cleaningUpUpUp = new cleaningUpUpUp();

    public npc migt = new npc(5);
    public showerAttack showerAttack = new showerAttack();

    public npc andrewg = new npc(6);
    public polymorphisimUnit polymorphisimUnit = new polymorphisimUnit();

    public villian reyyan = new villian(1);
    public villian dharma = new villian(2);
    public villian thomas = new villian(3);
    public villian zohar = new villian(4);
    public int wtai1 = 4;
    public int wtai2 = 7;
    public int wtai3 = 10;
    public textBox textbox = new textBox();
    public andrewgText andrewgText = new andrewgText();
    public dharmaName dharmaName = new dharmaName();
    public dharmaText dharmaText = new dharmaText();
    public hannahText hannahText = new hannahText();
    public migsText migsText = new migsText();
    public migtText migtText = new migtText();
    public nanamiText nanamiText = new nanamiText();
    public pranavText pranavText = new pranavText();
    public reyyanName reyyanName = new reyyanName();
    public reyyanText reyyanText = new reyyanText();
    public thomasZoharText thomasZoharText = new thomasZoharText();
    public thomasName thomasName = new thomasName();
    public zoharName zoharName = new zoharName();
    public villianHealth vh = new villianHealth();
    public villianHealthBarBorder vb = new villianHealthBarBorder();
    public doubleVillianHealth vdh1 = new doubleVillianHealth(true);
    public doubleVillianHealth vdh2 = new doubleVillianHealth(false);
    public villianHealthBarBorder vb1 = new villianHealthBarBorder();
    public villianHealthBarBorder vb2 = new villianHealthBarBorder();
    
    public sparkle sparkle;
    public fire fire;
    public computer computer;
    public pencils pone;
    public pencils ptwo;
    public pencils pthree;
    public pencils pfour;
    public pencils pfive;
    public pencils psix;
    
    public wifis wone;
    public wifis wtwo;
    public wifis wthree;
    public wifis wfour;
    public wifis wfive;
    public wifis wsix;
    
    public chemTests ctone;
    public chemTests cttwo;
    public chemTests ctthree;
    public chemTests ctfour;
    public chemTests ctfive;
    public chemTests ctsix;
    
    public cleaningUps cuone;
    public cleaningUps cutwo;
    public cleaningUps cuthree;
    public cleaningUps cufour;
    public cleaningUps cufive;
    public cleaningUps cusix;
    
    public showers sone;
    public showers stwo;
    public showers sthree;
    public showers sfour;
    public showers sfive;
    public showers ssix;
    
    public units uone;
    public units utwo;
    public units uthree;
    public units ufour;
    public units ufive;
    public units usix;
    
    public MyWorld(){    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1);
        
        worldsArr[1] = new GreenfootImage("hallway1.png");
        worldsArr[2] = new GreenfootImage("hallway2.png");
        worldsArr[3] = new GreenfootImage("hallway3.png");
        worldsArr[4] = new GreenfootImage("hallway4.png");
        worldsArr[5] = new GreenfootImage("hallway5.png");


        
        setBackground(worldsArr[0]);

        MusicManager.startMusic();
        
        addObject(p, 40, 300); 
        
        health bar = new health(p);
        addObject(bar, 40, 220);
        
        healthBarBorder border = new healthBarBorder(p);
        addObject(border, 40, 220);
        
        addObject(new darkness(), 40, 300);
        addObject(new collision(), 500, 555);
        addObject(new collision(), 500, 0);
        
        setPaintOrder(textBox.class, darkness.class, healthBarBorder.class, health.class, villian.class, player.class, npc.class);
    }
    
    public int health() {
        return health;
    }
    
    public void changeHealth(int amount) {
        health += amount;
        if (health < 0) {
            health = 0;
        }
        if (health > 100) {
            health = 100;
        }
    }
    
    public void started() {
        MusicManager.startMusic();
    }

    public void stopped() {
        MusicManager.stopMusic();
    }
    
    public void nextWorld(){
        if(worldChanging){
            return;
        }

        worldChanging = true;

        world++;
        worldsForHallways++;

        if (worldsForHallways >= totalWorlds){
            worldsForHallways = 0;
        }
        
        setBackground(worldsArr[worldsForHallways]);
        npcWorld(world);
        System.out.println("Current background should be: hallway" + (world+1) + ".png");

    }
    public void resetWorldTrigger(){
        worldChanging = false;
    }
    
    public void getSpellAccordingToNPC(int self){
        addObject(textbox, 500, 525);
        if(self == 1){
            addObject(pencilAttack, 324, 960);
            addObject(hannahText, 500, 525);
            hannah.setSpeak();
        } else if(self == 2){
            addObject(bcaWifi, 392, 910);
            addObject(nanamiText, 500, 525);
            nanami.setSpeak();
        } else if(self == 3){
             addObject(chemTest, 460, 860);
             addObject(migsText, 500, 525);
             migs.setSpeak();
        } else if(self == 4){
             addObject(cleaningUpUpUp, 528, 810);
             addObject(pranavText, 500, 525);
             pranav.setSpeak();
        } else if(self == 5){
            addObject(showerAttack, 596, 760);
            addObject(migtText, 500, 525);
            migt.setSpeak();
        }else if (self == 6){
             addObject(polymorphisimUnit, 664, 710);
             addObject(andrewgText, 500, 525);
             andrewg.setSpeak();
        } 
    }
    
    public Actor whoIAmAdding(int whichWorld){
        if(whichWorld == 2){
            return hannah;
        } else if(whichWorld == 3){
            return nanami;
        } else if(whichWorld == 4){
            return reyyan;
        } else if(whichWorld == 5){
            return migs;
        } else if(whichWorld == 6){
            return pranav;
        } else if(whichWorld == 7){
            return dharma;
        } else if(whichWorld == 8){
            return migt;
        } else if(whichWorld == 9){
            return andrewg;
        } else{
            return thomas;
        }
    }
    
    public void npcWorld(int whichWorld){
        if(whichWorld == 2 || whichWorld == 3 || whichWorld == 5 || whichWorld == 6 || whichWorld == 8 || whichWorld == 9){
            if(whichWorld == 3){
                removeObject(hannah);
            }else if(whichWorld == 6){
                removeObject(migs);
            }else if(whichWorld == 9){
                removeObject(migt);
            }npc who = (npc)whoIAmAdding(whichWorld);
            addObject(who, 915, 110);
            
        }else if(whichWorld == 4 || whichWorld == 7){
            addObject(textbox, 500, 525);
            if(whichWorld == 4){
                removeObject(nanami);
                addObject(reyyanName, 900, 380);
                addObject(reyyanText, 500, 525);
            }else{
                removeObject(pranav);
                addObject(dharmaText, 500, 525);
                addObject(dharmaName, 900, 380);
            }villian who = (villian)whoIAmAdding(whichWorld);
            addObject(who, 900, 300);
            addObject(vh, 900, 220);
            addObject(vb, 900, 220);
            p.isVillian = true;
            
        }else if(whichWorld == 10){
            addObject(textbox, 500, 525);
            removeObject(andrewg);
            addObject(thomas, 900, 200);
            addObject(thomasName, 900, 280);
            addObject(zohar, 900, 400);
            addObject(zoharName, 900, 480);
            p.isVillian = true;
            addObject(thomasZoharText, 500, 525);
            addObject(vdh1, 900, 120);
            addObject(vdh2, 900, 320);
            addObject(vb1, 900, 120);
            addObject(vb2, 900, 320);
        }
    }
    
    public void removeText(int whoRU){
        removeObject(textbox);
        if(whoRU == 1){
            removeObject(hannahText);
        } else if(whoRU == 2){
            removeObject(nanamiText);
        } else if(whoRU == 3){
            removeObject(migsText);
        } else if(whoRU == 4){
            removeObject(pranavText);
        } else if(whoRU == 5){
            removeObject(migtText);
        } else if(whoRU == 6){
            removeObject(andrewgText);
        }
    }
    
    public void killMe(int whoRU){
        if(whoRU == 1){
            removeObject(pone);
            removeObject(ptwo);
            removeObject(pthree);
            removeObject(pfour);
            removeObject(pfive);
            removeObject(psix);
        } else if(whoRU == 2){
            removeObject(wone);
            removeObject(wtwo);
            removeObject(wthree);
            removeObject(wfour);
            removeObject(wfive);
            removeObject(wsix);
        } else if(whoRU == 3){
            removeObject(ctone);
            removeObject(cttwo);
            removeObject(ctthree);
            removeObject(ctfour);
            removeObject(ctfive);
            removeObject(ctsix);
        } else if(whoRU == 4){
            removeObject(cuone);
            removeObject(cutwo);
            removeObject(cuthree);
            removeObject(cufour);
            removeObject(cufive);
            removeObject(cusix);
        } else if(whoRU == 5){
            removeObject(sone);
            removeObject(stwo);
            removeObject(sthree);
            removeObject(sfour);
            removeObject(sfive);
            removeObject(ssix);
        } else if(whoRU == 6){
            removeObject(uone);
            removeObject(utwo);
            removeObject(uthree);
            removeObject(ufour);
            removeObject(ufive);
            removeObject(usix);
        } else if (whoRU == 10){
            removeObject(sparkle);
        } else if (whoRU == 11){
            removeObject(fire);
        } else if (whoRU == 12){
            removeObject(computer);
        }
        else{
            if(whoRU == 7){
                removeObject(reyyan);
                removeObject(vh);
                removeObject(vb);
            } else if(whoRU == 8){
                removeObject(dharma);
                removeObject(vh);
                removeObject(vb);
            } else if(whoRU == 9){
                removeObject(thomas);
                removeObject(zohar);
            }
        }
    }
    
    public void addMe(int whoRU){
        if(whoRU == 1){
            addObject(pone, p.getX(), 220);
            addObject(ptwo, p.getX(), 252);
            addObject(pthree, p.getX(), 284);
            addObject(pfour, p.getX(), 316);
            addObject(pfive, p.getX(), 348);
            addObject(psix, p.getX(), 380);
        } else if(whoRU == 2){
            addObject(wone, p.getX(), 220);
            addObject(wtwo, p.getX(), 252);
            addObject(wthree, p.getX(), 284);
            addObject(wfour, p.getX(), 316);
            addObject(wfive, p.getX(), 348);
            addObject(wsix, p.getX(), 380);
        } else if(whoRU == 3){
            addObject(ctone, p.getX(), 220);
            addObject(cttwo, p.getX(), 252);
            addObject(ctthree, p.getX(), 284);
            addObject(ctfour, p.getX(), 316);
            addObject(ctfive, p.getX(), 348);
            addObject(ctsix, p.getX(), 380);
        } else if(whoRU == 4){
            addObject(cuone, p.getX(), 220);
            addObject(cutwo, p.getX(), 252);
            addObject(cuthree, p.getX(), 284);
            addObject(cufour, p.getX(), 316);
            addObject(cufive, p.getX(), 348);
            addObject(cusix, p.getX(), 380);
        } else if(whoRU == 5){
            addObject(sone, p.getX(), 220);
            addObject(stwo, p.getX(), 252);
            addObject(sthree, p.getX(), 284);
            addObject(sfour, p.getX(), 316);
            addObject(sfive, p.getX(), 348);
            addObject(ssix, p.getX(), 380);
        } else if(whoRU == 6){
            addObject(uone, p.getX(), 220);
            addObject(utwo, p.getX(), 252);
            addObject(uthree, p.getX(), 284);
            addObject(ufour, p.getX(), 316);
            addObject(ufive, p.getX(), 348);
            addObject(usix, p.getX(), 380);
        }
    }
    
    public void attack(int whoRU){
        if(whoRU == 1){
            addObject(sparkle, 800, 300);
        }if(whoRU == 2){
            addObject(fire, 800, 300);
        }if(whoRU == 3){
            addObject(computer, 800, 300);
        }
    }
    
    public int vilHealth(){
        if(world == wtai1){
            return reyyan.health;
        }return dharma.health;
    }
    
    public int doubleVilHealth(boolean it){
        if(it){
            return thomas.health;
        } return zohar.health;
    }
    
    public void changeVHealth(int damage){
        if(world == wtai1){
            reyyan.health += damage;
        } else if(world == wtai2){
            dharma.health += damage;
        }
    }
    
    public void changeDoubleVHealth(int damage){
        if(lastAttacked == 2){
            lastAttacked--;
            zohar.health += damage;
        }else{
            lastAttacked++;
            thomas.health += damage;
        }
    }
}
