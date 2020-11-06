package Num_17;
import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    static PrintWriter printWriter;

    static {
        try {
            printWriter = new PrintWriter("Output.md");
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        }
    }

    public static void getContent(String path) {
        File file = new File(path);
        if (file.isDirectory()) {
            String[] contents = file.list();
            for (String s : contents) {
                getContent(path + "\\" + s);
            }
        }
        if (file.isFile()) {
            if (file.getName().endsWith(".java")) {
                try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
                    printWriter.write("##### " + path + "\n```java\n");
                    String string = reader.readLine();
                    while (string != null) {
                        printWriter.write(string + "\n");
                        string = reader.readLine();
                    }
                    printWriter.write("```\n");
                } catch (FileNotFoundException exception) {
                    exception.printStackTrace();
                } catch (IOException exception) {
                    exception.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        Path path = Paths.get("").toAbsolutePath();
        getContent("C:\\Users\\Miki_san\\Desktop\\Java_02\\src");
        printWriter.close();
    }
}
