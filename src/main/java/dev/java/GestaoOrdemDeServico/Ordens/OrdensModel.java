package dev.java.GestaoOrdemDeServico.Ordens;

import dev.java.GestaoOrdemDeServico.Tecnicos.TecnicosModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Ordens Emitidas")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class OrdensModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "Nome")
    private String nome;

    @Column(name = "Descrição")
    private String descricao;

    @Column(name = "Local de Execução")
    private String local;

    // @OneToMany - Técnicos só podem estar alocados em uma Ordem
    @OneToMany
    @Column(name = "Técnicos alocados")
    private TecnicosModel tecnico;

}

