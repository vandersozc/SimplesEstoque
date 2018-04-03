package br.vandersoncamp.simples.model;import javax.persistence.*;import javax.validation.constraints.NotNull;import java.io.Serializable;import java.time.LocalDate;@Entity@Table(name = "entradas")@SequenceGenerator(name = "seq_entradas", sequenceName = "seq_entradas", initialValue = 1, allocationSize = 1)public class Entrada implements Serializable, EntityID {    private static final long serialVersionUID = 1L;    @Id    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_entradas")    private Long id;    @NotNull(message = "Não foi informada a data de entrada")    @Column(name = "data_entrada", nullable = false)    private LocalDate dataEntrada;    @Column(name = "observacao", length = 500, nullable = true)    private String observacao;    public Long getId() {        return id;    }    public void setId(Long id) {        this.id = id;    }    public String getObservacao() {        return observacao;    }    public void setObservacao(String observacao) {        this.observacao = observacao;    }    public LocalDate getDataEntrada() {        return dataEntrada;    }    public void setDataEntrada(LocalDate dataEntrada) {        this.dataEntrada = dataEntrada;    }}