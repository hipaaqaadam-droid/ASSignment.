package hospitalbilling;

public class Ultrasound extends MedicalService{
    private double additionalFee;

    public Ultrasound(String serviceID, double baseCost,
                      double additionalFee) {
        super(serviceID, "Ultrasound", baseCost);
        this.additionalFee = additionalFee;
    }

    @Override
    public double calculateTotalCost() {
        return baseCost + additionalFee;
    }
}
