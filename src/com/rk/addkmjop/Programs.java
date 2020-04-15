package com.rk.addkmjop;

import java.awt.*;

public class Programs extends Panel {

    public Programs() {
        setBackground(Color.green);
    }

    public void Warnai(Graphics g) {
        g.setColor(new Color(0, 255, 0));                         /* Hijau */
        g.setFont(new Font("Helvetica", Font.PLAIN, 16));
        g.drawString("Hallo Rizky Khapidsyah!", 30, 100);
        g.setColor(new Color(1.0f, 0, 0));
        g.fillRect(30, 100, 150, 10);
    }

    public static void main(String[] args) {
        Frame f = new Frame("Testing Graphics Panel");
        Programs gp = new Programs();

        f.add(gp);
        f.setSize(600, 300);
        f.setVisible(true);
    }
}
