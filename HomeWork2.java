package module2;


public class HomeWork2 {


    public static void main(String[] args) {

        int iarray[] = {27, 2, 6, -9, 1, 4, -32, 12, 71, 19};
        double darray[] = {5.0, 1.1, 8.0, -7.0, 9.0, -2.4, 5.5, 6.7, 1.9, 1.5};

//        System.out.println(Arrays.toString(iarray));
//        System.out.println(Arrays.toString(darray));

        int sum;
        double dSum;
        int min;
        double dMin;
        int max;
        double dMax;
        int maxPositive;
        double dMaxPositive;
        int mult;
        double dMult;
        int modul;
        double dModul;
        int secondLargest;
        double dSecondLargest;


        sum = sum(iarray);  // array = iarray
        dSum = sum(darray);
        min = min(iarray);
        dMin = min(darray);
        min = max(iarray);
        dMin = max(darray);
        maxPositive = imax(iarray);
        dMaxPositive = dmax(darray);
        mult = multiplication(iarray);
        dMult = multiplication(darray);
        modul = modulus(iarray);
        dModul = modulus(darray);
        secondLargest = secondLargest(iarray);
        dSecondLargest = dSecondLargest(darray);


    }


    public static int sum(int[] array) {

        int sum = 0;

        for (int element : array) {
            sum = sum + element;
//            sum = element;
        }

        int lenght = array.length;
        System.out.println("Сумма массива int = " + sum);

        return sum;

    }

    public static double sum(double[] array) {

        double sum = 0;

        for (double element : array) {
            sum = sum + element;
        }

        System.out.println("Сумма массива double = " + sum);
        System.out.println();

        return sum;
    }

    public static int min(int[] array) {
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) min = array[i];

        }
        System.out.println("Минимальное число массива int = " + min);
        return min;

    }

    public static double min(double[] array) {
        double min = 0;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) min = array[i];

        }
        System.out.println("Минимальное число массива double = " + min);
        System.out.println();
        return min;
    }

    public static int max(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) max = array[i];

        }
        System.out.println("Максимальное число массива int = " + max);
        return max;

    }

    public static double max(double[] array) {
        double max = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) max = array[i];

        }
        System.out.println("Максимальное число массива double = " + max);
        System.out.println();
        return max;
    }

    public static int imax(int[] array) {
        int maxPositive = 0;
        for (int i = 0; i < array.length; i++) {
            if (maxPositive < array[i]) maxPositive = array[i];

        }
        System.out.println("Максимальное Позитивное массива int = " + maxPositive);
        return maxPositive;

    }

    public static double dmax(double[] array) {
        double maxPositive = 0;
        for (int i = 0; i < array.length; i++) {
            if (maxPositive < array[i]) maxPositive = array[i];

        }
        System.out.println("Максимальное Позитивное число массива double = " + maxPositive);
        System.out.println();
        return maxPositive;

    }

    public static int multiplication(int[] array) {
        int multiplication = 1;
        for (int element : array) {
            multiplication = multiplication * element;

        }
        System.out.println("Произведение массива int = " + multiplication);
        return multiplication;

    }

    public static double multiplication(double[] array) {
        double multiplication = 1;
        for (double element : array) {
            multiplication = multiplication * element;

        }
        System.out.println("Произведение массива double = " + multiplication);
        System.out.println();
        return multiplication;

    }

    public static double modulus(double[] array) {
        double modulus = 0;
        for (double element : array) {
            modulus = array[0] % array[array.length - 1];
        }
        System.out.println("Деление по модулю первое число на второе массива double = " + modulus);
        System.out.println();
        return modulus;

    }

    public static int modulus(int[] array) {
        int modulus = 0;

        for (int element : array) {

            modulus = array[0] % array[array.length - 1];
        }

        System.out.println("Деление по модулю первое число на второе массива int = " + modulus);


        return modulus;

    }

    public static int secondLargest(int[] array) {
        int max1 = array[0];
        int max2 = array[0];
        int count = 0;
        while (count < array.length) {
            if (array[count] > max1) {
                max1 = array[count];
            }
            count++;
        }
        while (count < array.length) {
            if ((array[count] > max2) && (array[count] < max1)) {
                max2 = array[count];
            }
            count++;
        }
        System.out.println("Второе максимальное число массива int = " + max2);
        return max2;

    }

    public static double dSecondLargest(double[] array) {
        double max1 = 0;
        double max2 = 0;
        int count = 0;
        while (count < array.length) {
            if (array[count] > max1) {
                max1 = array[count];
            }
            count++;
        }

        
            count = 0;


        count = 0;

        while (count < array.length) {
            if ((array[count] > max2) && (array[count] < max1))  {
                max2 = array[count];
            }
            count++;

        }
        System.out.println("Второе максимальное число массива double = " + max2);
        return max2;

    }

}




