package prototype;

public class CloneFactory {

    public MyPrototype getClone(MyPrototype prototype) {
        return prototype.makeCopy();
    }
}
