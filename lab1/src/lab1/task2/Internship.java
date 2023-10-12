package lab1.task2;

import java.util.Random;
public class Internship {
    String name;
    double minGrade;
    Student[] students;

    /**
     * Setter for minGrade
     * @param minGrade the minimum grade required for an internship
     */
    public void setMinGrade(double minGrade) {
        this.minGrade = minGrade;
    }
    Student chooseCandidateRandomly(){     // why is this here?
        Random rand = new Random();

        return students[rand.nextInt(students.length)];
    }

    /**
     * Checks every student and prints those with grade higher than a minimum
     * @param students Student array for checking
     */
    void chooseCandidatesForInterview(Student[] students){
        for(int i = 0 ; i < students.length ; ++i){
            if(students[i].getGrade() >= minGrade){
                System.out.println("\nCandidate " + students[i].getName() + "got a phone interview at " + name);
            }
        }
    }
}

