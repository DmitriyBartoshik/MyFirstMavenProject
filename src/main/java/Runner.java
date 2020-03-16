public class Runner {
    public static void main(String[] args) {
        MyСalculator myСalculator= new MyСalculator();
        int sum=myСalculator.countSum(7,5);
        int multiplication= myСalculator.countMultiplication(7,5);
        int subtraction= myСalculator.countSubtraction(7,5);
        System.out.println("Cумма = " +sum+" Произведение = "+ multiplication +" Разность = " + subtraction);
    }
}
