package io.github.e_gradivo.io.naloge.naloga1;

public class Krog {
    private double polmer;

    public Krog(double polmer) {
        this.polmer = polmer;
    }

    public double getPolmer() {
        return polmer;
    }

    public double getObseg() {
        double o = Math.PI*2*polmer;
        return o;
    }

    public double getPloscina() {
        double p = Math.PI*Math.pow(polmer, 2);
        return p;
    }

    public String toString() {
        return String.format(
           "Krog s polmerom: %f cm",
           polmer 
        );
    }
}