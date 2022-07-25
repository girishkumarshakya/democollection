package core.spring.set;

import java.util.Set;

public class SetExample {
    private Set countries;

    @Override
    public String toString() {
        return "SetExample{" +
                "countries=" + countries +
                '}';
    }

    public Set getCountries() {
        return countries;
    }

    public void setCountries(Set countries) {
        this.countries = countries;
    }
}
