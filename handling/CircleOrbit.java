/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package event.handling;

/**
 *
 * @author keert
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Point2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;


public class CircleOrbit{

    private Circle center;
    private Circle orbiter;
    private int tick;
    private static final double DEG_TO_RAD = Math.PI / 180;

    private static final int TIMER_DELAY = 25;
    public CircleOrbit(Circle center){
        this.center = center;
        orbiter = new Circle(new Point2D.Double(), center.radius/10);
        tick = 0;
        updateOrbiterLoc();
    }

    private void updateOrbiterLoc(){
        Point2D.Double d = new Point2D.Double();
        final double xCenter = center.center.x;
        final double yCenter = center.center.y;
        final double rad = center.radius;
        d.setLocation(xCenter + rad * Math.cos(tick * DEG_TO_RAD),
                      yCenter + rad * Math.sin(tick * DEG_TO_RAD));
        orbiter.setCenter(d);
    }

    public void tick(){
        tick += 1;
        updateOrbiterLoc();
    }

    public void draw(Graphics2D g){
        center.draw(g);
        orbiter.draw(g);
    }
    public OrbitPanel getPanel(){
        return new OrbitPanel();
    }

    public static void main(String[] args){
        JFrame f = new JFrame();
        final CircleOrbit c = new CircleOrbit(new Circle(new Point2D.Double(250, 250), 200));

        final OrbitPanel o = c.getPanel();
        f.add(o, BorderLayout.CENTER);
        f.pack();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        final Timer t = new Timer(TIMER_DELAY, null);
        t.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                c.tick();
                o.repaint();
                t.restart();
           
            }
        });
        t.start();
    }

    @SuppressWarnings("serial")
    class OrbitPanel extends JPanel{

        public OrbitPanel(){
            setPreferredSize(new Dimension(
                    (int)(center.center.x + center.radius * 1.1),
                    (int)(center.center.y + center.radius * 1.1)
                ));
        }

        @Override
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.setColor(Color.blue);
            CircleOrbit.this.draw((Graphics2D)g);
        }
    }

    static class Circle {

        private Point2D.Double center;
        private double radius;

        public Circle(Point2D.Double c, double r){
            center = c;
            radius = r;
        }
public class EventHandling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
public void setCenter(Point2D.Double c){
            center = c;
        }

        public void draw(Graphics2D g){
            int x = (int)(center.x - radius);
            int y = (int)(center.y - radius);
            int size = (int)(radius * 2);
            g.drawOval(x, y, size, size);
        }

        public String toString(){
            return center.toString() + " r=" + radius;
        }
    }
}
