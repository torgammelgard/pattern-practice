package prototype;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyPrototypeTest {

    private CloneFactory factory;

    @Before
    public void before() {
        factory = new CloneFactory();
    }

    @Test
    public void testMyPrototype() {
        Sheep sally = new Sheep();
        Sheep clonedSheep = (Sheep) factory.getClone(sally);

        Assert.assertNotEquals(sally.hashCode(), clonedSheep.hashCode());
    }
}
