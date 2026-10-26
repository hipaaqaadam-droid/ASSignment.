package hospitalbilling;

public abstract class MedicalService {
    protected String serviceID;
    protected String serviceName;
    protected double baseCost;

    public MedicalService(String serviceID, String serviceName,
                          double baseCost) {
        this.serviceID = serviceID;
        this.serviceName = serviceName;
        this.baseCost = baseCost;
    }

    public abstract double calculateTotalCost();

    public void displayServiceInfo() {
        System.out.println("Service ID: " + serviceID);
        System.out.println("Service: " + serviceName);
        System.out.printf("Total Cost: $%.2f%n",
                calculateTotalCost());
        System.out.println();
    }
}