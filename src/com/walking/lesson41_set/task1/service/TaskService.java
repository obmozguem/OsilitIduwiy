package com.walking.lesson41_set.task1.service;

import com.walking.lesson41_set.task1.model.Task;
import java.util.LinkedHashSet;
import java.util.Set;

public class TaskService {
    private final Set<Task> tasks = new LinkedHashSet<>();

    public void addTask(Task t) {
        tasks.add(t);
        System.out.printf("Task \"%s\" added.\n", t.getName());
    }

    public void completeTask() {
        Task [] array = tasks.toArray(new Task[0]);
        tasks.remove(array[0]);
        if (array[0] == null) {
            System.out.println("Task's queue is empty!");
        } else {
            System.out.printf("Task \"%s\" completed.\n", array[0].getName());
        }
    }
}
