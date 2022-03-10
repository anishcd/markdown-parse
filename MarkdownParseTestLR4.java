import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class MarkdownParseTestLR4 {

    @Test
    public void testSnippet1() throws IOException{
        ArrayList<String> testList = new ArrayList<>();
        String contents = Files.readString(Path.of("/Users/anishdevineni/Desktop/markdown-parse/lr-4-snippet-1.md"));
        testList.add("`google.com");
        testList.add("google.com");
        testList.add("ucsd.edu");
        assertEquals(testList, MarkdownParse.getLinks(contents));
    }

    @Test
    public void testSnippet2() throws IOException{
        ArrayList<String> testList = new ArrayList<>();
        String contents = Files.readString(Path.of("/Users/anishdevineni/Desktop/markdown-parse/lr-4-snippet-2.md"));
        testList.add("a.com");
        testList.add("a.com(())");
        testList.add("example.com");
        assertEquals(testList, MarkdownParse.getLinks(contents));
    }

    @Test
    public void testSnippet3() throws IOException{
        ArrayList<String> testList = new ArrayList<>();
        String contents = Files.readString(Path.of("/Users/anishdevineni/Desktop/markdown-parse/lr-4-snippet-3.md"));
        testList.add("https://ucsd-cse15l-w22.github.io/");
        assertEquals(testList, MarkdownParse.getLinks(contents));
    }

    @Test
    public void testSnippet1Group() throws IOException{
        ArrayList<String> testList = new ArrayList<>();
        String contents = Files.readString(Path.of("/Users/anishdevineni/Desktop/markdown-parse/lr-4-snippet-1.md"));
        testList.add("`google.com");
        testList.add("google.com");
        testList.add("ucsd.edu");
        assertEquals(testList, MarkdownParseGroup.getLinks(contents));
    }

    @Test
    public void testSnippet2Group() throws IOException{
        ArrayList<String> testList = new ArrayList<>();
        String contents = Files.readString(Path.of("/Users/anishdevineni/Desktop/markdown-parse/lr-4-snippet-2.md"));
        testList.add("a.com");
        testList.add("a.com(())");
        testList.add("example.com");
        assertEquals(testList, MarkdownParseGroup.getLinks(contents));
    }

    @Test
    public void testSnippet3Group() throws IOException{
        ArrayList<String> testList = new ArrayList<>();
        String contents = Files.readString(Path.of("/Users/anishdevineni/Desktop/markdown-parse/lr-4-snippet-3.md"));
        testList.add("https://ucsd-cse15l-w22.github.io/");
        assertEquals(testList, MarkdownParseGroup.getLinks(contents));
    }


}
