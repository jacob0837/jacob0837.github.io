package SpringHibernate;

public interface IUserDao {
    public void find(int id);
    public void insert(User user);
    public void update(User user);
    public void delete(User user);


}
