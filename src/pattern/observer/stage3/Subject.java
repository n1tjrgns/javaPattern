package pattern.observer.stage3;

import java.util.ArrayList;
import java.util.List;

//옵저버를 추가, 제거, 메세지 알림 기능 역할
public class Subject {

    private List<Observer> observers = new ArrayList<>();

    //옵저버에 추가
    public void attach(Observer observer){
        observers.add(observer);
    }

    //옵저버 제거
    public void detach(Observer observer){
        observers.remove(observer);
    }

    public void notifyObservers(String msg){
        for (Observer observer : observers) {
            observer.receive(msg);
        }
    }
}
