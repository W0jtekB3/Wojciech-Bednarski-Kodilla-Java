package com.kodilla.stream.beautifier;

public class PoemDecorator {

    public String decorate(String text, PoemDecoratorFunction decoratorFunction) {
        return decoratorFunction.decorate(text);
    }
}
