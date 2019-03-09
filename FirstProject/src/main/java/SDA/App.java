package SDA;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        Calculator calculator = new Calculator();
//        System.out.println( calculator.silnia(4));

        int [] tab = { 3,1,5,2,9};

        Sort sort = new Sort();
        sort.sortowanie(tab);

        for (int i = 0; i<= tab.length-1;i++){
            System.out.println(tab[i]);
        }
    }
}
