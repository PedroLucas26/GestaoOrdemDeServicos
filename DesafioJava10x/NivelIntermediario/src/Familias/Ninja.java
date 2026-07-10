public abstract class Ninja implements EstrategiaDeBatalha {

    //Modelo do Ninja
    private String nome;
    int idade;
    String missao;
    String nivelDificuldade;
    String statusMissao;
    String aldeia;
    int numeroDeMissoesConcluidas;
    NivelNinja rank;

    //Getters and Setters treino

    public Ninja() {
    }

    public Ninja(String nome, int idade, String missao, String aldeia, NivelNinja rank) {
        this.nome = nome;
        this.idade = idade;
        this.missao = missao;
        this.aldeia = aldeia;
        this.rank = rank;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getMissao() {
        return missao;
    }

    public void setMissao(String missao) {
        this.missao = missao;
    }

    public String getAldeia() {
        return aldeia;
    }

    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }

    public NivelNinja getRank() {
        return rank;
    }

    public void setRank(NivelNinja rank) {
        this.rank = rank;
    }

    //metodos
    /*public Ninja() {
    }

    public Ninja(String nome, int idade, String aldeia) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
    }

    //TODO: Sobrecarga do construtor
    //Sobrecarga de metodos voce nao precisa redeclarar o construtor so os novos atributos
    public Ninja(String nome, int idade, String aldeia, int numeroDeMissoesConcluidas, NivelNinja rank) {
        this(nome, idade, aldeia);
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank = rank;
    }


    //Metodo geral
    //Criar um metodo Publico personalizado

    public String mostrarInformacoes() {
        return nome + idade + missao + nivelDificuldade + statusMissao + aldeia;
    }

    //Metodo String vai ter que retornar uma String
    public String EuSouUmNinja() {
        return "Oi, Eu sou um ninja";
    }

    //Metodo int vai ter que retornar um int
    public int anosParaSeTornarHokage(int idadeMinimaParaSerHokage) {
        return idadeMinimaParaSerHokage - idade;
    }

    //metodo abstrato - obrigatorio em todas as classes
    //public abstract void estrategiaDeBatalhaNinja();


    @Override
    public void estrategiaDeBatalhaNinja() {
        System.out.println("Meu nome é " + nome + " Essa é minha estrategia de combate");
    }

    @Override
    public String toString() {
        return "Meu nome é " + nome + " sou de " + aldeia + " e tenho " + idade + " anos";
    }
*/


}
