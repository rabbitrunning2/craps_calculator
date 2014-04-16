package com.ryan.crapscalculator.ui;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JTextField;

@SuppressWarnings("serial")
public class DecisionTextField extends JTextField {

    public DecisionTextField(int columns) {
        super(columns);
        createKeyListener();
    }

    private void createKeyListener() {
        addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                e.consume();
                onKeyTyped(e.getKeyChar());
            }
        });
    }

    private void onKeyTyped(char key) {
        if (key == 'c' || key == 'C') {
            setText("C");
        } else if (key == 'p' || key == 'P') {
            setText("P");
        } else {
            setText("");
        }
    }

}
