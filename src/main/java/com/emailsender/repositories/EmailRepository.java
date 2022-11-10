package com.emailsender.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emailsender.models.EmailModel;

public interface EmailRepository extends JpaRepository<EmailModel, UUID> {


}
