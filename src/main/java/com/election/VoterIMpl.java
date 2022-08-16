package com.election;

public class VoterIMpl {
    public static void main(String[] args) {
        Voter voter = new Voter();
        voter.setName("john");
        System.out.print(voter.getName());
        voter.setAge(16);
        System.out.println(" is "+ voter.getAgeCriteria(0));



    }
}