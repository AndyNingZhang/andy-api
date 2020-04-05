package andy.controller;

import andy.dto.StudentDto;
import andy.query.StudentQuery;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Descripption TODO
 * @Author:zn
 * @CreateDate:2020/4/4/004 21:31
 * @UpdateDate:2020/4/4/004 21:31
 */
@RestController
@Api(description = "学生管理")
@RequestMapping("/stu")
public class TestController {

    @PostMapping("/getStu")
    @ApiOperation("学生查询")
    public StudentDto getStu(@RequestBody StudentQuery studentQuery) {
        StudentDto studentDto=new StudentDto();
        studentDto.setAge(studentQuery.getAge());
        studentDto.setName(studentQuery.getName());
        return studentDto;
    }

}
