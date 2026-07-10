public class Hyuga extends Ninja {

    public Hyuga() {
        super();
    }

    public Hyuga(String nome, int idade, String missao, String aldeia, NivelNinja rank) {
        super(nome, idade, missao, aldeia, rank);
    }

    public void Byakugan() {
        System.out.println("Eu sou "+getNome()+" e tenho um Byakugan");
    }

    @Override
    public void estrategiaDeBatalhaNinja() {

    }
}
