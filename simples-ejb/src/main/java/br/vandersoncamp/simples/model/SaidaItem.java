package br.vandersoncamp.simples.model;import javax.persistence.*;import javax.validation.constraints.NotNull;import java.io.Serializable;import java.math.BigDecimal;@Entity@Table(name = "saida_itens")@SequenceGenerator(name = "seq_saida_itens", sequenceName = "seq_saida_itens", initialValue = 1, allocationSize = 1)public class SaidaItem implements Serializable, EntityID {    private static final long serialVersionUID = 1L;    @Id    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_saida_itens")    private Long id;    @NotNull(message = "Não foi informada a saída")    @ManyToOne    @JoinColumn(name = "i_saidas", nullable = false)    private Saida saida;    @NotNull(message = "Não foi informado o produto")    @ManyToOne    @JoinColumn(name = "i_produtos", nullable = false)    private Produto produto;    @Column(name = "nro_item", nullable = true)    private Long numeroItem;    @Column(name = "qtd_item", nullable = true)    private BigDecimal quantidadeItem;    @Column(name = "valor_venda", nullable = true)    private BigDecimal valorVenda;    @Column(name = "valor_total_venda", nullable = true)    private BigDecimal valorTotalVenda;    public Long getId() {        return id;    }    public void setId(Long id) {        this.id = id;    }    public Saida getSaida() {        return saida;    }    public void setSaida(Saida saida) {        this.saida = saida;    }    public Produto getProduto() {        return produto;    }    public void setProduto(Produto produto) {        this.produto = produto;    }    public Long getNumeroItem() {        return numeroItem;    }    public void setNumeroItem(Long numeroItem) {        this.numeroItem = numeroItem;    }    public BigDecimal getValorVenda() {        return valorVenda;    }    public void setValorVenda(BigDecimal valorVenda) {        this.valorVenda = valorVenda;    }    public BigDecimal getValorTotalVenda() {        return valorTotalVenda;    }    public void setValorTotalVenda(BigDecimal valorTotalVenda) {        this.valorTotalVenda = valorTotalVenda;    }    public BigDecimal getQuantidadeItem() {        return quantidadeItem;    }    public void setQuantidadeItem(BigDecimal quantidadeItem) {        this.quantidadeItem = quantidadeItem;    }}