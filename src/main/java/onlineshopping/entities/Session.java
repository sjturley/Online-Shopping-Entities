package onlineshopping.entities;

import java.util.HashMap;
import java.util.Map;

public class Session {

    private final Map<String, ModelObject> session;

    public Session() {
        session = new HashMap<>();
    }

    public ModelObject get(String key) {
        return this.session.get(key);
    }

    public void put(String key, ModelObject value) {
        this.session.put(key, value);
    }

    public void saveAll() {
        for (String key : session.keySet()) {
            ModelObject entity = session.get(key);
            if (entity != null) {
                entity.saveToDatabase();
            }
        }
    }

}
