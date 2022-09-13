public class Student {
    private String StudentNo;
    private String StudentName;
    private Date dateofbirth;
    private int meritpoints;
    public static int NoofStudent = 0;
public Student(){
    NoofStudent++;
}
public Student( String Studentno , String name , Date  dob , int meritpoints){
    this.StudentNo = Studentno ;
    this.StudentName = name ;
    this.dateofbirth = dob;
    if(meritpoints>20 && meritpoints <200 )
     this.meritpoints = meritpoints ;
     NoofStudent++;
}
public void setStudentNo(String StudentNo){
    this.StudentNo=StudentNo;
}
public String getStudentNo() {
    return StudentNo;
}
public void setStudentName(String StudentName){
    this.StudentName=StudentName;
}
public String getStudentName() {
    return StudentName;
}
public void setDate_Of_Birth(Date Date_Of_Birth){
    this.dateofbirth=Date_Of_Birth;
}
public Date getDateofbirth() {
    return dateofbirth;
}
public int getMeritpoints() {
    return meritpoints;
}
public String toString(){
    return String.format("The Number Of Students With Increament:%d%nThe Student Reg.No:%s%nThe Student Name is:%s%nThe Student Date Of Birth is:%s%n",NoofStudent,StudentNo,StudentName,dateofbirth,meritpoints );
}
}