package random.id;

public class IdGenerator {

    private String companyId;
    private String investorId;

    public IdGenerator(){

        companyId = uniqueCompId();
        investorId = uniqueInvId();
    }

    /*
       creates a unique id within the range of 100
        */
    public String uniqueCompId(){
        String id = null;
        for (int i = 0; i<100; i++){
            id = "Comp" + Integer.toString(i);
        }
        return id;
    }

    /*
       creates a unique id within the range of 100
        */
    public String uniqueInvId(){
        String id = null;
        for (int i = 0; i<100; i++){
            id = "inv" + Integer.toString(i);
        }
        return id;
    }
}
