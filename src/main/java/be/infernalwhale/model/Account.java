package be.infernalwhale.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

// TODO: fix the model entity annotations

public class Account {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private LocalDate birthday;
    private Gender gender;
    private LocalDateTime creationTime;
    private BigDecimal balance = BigDecimal.ZERO.setScale(2);
}
