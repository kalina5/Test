package pl.kalina;

public class noweKroki {
    public static void main(String[] args) {

        int rozmiarWierszy = 5;
        int rozmiarKolumny = 5;

        int[][] tablicoweGowno = new int[rozmiarWierszy][rozmiarKolumny];
        for (int komórkiWierszy = 0; komórkiWierszy < tablicoweGowno.length; komórkiWierszy++) {
            for (int komórkiKolumny = 0; komórkiKolumny < tablicoweGowno[komórkiWierszy].length; komórkiKolumny++) {
                tablicoweGowno[komórkiWierszy][komórkiKolumny] = 0;
                int liczbaKtóraWypełniaSięCoDrugaKomórka = 2;
                //int k = 0;
                int n = 0;
                tablicoweGowno[0][2 * n + 1] = liczbaKtóraWypełniaSięCoDrugaKomórka;
                tablicoweGowno[0][2 * n + 3] = liczbaKtóraWypełniaSięCoDrugaKomórka;

                if (komórkiKolumny + 1 < rozmiarKolumny)
                    System.out.print("[" + tablicoweGowno[komórkiWierszy][komórkiKolumny] + "]" + "\t");
                else {
                    System.out.println("[" + tablicoweGowno[komórkiWierszy][komórkiKolumny] + "]");
                }


            }

        /*for (int[] x : tablicoweGowno) {
            for (int z : x){
                System.out.print(z);
                System.out.println();
            }
        }*/
        }
    }
}
