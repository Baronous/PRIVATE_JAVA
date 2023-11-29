package Private_Test_Buoi7;

abstract class Person {
    private static int count = 1;

    private int id;
    private String name;
    private short age;
    private Address address;

    public Person() {
        this.id = count++;
    }

    public Person(String name, short age, Address address) {
        this.id = count++;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" + " id = " + id + ", name = ' " + name + '\'' + ", age = " + age + ", address = "  + address + '}';
    }

    public abstract String getCapacity();
}
