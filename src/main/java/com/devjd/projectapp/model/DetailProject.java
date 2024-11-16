package com.devjd.projectapp.model;

import com.devjd.projectapp.emun.ProjectStatus;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;

/**
 * Description: Model class to Project
 *
 * @CreationDate: 2024-11-16
 * @CreationUser: DevJD
 * @Version: 1.0
 */

@Entity
@Table(name = "detail_project")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DetailProject implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "status")
    private ProjectStatus status;

    @ManyToOne
    @JoinColumn(name = "project_id", nullable = false)
    private Project project;

//    Task Relationship One to Many
    @OneToMany(mappedBy = "detailProject", cascade = CascadeType.ALL)
    private Set<Task> taskList;

//    Recursive Relationship One to Many
    @OneToMany(mappedBy = "subDetailProject", cascade = CascadeType.ALL)
    private Set<DetailProject> detailProjectList;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "detail_project_id", nullable = false)
    private DetailProject subDetailProject;

}