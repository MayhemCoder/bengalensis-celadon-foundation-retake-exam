package hospitalSimulator;

public class Hospital {
protected Queue Queue;

public Hospital(Queue queue){
    this.Queue = queue;
}

public void addPatient(Patient patient){
    Queue.queuePatientUp(patient);
}
public void treatNextPatient(Patient patient){
    Queue.getNextPatient().treat();
}
}
