package src.models;

public class UserAccount {
    private String userId;
    private String name;
    private String email;
    private String phone;
    private String status;

    /* ------ Constructor ------ */
    public UserAccount(String userId, String name, String email,
                       String phone, String status) {
        this.userId  = userId;
        this.name    = name;
        this.email   = email;
        this.phone   = phone;
        this.status  = status;
    }

    /* ------ Getters & Setters ------ */
    public String getUserId()          { return userId; }
    public void   setUserId(String v)  { this.userId = v; }

    public String getName()            { return name; }
    public void   setName(String v)    { this.name = v; }

    public String getEmail()           { return email; }
    public void   setEmail(String v)   { this.email = v; }

    public String getPhone()           { return phone; }
    public void   setPhone(String v)   { this.phone = v; }

    public String getStatus()          { return status; }
    public void   setStatus(String v)  { this.status = v; }

    /* ------ Domain methods (stubs) ------ */
    public void register()   {}
    public void login()      {}
    public void deactivate() {}
    public void appeal()     {}

    @Override
    public String toString() {
        return "UserAccount[" +
                "userId="  + userId  + ", " +
                "name="    + name    + ", " +
                "email="   + email   + ", " +
                "phone="   + phone   + ", " +
                "status="  + status  + "]";
    }
}

