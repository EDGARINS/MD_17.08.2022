public class main {
    public static void main(String[] args) {

    for (int i = 0; i <=5; i++) {
        for (int j = 8; j > i; j-=1) {
            System.out.print(" ");
        }
        for (int k = 1; k <= i; k++) {
            System.out.print(" *");
        }

        System.out.println();
    }

    }
}
