/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author Nabeel Ahmad
 */
interface CommunicationChannel {

    void subscribe(EmployeeObserver observer);

    void unsubscribe(EmployeeObserver observer);

    void notifySubscribers(String message);
}
