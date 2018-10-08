public class Sponsor extends Person {

    String company;
    int hiredStudents = 0;

    public Sponsor(String name, int age, String gender, String company){

    }
    public Sponsor(String name, int age, String gender){
        super(name,age,gender);
        this.company = "Google";
        this.hiredStudents = 0;
    }
    public Sponsor(){

    }


    @Override
    public void introduce() {
        System.out.println("Hi, I'm "+ name+", a"+ age+" year old "+ gender+" who represents "+ company+" and hired "+hiredStudents+" students so far." );

    }
    public void hire(){
        this.hiredStudents += 1;

    }

    @Override
    public void getGoal() {
        System.out.println("Hire brilliant junior software developers.");
    }
}