import interfaces.IPersistence;

public class MySQL implements IPersistence {
    @Override
    public void insert(String statement) {}
    @Override
    public void select(String statement) {}
    @Override
    public void delete(String statement) {}
    @Override
    public void update(String statement) {}

    /*

    Principio dependency inversion

    public void insert(String statement){}
    public void select(String statement){}
    public void delete(String statement){}
    public void update(String statement){}

     */
    // More Methods
}

