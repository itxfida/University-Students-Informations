public class Undergraduate extends Student {
    private int testscore ;
    private double merit;
public Undergraduate (String Studentno , String name , Date  dob , int meritpoints , int testscore){
    super(Studentno , name , dob , meritpoints );
    this.testscore = testscore ;
}
public double CaculateMerit(){
    merit = testscore + getMeritpoints();
    return merit;
}
public String toString (){
    return String.format("%sThe Under Graduate Student Test Score is: %d %nThe Under Graduate Student Merit: %.2f ", super.toString() , testscore , CaculateMerit());
}
}
