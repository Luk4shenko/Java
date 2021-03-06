import java.util.Scanner;
public class Student implements Helper {
    private String name;
    private int InfMark, MathMark, EngMark;

    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя студента: ");
        name = in.nextLine();
        System.out.print("Введите оценку студента по информатике: ");
        InfMark = in.nextInt();
        System.out.print("Введите оценку студента по математике: ");
        MathMark = in.nextInt();
        System.out.print("Введите оценку студента по английскому: ");
        EngMark = in.nextInt();
    }

    @Override
    public int compareTo(Student obj2) {
        double a = this.InfMark + this.EngMark + this.MathMark, b = obj2.InfMark + obj2.EngMark + obj2.MathMark;
        if ((a / 3) > (b / 3))
            return 1;
        if ((a / 3) == (b / 3))
            return 0;
        return -1;
    }

    public String getName() {
        return name;
    }

    public int getInfMark() {
        return InfMark;
    }

    public int getMathMark() {
        return MathMark;
    }
}