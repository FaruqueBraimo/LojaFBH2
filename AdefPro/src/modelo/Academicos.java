/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author Faruque Braimo
 */
@Entity(name = "Academico")
public class Academicos {
   
@Id   
@GeneratedValue
private int id;
private boolean status;
private String curso;
private String universidade;
private String faculdade;
private String departamento;
private String regime;
private String media_ensino_Medio;
private String tipoDeEstudante;
private String residencia;
private String semestre;
private String anoLectivo;
private String nrDeCadeiras;
private String cadeirasAprovadas;
private String cadeirasReprovadas;
private int duracaoCurso;
private String mediaSemestral;
@OneToOne(cascade = CascadeType.MERGE)
private Estudante estudante;

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
     * @return the curso
     */
    public String getCurso() {
        return curso;
    }

    /**
     * @param curso the curso to set
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }

    /**
     * @return the universidade
     */
    public String getUniversidade() {
        return universidade;
    }

    /**
     * @param universidade the universidade to set
     */
    public void setUniversidade(String universidade) {
        this.universidade = universidade;
    }

    /**
     * @return the faculdade
     */
    public String getFaculdade() {
        return faculdade;
    }

    /**
     * @param faculdade the faculdade to set
     */
    public void setFaculdade(String faculdade) {
        this.faculdade = faculdade;
    }

    /**
     * @return the departamento
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * @param departamento the departamento to set
     */
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    /**
     * @return the regime
     */
    public String getRegime() {
        return regime;
    }

    /**
     * @param regime the regime to set
     */
    public void setRegime(String regime) {
        this.regime = regime;
    }

    /**
     * @return the media_ensino_Medio
     */
    public String getMedia_ensino_Medio() {
        return media_ensino_Medio;
    }

    /**
     * @param media_ensino_Medio the media_ensino_Medio to set
     */
    public void setMedia_ensino_Medio(String media_ensino_Medio) {
        this.media_ensino_Medio = media_ensino_Medio;
    }

    /**
     * @return the tipoDeEstudante
     */
    public String getTipoDeEstudante() {
        return tipoDeEstudante;
    }

    /**
     * @param tipoDeEstudante the tipoDeEstudante to set
     */
    public void setTipoDeEstudante(String tipoDeEstudante) {
        this.tipoDeEstudante = tipoDeEstudante;
    }

    /**
     * @return the residencia
     */
    public String getResidencia() {
        return residencia;
    }

    /**
     * @param residencia the residencia to set
     */
    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }

    /**
     * @return the semestre
     */
    public String getSemestre() {
        return semestre;
    }

    /**
     * @param semestre the semestre to set
     */
    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    /**
     * @return the anoLectivo
     */
    public String getAnoLectivo() {
        return anoLectivo;
    }

    /**
     * @param anoLectivo the anoLectivo to set
     */
    public void setAnoLectivo(String anoLectivo) {
        this.anoLectivo = anoLectivo;
    }

    /**
     * @return the nrDeCadeiras
     */
    public String getNrDeCadeiras() {
        return nrDeCadeiras;
    }

    /**
     * @param nrDeCadeiras the nrDeCadeiras to set
     */
    public void setNrDeCadeiras(String nrDeCadeiras) {
        this.nrDeCadeiras = nrDeCadeiras;
    }

    /**
     * @return the cadeirasAprovadas
     */
    public String getCadeirasAprovadas() {
        return cadeirasAprovadas;
    }

    /**
     * @param cadeirasAprovadas the cadeirasAprovadas to set
     */
    public void setCadeirasAprovadas(String cadeirasAprovadas) {
        this.cadeirasAprovadas = cadeirasAprovadas;
    }

    /**
     * @return the cadeirasReprovadas
     */
    public String getCadeirasReprovadas() {
        return cadeirasReprovadas;
    }

    /**
     * @param cadeirasReprovadas the cadeirasReprovadas to set
     */
    public void setCadeirasReprovadas(String cadeirasReprovadas) {
        this.cadeirasReprovadas = cadeirasReprovadas;
    }

    /**
     * @return the mediaSemestral
     */
    public String getMediaSemestral() {
        return mediaSemestral;
    }

    /**
     * @param mediaSemestral the mediaSemestral to set
     */
    public void setMediaSemestral(String mediaSemestral) {
        this.mediaSemestral = mediaSemestral;
    }

    /**
     * @return the estudante
     */
    public Estudante getEstudante() {
        return estudante;
    }

    /**
     * @param estudante the estudante to set
     */
    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }

    /**
     * @return the duracaoCurso
     */
    public int getDuracaoCurso() {
        return duracaoCurso;
    }

    /**
     * @param duracaoCurso the duracaoCurso to set
     */
    public void setDuracaoCurso(int duracaoCurso) {
        this.duracaoCurso = duracaoCurso;
    }




    
    
}
