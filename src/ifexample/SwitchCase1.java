package ifexample;

public class SwitchCase1 {

    public static void main(String[] args) {

        String name;
        int floor = 4;

        switch (floor) {
            case 1: name = "약국";
                System.out.println(floor + "층 " + name + "입니다");
            break;
            case 2: name = "정형외과";
                System.out.println(floor + "층 " + name + "입니다");
            break;
            case 3: name = "피부과";
                System.out.println(floor + "층 " + name + "입니다");
            break;
            case 4: name = "치과";
                System.out.println(floor + "층 " + name + "입니다");
            break;
            case 5: name = "헬스 클럽";
                System.out.println(floor + "층 " + name + "입니다");
            break;
        }
    }
}
