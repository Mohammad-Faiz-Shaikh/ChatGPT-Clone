package com.faiz.ai_clone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.faiz.ai_clone.model.FaizGPT;

@Repository
public interface FaizGPTRepo extends JpaRepository<FaizGPT, Long> {

	FaizGPT findByQuestionIgnoreCase(String question);
}
