public interface ContractBuilder {

    void buildContractID(String id);

    void buildPropertyID(String id);

    void buildTenantID(String id);

    void buildRentAmount(double amount);

    Contract signContract();

}
