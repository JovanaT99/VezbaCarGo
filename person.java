public class Person {

    private String name;
    private String phone;
    private String address;
    private Car car;

    public Car getCar() {
        return car;
    }
    public void setCar(Car car) {
        this.car = car;
    }

    public Person() {

    }

    public Person(String name, String phone, String address, Car car ) {

      this.name = name;
      this.phone = phone;
      this.address = address;
      this.car = car;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}

