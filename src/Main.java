public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {

        int[] numbers = new int[]{1, 2, 3}; //объявляем массивы - 1 задача
        double[] decimal = {1.57, 7.654, 9.986};
        long[] bigNumbers = {1234L, 123570872098734098L, 190341934983L};
        for (int index = 0; index < numbers.length; index++) {//распечатываем массивы - 2 задача
            if (index == numbers.length - 1) {
                System.out.println(numbers[index]);
                break;
            }
            System.out.print(numbers[index] + ", ");
        }
        for (int index = 0; index < decimal.length; index++) {
            if (index == decimal.length - 1) {
                System.out.println(decimal[index]);
                break;
            }
            System.out.print(decimal[index] + ", ");
        }
        for (int index = 0; index < bigNumbers.length; index++) {
            if (index == bigNumbers.length - 1) {
                System.out.println(bigNumbers[index]);
                break;
            }
            System.out.print(bigNumbers[index] + ", ");
        }
        for (int index = numbers.length - 1; index >= 0; index--) {//распечатываем массивы в обратную сторону - 3 задача
            if (index == 0) {
                System.out.println(numbers[index]);
                break;
            }
            System.out.print(numbers[index] + ", ");
        }
        for (int index = decimal.length - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.println(decimal[index]);
                break;
            }
            System.out.print(decimal[index] + ", ");
        }
        for (int index = bigNumbers.length - 1; index >= 0; index--) {
            if (index == 0) {
                System.out.println(bigNumbers[index]);
                break;
            }
            System.out.print(bigNumbers[index] + ", ");
        }
        for (int index = 0; index<numbers.length; index++) { //4 задача
            if (numbers[index]%2==1) {
                numbers[index]+=1;
            }
        }
        System.out.println(Arrays.toString (numbers));
    }

}