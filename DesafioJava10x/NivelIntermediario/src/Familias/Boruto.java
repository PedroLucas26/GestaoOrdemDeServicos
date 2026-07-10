public class Boruto extends Uzumaki implements HyugaUzumaki {

    public Boruto() {
        super();
    }

    public Boruto(String nome, int idade, String missao, String aldeia, NivelNinja rank) {
        super(nome, idade, missao, aldeia, rank);
    }

    @Override
    public void AtivarKarma() {
        System.out.println("O karma foi ativado");
    }

    @Override
    public void AtivarJougan() {
        System.out.println("Jougan ativado");
    }

    @Override
    public void estrategiaDeBatalhaNinja() {

    }
}
