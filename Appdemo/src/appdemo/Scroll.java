/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appdemo;

import java.awt.Frame;
import java.awt.Label;
import java.awt.Scrollbar;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

/**
 *
 * @author hatro
 */
public class Scroll {
    public Scroll() {
        Frame f = new Frame("Ví dụ Scrollbar trong Java AWT");
        final Label label = new Label();
        label.setAlignment(Label.CENTER);
        label.setSize(400, 100);
        final Scrollbar s = new Scrollbar();
        s.setBounds(350, 150, 15, 200);
        f.add(s);
        f.add(label);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        s.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                label.setText("Giá trị dọc của Scrollbar là:" + s.getValue());
            }
        });
    }
 
    public static void main(String args[]) {
        new Scroll();
    }

}
