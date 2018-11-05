/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controle.EstudanteDAO;
import java.util.Date;
import java.util.List;
import javafx.scene.control.Alert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Faruque Braimo
 */
@Entity(name = "Pessoais")
public class Estudante {
    
    @Id
    @GeneratedValue
    private int    id;
    private boolean status = true;
    private String nome;
    private String apelido;
    @Temporal(TemporalType.DATE)
    private Date   DataDeNascimento;
    private String genero;
    private int    contacto;
    private int    contactoAlternativo;
    private String naturalidade;
    private String morada;
    private String cidade;
    private String Bairro;
    private String quarteirao;
    private String nome_Pai;
    private String nome_Mae;
    private String numero_Bi;
    private String email;
    private String nrBI;
    private String endereco;
    private String observacoes;
    private String nomePai;
    private String nomeMae;
    
    private String EstadoCivil;
    
    @Temporal(TemporalType.DATE)
    private Date   data_Cadastro;

   
    
    
  public void incluir( Estudante dados) {
      EstudanteDAO dao = new EstudanteDAO();
      
   
          if(dao.gravar(dados)){
//            Alert alerta = new Alert(Alert.AlertType.INFORMATION);
//            alerta.setTitle("Feito");
//            alerta.setContentText("O Estudante foi registado com sucesso!");
//            alerta.show();   
     }
          else {
//               Alert alerta = new Alert(Alert.AlertType.INFORMATION);
//            alerta.setTitle("Erro");
//            alerta.setContentText("O Estudante  nao foi registado!");
//            alerta.show();
           }
  } 
  
  
  public void excluir( Estudante dados) {
   EstudanteDAO dao = new EstudanteDAO();
   dados.setStatus(false);
   
   if (dao.atualizar(dados)) {
       
   }
   
   

      
  }
  
   public void Actualizar( Estudante dados) {
   EstudanteDAO dao = new EstudanteDAO();
   
   if (dao.atualizar(dados)) {
       
   }
   
      
  }
   
   
   public static List<Estudante> buscar(){
         EstudanteDAO dao = new EstudanteDAO();
         return dao.consultar();
     }

    /**
     * @return the nrBI
     */
    public String getNrBI() {
        return nrBI;
    }

    /**
     * @param nrBI the nrBI to set
     */
    public void setNrBI(String nrBI) {
        this.nrBI = nrBI;
    }

    /**
     * @return the EstadoCivil
     */
    public String getEstadoCivil() {
        return EstadoCivil;
    }

    /**
     * @param EstadoCivil the EstadoCivil to set
     */
    public void setEstadoCivil(String EstadoCivil) {
        this.EstadoCivil = EstadoCivil;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the status
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(boolean status) {
        this.status = status;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the apelido
     */
    public String getApelido() {
        return apelido;
    }

    /**
     * @param apelido the apelido to set
     */
    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    /**
     * @return the DataDeNascimento
     */
    public Date getDataDeNascimento() {
        return DataDeNascimento;
    }

    /**
     * @param DataDeNascimento the DataDeNascimento to set
     */
    public void setDataDeNascimento(Date DataDeNascimento) {
        this.DataDeNascimento = DataDeNascimento;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return the contacto
     */
    public int getContacto() {
        return contacto;
    }

    /**
     * @param contacto the contacto to set
     */
    public void setContacto(int contacto) {
        this.contacto = contacto;
    }

    /**
     * @return the contactoAlternativo
     */
    public int getContactoAlternativo() {
        return contactoAlternativo;
    }

    /**
     * @param contactoAlternativo the contactoAlternativo to set
     */
    public void setContactoAlternativo(int contactoAlternativo) {
        this.contactoAlternativo = contactoAlternativo;
    }

    /**
     * @return the naturalidade
     */
    public String getNaturalidade() {
        return naturalidade;
    }

    /**
     * @param naturalidade the naturalidade to set
     */
    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    /**
     * @return the morada
     */
    public String getMorada() {
        return morada;
    }

    /**
     * @param morada the morada to set
     */
    public void setMorada(String morada) {
        this.morada = morada;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the Bairro
     */
    public String getBairro() {
        return Bairro;
    }

    /**
     * @param Bairro the Bairro to set
     */
    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    /**
     * @return the quarteirao
     */
    public String getQuarteirao() {
        return quarteirao;
    }

    /**
     * @param quarteirao the quarteirao to set
     */
    public void setQuarteirao(String quarteirao) {
        this.quarteirao = quarteirao;
    }

    /**
     * @return the nome_Pai
     */
    public String getNome_Pai() {
        return nome_Pai;
    }

    /**
     * @param nome_Pai the nome_Pai to set
     */
    public void setNome_Pai(String nome_Pai) {
        this.nome_Pai = nome_Pai;
    }

    /**
     * @return the nome_Mae
     */
    public String getNome_Mae() {
        return nome_Mae;
    }

    /**
     * @param nome_Mae the nome_Mae to set
     */
    public void setNome_Mae(String nome_Mae) {
        this.nome_Mae = nome_Mae;
    }

    /**
     * @return the numero_Bi
     */
    public String getNumero_Bi() {
        return numero_Bi;
    }

    /**
     * @param numero_Bi the numero_Bi to set
     */
    public void setNumero_Bi(String numero_Bi) {
        this.numero_Bi = numero_Bi;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the observacoes
     */
    public String getObservacoes() {
        return observacoes;
    }

    /**
     * @param observacoes the observacoes to set
     */
    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    /**
     * @return the nomePai
     */
    public String getNomePai() {
        return nomePai;
    }

    /**
     * @param nomePai the nomePai to set
     */
    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    /**
     * @return the nomeMae
     */
    public String getNomeMae() {
        return nomeMae;
    }

    /**
     * @param nomeMae the nomeMae to set
     */
    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    /**
     * @return the data_Cadastro
     */
    public Date getData_Cadastro() {
        return data_Cadastro;
    }

    /**
     * @param data_Cadastro the data_Cadastro to set
     */
    public void setData_Cadastro(Date data_Cadastro) {
        this.data_Cadastro = data_Cadastro;
    }

    @Override
    public String toString() {
        return "Estudante{" + "nome=" + nome + '}';
    }

  
  
   }
    

