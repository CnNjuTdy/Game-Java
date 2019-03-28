package model;

import pattern.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * Time       : 2019/3/27 13:27
 * Author     : tangdaye
 * Description: 日志
 */
public class Log extends Subject {
    private List<String> log = new ArrayList<>();

    public void empty() {
        log.clear();
    }

    public void append(String s) {
        log.add(s);
        notifyObserver();
    }

    public List<String> getLog() {
        return log;
    }
}
