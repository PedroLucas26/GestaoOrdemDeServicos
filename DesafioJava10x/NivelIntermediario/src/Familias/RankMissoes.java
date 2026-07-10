public enum RankMissoes {

    D("Baixo", 2),
    C("Moderado", 3),
    B("Confortável", 4),
    A("Difícil", 5),
    S("Altissimo", 12);

    private String descricao;
    private int dificuldade;

    RankMissoes(String descricao, int dificuldade) {
        this.descricao = descricao;
        this.dificuldade = dificuldade;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getDificuldade() {
        return dificuldade;
    }
}
