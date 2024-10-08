public class Son extends Father {
    private final double Gene;
    public Son(String x, int y, double Gene) {
        super(x, y);
        this.Gene = Gene;
    }
    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Son's DNA: " + Gene);
    }
}
