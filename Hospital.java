class Patient {
    String name;
    String diagnosis;

    Patient(String name, String diagnosis) {
        this.name = name;
        this.diagnosis = diagnosis;
    }
}

public class Hospital {

    static void updateDiagnosis(Patient p) {
        p.diagnosis = "Recovered";
    }

    public static void main(String[] args) {

        Patient p = new Patient("Ravi", "Fever");

        updateDiagnosis(p);

        System.out.println("Name: " + p.name);
        System.out.println("Diagnosis: " + p.diagnosis);
    }
}