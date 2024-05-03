package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier beautifier = new PoemBeautifier();

        PoemDecorator addABC = (text) -> "ABC" + text + "ABC";
        beautifier.beautify("Hello World!", addABC);

        PoemDecorator toUpperCase = (text) -> text.toUpperCase();
        beautifier.beautify("Hello World!", toUpperCase);

        PoemDecorator reverseText = (text) -> new StringBuilder(text).reverse().toString();
        beautifier.beautify("Hello World!", reverseText);


        PoemDecorator replaceO = (text) -> text.replace("o", "*");
        beautifier.beautify("Hello World!", replaceO);

        PoemDecorator addExclamation = (text) -> text.concat("!!!");
        beautifier.beautify("Hello World!", addExclamation);
    }
}
