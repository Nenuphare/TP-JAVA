public class exo1a {
    public static void main(String[] args){
        int[] tableau = new int[10];
        int[] tabPair = new int [10];
        int[] tabImpair = new int [10];
        int produit = 1;
        int somme = 0;
        int min = 667;
        int max = tableau[0];

        for (int i : tableau){
            int aleatoire = (int) (Math.random() *101);
            tableau[i]=aleatoire;
            System.out.println(tableau[i]);
            somme += tableau[i];
            produit = produit * tableau[i];

            if (tableau[i] < min){
                min = tableau[i];
            }
            if (tableau[i] > max){
                max = tableau[i];
            }
            if (tableau[i]%2 == 0){
                tabPair[i] = tableau[i];
            }
            else {
                tabImpair[i] = tableau[i];
            }
        }
        System.out.println("Tableau des pairs");

        for (int pair: tabPair) {
            System.out.println(pair);
        }
        System.out.println("Tableau des impairs");

        for (int impair: tabImpair){
            System.out.println(impair);
        }
        System.out.println("La somme du tableau est :"+somme);
        System.out.println("Le produit des termes du tableau est :"+produit);
        System.out.println("Le max est:"+max);
        System.out.println("Le min est:"+min);


    }
}
