public abstract class Character {
    public Weapon weapon;
    public String name;

    public Character (Weapon weapon,String name){
        this.weapon =  weapon;
        this.name = name;
    }
    public void changeWeapon(Weapon weapon){
        weapon.useWeapon();

    }
    public abstract void fight();
    
}
class Queen extends Character implements Human {
    public Queen (Weapon weapon, String name) {
        super(weapon, name);
        System.out.println("La reina "+ name +" se ha unido a la batalla");
        
    }

    @Override
    public void fight() {
        System.out.println("La reina "+name+" ataca sin piedad");
        weapon.useWeapon();
    }
}
class King extends Character implements Human{
    public King (Weapon weapon, String name) {
        super(weapon, name);
        System.out.println("El rey "+ name +" se ha unido a la batalla");
        
    }

    @Override
    public void fight() {
        System.out.println("El rey "+name+" ataca sin piedad");
        weapon.useWeapon();
    }
}
class Knight extends Character implements Human{
    public Knight (Weapon weapon, String name) {
        super(weapon, name);
        System.out.println("El caballero "+ name +" se ha unido a la batalla");
        
    }

    @Override
    public void fight() {
        System.out.println("El caballero "+name+" ataca sin piedad");
        weapon.useWeapon();
    }
}
class Troll extends Character implements Giant {
    public Troll (Weapon weapon, String name) {
        super(weapon, name);
        System.out.println("Troll "+ name +" se ha unido a la batalla");
        
    }

    @Override
    public void fight() {
        System.out.println("Troll "+name+" ataca sin piedad");
        weapon.useWeapon();
    }
}
class Dragon extends Character implements Giant{
    public Dragon (Weapon weapon, String name) {
        super(weapon, name);
        System.out.println("Dragon "+ name +" se ha unido a la batalla");
        
    }

    @Override
    public void fight() {
        System.out.println("Dragon "+name+" ataca sin piedad");
        weapon.useWeapon();
    }
}