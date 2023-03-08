import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.lang.reflect.Field;

public class TextContainer {

    private String text;

    public TextContainer(String text) {
        this.text = text;
    }

    public TextContainer() {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Saver
    public void saveTextToFile(String outFileName) {
        try (PrintWriter a = new PrintWriter(outFileName)) {
            a.println(this.text);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "TextContainer{" +
                "text='" + text + '\'' +
                '}';
    }
}
