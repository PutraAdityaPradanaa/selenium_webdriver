package frames;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FrameTests extends BaseTests {

    @Test
    public void testWsiwyg(){
        var editorPage = homePage.clickWsiwygEditor();
        editorPage.clearTextArea();

        String text1 = "hello";
        String text2 = "world";

        editorPage.setTextArea(text1);
        editorPage.decreseButton();
        editorPage.setTextArea(text2);

        assertEquals(editorPage.getTextEditor(),text1+text2, "test frames");
    }
}
