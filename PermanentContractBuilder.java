public class PermanentContractBuilder implements ContractBuilder {

    private String contractID;
    private String propertyID;
    private String tenantID;
    private double rentAmount;

    @Override
    public String toString() {
        return "PermanentContractBuilder [contractID=" + contractID + ", propertyID=" + propertyID + ", tenantID="
                + tenantID + ", rentAmount=" + rentAmount + "]";
    }

    @Override
    public void buildContractID(String id) {
        this.contractID = id;

    }

    @Override
    public void buildPropertyID(String id) {
        this.propertyID = id;

    }

    @Override
    public void buildRentAmount(double amount) {
        this.rentAmount = amount;

    }

    @Override
    public void buildTenantID(String id) {
        this.tenantID = id;
    }

    @Override
    public Contract signContract() {
        // TODO Auto-generated method stub
        return new Contract(contractID, propertyID, tenantID, rentAmount, "Permanent");
    }

}
