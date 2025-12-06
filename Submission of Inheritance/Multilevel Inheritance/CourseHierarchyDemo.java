// Base class
class Course {
    String courseName;
    int duration; // in hours

    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    void displayCourseInfo() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " hours");
    }
}

// Subclass
class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    void displayCourseInfo() {
        super.displayCourseInfo();
        System.out.println("Platform: " + platform + ", Recorded: " + isRecorded);
    }
}

// Subclass extending OnlineCourse
class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount; // in percentage

    PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    @Override
    void displayCourseInfo() {
        super.displayCourseInfo();
        System.out.println("Fee: $" + fee + ", Discount: " + discount + "%");
    }
}

// Demo
public class CourseHierarchyDemo {
    public static void main(String[] args) {
        Course c1 = new Course("Mathematics", 40);
        OnlineCourse c2 = new OnlineCourse("Java Programming", 60, "Udemy", true);
        PaidOnlineCourse c3 = new PaidOnlineCourse("Advanced AI", 100, "Coursera", false, 500, 10);

        Course[] courses = {c1, c2, c3};
        for (Course c : courses) {
            c.displayCourseInfo();
            System.out.println("------");
        }
    }
}
