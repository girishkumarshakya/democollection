package core.spring.list;

import java.util.List;

public class ListExample {
    private List cities;

    public List getCities() {
        return cities;
    }

    public void setCities(List cities) {
        this.cities = cities;
    }

    @Override
    public String toString() {
        return "ListExample{" +
                "cities=" + cities +
                '}';
    }
}
