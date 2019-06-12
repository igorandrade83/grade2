package app.dao;

import app.entity.*;
import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.domain.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.*; 


/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("AtorDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface AtorDAO extends JpaRepository<Ator, java.lang.String> {

  /**
   * Obtém a instância de Ator utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Ator entity WHERE entity.id = :id")
  public Ator findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Ator utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Ator entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM FilmeAtor entity WHERE entity.ator.id = :id")
  public Page<FilmeAtor> findFilmeAtor(@Param(value="id") java.lang.String id, Pageable pageable);
  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.filme FROM FilmeAtor entity WHERE entity.ator.id = :id")
  public Page<Filme> listFilme(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM FilmeAtor entity WHERE entity.ator.id = :instanceId AND entity.filme.id = :relationId")
  public int deleteFilme(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

}
