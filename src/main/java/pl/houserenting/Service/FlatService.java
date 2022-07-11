package pl.houserenting.Service;


import org.springframework.stereotype.Service;
import pl.houserenting.Dao.FlatDao;
import pl.houserenting.model.Flat;

import java.awt.print.Book;

@Service
public class FlatService {

    private final FlatDao flatDao;

    public FlatService(FlatDao flatDao) {
        this.flatDao = flatDao;
    }

    public void save(Flat flat) {
        flatDao.save(flat);
    }
}
