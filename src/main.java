public class main {
    public static void main(String[] args) {
    int totalAmount;
    int bonus;
    int plusCheck = 100;
    int initialAmount = 100;
    if (plusCheck > 1000) {
        bonus = plusCheck / 100;
        totalAmount = initialAmount + plusCheck + bonus;
        System.out.println(totalAmount);
    } else {
        totalAmount = initialAmount + plusCheck;
        System.out.println(totalAmount);
    }
    }
}
