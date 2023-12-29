/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nabeel Ahmad
 */
class TeamCommunicationChannel implements CommunicationChannel {

    private List<EmployeeObserver> subscribers = new ArrayList<>();

    @Override
    public void subscribe(EmployeeObserver observer) {
        subscribers.add(observer);
    }

    @Override
    public void unsubscribe(EmployeeObserver observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifySubscribers(String message) {
        for (EmployeeObserver subscriber : subscribers) {
            subscriber.update(message);
        }
    }

    // Additional behavior for sending an announcement to all subscribers
    public void sendAnnouncement(String announcement) {
        System.out.println("Announcement: " + announcement);
        notifySubscribers(announcement);
    }
}
