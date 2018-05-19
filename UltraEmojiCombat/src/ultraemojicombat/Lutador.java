
package ultraemojicombat;


public class Lutador {
   //Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;   

    Lutador(String puts, String brasil, int i, float f, float f0, int i0, int i1, int i2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    //Metodos Publicos
    public void apresentar(){
        System.out.println("---------------------------------------");
        System.out.println("Chegou a Hora, Apresentando o lutador" + this.getNome());
        System.out.println("Diretamente de" + this.getNacionalidade());
        System.out.println("com" + this.getIdade());
        System.out.println("pesando" + this.getPeso() + "KG");
        System.out.println(this.getVitorias() + "Vitorias");
        System.out.println(this.derrotas + "derrotas");
        System.out.println(this.empates + "empates");
    }
    public void Status(){
        System.out.println(this.getNome() + "e um peso"+ this.getCategoria());
        System.out.println("Ganhou"+ this.getVitorias()+ "Vezes");
        System.out.println("Perdeu"+ this.getDerrotas() + "vezes");
        System.out.println("Empatou" + this.getEmpates()+ "Vezes");
        
        
    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias()+ 1);
        
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
        
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
        
    }
    
    //Metodos Especias

    public Lutador(String no, String na, int id, float pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.peso < 52.2){
            this.categoria="Invalido;";           
        }else if (this.peso<=70.3){
            this.categoria="Livre";
        }else if (this.peso <=83.9){
            this.categoria = "Medio";
        }else if (this.peso<= 120.2){
            this.categoria = "Pesado";
        }else{
            this.categoria = "Invalido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    
}
