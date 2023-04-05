package aryanecassimiro030423;

/**
 *
 * @author aryan
 */
public class Internaçao {

    

    private int idInternaçao;
    private static int totalIdInternaçao;
    private String motivo;
    private int qtdDiasInternaçao;
    private double valorDiaria;
    private double valorTotal; 
    private double somaInternaçoes;
    
    private Paciente objPaciente;
    private Medico objMedico;
    private Enfermeiro objEnferm;
   
    //---------------------------------------------------
    
    // *** CONSTRUTORES *** 
    
    Internaçao(Paciente objPaciente, Medico objMedico, Enfermeiro objEnferm,
               String motivo, double valorDiaria, int qtdDiasInternaçao
               ){
        
    this.objPaciente = objPaciente;
    this.objMedico = objMedico;
    this.objEnferm = objEnferm;
    
    this.motivo = motivo;
    this.valorDiaria = valorDiaria;
    this.qtdDiasInternaçao = qtdDiasInternaçao;
    
    this.valorTotal = this.valorDiaria * this.qtdDiasInternaçao;
    
    Internaçao.totalIdInternaçao = Internaçao.totalIdInternaçao +1;
    this.idInternaçao = Internaçao.totalIdInternaçao;
    
    
    } // fim constru
    
    
    public int getTotalIdInternaçao() {
        return totalIdInternaçao;
    }

    /**
     * @param totalIdInternaçao the totalIdInternaçao to set
     */
    public void setTotalIdInternaçao(int totalIdInternaçao) {
        this.totalIdInternaçao = totalIdInternaçao;
    }
    
    public int getIdInternaçao() {
        return idInternaçao;
    }

    /**
     * @param idInternaçao the idInternaçao to set
     */
    public void setIdInternaçao(int idInternaçao) {
        this.idInternaçao = idInternaçao;
    }

    /**
     * @return the motivo
     */
    public String getMotivo() {
        return motivo;
    }

    /**
     * @param motivo the motivo to set
     */
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    /**
     * @return the qtdDiasInternaçao
     */
    public int getQtdDiasInternaçao() {
        return qtdDiasInternaçao;
    }

    /**
     * @param qtdDiasInternaçao the qtdDiasInternaçao to set
     */
    public void setQtdDiasInternaçao(int qtdDiasInternaçao) {
        this.qtdDiasInternaçao = qtdDiasInternaçao;
    }

    /**
     * @return the valorDiaria
     */
    public double getValorDiaria() {
        return valorDiaria;
    }

    /**
     * @param valorDiaria the valorDiaria to set
     */
    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    /**
     * @return the valorTotal
     */
    public double getValorTotal() {
        return valorTotal;
    }

    /**
     * @param valorTotal the valorTotal to set
     */
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    /**
     * @return the somaInternaçoes
     */
    public double getSomaInternaçoes() {
        return somaInternaçoes;
    }

    /**
     * @param somaInternaçoes the somaInternaçoes to set
     */
    public void setSomaInternaçoes(double somaInternaçoes) {
        this.somaInternaçoes = somaInternaçoes;
    }

    /**
     * @return the objPaciente
     */
    public Paciente getObjPaciente() {
        return objPaciente;
    }

    /**
     * @param objPaciente the objPaciente to set
     */
    public void setObjPaciente(Paciente objPaciente) {
        this.objPaciente = objPaciente;
    }

    /**
     * @return the objMedico
     */
    public Medico getObjMedico() {
        return objMedico;
    }

    /**
     * @param objMedico the objMedico to set
     */
    public void setObjMedico(Medico objMedico) {
        this.objMedico = objMedico;
    }

    /**
     * @return the objEnferm
     */
    public Enfermeiro getObjEnferm() {
        return objEnferm;
    }

    /**
     * @param objEnferm the objEnferm to set
     */
    public void setObjEnferm(Enfermeiro objEnferm) {
        this.objEnferm = objEnferm;
    }
    //------------------------------------------------------------------------
    
    public void vizualizarInternaçao(){
        
        System.out.println("Nome do paciente: "+this.getObjPaciente().getNomePaciente());
        System.out.println("Nome do medico: "+this.getObjMedico().getNomeMedico());
        System.out.println("Nome do enfermeiro: "+this.getObjEnferm().getNomeEnferm());
        System.out.println("Motivo da internaçao: "+this.getMotivo());
        System.out.println("Valor da diaria: "+this.getValorDiaria());
        System.out.println("Quantidade de dias de inernaçao: "+this.getQtdDiasInternaçao());
        System.out.println("Valor total da internacao: "+this.getValorTotal());
        
        
    }
    
    
    
    
}
