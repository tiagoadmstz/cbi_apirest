/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dsc.cbi.apirest.repositories;

import br.com.dsc.cbi.apirest.entities.Ordem_Servico;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Tiago
 */
@Repository
public interface OrdemServicoRepository extends MongoRepository<Ordem_Servico, String> {

    public List<Ordem_Servico> findByEquipamento(String equipamento);

    @Query(value = "{'dados_equipamento.categoria':{$regex: '(?i:?0 .*)'}}")
    public List<Ordem_Servico> findByCategoria(String categoria);
    
}
