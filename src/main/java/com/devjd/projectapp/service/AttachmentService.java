package com.devjd.projectapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;
import java.util.List;
import com.devjd.projectapp.model.Attachment;
import com.devjd.projectapp.repository.AttachmentRepository;

/**
* Description: Model class to Attachment
*
* @CreationDate: 2024-11-16
* @CreationUser: DevJD
* @Version: 1.0
*/

@Service
public class AttachmentService {

	@Autowired
	private AttachmentRepository attachmentRepository;

    public List<Attachment> getAllAttachment() {
        return attachmentRepository.findAll();
    }

    public Optional<Attachment> getAttachmentById(Long id) {
        return attachmentRepository.findById(id);
    }

    public Attachment saveAttachment(Attachment attachment) {
        return attachmentRepository.save(attachment);
    }

    public void deleteAttachment(Long id) {
        attachmentRepository.deleteById(id);
    }
}