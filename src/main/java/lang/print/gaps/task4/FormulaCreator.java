package lang.print.gaps.task4;

public class FormulaCreator {
    public static void main(String[] args) {
        byte nine = 9;
        char character1 = 'a';
        byte two = 2;
        char character2 = (char) Math.pow('a',2);
        byte five = 5;
        char character3 = 'b';
        byte seven = 7;
        byte four = 4;

        System.out.println("(9 * Math.pow(a, 2) - 5 * b + 2 + a - 7) * ((a + b - 4 * a * b) / 2)");
    }
}
