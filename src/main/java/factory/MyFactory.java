package factory;

 /*
 * Type : Creational
 * Level : Class
 *
 */
public class MyFactory {

     public EnemyShip makeEnemyShip(String newShipType) {
         EnemyShip enemyShip = null;
         if (newShipType.equals("U")) {
             enemyShip = new UFOEnemyShip();
         } else if (newShipType.equals("R")) {
             enemyShip = new RocketEnemyShip();
         } else if (newShipType.equals("B")) {
             enemyShip = new BigUFOEnemyShip();
         }

         return enemyShip;
     }
}

abstract class EnemyShip {

    private String name;
    private double amtDamage;

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    public double getAmtDamage() {
        return amtDamage;
    }

    void setAmtDamage(double amtDamage) {
        this.amtDamage = amtDamage;
    }

    public void followHeroShip(){
        System.out.println(getName() + " is following the hero");
    }

}

class UFOEnemyShip extends EnemyShip {
    UFOEnemyShip() {
        setName("UFO ENEMY SHIP");
        setAmtDamage(20.0);
    }
}

class RocketEnemyShip extends EnemyShip {
    RocketEnemyShip() {
        setName("Rocket enemy ship");
        setAmtDamage(10.0);
    }
}

class BigUFOEnemyShip extends UFOEnemyShip {
    BigUFOEnemyShip() {
        setName("Big UFO Enemy ship");
        setAmtDamage(40.0);
    }
}