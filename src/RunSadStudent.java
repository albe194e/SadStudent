public class RunSadStudent {

    void go(){

        SadStudent student = new SadStudent("Albert");

        student.danceLikeCrazy();
        student.ignoreTeacherInspirationalMoves();
        student.lookLikeAZombie();
        student.shoutLikeCrazy();
        student.shoutLikeCrazy();

        System.out.println(student);
    }
    public static void main(String[] args) {
        new RunSadStudent().go();
    }
}