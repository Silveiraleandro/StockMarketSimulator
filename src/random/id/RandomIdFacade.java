package random.id;

public class RandomIdFacade {
/*
defining the elements of the enum
 */
    public static enum IdFacade {
        COMPANY, INVESTOR;
    }
/*

 */
    public static String generateId(IdFacade idType){

        IdGenerator idG = null;
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
