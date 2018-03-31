package br.vandersoncamp.simples.model;import javax.persistence.*;import javax.validation.constraints.NotNull;import javax.xml.bind.annotation.XmlRootElement;import java.io.Serializable;@Entity@XmlRootElement@Table(name = "clientes")@SequenceGenerator(name = "seq_clientes", sequenceName = "seq_clientes", initialValue = 1, allocationSize = 1)public class Cliente implements Serializable, EntityID {    private static final long serialVersionUID = 1L;    @Id    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_clientes")    private Long id;    @NotNull    @Column(name = "nome", length = 255, nullable = false)    private String nome;    @Column(name = "documento", nullable = false)    private Long documento;    @Column(name = "email", length = 255)    private String email;    @Column(name = "telefone")    private Long telefone;    @Column(name = "celular")    private Long celular;    @Column(name = "observacao", length = 500)    private String observacao;    @Override    public Long getId() {        return id;    }    public void setId(Long id) {        this.id = id;    }    public String getNome() {        return nome;    }    public void setNome(String nome) {        this.nome = nome;    }    public String getEmail() {        return email;    }    public void setEmail(String email) {        this.email = email;    }    public Long getDocumento() {        return documento;    }    public void setDocumento(Long documento) {        this.documento = documento;    }    public Long getTelefone() {        return telefone;    }    public void setTelefone(Long telefone) {        this.telefone = telefone;    }    public Long getCelular() {        return celular;    }    public void setCelular(Long celular) {        this.celular = celular;    }    public String getObservacao() {        return observacao;    }    public void setObservacao(String observacao) {        this.observacao = observacao;    }}