package dev.java.GestaoOrdemDeServico.Ordens;

import dev.java.GestaoOrdemDeServico.TecnicoModel;
import jakarta.persistence.*;

@Entity
@Table(name = "Ordens Emitidas")
public class OrdensModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String local;

    @ManyToOne
    @JoinColumn(name = "tecnico_id")
    private TecnicoModel tecnico;

    public OrdensModel() {
    }

    public OrdensModel(Long id, String nome, String local, TecnicoModel tecnico) {
        this.id = id;
        this.nome = nome;
        this.local = local;
        this.tecnico = tecnico;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public TecnicoModel getTecnico() {
        return tecnico;
    }

    public void setTecnico(TecnicoModel tecnico) {
        this.tecnico = tecnico;
    }
}
