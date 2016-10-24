
package dungeon;

import java.util.Scanner;



public class Player {
    
    Scanner scan = new Scanner(System.in);
    private String name = scan.next();
    private int cache = 0;
    private int hp = 100;
    private boolean wearSuit = false;
    

    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public void setCache(int cache) {
        this.cache = cache;
    }
    
    public void addToCache( int toBeAdded )
       {
           this.cache += toBeAdded;
       }
    
    public int getCache() {
        return cache;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    
    
    public boolean isWearSuit() {
        return wearSuit;
    }

    public void setWearSuit(boolean wearSuit) {
        this.wearSuit = wearSuit;
    }
    
    
     @Override
    public String toString() {
        return "Player{" + "name=" + name + '}';
    }
    
    
    
    

   
    
    
}