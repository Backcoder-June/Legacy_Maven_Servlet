package Bean;

public class beandto {

    private String id;
    private String pw;
    private String name;

    @Override
    public String toString() {
        return "회원{" +
                "id : '" + id + '\'' +
                ", name : '" + name + '\'' +
                '}';
    }

    public beandto(){}
    public beandto(String id, String pw, String name) {
        this.id = id;
        this.pw = pw;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
