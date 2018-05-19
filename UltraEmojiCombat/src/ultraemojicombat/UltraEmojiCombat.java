
package ultraemojicombat;


public class UltraEmojiCombat {

    public static void main(String[] args) {
        Lutador l = new Lutador("Nome", "França", 31,
                                   1.75f, 11, 2, 1);
         Lutador l1 = new Lutador("Prety", "França", 31,
                                   1.75f, 11, 2, 1);
         Lutador l2 = new Lutador("Puts", "França", 31,
                                   1.75f, 11, 2, 1);
         Lutador l3 = new Lutador("Dead", "França", 31,
                                   1.75f, 11, 2, 1);
         Lutador l4 = new Lutador("Nerd", "França", 31,
                                   1.75f, 11, 2, 1);
         Lutador l5 = new Lutador("UFC", "França", 31,
                                   1.75f, 11, 2, 1);
                      Luta UEC01 = new Luta();
                      UEC01.marcarLuta(l1, l2);
                      UEC01.lutar();
    }
    
}
