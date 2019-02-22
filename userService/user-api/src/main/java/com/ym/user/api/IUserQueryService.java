package com.ym.user.api;

import com.ym.user.api.dto.*;

public interface IUserQueryService {

	/**
	 * 根据用户id来查询用户信息
	 * @param request
	 * @return
	 */
	UserQueryResponse getUserById(UserQueryRequest request);

}
