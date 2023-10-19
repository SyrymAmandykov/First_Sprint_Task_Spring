package com.example.thymeleaf_layout_dialect.core;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Tasks {

    private Long id;
    private String name;
    private String description;
    private LocalDateTime deadlineDate;
    private boolean isCompleted;
}
