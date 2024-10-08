public class Main {
    public static void main(String[] args) {
        Son  son = new Son("Value1",10,99.999);
        Daughter daughter = new Daughter("Value2",20,99.999);

        son.showDetails();

        daughter.showDetails();

        son.displayMessage();
        daughter.displayMessage();

        Checker typeChecker = new Checker();
        typeChecker.identifyObjectType(son);
        typeChecker.identifyObjectType(daughter);
    }
}
