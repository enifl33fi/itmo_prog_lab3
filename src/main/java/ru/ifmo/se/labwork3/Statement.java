package ru.ifmo.se.labwork3;

import java.util.Objects;

public class Statement {
    private String text;
    private boolean isCorrect;

    public Statement(String text, boolean isCorrect) {
        this.text = text;
        this.isCorrect = isCorrect;
    }

    public boolean isCorrectCheck() {
        return this.isCorrect;
    }

    public String getTextOfStatement() {
        return this.text;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Statement statement = (Statement) obj;
        return (Objects.equals(this.getTextOfStatement(), statement.getTextOfStatement()) && this.isCorrect == statement.isCorrect);
    }


    @Override
    public int hashCode() {
        if (this.isCorrect) {
            return (("1" + this.getTextOfStatement()).hashCode());
        } else {
            return (("0" + this.getTextOfStatement()).hashCode());
        }
    }

    @Override
    public String toString() {
        return text;
    }
}
