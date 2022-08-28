package commandPattern;

import com.CounterX.commandPattern.EditorDemo;
import org.junit.Test;

public class EditorDemoTest {

    @Test
    public void test01() {
        EditorDemo editor = new EditorDemo("123");
        editor.insert(1, "a");
        editor.undo();
        editor.redo();
    }
}
