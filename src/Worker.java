public class Worker {
    private int id;
    private String name;
    private Long telephonNumber;
    private int workExperience;

    public Worker(int id, String name, long telephonNumber, int workExperience) {
        this.id = id;
        this.name = name;
        this.telephonNumber = telephonNumber;
        this.workExperience = workExperience;
    }

    @Override
    public String toString() {
        return "Id: " + id + ", name: " + name + ", telephonNumber: " +
                telephonNumber + ", workExperience: " + workExperience + " years";
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public String getName() {
        return name;
    }

    public Long getTelephonNumber() {
        return telephonNumber;
    }

    public int getId() {
        return id;
    }
}
