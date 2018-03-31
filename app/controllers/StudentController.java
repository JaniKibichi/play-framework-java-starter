package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import play.mvc.*;
import util.Util;
import models.Student;
import play.libs.Json;
import models.StudentStore;
import java.util.Set;

public class StudentController extends Controller {

    public Result create(){
        JsonNode json = request().body().asJson();
        if(json == null){
            return badRequest(Util.createResponse(
                    "Expecting Json data",false
            ));
        }
        Student student = new StudentStore().addStudent(
                (Student) Json.fromJson(json, Student.class));
        JsonNode jsonObject = Json.toJson(student);
        return created(Util.createResponse(jsonObject,true));
    }

    public Result update(){
        JsonNode json = request().body().asJson();
        if(json == null){
            return badRequest(Util.createResponse("Expecting Json data",false));
        }
        Student student = new StudentStore().updateStudent(
                (Student) Json.fromJson(json, Student.class)
        );
        if(student==null){
            return notFound(Util.createResponse("Student not found",false));
        }
        JsonNode jsonObject = Json.toJson(student);
        return ok(Util.createResponse(jsonObject, true));
    }

    public Result retrieve(int id){
        Student student = new StudentStore().getStudent(id);
        if(student == null){
            return notFound(Util.createResponse("Student with id:"+id+" not found", false));
        }
        JsonNode jsonObjects = Json.toJson(student);
        return ok(Util.createResponse(jsonObjects,true));
    }

    public Result delete(int id){
        boolean status = new StudentStore().deleteStudent(id);
        if(!status){
            return notFound(Util.createResponse("Student with id:"+id+" not found",false));
        }
        return ok(Util.createResponse("Student with id:"+id+" deleted.", true));
    }

    public Result listStudents(){
        Set<Student> result = new StudentStore().getAllStudents();
        ObjectMapper mapper = new ObjectMapper();

        JsonNode jsonData = mapper.convertValue(result,JsonNode.class);
        return ok(Util.createResponse(jsonData, true));
    }
}