package hospitalSimulator;

public class SafeQueue extends Queue {
    @Override
    public Patient getNextPatient() {
        int maxSeverity = 0;
        Patient patientss = null;
        if (patients.isEmpty()) {
            return null;
        }
        for (Patient patient : patients) {
            if (patient.getSeverity() > maxSeverity) {
                patientss = patient;
                maxSeverity = patient.getSeverity();
            }
        }
        return patientss;
    }
}


