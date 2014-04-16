package com.ryan.crapscalculator.ui;

import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

@SuppressWarnings("serial")
public class DigitTextField extends JTextField {

    public DigitTextField(int columns) {
        this(null, columns);
    }

    public DigitTextField(String text, int columns) {
        super(new DieValueDocument(columns), text, columns);
    }

}

@SuppressWarnings("serial")
class DieValueDocument extends PlainDocument {
    private int maxLength;

    public DieValueDocument(int maxLength) {
        this.maxLength = maxLength;
    }

    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
        if (getLength() + str.length() > maxLength) {
            Toolkit.getDefaultToolkit().beep();
        } else {
            if (str != null) {
                if (Character.isDigit(str.charAt(0))) {
                    super.insertString(offs, str, a);
                }
            }
        }
    }
}