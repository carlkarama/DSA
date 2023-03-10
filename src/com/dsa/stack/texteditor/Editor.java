package com.dsa.stack.texteditor;

public class Editor {
    public static void main(String[] args) {

        TextEditor textEditor = new TextEditor("hello world");

        System.out.println("Before deletion: " + textEditor.getDocument());

        textEditor.deleteParagraph(6,8); // specify where to delete

        System.out.println("After deletion: " + textEditor.getDocument());

        textEditor.undo();

        System.out.println("After Undo: " + textEditor.getDocument());

        textEditor.redo();
        System.out.println("After Redo: " + textEditor.getDocument());
    }
}
