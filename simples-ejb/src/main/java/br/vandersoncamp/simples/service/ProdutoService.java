package br.vandersoncamp.simples.service;import br.vandersoncamp.simples.model.Produto;import br.vandersoncamp.simples.util.GenericService;import javax.ejb.Stateless;import javax.ejb.TransactionAttribute;import javax.ejb.TransactionAttributeType;@Stateless@TransactionAttribute(TransactionAttributeType.REQUIRED)public class ProdutoService extends GenericService<Produto, Long> {    public ProdutoService() {        super(Produto.class);    }}