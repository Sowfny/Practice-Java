package pr2.Shop;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<String> computers = new ArrayList();

    public void addComputer(String computer) {
        computers.add(computer);
    }

    public String findComputer(String computer) {
        return computers.contains(computer) ? "Компьютер " + computer + " найден" : "Компьютер "+computer+" не найден";
    }

    public void deleteComputer(String computer) {
        computers.remove(computer);
    }
}
