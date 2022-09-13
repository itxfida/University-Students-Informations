public class StudentTest {
    public static void main(String[] args) {
        Student st = new Student("SE120202030", "FIDA", new Date(12, 8, 2001), 40);
        System.out.println(st);
        Undergraduate ug = new Undergraduate("SE120202014", "MAAZ", new Date(5, 5, 2001), 70 , 100 );
        System.out.println(ug);
        System.out.println();
        PostGraduateStudent pg= new PostGraduateStudent("SE120132022", "MUQEET", new Date(12, 6, 1998), 33, 3.45);
        System.out.println(pg);
    }
}
