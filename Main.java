import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int n1 = in.nextInt();
        System.out.print("Введите действие: ");
        String ch = in.next();
        System.out.print("Введите второе число: ");
        int n2 = in.nextInt();
        Context context = new Context();
        context.chooseStrategy(ch,n1,n2);
    }
}

