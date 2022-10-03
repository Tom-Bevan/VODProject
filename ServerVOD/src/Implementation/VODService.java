package Implementation;

import Interface.ClientBox;
import Interface.VODServiceInterface;

import java.util.List;

public class VODService implements VODServiceInterface {


    @Override
    public List<MovieDesc> viewCatalog() {
        return null;
    }

    @Override
    public Bill playmovie(String isbn, ClientBox box) {
        return null;
    }
}
