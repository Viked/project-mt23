package com.example.project_mt23.topic_1_07.hierarchy;

import com.example.project_mt23.topic_1_06.hierarchy.Student;

import java.util.Comparator;

/**
 * Created by Initb on 25.04.2016.
 */
public abstract class AbstractGroup {

    abstract public Student getStudent(int i);
    abstract public void setStudent(int i, Student student);
    abstract public int studentCount();
    abstract public void addStudent(Student student);
    abstract public void clearStudent();
    abstract public void sortByAlphabeticalName();
    abstract public void sortByAscendingNamesLength();

    protected void print(StringBuffer out){
        for (int i = 0; i < studentCount(); i++){
            out.append(getStudent(i).toString()).append("\n");
        }
    }

    public void test(StringBuffer out) {
        addStudent(new Student(2002, "Первый", "Фамилия", "Харьков" , "Учится на 1" ));
        addStudent(new Student(1994, "Второй", "Норм фамилия", "Харьков" , "Учится на 2, иногда" ));
        addStudent(new Student(1996, "Третий", "Длинная фамилия", "Харьков" , "Не учится" ));
        addStudent(new Student(2001, "Четвертый", "Очень длинная фамилия", "Харьков" , "Да" ));
        addStudent(new Student(2000, "Пятый", "Ну очень длинная фамилия", "Харьков" , "Учится" ));
        out.append("\n")
                .append(this.getClass().getSimpleName())
                .append("\nПеред\n");
        print(out);
        sortByAlphabeticalName();
        out.append("\nПосле сортировки имен по алфавиту\n");
        print(out);
        sortByAscendingNamesLength();
        out.append("\nПосле сортировки по длинне фамилии\n");
        print(out);
    }

    class CompareAlphabeticalName implements Comparator<Student> {

        @Override
        public int compare(Student lhs, Student rhs) {
            return lhs.getName().compareToIgnoreCase(rhs.getName());
        }
    }

    class CompareAscendingNamesLength implements Comparator<Student> {

        @Override
        public int compare(Student lhs, Student rhs) {
            return lhs.getSurname().length() - rhs.getSurname().length();
        }
    }

}
