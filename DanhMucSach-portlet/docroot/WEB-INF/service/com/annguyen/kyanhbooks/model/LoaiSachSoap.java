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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.annguyen.kyanhbooks.service.http.LoaiSachServiceSoap}.
 *
 * @author AnNguyen
 * @see com.annguyen.kyanhbooks.service.http.LoaiSachServiceSoap
 * @generated
 */
public class LoaiSachSoap implements Serializable {
	public static LoaiSachSoap toSoapModel(LoaiSach model) {
		LoaiSachSoap soapModel = new LoaiSachSoap();

		soapModel.setMaLoaiSach(model.getMaLoaiSach());
		soapModel.setTenLoaiSach(model.getTenLoaiSach());

		return soapModel;
	}

	public static LoaiSachSoap[] toSoapModels(LoaiSach[] models) {
		LoaiSachSoap[] soapModels = new LoaiSachSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static LoaiSachSoap[][] toSoapModels(LoaiSach[][] models) {
		LoaiSachSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new LoaiSachSoap[models.length][models[0].length];
		}
		else {
			soapModels = new LoaiSachSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static LoaiSachSoap[] toSoapModels(List<LoaiSach> models) {
		List<LoaiSachSoap> soapModels = new ArrayList<LoaiSachSoap>(models.size());

		for (LoaiSach model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new LoaiSachSoap[soapModels.size()]);
	}

	public LoaiSachSoap() {
	}

	public String getPrimaryKey() {
		return _MaLoaiSach;
	}

	public void setPrimaryKey(String pk) {
		setMaLoaiSach(pk);
	}

	public String getMaLoaiSach() {
		return _MaLoaiSach;
	}

	public void setMaLoaiSach(String MaLoaiSach) {
		_MaLoaiSach = MaLoaiSach;
	}

	public String getTenLoaiSach() {
		return _TenLoaiSach;
	}

	public void setTenLoaiSach(String TenLoaiSach) {
		_TenLoaiSach = TenLoaiSach;
	}

	private String _MaLoaiSach;
	private String _TenLoaiSach;
}