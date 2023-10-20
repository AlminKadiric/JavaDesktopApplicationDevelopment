package newGui.connection;

//CRUD
//Create
//Retrieve
//Update
//Delete


import java.util.List;
import java.util.Locale;

public interface Dao <E>{

    E save(E entity);

    List<E> getAll();

    E get(Long id);

    E update(E entity);

    boolean delete(E entity);







}
