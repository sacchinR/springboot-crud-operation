package com.demo.service;

import com.demo.io.BaseResponse;
import com.demo.table.Task;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TaskService {

    public BaseResponse findAll();

    public BaseResponse saveDetails(Task taskDetails);

    public BaseResponse deleteDetails(int task);

    public BaseResponse updateDetails(Task taskDetails);

    BaseResponse getByIdDetails(int taskId);
}
