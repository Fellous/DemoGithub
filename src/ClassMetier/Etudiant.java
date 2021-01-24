/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassMetier;

/**
 *
 * @author fello
 */
public class Etudiant 
{
    private int numeroEtudiant;
    private String prenomEtudiant;
    private int ageEtudiant;
    
    public Etudiant ( int unNumero , String unPrenom , int unAge)
    {
        this.numeroEtudiant = unNumero;
        prenomEtudiant = unPrenom;
        ageEtudiant = unAge;
    }

    /**
     * @return the numeroEtudiant
     */
    public int getNumeroEtudiant() {
        return numeroEtudiant;
    }

    /**
     * @return the prenomEtudiant
     */
    public String getPrenomEtudiant() {
        return prenomEtudiant;
    }

    /**
     * @return the ageEtudiant
     */
    public int getAgeEtudiant() {
        return ageEtudiant;
    }

    /**
     * @param ageEtudiant the ageEtudiant to set
     */
    public void setAgeEtudiant(int ageEtudiant) {
        this.ageEtudiant = ageEtudiant;
    }
    
}
