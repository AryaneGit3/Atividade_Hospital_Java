package aryanecassimiro030423;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aryan
 */
public class TesteHospital {
    public static void main(String[] args) {
        
        List<Internaçao> listaInternacao = new ArrayList<>();
        
        Paciente pac1 = new Paciente("Aryane Machado", "129.836.396-90");
        Medico med1 = new Medico ("Lariisa Bueno", "555.555");
        Enfermeiro enf1 = new Enfermeiro ("Maria Jose", "556.888");
        
        Internaçao intern1 = new Internaçao(pac1, med1, enf1,"Pneumonia", 150.00, 3);
        Internaçao intern2 = new Internaçao(pac1, med1, enf1,"Diarreia", 150.00, 4);
        Internaçao intern3 = new Internaçao(pac1, med1, enf1,"Virose", 150.00, 8);
        
        intern1.vizualizarInternaçao();
        
        listaInternacao.add(intern1);
        listaInternacao.add(intern2);
        listaInternacao.add(intern3);
       
        
        
        
                }

    
}
