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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link LoaiSach}.
 * </p>
 *
 * @author AnNguyen
 * @see LoaiSach
 * @generated
 */
public class LoaiSachWrapper implements LoaiSach, ModelWrapper<LoaiSach> {
	public LoaiSachWrapper(LoaiSach loaiSach) {
		_loaiSach = loaiSach;
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

	/**
	* Returns the primary key of this loai sach.
	*
	* @return the primary key of this loai sach
	*/
	@Override
	public java.lang.String getPrimaryKey() {
		return _loaiSach.getPrimaryKey();
	}

	/**
	* Sets the primary key of this loai sach.
	*
	* @param primaryKey the primary key of this loai sach
	*/
	@Override
	public void setPrimaryKey(java.lang.String primaryKey) {
		_loaiSach.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ma loai sach of this loai sach.
	*
	* @return the ma loai sach of this loai sach
	*/
	@Override
	public java.lang.String getMaLoaiSach() {
		return _loaiSach.getMaLoaiSach();
	}

	/**
	* Sets the ma loai sach of this loai sach.
	*
	* @param MaLoaiSach the ma loai sach of this loai sach
	*/
	@Override
	public void setMaLoaiSach(java.lang.String MaLoaiSach) {
		_loaiSach.setMaLoaiSach(MaLoaiSach);
	}

	/**
	* Returns the ten loai sach of this loai sach.
	*
	* @return the ten loai sach of this loai sach
	*/
	@Override
	public java.lang.String getTenLoaiSach() {
		return _loaiSach.getTenLoaiSach();
	}

	/**
	* Sets the ten loai sach of this loai sach.
	*
	* @param TenLoaiSach the ten loai sach of this loai sach
	*/
	@Override
	public void setTenLoaiSach(java.lang.String TenLoaiSach) {
		_loaiSach.setTenLoaiSach(TenLoaiSach);
	}

	@Override
	public boolean isNew() {
		return _loaiSach.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_loaiSach.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _loaiSach.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_loaiSach.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _loaiSach.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _loaiSach.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_loaiSach.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _loaiSach.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_loaiSach.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_loaiSach.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_loaiSach.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new LoaiSachWrapper((LoaiSach)_loaiSach.clone());
	}

	@Override
	public int compareTo(com.annguyen.kyanhbooks.model.LoaiSach loaiSach) {
		return _loaiSach.compareTo(loaiSach);
	}

	@Override
	public int hashCode() {
		return _loaiSach.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.annguyen.kyanhbooks.model.LoaiSach> toCacheModel() {
		return _loaiSach.toCacheModel();
	}

	@Override
	public com.annguyen.kyanhbooks.model.LoaiSach toEscapedModel() {
		return new LoaiSachWrapper(_loaiSach.toEscapedModel());
	}

	@Override
	public com.annguyen.kyanhbooks.model.LoaiSach toUnescapedModel() {
		return new LoaiSachWrapper(_loaiSach.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _loaiSach.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _loaiSach.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_loaiSach.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof LoaiSachWrapper)) {
			return false;
		}

		LoaiSachWrapper loaiSachWrapper = (LoaiSachWrapper)obj;

		if (Validator.equals(_loaiSach, loaiSachWrapper._loaiSach)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public LoaiSach getWrappedLoaiSach() {
		return _loaiSach;
	}

	@Override
	public LoaiSach getWrappedModel() {
		return _loaiSach;
	}

	@Override
	public void resetOriginalValues() {
		_loaiSach.resetOriginalValues();
	}

	private LoaiSach _loaiSach;
}