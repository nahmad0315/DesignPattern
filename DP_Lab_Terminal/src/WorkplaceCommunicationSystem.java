/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nabeel Ahmad
 */
public class WorkplaceCommunicationSystem {

    public static void main(String[] args) {
        // Creating instances of employees and a team communication channel
        Employee Amarullah = new Employee("Amarullah");
        Employee Saifullah = new Employee("Saifullah");
        TeamCommunicationChannel teamChannel = new TeamCommunicationChannel();

        // Subscribing employees to the communication channel
        teamChannel.subscribe(Amarullah);
        teamChannel.subscribe(Saifullah);
        
        //System Message
        System.out.println("    ---- DESK ALERTS ----    ");

        // Sending an announcement through the communication channel
        teamChannel.sendAnnouncement("Important Team Meeting Tomorrow at 9:00 am.");

        // Creating instances of communication actions
        CommunicationAction sendMessage = new SendMessageAction("Hi, how are you doing?");
        CommunicationAction sendAnnouncement = new SendAnnouncementAction("Company-wide Event on coming saturday");

        // Creating an instance of CommunicationManager
        CommunicationManager communicationManager = new CommunicationManager();

        // Setting and executing communication actions
        communicationManager.setAction(sendMessage);
        communicationManager.executeAction();

        communicationManager.setAction(sendAnnouncement);
        communicationManager.executeAction();
    }
}
