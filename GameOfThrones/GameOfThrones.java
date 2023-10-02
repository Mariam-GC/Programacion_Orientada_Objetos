public class GameOfThrones {
    public static void main(String[] args) {
        Character Mariam = new Queen(new BowAndArrow(), "Mariam");
        Mariam.fight();
        Character Anngelo = new King(new Sword(), "Annelo");
        Anngelo.fight();
        Anngelo.changeWeapon(new Knife());
        Anngelo.fight();
        Character Martin = new Troll(new Axe(), "Martin");
        Martin.fight();
        Martin.fight();
        Mariam.fight();
        
    }
    
}
