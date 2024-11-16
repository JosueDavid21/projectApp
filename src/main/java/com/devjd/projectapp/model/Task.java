package com.devjd.projectapp.model;

import com.devjd.projectapp.emun.ImportanceLevel;
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
* Description: Model class to Task
*
* @CreationDate: 2024-11-16
* @CreationUser: DevJD
* @Version: 1.0
*/

@Entity
@Table(name = "task")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Task implements Serializable{

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

    @Column( name = "endDate" )
    private LocalDate enddate;

    @NotNull
    @Column( name = "status" )
    private ProjectStatus status;

    @NotNull
    @Column( name = "importance" )
    private ImportanceLevel importance;

    @ManyToOne
    @JoinColumn(name = "detail_project_id", nullable = false)
    private DetailProject detailProject;

//    Recursive Relationship One to Many
    @OneToMany(mappedBy = "subTasks", cascade = CascadeType.ALL)
    private Set<Task> subTaskList;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "task_id", nullable = false)
    private Task subTasks;
}