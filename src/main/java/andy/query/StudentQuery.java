package andy.query;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Descripption TODO
 * @Author:zn
 * @CreateDate:2020/4/4/004 21:36
 * @UpdateDate:2020/4/4/004 21:36
 */
@Data
public class StudentQuery {

    @ApiModelProperty(value = "姓名")
    private String name;

    @ApiModelProperty(value = "年龄")
    private Integer age;
}
