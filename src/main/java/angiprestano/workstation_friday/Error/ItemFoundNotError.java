package angiprestano.workstation_friday.Error;

public class ItemFoundNotError extends RuntimeException{
    public ItemFoundNotError (long id) {
        super("The date" + id + "is not found");
    }
}
