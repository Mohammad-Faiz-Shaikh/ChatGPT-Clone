package com.faiz.ai_clone.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.faiz.ai_clone.model.FaizGPT;
import com.faiz.ai_clone.service.FaizGPTService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@CrossOrigin(value = "*")
public class FaizGPTController {
	
	private final FaizGPTService serv;
	
	@PostMapping("/save")
	public ResponseEntity<FaizGPT> save(@RequestBody FaizGPT request)
	{
		return ResponseEntity.status(201).body(serv.save(request.getQuestion(), request.getAnswer()));
	}
	
	@GetMapping("/getAnswer/{question}")
	public ResponseEntity<String> findTheAnswer (@PathVariable String question)
	{
		return ResponseEntity.status(200).body(serv.findAnswer(question));
	}

}
