package dev.java.GestaoOrdemDeServico.Tecnicos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Técnicos")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TecnicosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "Nome")
    private String nome;

    @Column(name = "Cargo")
    private String cargo;

    @Column(name = "Idade")
    private String idade;

    @Column(name = "Disponibilidade")
    private Disponibilidade disponibilidade;

    // @ManyToOne - Uma ordem pode ter mais de um Tecnico cadastrado
    @ManyToOne
    @Column(name = "Ordem Atual")
    private String ordem;

}
