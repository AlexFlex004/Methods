import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        System.out.println("CASE 1");
        checkLeapYear(1924);
        System.out.println();

        System.out.println("CASE 2");
        checkDeviceVersion(1, 2015);
        System.out.println();

        System.out.println("CASE 3");
        int deliveryDistance = 95;
        int time = checkDeliveryDays(deliveryDistance);
        if (time > 0) {
            System.out.println("Потребуется дней: " + time);
        } else {
            System.out.println("Доставка не осуществляется на это расстояние.");
        }
    }

    //CASE1///////////////////////////////////////////////////
    public static void checkLeapYear(int i) {
        if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
            System.out.println(i + " год — високосный год");
        } else {
            System.out.println(i + " год — невисокосный год");
        }
    }

    //CASE2///////////////////////////////////////////////////
    public static void checkDeviceVersion(int i, int i1) {
        int currentYear = LocalDate.now().getYear();
        int os = i;
        int deviceYear = i1;
        boolean isDeviceOld = deviceYear < 2015;
        if (os == 0) {
            if (isDeviceOld) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите обычную версию приложения для iOS по ссылке");
            }
        }
        if (os == 1) {
            if (isDeviceOld) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите обычную версию приложения для Android по ссылке");
            }
        }
        }
    //CASE3////////////////////////////////////////////////////
    private static int checkDeliveryDays(int deliveryDistance) {
        if (deliveryDistance <= 0) {
            return 0;
        } else if (deliveryDistance <= 20) {
            return 1;

        } else if (deliveryDistance <= 60) {
            return 2;
        } else if (deliveryDistance <= 100) {
            return 3;
        } else {
            return 0;
        }
    }
    }
