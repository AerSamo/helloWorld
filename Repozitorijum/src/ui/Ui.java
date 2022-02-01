package ui;

import db.Course;

import java.util.Scanner;

public class Ui {
    public int menu() {
        System.out.println("" + 1 + " - Show courses, " + 2 + " - Add course, " +
                3 + " - Update course, " + 4 + " - Delete course, " + 5 + " - Exit program");

        Scanner scanner = new Scanner(System.in);
        int selectedOption = 0;

        while (true) {
            try {
                selectedOption = Integer.parseInt(scanner.nextLine());
                if (selectedOption < 1 || selectedOption > 5) {
                    System.out.println("Menu item does not,exist,try again");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.println("please enter valid menu item number");
            }
        }
        return selectedOption;

    }

    public int getId() {

        Scanner scanner = new Scanner(System.in);
        int selectedId = 0;

        while (true) {
            try {
                System.out.println("insert course ID number");
                selectedId = Integer.parseInt(scanner.nextLine());

                break;
            } catch (Exception e) {
                System.out.println("please, enter valid ID wnumber");
            }
        }
        return selectedId;

    }

    public Course getCurse() {

        Course course = new Course();
        Scanner scanner = new Scanner(System.in);

        while(course.title == null){
            System.out.println("insert course title");
            String title = scanner.nextLine();
            if(title.isEmpty()){
                System.out.println("title cannot be empty");
                continue;
            }
            course.title = title;
            System.out.println("insert course description");
            course.description = scanner.nextLine();
        }

        return course;
    }

    public void updateCourse(Course c){
        Scanner scanner = new Scanner(System.in);

        System.out.println("insert course title");

        String title = scanner.nextLine();
        if(!title.isEmpty()){
            c.title = title;
        }

        System.out.println("insert course description");
        String desc = scanner.nextLine();
        if(!desc.isEmpty()){
            c.description = title;
        }


    }

}
