package hospitalbilling;

public class Consultation extends MedicalService {
    private double doctorFee;

    public Consultation(String serviceID, double baseCost,
                        double doctorFee) {
        super(serviceID, "Consultation", baseCost);
        this.doctorFee = doctorFee;
    }

    @Override
    public double calculateTotalCost() {
        return baseCost + doctorFee;
    }
}
