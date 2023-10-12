package lab1.task2;

public class JobMarket {
    public static void main(String args[]){

        //task 2 and 4 
        Internship[] companii = new Internship[4];

        for(int i = 0 ; i < 4 ; ++i)
            companii[i] = new Internship();

        companii[0].name = "Google";
        companii[1].name = "Amazon";
        companii[2].name = "Facebook";
        companii[3].name = "Microsoft";

        companii[0].setMinGrade(4);
        companii[1].setMinGrade(6);
        companii[2].setMinGrade(2);
        companii[3].setMinGrade(7);


        Student[] studenti = new Student[4];

        for(int i = 0 ; i < 4 ; ++i)
            studenti[i] = new Student();

        studenti[0].setName("Gigel");
        studenti[1].setName("Marcel");
        studenti[2].setName("Ionel");
        studenti[3].setName("Dorel");

        studenti[0].setGrade(2);
        studenti[1].setGrade(5);
        studenti[2].setGrade(4);
        studenti[3].setGrade(9);

        for(int i = 0 ; i < companii.length ; ++i){
            companii[i].chooseCandidatesForInterview(studenti);
        } 

        //task 3
        Student stud1 = new Student();
        stud1.setName("Denis");
        stud1.setGrade(9.7);

        Student stud2 = new Student();
        stud2.setName("Denis");
        stud2.setGrade(9.7);
        if(stud1.equals(stud2)){
            System.out.println("DA");
        }
        else{
            System.out.println("NU");
        }
    }
}
