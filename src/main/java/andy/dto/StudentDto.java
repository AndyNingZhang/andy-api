package andy.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Descripption TODO
 * @Author:zn
 * @CreateDate:2020/4/4/004 21:37
 * @UpdateDate:2020/4/4/004 21:37
 */
@Data
public class StudentDto {

    @ApiModelProperty(value = "姓名")
    private String name;

    @ApiModelProperty(value = "年龄")
    private Integer age;
}
