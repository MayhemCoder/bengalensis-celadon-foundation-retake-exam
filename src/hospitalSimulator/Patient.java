package hospitalSimulator;
import java.util.Random;

public class Patient {
    private int severity;

  public Patient(){
      severity = new Random().nextInt(10);
  }
  public int getSeverity(){
      return severity;
  }

    public void treat() {
      if (severity > 0){
          severity --;
      }
    }
}
