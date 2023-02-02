package com.walking.lesson40_queue2.task1.service;

/* Реализуйте сервис, хранящий задания. Он должен иметь методы для добавления заданий и их "выполнения". Задания
 должны обрабатываться в порядке очереди. Критерием выполнения задания будем считать выведение в консоль фразы
 "Задание %название задания% выполнено!".
Также добавьте вывод сообщения в консоль о том, что задание (с указанием названия) добавлено.*/

import com.walking.lesson40_queue2.task1.model.Task;

import java.util.ArrayDeque;
import java.util.Deque;

public class TaskService {

    private final Deque<Task> tasks = new ArrayDeque<>();

    public void addTask(Task t) {
        tasks.add(t);
        System.out.printf("Task \"%s\" added.\n", t.getName());
    }

    public void completeTask() {
        Task task = tasks.poll();
        if (task == null) {
            System.out.println("Task's queue is empty!");
        } else {
            System.out.printf("Task \"%s\" completed.\n", task.getName());
        }
    }
}
