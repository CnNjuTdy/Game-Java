package pattern;

import java.util.List;

/**
 * Time       : 2019/3/26 17:02
 * Author     : tangdaye
 * Description: 主题
 */
public interface Subject {

    void notifyObserver();

    void register(Observer o);
}
