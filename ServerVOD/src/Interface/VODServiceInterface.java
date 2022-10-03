package Interface;

import Implementation.Bill;
import Implementation.MovieDesc;

import java.util.List;

public interface VODServiceInterface {

    public List<MovieDesc> viewCatalog();

    Bill playmovie(String isbn, ClientBox box);
}
