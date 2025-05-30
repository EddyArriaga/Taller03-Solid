public class User {
    String nickname;
    String password;
    private boolean userIsAdmin;

    public User(String nickname, String password, boolean userIsAdmin) {
        this.nickname = nickname;
        this.password = password;
        this.userIsAdmin = userIsAdmin;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isUserIsAdmin() {
        return userIsAdmin;
    }

    public void setUserIsAdmin(boolean userIsAdmin) {
        this.userIsAdmin = userIsAdmin;
    }
    
}
