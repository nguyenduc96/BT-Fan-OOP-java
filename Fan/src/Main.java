public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan(3, true, "yelow", 10);
        Fan fan2 = new Fan(2, false, "blue", 5);
        System.out.println("fan1 status " + fan1.toString());
        System.out.println("fan2 status " + fan2.toString());
    }
}
