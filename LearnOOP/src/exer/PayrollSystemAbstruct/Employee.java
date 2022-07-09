package exer.PayrollSystemAbstruct;

public abstract class Employee {
    private String name;
    private int number;
    private EntryDate birthday;

    public Employee(String name, int number, EntryDate birthday) {
        super();
        this.name = name;
        this.number = number;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public EntryDate getBirthday() {
        return birthday;
    }

    public void setBirthday(EntryDate birthday) {
        this.birthday = birthday;
    }

    public abstract double earnings();

    @Override
    public String toString() {
        return "name=" + name + ", number=" + number + ", birthday=" + birthday.toDateString();
    }
}
