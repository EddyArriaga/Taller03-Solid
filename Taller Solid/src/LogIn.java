public class LogIn {
    private InsertUser insertUser;
    public void log (User user) {
        System.out.println("Has access to the website");
        insertUser.insertUserInDatabase(user);
        // Logic
    }
    
}

