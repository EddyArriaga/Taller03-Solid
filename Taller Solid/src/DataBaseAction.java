public interface DataBaseAction {
    void insert(String statement);
    void select(String statement);
    void delete(String statement);
    void update(String statement);
}
