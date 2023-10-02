public interface Weapon {
    abstract void useWeapon();
    
}
class Sword implements Weapon{
    Sword(){
        System.out.println("Espada activada");
    }

    @Override
    public void useWeapon() {
        System.out.println("Da espadazos");
    }
}
//CORREGIR MÉTODOS
class Axe implements Weapon{
    Axe(){
        System.out.println("Hacha activada");
    }

    @Override
    public void useWeapon() {
        System.out.println("Da hachazo");
    }
}
class Knife implements Weapon{
    Knife(){
        System.out.println("Cuchillo activado");
    }

    @Override
    public void useWeapon() {
        System.out.println("Da cuchillazos");
    }
}
class BowAndArrow implements Weapon{
    BowAndArrow(){
        System.out.println("Arco y flecha activados");
    }

    @Override
    public void useWeapon() {
        System.out.println("Dispara flecha");
    }
}
