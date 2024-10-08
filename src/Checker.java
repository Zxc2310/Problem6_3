public class Checker {
    public void identifyObjectType(Father obj) {
        if (obj instanceof Son) {
            System.out.println("This object is an instance of Son.");
        } else if (obj instanceof Daughter) {
            System.out.println("This object is an instance of Daughter.");
        } else {
            System.out.println("This object is not an instance of Son or Daughter.");
        }
    }
}