package random.id;

public class IdGenerator {
    //Global variables used to create ids to company and investors
    private int companyCount = 1;
    private int investorCount = 1;
    //instance of the singleton class
    private static IdGenerator instance;

    /*private constructor necessary to create a singleton class
   in order to avoid the same id being given to the objs created
     */
    private IdGenerator() {

    }

    /*
        This method provides access to the instance of the IdGenerator singleton class
         */
    public static IdGenerator getInstance() {
        if (instance == null) {
            instance = new IdGenerator();
        }
        return instance;
    }

    /*
       creates a unique id within the range of 100. for company objs
        */
    public String uniqueCompId() {

        String id = "comp" + Integer.toString(companyCount);
        this.companyCount++;
        return id;
    }

    /*
       creates a unique id within the range of 100. for investors objs
        */
    public String uniqueInvId() {

        String id = "inv" + Integer.toString(investorCount);
        this.investorCount++;
        return id;
    }
}
