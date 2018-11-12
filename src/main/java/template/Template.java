package template;

abstract class Template {

    private void setup() {
        System.out.println("Setting up things...");
    }

    abstract String doActualWork();

    String doThing() {
        setup();
        return doActualWork();
    }

}
