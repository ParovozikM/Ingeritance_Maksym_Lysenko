package add;
import java.util.Scanner;

//Базовий класс
class Calculator {
    //Метод,для випадку а) в завдані
    public double calculate(double bet) {
        return bet * 1.25;
    }
}
//Похідний класс,де перевизначаємо метод"calculateWin(double bet)"
//у випадку b) в завдані
class Calculator_1 extends Calculator {
    @Override
    public double calculate(double bet) {
        double win = super.calculate(bet);
        double fee = bet * 0.05;
        return win - fee;
    }
}
//Похідний класс де перевизначаємо метод"calculateWin(double bet)"
//у випадку с) в завадні
class Calculator_2 extends Calculator {
    @Override
    public double calculate(double bet) {
        double win = super.calculate(bet);
        double fee = win * 0.10;
        return win - fee;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть ставку: ");
        double bet = scanner.nextDouble();
//  В залежності від ведденої ставки користувачем,обираємо віповідний класс для обчислення
        Calculator winningCalculator;
        if (bet < 3) {
