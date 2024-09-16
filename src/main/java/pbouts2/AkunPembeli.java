package Project_JasaGambar;

public class AkunPembeli {
protected String password;
protected String email;
protected String username;

    public AkunPembeli(String password, String email, String username) {
        this.password = password;
        this.email = email;
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
