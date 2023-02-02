package com.walking.lesson40_queue2.task1;
/* Реализуйте класс Задание. Он должен содержать поле Название, состав остальных полей - на ваше усмотрение.
Реализуйте сервис, хранящий задания. Он должен иметь методы для добавления заданий и их "выполнения". Задания
 должны обрабатываться в порядке очереди. Критерием выполнения задания будем считать выведение в консоль фразы
 "Задание %название задания% выполнено!".
Также добавьте вывод сообщения в консоль о том, что задание (с указанием названия) добавлено. */

import com.walking.lesson40_queue2.task1.model.Task;
import com.walking.lesson40_queue2.task1.service.TaskService;

public class Main {
    public static void main(String[] args) {
        Task t1 = new Task("task1");
        Task t2 = new Task("task2");
        Task t3 = new Task("task3");
        Task t4 = new Task("task4");
        Task t5 = new Task("task5");

        TaskService taskService = new TaskService();

        taskService.addTask(t1);
        taskService.addTask(t2);
        taskService.addTask(t3);

        taskService.completeTask();

        taskService.addTask(t4);
        taskService.addTask(t5);

        taskService.completeTask();
        taskService.completeTask();
        taskService.completeTask();
        taskService.completeTask();
        taskService.completeTask();
        taskService.completeTask();
    }
}
