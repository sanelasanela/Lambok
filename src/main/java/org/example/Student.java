package org.example;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@ToString

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Student {
    private int id;
    private String name;
    private String address;
    private String grade;
}
