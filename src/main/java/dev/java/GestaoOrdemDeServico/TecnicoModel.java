package dev.java.GestaoOrdemDeServico;

import dev.java.GestaoOrdemDeServico.Ordens.OrdensModel;
import jakarta.persistence.*;

import java.util.List;

//Entity transforma uma classe em uma entidade do BD
@Entity
@Table(name = "tb_cadastro_de_tecnicos")
public class TecnicoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String idade;
    private String cargo;
    @OneToMany
    private List<OrdensModel> orderns;

    public TecnicoModel() {
    }

    public TecnicoModel(String nome, String idade, String cargo) {
        this.nome = nome;
        this.idade = idade;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }
}


