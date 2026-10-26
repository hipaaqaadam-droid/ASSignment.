package hospitalbilling;

public class LaboratoryTest extends MedicalService {
    private double testCharge;

    public LaboratoryTest(String serviceID, double baseCost,
                          double testCharge) {
        super(serviceID, "Laboratory Test", baseCost);
        this.testCharge = testCharge;
    }

    @Override
    public double calculateTotalCost() {
        return baseCost + testCharge;
    }
}
