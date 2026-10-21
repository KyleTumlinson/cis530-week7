package edu.bellevue.cis530_Week7.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "members")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(min = 2, max = 100)
    @NotBlank
    private String username;
    @Size(min = 2, max = 255)
    @NotBlank
    private String password;

    private String role;
    private boolean enabled = true;
}
