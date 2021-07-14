class Person
{
    String name;
    int grade_test1;
    int grade_test2;
    int grade_test3;
    public Person(String studentName, int grade1, int grade2, int grade3)
    {
        this.name = studentName;
        this.grade_test1 = grade1;
        this.grade_test2 = grade2;
        this.grade_test3 = grade3;
    }
    public String getName()
    {
        return name;
    }

    public float getAvg_grade() {
        float avg_grade = ((float) grade_test1 + grade_test2 + grade_test3) / 3;
        return avg_grade;
    }

    public static void main(String[] args)
    {
        Person jaden = new Person("Jaden", 75, 91, 69);
        Person alaina = new Person("Alaina", 91, 95, 79);



        System.out.println("Student " + jaden.getName() + "'s" + " average grade is " + jaden.getAvg_grade());
        System.out.println("Student " + alaina.getName() + "'s" + " average grade is " + alaina.getAvg_grade());
    }
}