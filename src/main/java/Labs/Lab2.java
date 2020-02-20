package Labs;

public class Lab2 {
    /*Create a Student Database with the following attributes:
            - New Student constructor that takes name and SSN in the arguments
- Automatically create an email ID based on the name
- Set a private static ID
- Generate a user ID that is combination of Static ID, random 4-digit number between 1000 and 9000, and last 4 of SSN
- Methods: enroll(), pay(), checkBalance(), toString(), showCourses()
- Use encapsulation to set variables (phone, city, state)*/
    public static void main(String[] args) {
        //3.Create a student object
        Student student1 = new Student("Jamelle", "321456987");
        Student student2 = new Student("Jak", "123456907");
        Student student3 = new Student("Ted", "908456911");

        student1.enroll("Math154");
        student1.enroll("SCI4215");
        student1.enroll("His211");

        //student1.showCourses();
        //student1.checkBalance();
        student1.pay(600);
        //student1.checkBalance();
        System.out.println(student1.toString()); ;

    }

    static class Student{
        //1. Create class and properties
        private static int iD = 1000;
        private String userId;
        private String name;
        private String ssn;
        private String email;
        private String phone;
        private String city;
        private String state;
        private String courses = "";
        private static final int costOfCourse = 800;
        private int balance = 0;



        //2. create constructors with paremeters
        public Student(String name, String ssn) {
            iD++;//increment id for each student object created
            this.name = name;
            this.ssn = ssn;
            setUserId();//4
            setEmail();
        }

        //8 getters and setter encapsulation
        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getEmail() {
            return email;
        }

        private void setEmail() {
            //this.email = email;
            email = name.toLowerCase() + "." + iD + "@sdetuniversity.com";
            System.out.println("Your email: " + email);
        }

        public void setUserId() {//5
            int max = 9000;
            int min = 100;
            //this.userId = userId;
           int  ranNum = (int) (Math.random() * ((max - min)));//6
           ranNum = ranNum + min;
           userId = iD +  ranNum  + ssn.substring(6);//last 3 of soc
            System.out.println("This just a random number message " + ranNum);
            System.out.println("Your User ID " + userId);
        }

        public void enroll(String course){//7
            this.courses = this.courses + "\n" + course;
            System.out.println(courses);
            balance = balance + costOfCourse;
        }

        public void pay(int amount){
            System.out.println("Your Payment: " + amount);
            balance = balance - amount;
        }

        public void checkBalance(){
            System.out.println("Balance: $" + balance);
        }

        public void showCourses(){
            System.out.println(courses);

        }


        public String toString() {
            return "[Name: " + name + "]\n[COURSES: " + courses + "]\nBalance: " + balance + "] " ;
        }

    }


}
