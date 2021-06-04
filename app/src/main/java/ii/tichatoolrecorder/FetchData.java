package ii.tichatoolrecorder;

public class FetchData  {
    String studentid;
    String studentSurname;
    String studentLastname;
    String studentFirstname;
    String firstScore;
    String secondScore;
    String thirdScore;
    String fourthScore;
    String exam;

    public FetchData() {
    }

    public FetchData(String studentid, String studentSurname, String studentLastname, String studentFirstname, String firstScore, String secondScore, String thirdScore, String fourthScore, String exam) {
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

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }

    public String getStudentSurname() {
        return studentSurname;
    }

    public void setStudentSurname(String studentSurname) {
        this.studentSurname = studentSurname;
    }

    public String getStudentLastname() {
        return studentLastname;
    }

    public void setStudentLastname(String studentLastname) {
        this.studentLastname = studentLastname;
    }

    public String getStudentFirstname() {
        return studentFirstname;
    }

    public void setStudentFirstname(String studentFirstname) {
        this.studentFirstname = studentFirstname;
    }

    public String getFirstScore() {
        return firstScore;
    }

    public void setFirstScore(String firstScore) {
        this.firstScore = firstScore;
    }

    public String getSecondScore() {
        return secondScore;
    }

    public void setSecondScore(String secondScore) {
        this.secondScore = secondScore;
    }

    public String getThirdScore() {
        return thirdScore;
    }

    public void setThirdScore(String thirdScore) {
        this.thirdScore = thirdScore;
    }

    public String getFourthScore() {
        return fourthScore;
    }

    public void setFourthScore(String fourthScore) {
        this.fourthScore = fourthScore;
    }

    public String getExam() {
        return exam;
    }

    public void setExam(String exam) {
        this.exam = exam;
    }
}
