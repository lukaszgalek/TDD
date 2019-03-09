package SDA;

public class Sort {

    public int [] sortowanie(int [] tab){

        for(int j = tab.length; j>0; j--)
            for (int i = 0; i<tab.length-1; i++ ){
                if (tab[i]> tab[i+1]){
                    int temp = tab[i];
                    tab[i] = tab[i+1];
                    tab[i+1]= temp;
                }

            }return tab;
    }


}
