public class Main {
    public static void main(String[] args) {

        //Criar o ninja Naruto (objeto OOP/POO)

        Uzumaki Naruto = new Uzumaki();

        Naruto.nome = "Naruto Uzumaki";
        Naruto.idade = 16;
        Naruto.aldeia = "Konoha";
        Naruto.ChacraInfinito();

        //Criar o ninja Sasuke (objeto OOP/POO)

        Uchiha Sasuke = new Uchiha();

        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.idade = 16;
        Sasuke.aldeia = "Konoha";
        Sasuke.SharinganAtivado();

        int quantoTempoFalta = Sasuke.anosParaSeTornarHokage(40);
        System.out.println("Você tem " + Sasuke.idade + " anos falta no minimo " + quantoTempoFalta);

        //Criar o ninja Sakura (objeto OOP/POO)

        Ninja Sakura = new Ninja();

        Sakura.nome = "Sakura Haruno";
        Sakura.idade = 16;
        Sakura.aldeia = "Konoha";

        //Criar a ninja Hyuga
        Hyuga Hinata = new Hyuga();

        Hinata.nome = "Hinata Hyuga";
        Hinata.idade = 16;
        Hinata.aldeia = "Konoha";
        Hinata.Byakugan();

        //Criar boruto
        Boruto boruto = new Boruto();

        boruto.nome = "Boruto";
        boruto.idade = 9;
        boruto.aldeia = "Konoha";
        boruto.AtivarKarma();
        boruto.AtivarJougan();


    }
}