package first;

public class exercice {
    public static void main(String[] args) {
        //1
        String chaine = "azeroth";
        char[] chtab = new char[chaine.length()];
        for (int a = 0; a < chaine.length(); a++) {
            chtab[a] = chaine.charAt(a);
        }
        System.out.println("exercice 1 : ");
        System.out.println(chtab);
        System.out.println(chtab.getClass());

        //2
        char[] chartab = {'a', 'z', 'e', 'r', 'o', 't', 'h'};
        String ch = new String(chartab);
        System.out.println("exercice 2 : ");
        System.out.println(ch);
        System.out.println(ch.getClass());

        //3
        char[] chartabz = {'a', 'z', 'e', 'r', 'o', 't', 'h'};
        char temp;
        int changement = chaine.length()/2;
        for (int r=0;r<=changement; r++){
            temp = chartabz[r];
            chartabz[r]= chartabz[chartabz.length-(r+1)];
            chartabz[chartabz.length-(r+1)]=temp;
        }
        System.out.println("exercice 3 : ");
        System.out.println(chartabz);

        //4
        char[] tabtri = new char[chartab.length];
        char[] chtab_t = chtab;//copie du tableau de départ pour garder l'original intact
        for (int j = 0; j < chtab.length; j++) {//boucle sur le splace du tableau trié
            char max ='a';
            int pos = 0;
            for (int i = 0; i < chtab.length; i++) {//boucle pour rechercher la lettre la plus élevée
                if (max < chtab_t[i]){
                    max = chtab_t[i];//recup du plus haut caractère
                    pos = i;//position a reset pour ne pas avoir un tableau plein de la plus haute valeur
                }
            }
            chtab_t[pos] = 'a';//reset a la plus basse valeur pour ne pas reprendre la meme
            tabtri[j] = max;
        }
        System.out.println("exercice 4 : ");
        System.out.println(tabtri);
    }
}
