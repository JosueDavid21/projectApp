package com.devjd.projectapp.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
* Description: Model class to Attachment
*
* @CreationDate: 2024-11-16
* @CreationUser: DevJD
* @Version: 1.0
*/

@Entity
@Table(name = "attachment")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Attachment implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Column( name = "name" )
    private String name;

    @Column( name = "path" )
    private String path;

    @Column( name = "uploadDate" )
    private LocalDate uploaddate;

}