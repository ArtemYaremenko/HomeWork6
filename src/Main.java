public class Main {
    public static void main(String[] args) {

        //Task 1
        System.out.println("Task 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //Task 2
        System.out.println("\nTask 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        //Task 3
        System.out.println("\nTask 3");
        for (int i = 0; i < 17; i += 2) {
            System.out.println(i);
        }

        //Task 4
        System.out.println("\nTask 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        //Task 5
        System.out.println("\nTask 5");
        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i + " год является високосным");
        }

        //Task 6
        System.out.println("\nTask 6");
        for (int i = 7; i <= 98; i += 7) {
            System.out.print(i + " ");
        }

        //Task 7
        System.out.println("\n\nTask 7");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.print(i + " ");
        }

        //Task 8
        System.out.println("Task 8");
        int cash = 0;
        int deferredAmount = 29000;
        for (int i = 1; i <= 12; i++) {
            cash += deferredAmount;
            if (i == 1) {
                System.out.println("За " + i + " месяц, сумма накоплений равна " + cash + " рублей");
            } else if (i > 1 && i < 5) {
                System.out.println("За " + i + " месяца, сумма накоплений равна " + cash + " рублей");
            } else {
                System.out.println("За " + i + " месяцев, сумма накоплений равна " + cash + " рублей");
            }
        }

        //Task 9
        System.out.println("\nTask 9");
        float myCash = 29000f;
        float bankTax = (float)1 / 12;
        for (int i = 1; i <= 12; i++) {
            myCash = myCash + (myCash * bankTax);
            if (i == 1) {
                System.out.println("За " + i + " месяц, сумма накоплений равна " + myCash + " рублей");
            } else if (i > 1 && i < 5) {
                System.out.println("За " + i + " месяца, сумма накоплений равна " + myCash + " рублей");
            } else {
                System.out.println("За " + i + " месяцев, сумма накоплений равна " + myCash + " рублей");
            }
        }

        //Task 10
        System.out.println("\nTask 10");
        int two = 2;
        int result;
        for (int i = 1; i <= 10; i++) {
            result = two * i;
            System.out.println(two + "*" + i + "=" + result);
        }
    }
}