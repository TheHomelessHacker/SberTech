package Book;

public class Author {
    private String name;
    private String sex;
    private String email;

    public Author(String name, String sex, String email) {
        this.name = name;
        this.sex = sex;
        this.email = email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "\n\t" + name + "\nПол: \n\t" + sex + "\nПочта: \n\t" + email;
    }
}
