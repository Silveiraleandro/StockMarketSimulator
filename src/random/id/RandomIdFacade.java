package random.id;

public class RandomIdFacade {
    /*
    defining the elements of the enum
     */
    public static enum IdFacade {
        COMPANY, INVESTOR;
    }

    /*
    receives a type of IdFacade, gets an instance of IdGenerator and
    gives an uniqueId to this instance.
     */
    public static String generateId(IdFacade idType) {

        IdGenerator idG = IdGenerator.getInstance();
        String uniqueId = null;

        switch (idType) {
            case COMPANY:
                uniqueId = idG.uniqueCompId();

                break;
            case INVESTOR:
                uniqueId = idG.uniqueInvId();

                break;
        }
        return uniqueId;
    }

}
