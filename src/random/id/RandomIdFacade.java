package random.id;



public class RandomIdFacade {

    IdGenerator idG = new IdGenerator();

    public RandomIdFacade(){
        generatingId("", "");
    }

    public void generatingId(String company, String investor) {
        String idOut = null;

        if (idOut == company) {
            idG.uniqueCompId();
        }
        if (idOut == investor) {
            idG.uniqueInvId();
        }

    }
}
