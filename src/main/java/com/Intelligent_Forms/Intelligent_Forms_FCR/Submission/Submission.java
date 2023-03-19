package com.Intelligent_Forms.Intelligent_Forms_FCR.Submission;

import com.Intelligent_Forms.Intelligent_Forms_FCR.Form.Form;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "submission")
public class Submission {
    @Id
    @GeneratedValue
    private UUID id;
    @NotBlank
    @Size(min = 13, max = 13)
    public String cnp;
    @NotBlank
    public String userName;
    @NotBlank
    @Size(min = 2, max = 2)
    public String series;
    @NotBlank
    @Size(min = 6, max = 6)
    public String number;
    @NotBlank
    private LocalDate creationDate;
    @ManyToOne
    @JoinColumn(name = "form_id", referencedColumnName = "id")
    public Form form;

}
