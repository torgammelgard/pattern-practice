package template;

import org.junit.Assert;
import org.junit.Test;

public class TemplateTwoTest {

    @Test
    public void testMyTemplate_One() {
        Template template1 = new Template_One();
        Template template2 = new Template_Two();

        String str1 = template1.doThing();
        String str2 = template2.doThing();

        Assert.assertEquals(Template_One.ACTUAL_WORK_MESSAGE, str1);
        Assert.assertEquals(Template_Two.ACTUAL_WORK_MESSAGE, str2);

    }
}
