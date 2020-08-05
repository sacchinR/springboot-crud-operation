package com.demo.service.impl;
    
import com.demo.constants.MessageCodes;
import com.demo.dao.TaskDAO;
import com.demo.io.BaseResponse;
import com.demo.io.StatusMessage;
import com.demo.table.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskServiceImpl implements com.demo.service.TaskService {
    @Autowired
    TaskDAO taskDAO;

    @Override
    public BaseResponse findAll() {
        String status=null;
        StatusMessage statusMessage=null;
        List<Task> task=null;
        try{
            task=taskDAO.findAll();
            status=  MessageCodes.SUCCESS;
            statusMessage=StatusMessage.builder().code(MessageCodes.SUCCESS).description(MessageCodes.SUCCESS_MSG).build();

        }catch(Exception e){
            status=  MessageCodes.BAD_REQUEST;
            statusMessage=StatusMessage.builder().code(MessageCodes.BAD_REQUEST).description(MessageCodes.ERROR).build();
        }

        return BaseResponse.builder().status(status).statusMessage(statusMessage).data(task).build();
    }

    @Override
    public BaseResponse saveDetails(Task taskDetails) {
         String status=null;
        StatusMessage statusMessage=null;
        List<Task> task=null;
        try{
            taskDAO.save(taskDetails);
            status=  MessageCodes.SUCCESS;
            statusMessage=StatusMessage.builder().code(MessageCodes.SUCCESS).description(MessageCodes.SUCCESS_MSG).build();

        }catch(Exception e){
            status=  MessageCodes.BAD_REQUEST;
            statusMessage=StatusMessage.builder().code(MessageCodes.BAD_REQUEST).description(MessageCodes.ERROR).build();
        }

        return BaseResponse.builder().status(status).statusMessage(statusMessage).build();
    }
    @Override
    public BaseResponse deleteDetails(int taskId) {

         String status=null;
        StatusMessage statusMessage=null;
        List<Task> task=null;
        try{
            taskDAO.deleteById(taskId);
            status=  MessageCodes.SUCCESS;
            statusMessage=StatusMessage.builder().code(MessageCodes.SUCCESS).description(MessageCodes.SUCCESS_MSG).build();

        }catch(Exception e){
            status=  MessageCodes.BAD_REQUEST;
            statusMessage=StatusMessage.builder().code(MessageCodes.BAD_REQUEST).description(MessageCodes.ERROR).build();
        }
        return BaseResponse.builder().status(status).statusMessage(statusMessage).build();
    }
    @Override
    public BaseResponse updateDetails(Task taskDetails) {

        String status=null;
        StatusMessage statusMessage=null;
        try{
            Optional<Task> task=taskDAO.findById(taskDetails.getTask()) ;
            Task taskdetails= task.get();
            taskdetails.setTaskName(taskDetails.getTaskName());
            taskdetails.setTaskFrequency(taskDetails.getTaskFrequency());
            taskdetails.setIsActive(taskDetails.getIsActive());
            taskdetails.setTaskBusinessSegment(taskDetails.getTaskBusinessSegment());
            taskdetails.setTaskCategory(taskDetails.getTaskCategory());
            taskdetails.setTaskProvenaceFlag(taskDetails.getTaskProvenaceFlag());
            taskdetails.setTaskNature(taskDetails.getTaskNature());
            taskdetails.setTaskWeightageScore(taskDetails.getTaskWeightageScore());
            taskdetails.setTaskCreatedBy(taskDetails.getTaskCreatedBy());
            taskdetails.setTaskCreationTimestamp(taskDetails.getTaskCreationTimestamp());
            taskdetails.setTaskApporver(taskDetails.getTaskApporver());
            taskDAO.save(taskdetails);
            status=  MessageCodes.SUCCESS;
            statusMessage=StatusMessage.builder().code(MessageCodes.SUCCESS).description(MessageCodes.SUCCESS_MSG).build();

        }catch(Exception e){
            status=  MessageCodes.BAD_REQUEST;
            statusMessage=StatusMessage.builder().code(MessageCodes.BAD_REQUEST).description(MessageCodes.ERROR).build();
        }
        return BaseResponse.builder().status(status).statusMessage(statusMessage).build();
    }

    @Override
    public BaseResponse getByIdDetails(int taskId) {
        String status=null;
        StatusMessage statusMessage=null;
        Optional<Task> task=null;
        try{
            task=taskDAO.findById(taskId);
            status=  MessageCodes.SUCCESS;
            statusMessage=StatusMessage.builder().code(MessageCodes.SUCCESS).description(MessageCodes.SUCCESS_MSG).build();

        }catch(Exception e){
            status=  MessageCodes.BAD_REQUEST;
            statusMessage=StatusMessage.builder().code(MessageCodes.BAD_REQUEST).description(MessageCodes.ERROR).build();
        }
        return BaseResponse.builder().status(status).statusMessage(statusMessage).data(task).build();
    }

}
