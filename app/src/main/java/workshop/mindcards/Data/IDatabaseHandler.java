package workshop.mindcards.Data;

import java.util.List;

import workshop.mindcards.Model.User;

/**
 * Created by linuxoid on 15.11.15.
 */
public interface IDatabaseHandler {
    public void addUser(User user);
    public User getUser(int id);
    public List<User> getAllUsers();
    public int getUserCount();
    public int updateUser(User user);
    public void deleteUser(User user);
    public void deleteAllUsers();


}
