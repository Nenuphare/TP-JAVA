import java.util.ArrayList;
import java.util.List;

public class RandomList {
    public static void main(String[] args) {
        List<Integer> arrayNb = new ArrayList<Integer>();
        List<Integer> arrayPair = new ArrayList<Integer>();
        List<Integer> arrayImpair = new ArrayList<Integer>();

        long produit=1;
        int somme=0;
        int min=100000000;
        int max=0;
        for (int i=0 ;i<=10;i++){
            int rand = (int)(Math.random()*101);
            arrayNb.add(rand);
            System.out.println(arrayNb.get(i));
        }
        for (int i=0; i<arrayNb.size();i++){
            somme=somme+arrayNb.get(i);
            produit =produit * arrayNb.get(i);
            if(arrayNb.get(i) <min){
                min= arrayNb.get(i);
            }
            if (arrayNb.get(i)>max){
                max= arrayNb.get(i);
            }
            if (arrayNb.get(i)%2==0){
                arrayPair.add(arrayNb.get(i));
            }
            if (arrayNb.get(i)%2==1){
                arrayImpair.add(arrayNb.get(i));
            }
        }
        System.out.println("La somme des termes du tableau :"+somme);
        System.out.println("Le produit des termes du tableau :"+produit);
        System.out.println("min  :"+min);
        System.out.println("max :"+max);
        System.out.println("tableau des Pair :");
        for (int i=0;i<arrayPair.size();i++){
            System.out.println(arrayPair.get(i));
        }
        System.out.println("tableau des Impairs :");
        for (int j=0;j<arrayImpair.size();j++){
            System.out.println(arrayImpair.get(j));
        }

    }
}
