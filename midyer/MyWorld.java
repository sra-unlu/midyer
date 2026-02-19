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
    public int wtai1 = 3;
    public int wtai2 = 6;
    public int wtai3 = 9;
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
    public villianHealth vh1 = new villianHealth(7);
    public villianHealth vh2 = new villianHealth(8);
    public villianHealthBarBorder vb = new villianHealthBarBorder();
    public doubleVillianHealth vdh1 = new doubleVillianHealth(true);
    public doubleVillianHealth vdh2 = new doubleVillianHealth(false);
    public villianHealthBarBorder vb1 = new villianHealthBarBorder();
    public villianHealthBarBorder vb2 = new villianHealthBarBorder();
    
    public sparkle sparkle = new sparkle();
    public fire fire = new fire();
    public computer computer = new computer();
    
    public pencils pone = new pencils();
    public pencils ptwo = new pencils();
    public pencils pthree = new pencils();
    public pencils pfour = new pencils();
    public pencils pfive = new pencils();
    public pencils psix = new pencils();
    
    public wifis wone = new wifis();
    public wifis wtwo = new wifis();
    public wifis wthree = new wifis();
    public wifis wfour = new wifis();
    public wifis wfive = new wifis();
    public wifis wsix = new wifis();
    
    public chemTests ctone = new chemTests();
    public chemTests cttwo = new chemTests();
    public chemTests ctthree = new chemTests();
    public chemTests ctfour = new chemTests();
    public chemTests ctfive = new chemTests();
    public chemTests ctsix = new chemTests();
    
    public cleaningUps cuone = new cleaningUps();
    public cleaningUps cutwo = new cleaningUps();
    public cleaningUps cuthree = new cleaningUps();
    public cleaningUps cufour = new cleaningUps();
    public cleaningUps cufive = new cleaningUps();
    public cleaningUps cusix = new cleaningUps();
    
    public showers sone = new showers();
    public showers stwo = new showers();
    public showers sthree = new showers();
    public showers sfour = new showers();
    public showers sfive = new showers();
    public showers ssix = new showers();
    
    public units uone = new units();
    public units utwo = new units();
    public units uthree = new units();
    public units ufour = new units();
    public units ufive = new units();
    public units usix = new units();
    
    public MyWorld(){    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1);
        
        worldsArr[0] = new GreenfootImage("hallway1.png");
        worldsArr[1] = new GreenfootImage("hallway2.png");
        worldsArr[2] = new GreenfootImage("hallway3.png");
        worldsArr[3] = new GreenfootImage("hallway4.png");
        worldsArr[4] = new GreenfootImage("hallway5.png");
        worldsArr[5] = new GreenfootImage("hallway6.png");
        worldsArr[6] = new GreenfootImage("hallway7.png");
        worldsArr[7] = new GreenfootImage("hallway8.png");
        worldsArr[8] = new GreenfootImage("hallway9.png");
        worldsArr[9] = new GreenfootImage("hallway1.png");


        
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
        
        setPaintOrder(spells.class, names.class, texts.class, textBox.class, darkness.class, health.class, villianHealth.class, doubleVillianHealth.class, healthBarBorder.class, villianHealthBarBorder.class, attack.class, vilAttack.class, player.class, npc.class, villian.class);
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
        world++;
        worldChanging = true;

        setBackground(worldsArr[world]);
        npcWorld(world);
        System.out.println("Current background should be: hallway" + (world+1) + ".png");

    }
    public void resetWorldTrigger(){
        worldChanging = false;
    }
    
    public void getSpellAccordingToNPC(int self){
        addObject(textbox, 500, 525);
        if(self == 1){
            addObject(pencilAttack, 324, 50);
            addObject(hannahText, 510, 525);
            hannah.setSpeak();
        } else if(self == 2){
            addObject(bcaWifi, 402, 50);
            addObject(nanamiText, 510, 535);
            nanami.setSpeak();
        } else if(self == 3){
             addObject(chemTest, 480, 50);
             addObject(migsText, 510, 525);
             migs.setSpeak();
        } else if(self == 4){
             addObject(cleaningUpUpUp, 558, 50);
             addObject(pranavText, 510, 525);
             pranav.setSpeak();
        } else if(self == 5){
            addObject(showerAttack, 636, 50);
            addObject(migtText, 510, 525);
            migt.setSpeak();
        }else if (self == 6){
             addObject(polymorphisimUnit, 714, 50);
             addObject(andrewgText, 510, 525);
             andrewg.setSpeak();
        } 
    }
    
    public Actor whoIAmAdding(int whichWorld){
        if(whichWorld == 1){
            return hannah;
        } else if(whichWorld == 2){
            return nanami;
        } else if(whichWorld == 3){
            return reyyan;
        } else if(whichWorld == 4){
            return migs;
        } else if(whichWorld == 5){
            return pranav;
        } else if(whichWorld == 6){
            return dharma;
        } else if(whichWorld == 7){
            return migt;
        } else if(whichWorld == 8){
            return andrewg;
        } else{
            return thomas;
        }
    }
    
    public villian whichVillian(int whichWorld){
        if(whichWorld == 3){
            return reyyan;
        }else if(whichWorld == 6){
            return dharma;
        }else{
            return thomas;
        }
    }
    
    public void npcWorld(int whichWorld){
        if(whichWorld == 1 || whichWorld == 2 || whichWorld == 4 || whichWorld == 5 || whichWorld == 7 || whichWorld == 8){
            if(whichWorld == 2){
                removeObject(hannah);
            }else if(whichWorld == 5){
                removeObject(migs);
            }else if(whichWorld == 8){
                removeObject(migt);
            }npc who = (npc)whoIAmAdding(whichWorld);
            addObject(who, 915, 110);
            
        }else if(whichWorld == 3 || whichWorld == 6){
            addObject(textbox, 500, 515);
            if(whichWorld == 3){
                removeObject(nanami);
                addObject(reyyanName, 900, 380);
                addObject(vh1, 970, 230);
                addObject(reyyanText, 510, 525);
            }else{
                removeObject(pranav);
                addObject(dharmaText, 510, 525);
                addObject(vh2, 970, 230);
                addObject(dharmaName, 900, 380);
            }villian who = (villian)whoIAmAdding(whichWorld);
            addObject(who, 900, 300);
            addObject(vb, 895, 225);
            p.isVillian = true;
            
        }else if(whichWorld == 9){
            addObject(textbox, 500, 515);
            removeObject(andrewg);
            addObject(thomas, 900, 200);
            addObject(thomasName, 900, 280);
            addObject(zohar, 900, 400);
            addObject(zoharName, 900, 480);
            p.isVillian = true;
            addObject(thomasZoharText, 510, 525);
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
        }else if(whoRU == 7){
            removeObject(reyyanText);
        }else if(whoRU == 8){
            removeObject(dharmaText);
        }else if(whoRU == 9){
            removeObject(thomasZoharText);
        } 
    }
    
    public void killMe(int whoRU){
        villian v = whichVillian(world);
        if(whoRU == 1){
            removeObject(pone);
            removeObject(ptwo);
            removeObject(pthree);
            removeObject(pfour);
            removeObject(pfive);
            removeObject(psix);
            v.attacked();
        } else if(whoRU == 2){
            removeObject(wone);
            removeObject(wtwo);
            removeObject(wthree);
            removeObject(wfour);
            removeObject(wfive);
            removeObject(wsix);
            v.attacked();
        } else if(whoRU == 3){
            removeObject(ctone);
            removeObject(cttwo);
            removeObject(ctthree);
            removeObject(ctfour);
            removeObject(ctfive);
            removeObject(ctsix);
            v.attacked();
        } else if(whoRU == 4){
            removeObject(cuone);
            removeObject(cutwo);
            removeObject(cuthree);
            removeObject(cufour);
            removeObject(cufive);
            removeObject(cusix);
            v.attacked();
        } else if(whoRU == 5){
            removeObject(sone);
            removeObject(stwo);
            removeObject(sthree);
            removeObject(sfour);
            removeObject(sfive);
            removeObject(ssix);
            v.attacked();
        } else if(whoRU == 6){
            removeObject(uone);
            removeObject(utwo);
            removeObject(uthree);
            removeObject(ufour);
            removeObject(ufive);
            removeObject(usix);
            v.attacked();
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
                removeObject(reyyanName);
                removeObject(vh1);
                removeObject(vb);
            } else if(whoRU == 8){
                removeObject(dharma);
                removeObject(dharmaName);
                removeObject(vh2);
                removeObject(vb);
            } else if(whoRU == 9){
                removeObject(thomas);
                removeObject(thomasName);
                removeObject(zohar);
                removeObject(zoharName);
                removeObject(vdh1);
                removeObject(vdh2);
                removeObject(vh1);
                removeObject(vh2);
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
