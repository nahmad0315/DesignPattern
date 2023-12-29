/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nabeel Ahmad
 */
class SendAnnouncementAction implements CommunicationAction {

    private final String announcement;

    public SendAnnouncementAction(String announcement) {
        this.announcement = announcement;
    }

    @Override
    public void execute() {
        System.out.println("Sending announcement: " + announcement);
    }
}
