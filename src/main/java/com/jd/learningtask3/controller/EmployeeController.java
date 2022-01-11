package com.jd.learningtask3.controller;

import com.jd.learningtask3.model.ToDoList;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class EmployeeController {

    @GetMapping("/getAllEmployees")
    public void getAllEmployee(){
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:3000/get";
        ResponseEntity<ToDoList[]> responseEntity = restTemplate.getForEntity(url, ToDoList[].class);
        ToDoList[] employee = responseEntity.getBody();
        for(ToDoList e : employee){
            System.out.println("ID: "+e.getId()+", Title: "+e.getTitle()+", Description: "+e.getDescription()+", Status: "+e.getStatus());
        }
//EMPLOYEE
//        ResponseEntity<Employee[]> responseEntity = restTemplate.getForEntity(url, Employee[].class);
//        Employee[] employee = responseEntity.getBody();
//        for(Employee e : employee){
//            System.out.println("Employee id: "+e.getId()+", Employee name: "+e.getEmployee_name()+", Employee age: "+e.getEmployee_age()+". Employee salary: "+e.getEmployee_salary());
//        }
//POST
//        String url = "https://jsonplaceholder.typicode.com/users";
//        ResponseEntity<Post[]> responseEntity = restTemplate.getForEntity(url, Post[].class);
//        Post[] post = responseEntity.getBody();
//        for(Post e : post){
//            System.out.println("User id: "+e.getUserId()+", ID: "+e.getId()+", Post title: "+e.getTitle()+", Post body: "+e.getBody());
//        }
    }

    @PostMapping
    public void insertEmployee(ToDoList toDoList){
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:3000/save";
        HttpEntity<ToDoList> httpEntity = new HttpEntity<ToDoList>(toDoList);
        restTemplate.postForLocation(url, httpEntity);
    }
}
