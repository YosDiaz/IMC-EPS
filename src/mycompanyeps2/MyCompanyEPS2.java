
package mycompanyeps2;

public class MyCompanyEPS2 {

    public static void main(String[] args) {
        Patient patient1 = new Patient();
        patient1.setName("Juan Pablo");
        patient1.setDocument("109151536");
        patient1.setSex("M");
        patient1.setHeight(1.70);
        patient1.setWeight(54);
        
        Patient patient2 = new Patient();
        patient2.setName("Mileneth ");
        patient2.setDocument("1532888");
        patient2.setSex("C");
        patient2.setHeight(1.61);
        patient2.setWeight(52);
        
        Patient patients[]= {patient1, patient2};
        PatientService patientService = new PatientService();
        double totalImc = patientService.CalculateImc(patients);
        System.out.println("totalImc = " + totalImc);
        for (Patient patient : patients){
            System.out.println("El imc del paciente "+ patient.getName()+" es "+ patient.getImc());
        }
    }
    
}
