package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela ATOR
 * @generated
 */
@Entity
@Table(name = "\"ATOR\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Ator")
public class Ator implements Serializable {

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
  @Column(name = "A_nome", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String a_nome;

  /**
   * Construtor
   * @generated
   */
  public Ator(){
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
  public Ator setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém a_nome
   * return a_nome
   * @generated
   */
  
  public java.lang.String getA_nome(){
    return this.a_nome;
  }

  /**
   * Define a_nome
   * @param a_nome a_nome
   * @generated
   */
  public Ator setA_nome(java.lang.String a_nome){
    this.a_nome = a_nome;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Ator object = (Ator)obj;
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
