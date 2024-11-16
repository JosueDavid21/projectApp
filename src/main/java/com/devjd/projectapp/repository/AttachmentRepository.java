package com.devjd.projectapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.devjd.projectapp.model.Attachment;

/**
* Description: Model class to Attachment
*
* @CreationDate: 2024-11-16
* @CreationUser: DevJD
* @Version: 1.0
*/

@Repository
public interface AttachmentRepository extends JpaRepository<Attachment, Long> {
}