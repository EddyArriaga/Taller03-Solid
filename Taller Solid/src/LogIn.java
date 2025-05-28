public class LogIn {
    private InsertUser insertUser;
    private User user;
    public void log (User user) {
        System.out.println("Has access to the website");
        insertUser.insertUserInDatabase(user);
        if (user.isUserIsAdmin()) {
             System.out.println("Has access to the website in admin mode"); 
        }
        // Logic
    }
    
}

