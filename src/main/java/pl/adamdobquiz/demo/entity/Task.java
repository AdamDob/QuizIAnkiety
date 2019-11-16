package pl.adamdobquiz.demo.entity;

import lombok.Data;

import javax.annotation.Priority;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data

public class Task {

    private String id;
    private String description;
    private LocalDateTime finishDateTime;
    private boolean finished;
    private Priority priority;


}
