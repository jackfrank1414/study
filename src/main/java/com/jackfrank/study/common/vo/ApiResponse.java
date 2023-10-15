package com.jackfrank.study.common.vo;

import com.jackfrank.study.common.constant.ApiReturnMessage;
import com.jackfrank.study.common.constant.ApiStatusCode;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : jackfrank
 * @version : v1.0
 * @description : 一句话描述该类的功能
 * @createTime : 2023/10/14 23:50
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(name = "apiResponse", description = "接口统一返回实体")
public class ApiResponse {
    @Schema(description = "状态码")
    private Integer statusCode;

    @Schema(description = "返回信息")
    private String message;

    @Schema(description = "返回数据")
    private Object data;

    /**
     * 成功
     *
     * @param data 返回数据
     * @return 成功
     */
    public static ApiResponse success(Object data) {
        return ApiResponse.builder().statusCode(ApiStatusCode.SUCCESS).message(ApiReturnMessage.SUCCESS).data(data)
            .build();
    }
}
