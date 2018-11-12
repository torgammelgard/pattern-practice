package factory;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MyFactoryTest {

    private MyFactory myFactory;

    @Before
    public void setup () {
        myFactory = new MyFactory();
    }

    @Test
    public void test_UFOEnemyShip() {
        EnemyShip enemyShip = myFactory.makeEnemyShip("U");
        assertTrue(enemyShip instanceof UFOEnemyShip);
    }

    @Test
    public void test_RocketEnemyShip() {
        EnemyShip enemyShip = myFactory.makeEnemyShip("R");
        assertTrue(enemyShip instanceof RocketEnemyShip);
    }

    @Test
    public void test_BigUFOEnemyShip() {
        EnemyShip enemyShip = myFactory.makeEnemyShip("B");
        assertTrue(enemyShip instanceof BigUFOEnemyShip);
    }
}
