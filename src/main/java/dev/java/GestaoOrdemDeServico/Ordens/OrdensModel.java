package dev.java.GestaoOrdemDeServico.Ordens;

import dev.java.GestaoOrdemDeServico.TecnicoModel;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_Ordens")
public class OrdensModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String local;

    private TecnicoModel tecnico;

}
