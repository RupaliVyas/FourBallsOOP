import processing.core.PApplet;

public class TryProcessing extends PApplet{

    int b1 = 0;
    int b2 = 0;
    int b3 = 0;
    int b4 = 0;

    @Override
    public void settings() {
        super.settings();
        int width = 640;
        int height = 480;
        size(width, height);
    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {


        drawFirstCircle();
        drawSecondCircle();
        drawThirdCircle();
        drawFourthCircle();


    }

    private void drawFirstCircle() {
        int ballNumber = 1;
        ellipse(b1, ballNumber*height/5, 10, 10);
        b1+=ballNumber;
    }

    private void drawSecondCircle() {
        int ballNumber = 2;
        ellipse(b2, ballNumber*height/5, 10, 10);
        b2+=ballNumber;
    }

    private void drawThirdCircle() {
        int ballNumber = 3;
        ellipse(b3, ballNumber*height/5, 10, 10);
        b3+=ballNumber;
    }

    private void drawFourthCircle() {
        int ballNumber = 4;
        ellipse(b4, ballNumber*height/5, 10, 10);
        b4+=ballNumber;
    }

    private void setBackgroundWhite() {
        background(255);
    }

    public static void main(String[] args) {
        PApplet.main("TryProcessing", args);



    }

}