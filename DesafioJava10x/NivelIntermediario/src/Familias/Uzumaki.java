public class Uzumaki extends Ninja {

    public Uzumaki() {
        super();
    }

    public Uzumaki(String nome, int idade, String missao, String aldeia, NivelNinja rank) {
        super(nome, idade, missao, aldeia, rank);
    }

    public void ChacraInfinito() {
        System.out.println("Meu nome é " + getNome() + " e tenho chacra roubadasso");
    }

    @Override
    public void estrategiaDeBatalhaNinja() {

    }
}
