
public class Daughter extends Father {
    private final double Gene;
    public Daughter(String x, int y, double Gene) {
        super(x, y);
        this.Gene = Gene;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Daughter's DNA : " + Gene);
    }
}