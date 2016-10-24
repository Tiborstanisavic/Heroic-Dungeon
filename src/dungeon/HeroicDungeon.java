
package dungeon;


public class HeroicDungeon {

    
    public static void main(String[] args) {
        
        Dungeon dungeon = new Dungeon();
        dungeon.welcome();
        dungeon.createDungeon();
        dungeon.createPlayer();
        dungeon.gameLoop();
    }
}
