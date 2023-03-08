
public class Main {
    public static void main(String[] args) {

        TextContainer tc = new TextContainer("Hello world. Hello Java.");
        Class<?> cl = FileName.class;
        SaveTo st = cl.getAnnotation(SaveTo.class);
        String fileName = st.fileName();
        tc.saveTextToFile(fileName);

    }
}