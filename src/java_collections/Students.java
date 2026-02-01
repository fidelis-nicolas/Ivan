package java_collections;

public class Students implements Comparable<Students>{
    private String name;
    private int id;

    public Students(String name, int id) {
        this.name = name;
        this.id = id;
    }


    @Override
    public int compareTo(Students o) {
        return this.id - o.id;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
