package ii.tichatoolrecorder.data.model;

public class Student {
    String studentid;
    String studentSurname;
    String studentLastname;
    String studentFirstname;
    String firstScore;
    String secondScore;
    String thirdScore;
    String fourthScore;
    String exam;

   public Student(){}

    public Student(String studentid, String studentSurname, String studentLastname, String studentFirstname, String firstScore, String secondScore, String thirdScore, String fourthScore, String exam) {
        this.studentid = studentid;
        this.studentSurname = studentSurname;
        this.studentLastname = studentLastname;
        this.studentFirstname = studentFirstname;
        this.firstScore = firstScore;
        this.secondScore = secondScore;
        this.thirdScore = thirdScore;
        this.fourthScore = fourthScore;
        this.exam = exam;
    }

    public String getStudentid() {
        return studentid;
    }

    public String getStudentSurname() {
        return studentSurname;
    }

    public String getStudentLastname() {
        return studentLastname;
    }

    public String getStudentFirstname() {
        return studentFirstname;
    }

    public String getFirstScore() {
        return firstScore;
    }

    public String getSecondScore() {
        return secondScore;
    }

    public String getThirdScore() {
        return thirdScore;
    }

    public String getFourthScore() {
        return fourthScore;
    }

    public String getExam() {
        return exam;
    }
}
