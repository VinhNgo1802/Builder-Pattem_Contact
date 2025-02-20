public class Main {

    public static void main(String[] args) {

        // -------------------Permanent-------------------------------------------------------
        System.out.println("------------------Permanent------------------------------------------");

        ContractBuilder permanentBuilder = new PermanentContractBuilder();
        ContractDirector director1 = new ContractDirector(permanentBuilder);
        Contract permanentContract = director1.constructContract("C101", "A111", "B222", 4000);

        System.out.println(permanentContract);

        System.out.println("------------------Long Term ------------------------------------------");

        ContractBuilder longTermBuilder = new LongTermContractBuilder();
        ContractDirector director2 = new ContractDirector(longTermBuilder);
        Contract longTermContract = director2.constructContract("C102", "A222", "B333", 6000);

        System.out.println(longTermContract);

        System.out.println("------------------Short Term ------------------------------------------");

        ContractBuilder shortTermBuilder = new ShortTermContractBuilder();
        ContractDirector director3 = new ContractDirector(shortTermBuilder);
        Contract shortTermContract = director3.constructContract("C103", "A333", "B444", 8000);

        System.out.println(shortTermContract);

    }

}
