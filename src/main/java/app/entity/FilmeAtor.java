package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela FILMEATOR
 * @generated
 */
@Entity
@Table(name = "\"FILMEATOR\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.FilmeAtor")
public class FilmeAtor implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_filme", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Filme filme;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_ator", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Ator ator;

  /**
   * Construtor
   * @generated
   */
  public FilmeAtor(){
  }


  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.String getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public FilmeAtor setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém filme
   * return filme
   * @generated
   */
  
  public Filme getFilme(){
    return this.filme;
  }

  /**
   * Define filme
   * @param filme filme
   * @generated
   */
  public FilmeAtor setFilme(Filme filme){
    this.filme = filme;
    return this;
  }

  /**
   * Obtém ator
   * return ator
   * @generated
   */
  
  public Ator getAtor(){
    return this.ator;
  }

  /**
   * Define ator
   * @param ator ator
   * @generated
   */
  public FilmeAtor setAtor(Ator ator){
    this.ator = ator;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    FilmeAtor object = (FilmeAtor)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

}
