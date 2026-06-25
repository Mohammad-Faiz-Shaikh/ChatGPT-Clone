package com.faiz.ai_clone.service;

import org.springframework.stereotype.Service;

import com.faiz.ai_clone.model.FaizGPT;
import com.faiz.ai_clone.repository.FaizGPTRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class FaizGPTService  {
	
	private final FaizGPTRepo repo;
	
	public FaizGPT save(String question , String answer)
	{
		FaizGPT gpt= repo.findByQuestionIgnoreCase(question);
		
		if(gpt==null)
		{
			return repo.save( new FaizGPT(question , answer));
		}
		return new FaizGPT(question, "Question already exist");
	}
	public String findAnswer(String question)
	{
		FaizGPT gpt = repo.findByQuestionIgnoreCase(question);
		
		if(gpt==null)
		{
			return "No answer found";
		}
		return gpt.getAnswer();
	}
}
