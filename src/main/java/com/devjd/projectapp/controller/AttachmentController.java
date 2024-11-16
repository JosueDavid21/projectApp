package com.devjd.projectapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import com.devjd.projectapp.service.AttachmentService;
import com.devjd.projectapp.model.Attachment;

import java.util.List;

/**
* Description: Model class to Attachment
*
* @CreationDate: 2024-11-16
* @CreationUser: DevJD
* @Version: 1.0
*/

@RestController
@RequestMapping("/attachment")
@CrossOrigin({ "*" })
public class AttachmentController {

	@Autowired
	private AttachmentService attachmentService;

    @GetMapping("/all")
    public List<Attachment> getAllAttachment() {
        return attachmentService.getAllAttachment();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Attachment> getAttachmentById(@PathVariable Long id) {
        return attachmentService.getAttachmentById(id)
            .map(attachment -> ResponseEntity.ok().body(attachment))
            .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Attachment> saveAttachment(@RequestBody Attachment attachment) {
        Attachment newAttachment = attachmentService.saveAttachment(attachment);
        return ResponseEntity.status(HttpStatus.CREATED).body(newAttachment);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAttachment(@PathVariable Long id) {
        attachmentService.deleteAttachment(id);
        return ResponseEntity.noContent().build();
    }
}