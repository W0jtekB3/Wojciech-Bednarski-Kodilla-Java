package com.kodilla.stream.beautifier;

public class StreamMain {

    public static void main(String[] args) {
        // Step 1: Create a PoemBeautifier object
        PoemBeautifier beautifier = new PoemBeautifier();

        // Step 2: Define Lambda Expressions for text beautification
        PoemDecorator addABC = text -> "ABC" + text + "ABC";
        PoemDecorator toUpperCase = String::toUpperCase;

        // Step 3: Call the beautify method with different texts and beautifiers
        String text1 = "This is a beautiful poem.";
        String result1 = beautifier.beautify(text1, addABC);
        System.out.println("Beautified text 1: " + result1);

        String text2 = "Streams are powerful!";
        String result2 = beautifier.beautify(text2, toUpperCase);
        System.out.println("Beautified text 2: " + result2);

        // Step 4: Add your own custom beautifiers and call the beautify method with them
        PoemDecorator customBeautifier1 = text -> "~~~ " + text + " ~~~";
        String text3 = "Custom beautifier test";
        String result3 = beautifier.beautify(text3, customBeautifier1);
        System.out.println("Beautified text 3: " + result3);

        PoemDecorator customBeautifier2 = text -> text.replaceAll("e", "3");
        String text4 = "Replace e with 3";
        String result4 = beautifier.beautify(text4, customBeautifier2);
        System.out.println("Beautified text 4: " + result4);
    }
}
