
package mycompanyeps2;

public class PatientService {
    public double CalculateImc(Patient patients[]){
        double accu=0;
        double imc;
        double sum=0;
        
        for (Patient patient : patients){
           
            imc=patient.getWeight()/Math.pow(patient.getHeight(),2);
            patient.setImc(imc);
            sum+=imc;
            accu++;
        }
        return sum/accu;
 
    }
    
}
