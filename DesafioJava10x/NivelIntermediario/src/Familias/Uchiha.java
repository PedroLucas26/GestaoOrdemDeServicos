public class Uchiha extends Ninja{

    public Uchiha() {
        super();
    }

    public Uchiha(String nome, int idade, String missao, String aldeia, NivelNinja rank) {
        super(nome, idade, missao, aldeia, rank);
    }

    //Sharingan ativado
    public void SharinganAtivado() {
        System.out.println("O sharingan Ativou");
    }

    @Override
    public void estrategiaDeBatalhaNinja() {

    }
}
