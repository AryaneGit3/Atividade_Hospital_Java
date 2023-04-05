
package aryanecassimiro030423;

/**
 *
 * @author aryan
 */
public class Medico {

   private String nomeMedico;
   private String crm;
    
    //-----------------------------------------------------
   
   // *** CONSTRUTORES ***
   
   Medico(String nomeMedico, String crm){
       
       this.nomeMedico = nomeMedico;
       this.crm = crm;
       
   }
    
    public String getNomeMedico() {
        return nomeMedico;
    }

    /**
     * @param nomeMedico the nomeMedico to set
     */
    public void setNomeMedico(String nomeMedico) {
        this.nomeMedico = nomeMedico;
    }

    /**
     * @return the crm
     */
    public String getCrm() {
        return crm;
    }

    /**
     * @param crm the crm to set
     */
    public void setCrm(String crm) {
        this.crm = crm;
    }
    
   
    
}
