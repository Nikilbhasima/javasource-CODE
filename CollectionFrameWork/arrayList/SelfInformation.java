package CollectionFrameWork.arrayList;

public class SelfInformation {
    private String name;
    private int age;
    private String address;
    private int phone_no;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(int phone_no) {
        this.phone_no = phone_no;
    }

    @Override
    public String toString() {
        return "SelfInformation{" + "name='" + name + '\'' + ", age=" + age + ", address='" + address + '\'' + ", phone_no=" + phone_no + '}';
    }
}
