tests : MarkdownParse.class MarkdownParseTestLR4.class
	java -cp .:./lib/* org.junit.runner.JUnitCore MarkdownParseTestLR4
 
MarkdownParse.class : MarkdownParse.java
	javac -cp .:./lib/* MarkdownParse.java
 
MarkdownParseTestLR4.class: MarkdownParseTestLR4.java MarkdownParse.class
	javac -cp .:./lib/* MarkdownParseTestLR4.java

CLASSPATH = lib/*:.

TryCommonMark.class: TryCommonMark.java
	javac -g -cp $(CLASSPATH) TryCommonMark.java