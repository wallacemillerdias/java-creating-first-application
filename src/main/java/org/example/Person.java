package org.example;

import lombok.*;

@Data
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private Long id;
    private String nome;
    private String email;
    private String senha;
}
