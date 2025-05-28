public class InsertUser {
    DataBaseAction dataBaseAction;
    public void insertUserInDatabase(User user){
        // Insert user in database
        dataBaseAction.insert(user.nickname);
    }
}
