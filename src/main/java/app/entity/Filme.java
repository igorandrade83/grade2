package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela FILME
 * @generated
 */
@Entity
@Table(name = "\"FILME\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Filme")
public class Filme implements Serializable {

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
  @Column(name = "f_nome", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String f_nome;

  /**
   * Construtor
   * @generated
   */
  public Filme(){
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
  public Filme setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém f_nome
   * return f_nome
   * @generated
   */
  
  public java.lang.String getF_nome(){
    return this.f_nome;
  }

  /**
   * Define f_nome
   * @param f_nome f_nome
   * @generated
   */
  public Filme setF_nome(java.lang.String f_nome){
    this.f_nome = f_nome;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Filme object = (Filme)obj;
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
