package com.github.alancoffey;
import java.util.ArrayList;
public class Module
{
    private final String moduleName;
    private final String moduleId;
    private final ArrayList<Student> students;

    public Module(String module, String id)
    {
      this.moduleName = module;
      this.moduleId = id;
      this.students = new ArrayList<Student>();

    }

    public String getName() {
      return this.moduleName;
    }

    public String getId() {
      return this.moduleId;
    }

    public ArrayList<Student> getStudents() {
      return this.students;
    }

    public void addStudents(ArrayList<Student> students) {
      this.students.addAll(students);
     }
}