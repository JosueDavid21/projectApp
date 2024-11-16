package com.devjd.projectapp.model;

import com.devjd.projectapp.emun.ProjectStatus;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
* Description: Model class to Project
*
* @CreationDate: 2024-11-16
* @CreationUser: DevJD
* @Version: 1.0
*/

@Entity
@Table(name = "project")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Project implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Column( name = "name" )
    private String name;

    @Column( name = "description" )
    private String description;

    @NotNull
    @Column( name = "startDate" )
    private LocalDate startdate;

    @NotNull
    @Column( name = "endDate" )
    private LocalDate enddate;

    @NotNull
    @Column( name = "status" )
    private ProjectStatus status;

    @OneToMany(mappedBy = "project", cascade = CascadeType.ALL)
    private Set<DetailProject> detailProjectList;
}