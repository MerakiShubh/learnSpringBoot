package com.merakishubh.StudentManagement.LearningRestApis.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class AddStudentRequestDto {
    @NotBlank(message = "Name is required")
    @Size(min = 3, max = 30, message = "Name should be of length 3 to 30 character")
    private String  name;
    @Email
    @NotBlank(message = "Email is required")
    private String email;
}
