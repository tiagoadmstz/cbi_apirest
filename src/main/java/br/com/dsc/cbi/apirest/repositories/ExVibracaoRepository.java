/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dsc.cbi.apirest.repositories;

import br.com.dsc.cbi.apirest.entities.atmosferaex.ExVibracao;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Tiago
 */
@Repository
public interface ExVibracaoRepository extends MongoRepository<ExVibracao, String> {

}
