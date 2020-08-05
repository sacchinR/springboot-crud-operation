package com.demo.controller;


import com.demo.io.BaseResponse;
import com.demo.service.TaskService;
import com.demo.table.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class HomeController {

	@Autowired
	private TaskService taskService;
	
	@GetMapping("/getAll")
	public BaseResponse getAllTask() {
		return taskService.findAll();
	}

	@PostMapping("/save")
	public BaseResponse saveTaskDetails(@RequestBody Task task) {
		return taskService.saveDetails(task);
	}

	@DeleteMapping("/delete")
	public BaseResponse deleteTaskDetails(@RequestParam int taskId) {
		return taskService.deleteDetails(taskId);
	}

	@PostMapping("/update")
	public BaseResponse updateTaskDetails(@RequestBody Task task) {
		return taskService.updateDetails(task);
	}

	@GetMapping("/get")
	public BaseResponse getByIddetails(@RequestParam int taskId) { return taskService.getByIdDetails(taskId); }
	
}
