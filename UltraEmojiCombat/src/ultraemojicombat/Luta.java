
package ultraemojicombat;

import java.util.Random;


public class Luta {
    //Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    //Metodos Publicos
    public void marcarLuta(Lutador l1, Lutador l2){
      if (l1.getCategoria().equals(l2.getCategoria()) 
          && l1 != l2){
        this.aprovada = true;
        this.desafiado = l1;
        this.desafiante = l2;    
    }else{
          this.aprovada= false;
          this.desafiado=null;
          this.desafiante=null;
      }
    }
    public void lutar(){
        if(this.aprovada){
            System.out.println("####DESAFADO###");
            this.desafiado.apresentar();
            System.out.println("#####DESAFIANTE");
            this.desafiante.apresentar();
            
            Random aleatoria = new Random();
            int vencedor = aleatoria.nextInt(3); 
            switch (vencedor){
                case 0:
                    System.out.println("Empatou");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println("Vitoria do" + this.desafiado);
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println("Vitoria do"+ this.desafiante);
                    this.desafiante.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                    
            }
            
        }else{
            System.out.println("A luta não pode acontecer");
        }
        
    }
    //Metodos Especiais

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
    
}
