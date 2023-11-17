/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fa20-bse-061
 */
public class MediatorPatternDemo {
    public static void main(String[] args) {


        University comsatsUniversity = new University("COMSATS University");
        University nustUniversity = new University("NUST");
        Teacher teacherAli = new Teacher("Teacher Sir Ali");
        User mAli = new User("M Ali");
        User ahmad = new User("Ahmad");
        User ali = new User("Ali");
        
        
        ChatRoom.sendMessageToTarget(mAli, comsatsUniversity, "Hello, COMSATS University!");
        ChatRoom.sendMessageToAll(mAli, List.of(comsatsUniversity, nustUniversity, teacherAli, ahmad, ali), "Hello, everyone!");

    }
}
