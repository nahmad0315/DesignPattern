/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nabeel Ahmad
 */
class CommunicationManager {

    private CommunicationAction action;

    public void setAction(CommunicationAction action) {
        this.action = action;
    }

    public void executeAction() {
        action.execute();
    }
}
