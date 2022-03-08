public class SadStudent {
    String name;
    int levelOfEngagement = 0;
    int expectedExamGrade = 0;

    void danceLikeCrazy(){
        levelOfEngagement += 10;
        expectedExamGrade += 1;
    }
    void shoutLikeCrazy(){
        levelOfEngagement += 10;
        expectedExamGrade += 1;
    }
    void lookLikeAZombie(){
        levelOfEngagement -= 10;
        expectedExamGrade -= 1;
    }
    void ignoreTeacherInspirationalMoves(){
        levelOfEngagement -= 10;
        expectedExamGrade -= 1;
    }
    SadStudent(String assignedName){
        name = assignedName;
    }
    @Override
    public String toString() {
        return "Name: " + name +
                "\nLevelOfEngagement: " + levelOfEngagement +
                "\nExpectedExamGrade: " + expectedExamGrade;
    }
}
