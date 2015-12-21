package com.mtsmda.java7Book.ch9;

/**
 * Created by c-DMITMINZ on 21.12.2015.
 */
public class ToStringEx {

    public static void main(String[] args) {
        ToDo toDo = new ToDo();
        toDo.setTaskDescription("A");
        toDo.setTaskName("");
        System.out.println(toDo.toString());
        System.out.println(toDo.hashCode() + " hex - " + Integer.toHexString(toDo.hashCode()));
    }

}

class ToDo {

    private String taskName;
    private String taskDescription;

    public ToDo() {

    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ToDo toDo = (ToDo) o;

        if (!taskName.equals(toDo.taskName)) return false;
        return taskDescription.equals(toDo.taskDescription);

    }

    @Override
    public int hashCode() {
        int result = taskName.hashCode();
        result = 31 * result + taskDescription.hashCode();
        return result;
    }
}