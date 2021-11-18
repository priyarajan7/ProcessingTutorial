import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    int a = 0, b=0, c=0, d=0;

    public static void main(String[] args) {
        PApplet.main("TryProcessing", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {
        drawCircle();
    }

    private void drawCircle() {
        ellipse(a, HEIGHT/5, DIAMETER,DIAMETER);
        a++;
        ellipse(b, 2 * HEIGHT/5, DIAMETER,DIAMETER);
        b+=2;
        ellipse(c, 3 * HEIGHT/5, DIAMETER,DIAMETER);
        c+=3;
        ellipse(d, 4 * HEIGHT/5, DIAMETER,DIAMETER);
        d+=4;
    }
}
