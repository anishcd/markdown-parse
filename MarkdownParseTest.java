
import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MarkdownParseTest {

    @Test
    public void testIssue1() throws IOException{
        ArrayList<String> testList = new ArrayList<>();
        String contents = Files.readString(Path.of("/Users/anishdevineni/Desktop/markdown-parse/test-issue-1.md"));
        assertEquals(testList, MarkdownParse.getLinks(contents));
    }

    @Test
    public void testIssue2() throws IOException{
        ArrayList<String> testList = new ArrayList<>();
        String contents = Files.readString(Path.of("/Users/anishdevineni/Desktop/markdown-parse/test-issue-2.md"));
        assertEquals(testList, MarkdownParse.getLinks(contents));
    }

    @Test
    public void testIssue3() throws IOException{
        ArrayList<String> testList = new ArrayList<>();
        String contents = Files.readString(Path.of("/Users/anishdevineni/Desktop/markdown-parse/test-issue-3.md"));
        assertEquals(testList, MarkdownParse.getLinks(contents));
    }
}