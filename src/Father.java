public class Father {
    protected String x;
    protected int y;
    public Father(String Skin, int Tallness) {
        this.x = Skin;
        this.y = Tallness;
    }
    public void showDetails() {
        System.out.println("Father's Genes: " + x + ", FGs: " + y);
    }
    public final void displayMessage() {
        System.out.println("This is a final method in Father and cannot be overridden.");
    }
}

