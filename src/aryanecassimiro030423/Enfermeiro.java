
package aryanecassimiro030423;

/**
 *
 * @author aryan
 */
public class Enfermeiro {

    private String nomeEnferm;
    private String cpfEnferm;
    
    //---------------------------------------------------------
    
    // *** CONSTRUTORES *** 
    
    Enfermeiro(String nomeEnferm, String cpfEnferm){
        
        this.nomeEnferm = nomeEnferm;
        this.cpfEnferm = cpfEnferm;
        
    } // fim constru 
    
    public String getNomeEnferm() {
        return nomeEnferm;
    }

    /**
     * @param nomeEnferm the nomeEnferm to set
     */
    public void setNomeEnferm(String nomeEnferm) {
        this.nomeEnferm = nomeEnferm;
    }

    /**
     * @return the cpfEnferm
     */
    public String getCpfEnferm() {
        return cpfEnferm;
    }

    /**
     * @param cpfEnferm the cpfEnferm to set
     */
    public void setCpfEnferm(String cpfEnferm) {
        this.cpfEnferm = cpfEnferm;
    }
    //--------------------------------------------------------------------------
    
    
    
}
