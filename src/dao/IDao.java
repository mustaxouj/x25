package dao;

import java.util.List;
import presentation.modele.Client;
public interface IDao<T, ID> {

    List<T> findAll();

    T findById(ID id);
    List<T> saveAll(List<T> liste);
    T save(T t);

    T update(T t);

    Boolean delete(ID id);
    Boolean delete(Client client);
    Boolean deleteById(ID id);

}
