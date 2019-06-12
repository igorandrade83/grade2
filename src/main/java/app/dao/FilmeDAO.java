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
@Repository("FilmeDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface FilmeDAO extends JpaRepository<Filme, java.lang.String> {

  /**
   * Obtém a instância de Filme utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Filme entity WHERE entity.id = :id")
  public Filme findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Filme utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Filme entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM FilmeAtor entity WHERE entity.filme.id = :id")
  public Page<FilmeAtor> findFilmeAtor(@Param(value="id") java.lang.String id, Pageable pageable);
  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.ator FROM FilmeAtor entity WHERE entity.filme.id = :id")
  public Page<Ator> listAtor(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM FilmeAtor entity WHERE entity.filme.id = :instanceId AND entity.ator.id = :relationId")
  public int deleteAtor(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

}
