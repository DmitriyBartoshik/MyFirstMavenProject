public class Runner {
    public static void main(String[] args) {
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator();
        int sum= arithmeticCalculator.countSum(7,5);
        int multiplication= arithmeticCalculator.countMultiplication(7,5);
        int subtraction= arithmeticCalculator.countSubtraction(7,5);
        System.out.println("Cумма = " +sum+" Произведение = "+ multiplication +" Разность = " + subtraction);
    }
}
