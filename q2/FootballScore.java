package q2;

import java.util.ArrayList;
import java.util.List;

class FootballScore implements Publisher {
    private List<Subscriber> subscribers = new ArrayList<>();

    @Override
    public void registerSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers(String score) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(score);
        }
    }
}