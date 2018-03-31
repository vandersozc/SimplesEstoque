package br.vandersoncamp.simples.model;import javax.persistence.*;import javax.validation.constraints.NotNull;import javax.validation.constraints.Size;import java.io.Serializable;@Entity@Table(name = "produtos")@SequenceGenerator(name = "seq_produtos", sequenceName = "seq_produtos", initialValue = 1, allocationSize = 1)public class Produto implements Serializable, EntityID {    private static final long serialVersionUID = 1L;    @Id    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_produtos")    private Long id;    @NotNull    @Column(name = "descricao", length = 500, nullable = false)    private String descricao;    @NotNull    @Column(name = "unidade_medida", nullable = false)    private Integer unidadeMedida;    @Size(max = 500)    @Column(name = "observacao", length = 500, nullable = true)    private String observacao;    public Long getId() {        return id;    }    public void setId(Long id) {        this.id = id;    }    public String getDescricao() {        return descricao;    }    public void setDescricao(String descricao) {        this.descricao = descricao;    }    public Integer getUnidadeMedida() {        return unidadeMedida;    }    public void setUnidadeMedida(Integer unidadeMedida) {        this.unidadeMedida = unidadeMedida;    }    public String getObservacao() {        return observacao;    }    public void setObservacao(String observacao) {        this.observacao = observacao;    }}