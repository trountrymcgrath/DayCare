package daycare.comp152;

import java.util.ArrayList;

public class Child {
    private int age;
    private boolean siblingInProgram;
    private int yearsOfAttendence;
    private int dayCareID;
    private String Name;
    private static int nextID =1000;
    private ArrayList<DayCareWorker> group;

    public Child(){
        dayCareID = nextID;
        nextID++;
    }

    public Child(String name, boolean siblingPlan, int currentAge){
        this.Name = name;
        siblingInProgram = siblingPlan;
        age = currentAge;
        yearsOfAttendence = 0;
        dayCareID = nextID;
        nextID = nextID+1;

    }

    public int CalculateBill()

    public String getName(){
        return Name;
    }

}
