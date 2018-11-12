package template;

public class Template_Two extends Template {

    public final static String ACTUAL_WORK_MESSAGE = "Doing special work";

    @Override
    String doActualWork() {
        return ACTUAL_WORK_MESSAGE;
    }
}
