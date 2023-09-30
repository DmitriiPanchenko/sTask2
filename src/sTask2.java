public class sTask2 {
    public static void main(String[] args) {
        eggTop();
        eggBot();
        cup();
        eggStop();
        hat();
    }

    private static void eggTop() {
        System.out.println("  _______");
        System.out.println(" /       \\");
        System.out.println("/         \\");
    }

    private static void eggBot() {
        System.out.println("\\         /");
        System.out.println(" \\_______/");
    }

    private static void line() {
        System.out.println(" +-------+");
    }

    private static void cup() {
        eggBot();
        System.out.println(" +-------+");
    }

    private static void eggStop() {
        eggTop();
        System.out.println("|   STOP  |");
        eggBot();
    }

    private static void hat() {
        eggTop();
        line();
    }
}
