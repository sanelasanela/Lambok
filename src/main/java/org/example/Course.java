package org.example;


import lombok.*;

import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data

@Builder

public class Course {
    private int id;
    private String name;
    private Teacher teacher;
    private List<Student> students;
}
