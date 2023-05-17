package io.github.e_gradivo.io.naloge.naloga1;

public class Valj extends Krog {
    private double visina;

    public Valj(double visina, double polmer) {
        super(polmer);
        this.visina = visina;
    }

    public double getVisina() {
        return visina;
    }

    public double getProstornina() {
        double prostornina = super.getObseg()*visina*super.getPloscina();
        return prostornina;
    }

    public double getPovrsina() {
        double povrsina = super.getObseg()*visina + 2*super.getPloscina();
        return povrsina;
    }

    public String toString() {
        return String.format(
            "Valj z visino %f cm in polmer %f cm.",
            visina,
            getPolmer()
        );
    }
}