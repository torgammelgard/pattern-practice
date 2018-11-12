package template;

class Template_One extends Template {

    public final static String ACTUAL_WORK_MESSAGE = "Doing other special work";

    @Override
    String doActualWork() {
        return ACTUAL_WORK_MESSAGE;
    }
}