package pl.houserenting.Dao;


import org.springframework.stereotype.Repository;
import pl.houserenting.model.Flat;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.awt.print.Book;
import java.util.List;

@Repository
@Transactional
public class FlatDao {

    @PersistenceContext
    private EntityManager entityManager;

    public void save(Flat flat){ entityManager.persist(flat);}

    public Flat findById(long id) {
        return entityManager.find(Flat.class, id);
    }

    public void update(Flat flat) {
        entityManager.merge(flat);
    }

    public void delete(Flat flat) {
        entityManager.remove(entityManager.contains(flat) ?
                flat : entityManager.merge(flat));
    }

    public List<Flat> findAll() {
        Query query = entityManager.createQuery("select b from Flat b");
        List<Flat> resultList = query.getResultList();
        return resultList;
    }

}
