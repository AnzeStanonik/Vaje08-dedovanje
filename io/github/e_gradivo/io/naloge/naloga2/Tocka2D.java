package io.github.e_gradivo.io.naloge.naloga2;

public class Tocka2D {
    private double x;
    private double y;

    public Tocka2D() {

    }

    public Tocka2D(double x, double y) {
        setX(x);
        setY(y);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String toString() {
        return String.format(
            "Razdalja do tocke x: %f, razdalja do tocke y: %f.",
            x,
            y
        );
    }
}
