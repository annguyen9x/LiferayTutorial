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

package com.annguyen.kyanhbooks.model;

import com.annguyen.kyanhbooks.service.ClpSerializer;
import com.annguyen.kyanhbooks.service.LoaiSachLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author AnNguyen
 */
public class LoaiSachClp extends BaseModelImpl<LoaiSach> implements LoaiSach {
	public LoaiSachClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return LoaiSach.class;
	}

	@Override
	public String getModelClassName() {
		return LoaiSach.class.getName();
	}

	@Override
	public String getPrimaryKey() {
		return _MaLoaiSach;
	}

	@Override
	public void setPrimaryKey(String primaryKey) {
		setMaLoaiSach(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _MaLoaiSach;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((String)primaryKeyObj);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("MaLoaiSach", getMaLoaiSach());
		attributes.put("TenLoaiSach", getTenLoaiSach());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String MaLoaiSach = (String)attributes.get("MaLoaiSach");

		if (MaLoaiSach != null) {
			setMaLoaiSach(MaLoaiSach);
		}

		String TenLoaiSach = (String)attributes.get("TenLoaiSach");

		if (TenLoaiSach != null) {
			setTenLoaiSach(TenLoaiSach);
		}
	}

	@Override
	public String getMaLoaiSach() {
		return _MaLoaiSach;
	}

	@Override
	public void setMaLoaiSach(String MaLoaiSach) {
		_MaLoaiSach = MaLoaiSach;

		if (_loaiSachRemoteModel != null) {
			try {
				Class<?> clazz = _loaiSachRemoteModel.getClass();

				Method method = clazz.getMethod("setMaLoaiSach", String.class);

				method.invoke(_loaiSachRemoteModel, MaLoaiSach);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTenLoaiSach() {
		return _TenLoaiSach;
	}

	@Override
	public void setTenLoaiSach(String TenLoaiSach) {
		_TenLoaiSach = TenLoaiSach;

		if (_loaiSachRemoteModel != null) {
			try {
				Class<?> clazz = _loaiSachRemoteModel.getClass();

				Method method = clazz.getMethod("setTenLoaiSach", String.class);

				method.invoke(_loaiSachRemoteModel, TenLoaiSach);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getLoaiSachRemoteModel() {
		return _loaiSachRemoteModel;
	}

	public void setLoaiSachRemoteModel(BaseModel<?> loaiSachRemoteModel) {
		_loaiSachRemoteModel = loaiSachRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _loaiSachRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_loaiSachRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			LoaiSachLocalServiceUtil.addLoaiSach(this);
		}
		else {
			LoaiSachLocalServiceUtil.updateLoaiSach(this);
		}
	}

	@Override
	public LoaiSach toEscapedModel() {
		return (LoaiSach)ProxyUtil.newProxyInstance(LoaiSach.class.getClassLoader(),
			new Class[] { LoaiSach.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		LoaiSachClp clone = new LoaiSachClp();

		clone.setMaLoaiSach(getMaLoaiSach());
		clone.setTenLoaiSach(getTenLoaiSach());

		return clone;
	}

	@Override
	public int compareTo(LoaiSach loaiSach) {
		int value = 0;

		value = getTenLoaiSach().compareTo(loaiSach.getTenLoaiSach());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LoaiSachClp)) {
			return false;
		}

		LoaiSachClp loaiSach = (LoaiSachClp)obj;

		String primaryKey = loaiSach.getPrimaryKey();

		if (getPrimaryKey().equals(primaryKey)) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return getPrimaryKey().hashCode();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{MaLoaiSach=");
		sb.append(getMaLoaiSach());
		sb.append(", TenLoaiSach=");
		sb.append(getTenLoaiSach());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("com.annguyen.kyanhbooks.model.LoaiSach");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>MaLoaiSach</column-name><column-value><![CDATA[");
		sb.append(getMaLoaiSach());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>TenLoaiSach</column-name><column-value><![CDATA[");
		sb.append(getTenLoaiSach());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _MaLoaiSach;
	private String _TenLoaiSach;
	private BaseModel<?> _loaiSachRemoteModel;
	private Class<?> _clpSerializerClass = com.annguyen.kyanhbooks.service.ClpSerializer.class;
}