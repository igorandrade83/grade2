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
@Repository("FilmeAtorDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface FilmeAtorDAO extends JpaRepository<FilmeAtor, java.lang.String> {

  /**
   * Obtém a instância de FilmeAtor utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM FilmeAtor entity WHERE entity.id = :id")
  public FilmeAtor findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de FilmeAtor utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM FilmeAtor entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * Foreign Key filme
   * @generated
   */
  @Query("SELECT entity FROM FilmeAtor entity WHERE entity.filme.id = :id")
  public Page<FilmeAtor> findFilmeAtorsByFilme(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * Foreign Key ator
   * @generated
   */
  @Query("SELECT entity FROM FilmeAtor entity WHERE entity.ator.id = :id")
  public Page<FilmeAtor> findFilmeAtorsByAtor(@Param(value="id") java.lang.String id, Pageable pageable);

}
