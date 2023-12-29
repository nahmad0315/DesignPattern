/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nabeel Ahmad
 */
class SendMessageAction implements CommunicationAction {
    private final String message;

    public SendMessageAction(String message) {
        this.message = message;
    }

    @Override
    public void execute() {
        System.out.println("Sending message: " + message);
    }
}