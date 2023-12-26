public class Main {
    public static void main(String[] args) {

        WorkersDirectory w = new WorkersDirectory();
        w.addWorker(new Worker(1,"Vasya", 89172347890L, 10));
        w.addWorker(new Worker(2,"Maks", 89172557890L, 20));
        w.addWorker(new Worker(3,"Maria", 89172557844L, 30));
        w.addWorker(new Worker(4,"Vasya", 89134563210L, 30));

        System.out.println(w.searchByWorkExperience(30));
        System.out.println(w.searchTelNumByName("Vasya"));
        System.out.println(w.searchById(2));

    }
}