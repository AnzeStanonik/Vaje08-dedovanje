package io.github.e_gradivo.naloge.naloga2;

public class Tocka3D extends Tocka2D {
    private double z;

    public Tocka3D() {

    }

    public Tocka3D(double x, double y, double z) {
        super(x,y);
        setZ(z);
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public String toString() {
        return String.format(
            "Razdalja do tocke x: %f, razdalja do tocke y: %f, razdalja do tocke z: %f.",
            x,
            y,
            z
        );
    }
}