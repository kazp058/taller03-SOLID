package interfaces;

public interface IPersistence {
    public void insert(Object object);
    public void select(String statement);
    public void delete(String statement);
    public void update(String statement);
}
