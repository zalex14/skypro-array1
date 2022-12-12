import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nДомашнее задание Массивы 1");
        task1 ();
//
    }


        public static void task1 () {
        // Выполнено в одном методе

        System.out.println("\nЗадача 1");

        int[] array1 = new int [] { 1, 2, 3 }; //Целочисленный массив с помощью new
        double[] array2 = { 1.57, 7.654, 9.986 }; // Массив сразу со значениями
        int [] array3 = { 0, 1, 2, 3, 4, 5, 6 }; // Массив сразу со значениями

        int array1Cells = array1.length -1; // Запоминаем число ячеек массивов
        int array2Cells = array2.length -1;
        int array3Cells = array3.length -1;


        System.out.println("\nЗадача 2");
        for ( int i=0; i <= array1Cells; i++ ) {  // Выводим массив 1
                System.out.print( array1 [i] );
                if( i != array1Cells ) {
                    System.out.print( ", " );
                }
            }
        System.out.println( );

        for ( int i=0; i<= array2Cells; i++ ) {  // Выводим массив 2
                System.out.print( array2 [i] );
                if( i != array2Cells ) {
                    System.out.print( ", " );
                }
            }
        System.out.println( );

        for ( int i=0; i<= array3Cells; i++ ) {  // Выводим массив 3
                System.out.print( array3 [i] );
                if( i !=  array3Cells ) {
                    System.out.print( ", " );
                }
            }
        System.out.println( );



        System.out.println("\nЗадача 3");
        for ( int i=array1Cells; i>= 0 ; i-- ) {  // Выводим массив 1 в обратном порядке
        System.out.print( array1 [i] );
        if( i != 0 ) {
            System.out.print( ", " );
        }
    }
        System.out.println( );

        for ( int i=array2Cells; i >=0; i-- ) {  // Выводим массив 2 в обратном порядке
        System.out.print( array2 [i] );
        if( i != 0 ) {
            System.out.print( ", " );
        }
    }
        System.out.println( );

        for ( int i=array3Cells; i >= 0; i-- ) {  // Выводим массив 3 в обратном порядке
        System.out.print( array3 [i] );
        if( i != 0 ) {
            System.out.print( ", " );
        }
    }
        System.out.println( );



        System.out.println("\nЗадача 4");
            for ( int i=0; i <= array1Cells ; i++ ) {  // Делаем нечетный числа четными и выводим массив
                if ( array1[i] % 2 != 0 ) {
                    array1[i]++;
                }
            }
            System.out.println( Arrays.toString(array1) );
    }
}