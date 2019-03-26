package pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Time       : 2019/3/26 17:02
 * Author     : tangdaye
 * Description: 主题
 */
public abstract class Subject {
    List<Observer> observers = new ArrayList<>();

    public void notifyObserver() {
        for (Observer o : observers) {
            o.update(this);
        }
    }

    public void register(Observer o) {
        if (observers.indexOf(o) < 0) {
            observers.add(o);
        }
    }
}
