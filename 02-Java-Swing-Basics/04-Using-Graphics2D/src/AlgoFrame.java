import java.awt.*;
import javax.swing.*;
import java.awt.geom.Ellipse2D;

public class AlgoFrame extends JFrame{

    private int canvasWidth;
    private int canvasHeight;

    public AlgoFrame(String title, int canvasWidth, int canvasHeight){

        this.canvasWidth = canvasWidth;
        this.canvasHeight = canvasHeight;

        AlgoCanvas canvas = new AlgoCanvas();
        canvas.setPreferredSize(new Dimension(canvasWidth,canvasHeight));
        setContentPane(canvas);
        pack();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setTitle(title);

        setVisible(true);
    }

    public AlgoFrame(String title){

        this(title, 1024, 768);
    }

    public int getCanvasWidth(){return canvasWidth;}
    public int getCanvasHeight(){return canvasHeight;}


    private class AlgoCanvas extends JPanel{

        @Override
        public void paint(Graphics g) {
            super.paint(g);

            //g.drawOval(50, 50, 300, 300);

            Graphics2D g2d = (Graphics2D)g;

            Ellipse2D circle = new Ellipse2D.Double(50, 50, 600, 600);
            g2d.setPaint(Color.RED);
            int strokeWidth = 10;
            g2d.setStroke(new BasicStroke(strokeWidth, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
            g2d.draw(circle);

            Ellipse2D circle2 = new Ellipse2D.Double(50, 50, 600, 600);
            g2d.setPaint(Color.BLUE);
            g2d.fill(circle2);
        }
    }
}

