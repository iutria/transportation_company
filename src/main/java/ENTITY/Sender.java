package ENTITY;

public class Sender {
    private String name;
    private String department;
    private String phoneExt;

    public Sender(String name, String department, String phoneExt) {
        this.name = name;
        this.department = department;
        this.phoneExt = phoneExt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPhoneExt() {
        return phoneExt;
    }

    public void setPhoneExt(String phoneExt) {
        this.phoneExt = phoneExt;
    }

    @Override
    public String toString() {
        return "Sender{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", phoneExt='" + phoneExt + '\'' +
                '}';
    }
}
