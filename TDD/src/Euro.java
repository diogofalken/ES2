public class Euro {
    private static final double CENTS_PER_EURO = 100;

    int euro;

    public Euro(double e) {
        this.euro = (int) Math.round(e * CENTS_PER_EURO);
    }

    public String toString(){
        return String.format("EUR %.2f", (double) this.euro/CENTS_PER_EURO);
    }

    @Override
    public boolean equals(Object e2){
        return (e2 instanceof Euro) && this.euro == ((Euro) e2).euro;
    }

    public Euro minus(Euro oneEuro) {
        return new Euro(this.euro-oneEuro.euro);
    }
}