package SDA;

public class Calculator {
//    private int liczba1;
//    private int liczba2;
//
//    public Calculator(int liczba1, int liczba2) {
//        this.liczba1 = liczba1;
//        this.liczba2 = liczba2;
//    }


    public int add (int a,int b){
        return a + b;
    }

    public int roznica (int a , int b ){
        return a-b;
    }

    public int mnozenie ( int a, int b ){
        return a*b;
    }
    public double dzielenie ( double a, double b ){
        if (b==0 || a==0  ){
            throw new ArithmeticException("Incorrect value");
        }
        return a/b;
    }
    public int silnia(int a ){
        if(a==1){
            return 1;
        }
       return a*silnia(a-1);
    }
}
