package prototype;

public class Sheep implements MyPrototype {

    Sheep() {
        System.out.println("Sheep is made!");
    }

    @Override
    public MyPrototype makeCopy() {

        System.out.println("Sheep is BEING made!");

        Sheep sheepObject = null;
        try {
            sheepObject = (Sheep) this.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported");
        }

        return sheepObject;
    }

    @Override
    public String toString() {
        return String.format("Dolly is my hero, id : %d", this.hashCode());
    }
}
