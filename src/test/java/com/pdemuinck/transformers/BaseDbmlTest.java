package com.pdemuinck.transformers;

import com.pdemuinck.transformers.antlr.DbmlLexer;
import com.pdemuinck.transformers.antlr.DbmlParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;
import java.io.InputStream;

public class BaseDbmlTest {

    public DbmlParser parser(String input){
        CharStream charStream = CharStreams.fromString(input);
        DbmlLexer lexer = new DbmlLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        return new DbmlParser(tokens);
    }

    public DbmlParser parser(InputStream is) throws IOException {
        CharStream charStream = CharStreams.fromStream(is);
        DbmlLexer lexer = new DbmlLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        return new DbmlParser(tokens);
    }
}
