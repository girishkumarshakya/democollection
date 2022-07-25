package core.spring.map;

import java.util.Map;

public class MapExample {
    private Map<String,String> countryCodes;

    @Override
    public String toString() {
        return "MapExample{" +
                "countryCodes=" + countryCodes +
                '}';
    }

    public Map<String, String> getCountryCodes() {
        return countryCodes;
    }

    public void setCountryCodes(Map<String, String> countryCodes) {
        this.countryCodes = countryCodes;
    }
}
