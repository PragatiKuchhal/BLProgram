//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Widening Casting");
        int num1 = 9;
        double num2 = num1;
        System.out.println(num2);

        float num5 = 9.7f;
        double num6 = num5;
        System.out.println(num6);

        System.out.println("Narrowing Casting");
        double num3 = 18.57;
        int num4 = (int) num3;
        System.out.println(num4);
    }
}