package com.dsa.stack.texteditor;

import java.util.Stack;

public class TextEditor {

    private String document;
    private Stack<String> undoStack;
    private Stack<String> redoStack;

    public TextEditor(String document) {
        this.document = document;
        this.undoStack = new Stack<>();
        this.redoStack = new Stack<>();
    }

    public String getDocument() {
        return document;
    }

    public void deleteParagraph(int start, int end) {
        String deleted = document.substring(start, end);

        document = document.substring(0, start) + document.substring(end);
        undoStack.push(deleted);
        redoStack.clear();
    }

    public void undo() {
        if (!undoStack.empty()) {
            String deleted = undoStack.pop();
            redoStack.push(deleted);

            int index = document.length() - deleted.length();
            document = document.substring(0, index) + deleted + " " + document.substring(index);
            document += deleted;
        }
    }

    public void redo() {
        if (!redoStack.empty()) {
            String action = redoStack.pop();
            undoStack.push(action);

            document = document.substring(0, document.length() - action.length());
        }
    }

}
