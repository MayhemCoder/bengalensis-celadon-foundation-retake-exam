package hospitalSimulator;
import java.util.ArrayList;


public abstract class Queue {
    protected ArrayList<Patient> patients = new ArrayList<>();


    public void queuePatientUp(Patient patient){
        patients.add(patient);
    }

    public abstract Patient getNextPatient();
}

