package comhlk.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("用户实体")
public class User {
    @ApiModelProperty("用户名")
    public String username;
    @ApiModelProperty("密码")
    public String password;
}

/*注：并不是因为@ApiModel这个注解让实体显示在这里了，
而是只要出现在接口方法的返回值上的实体都会显示在这里，
而@ApiModel和@ApiModelProperty这两个注解只是为实体添加注释的。
@ApiModel为类添加注释
@ApiModelProperty为类属性添加注释
* */