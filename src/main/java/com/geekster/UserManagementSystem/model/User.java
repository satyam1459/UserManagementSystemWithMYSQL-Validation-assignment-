package com.geekster.UserManagementSystem.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.service.annotation.PostExchange;

import java.time.LocalTime;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @NotNull
    private int userId;
    @NotNull
    private String userName;
 @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  @JsonFormat(pattern="yyyy-MM-dd")
    private String dob;
    @Email(regexp = "[A-Za-z]+[0-9]+@[a-z]+\\.com")
    private String email;
    @Length(max = 12,min = 10)
    private String phoneNumber;
    private LocalTime time = LocalTime.now();
}
