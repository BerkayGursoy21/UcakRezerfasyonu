public class Customer {
    private String name;
    private String surname;
    private String age;
    private String id;
    private String telNo;
    private int sex;
    private String date;

    public Customer(String name, String surname, String age, String id, String telNo, int sex, String date) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.id = id;
        this.telNo = telNo;
        this.sex = sex;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
