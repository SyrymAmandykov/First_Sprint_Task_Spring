package com.example.thymeleaf_layout_dialect.core;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

public class DataBaseManager {

    private static ArrayList<Tasks> task = new ArrayList<>();

    private static Long idCursor = 1L;


    public static ArrayList<Tasks> getAllTasks(){
        return task;
    }

    public static void addNewTasks(String name, String description, LocalDateTime deadlineDate, boolean isCompleted){
        task.add(new Tasks(
                        idCursor,
                        name,
                        description,
                        deadlineDate,
                        isCompleted
                )
        );
        idCursor += 1;
    }
}
