package core.spring.property;

import java.util.Properties;

public class PropExample {
    private Properties databases;

    @Override
    public String toString() {
        return "PropExample{" +
                "databases=" + databases +
                '}';
    }

    public Properties getDatabases() {
        return databases;
    }

    public void setDatabases(Properties databases) {
        this.databases = databases;
    }
}
