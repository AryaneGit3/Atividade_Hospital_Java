
package aryanecassimiro030423;

/**
 *
 * @author aryan
 */
public class Paciente {

    private String nomePaciente;
    private String cpfPaciente;
    
    //------------------------------------------------
    
    // *** CONSTRUTORES ***
    
    Paciente (String nomePaciente, String cpfPaciente){
        
        this.nomePaciente = nomePaciente;
        this.cpfPaciente = cpfPaciente;
        
    } // fim constru
    
    //-----------------------------------------------
    public String getNomePaciente() {
        return nomePaciente;
    }

    /**
     * @param nomePaciente the nomePaciente to set
     */
    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    /**
     * @return the cpfPaciente
     */
    public String getCpfPaciente() {
        return cpfPaciente;
    }

    /**
     * @param cpfPaciente the cpfPaciente to set
     */
    public void setCpfPaciente(String cpfPaciente) {
        this.cpfPaciente = cpfPaciente;
    }
    
    
    
}
