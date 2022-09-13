public class PostGraduateStudent extends Student {
    private double GPA ;
    private double merit ; 
public PostGraduateStudent(String Studentno , String name , Date  dob , int meritpoints , double GPA){
    super(Studentno , name , dob , meritpoints );
        this.GPA  = GPA ;
}
public double CaculateMerit(){
    merit = GPA + getMeritpoints();
    return merit;
}
public String toString (){
    return String.format("%sThe Post Graduate Student GPA Is: %.2f %nThe Post Graduate Student Merit is: %.2f ", super.toString() ,GPA, CaculateMerit() );
}
}
