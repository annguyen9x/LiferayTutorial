/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.tutorial.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import com.liferay.tutorial.model.Validator_Student;
import com.liferay.tutorial.service.Validator_StudentLocalServiceUtil;

/**
 * The extended model base implementation for the Validator_Student service. Represents a row in the &quot;database_Validator_Student&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link Validator_StudentImpl}.
 * </p>
 *
 * @author AnNguyen
 * @see Validator_StudentImpl
 * @see com.liferay.tutorial.model.Validator_Student
 * @generated
 */
public abstract class Validator_StudentBaseImpl
	extends Validator_StudentModelImpl implements Validator_Student {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a validator_ student model instance should use the {@link Validator_Student} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			Validator_StudentLocalServiceUtil.addValidator_Student(this);
		}
		else {
			Validator_StudentLocalServiceUtil.updateValidator_Student(this);
		}
	}
}