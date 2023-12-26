import java.util.ArrayList;
import java.util.List;

public class WorkersDirectory {
    List<Worker> workers;

    public WorkersDirectory() {
        workers = new ArrayList<>();
    }

    /**
     * Поиск сотрудника по заданному стажу
     * @param years стаж сотрудника
     * @return Worker
     */
    public List<Worker> searchByWorkExperience(int years) {
        List<Worker> workersSearch = new ArrayList<>();
        for(Worker w : workers) {
            if(w.getWorkExperience() == years) {
                workersSearch.add(w);
            }
        }
        if(workersSearch.isEmpty()) {
            System.out.println("Сотрудник со стажем " + years + " лет не найден");
            return null;
        }
        return workersSearch;
    }

    /**
     * Поиск телефона сотрудника по заданному имени
     *
     * @param name имя сотрудника
     * @return номер телефона данного сотрудника
     */
    public List<Long> searchTelNumByName(String name) {
        List<Long> telNumbers = new ArrayList<>();
        for(Worker w : workers) {
            if(w.getName().equalsIgnoreCase(name)) {
                telNumbers.add(w.getTelephonNumber());
            }
        }
        if(telNumbers.isEmpty()) {
            System.out.println("Сотрудник с именем " + name + " не найден");
            return null;
        }
        return telNumbers;
    }

    /**
     * Поиск сотрудника по заданному id (табельный номер)
     * @param id
     * @return Worker
     */
    public Worker searchById(int id) {
        for(Worker w : workers) {
            if(w.getId() == id) {
                return w;
            }
        }
        System.out.println("Сотрудник с id " + id + " не найден");
        return null;
    }

    /**
     * Добавление нового сотрудника
     * @param w new Worker()
     */
    public void addWorker(Worker w) {
        workers.add(w);
    }
}
