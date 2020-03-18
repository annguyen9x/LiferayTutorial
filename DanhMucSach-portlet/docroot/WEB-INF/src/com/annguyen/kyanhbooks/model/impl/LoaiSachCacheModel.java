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

package com.annguyen.kyanhbooks.model.impl;

import com.annguyen.kyanhbooks.model.LoaiSach;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing LoaiSach in entity cache.
 *
 * @author AnNguyen
 * @see LoaiSach
 * @generated
 */
public class LoaiSachCacheModel implements CacheModel<LoaiSach>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{MaLoaiSach=");
		sb.append(MaLoaiSach);
		sb.append(", TenLoaiSach=");
		sb.append(TenLoaiSach);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public LoaiSach toEntityModel() {
		LoaiSachImpl loaiSachImpl = new LoaiSachImpl();

		if (MaLoaiSach == null) {
			loaiSachImpl.setMaLoaiSach(StringPool.BLANK);
		}
		else {
			loaiSachImpl.setMaLoaiSach(MaLoaiSach);
		}

		if (TenLoaiSach == null) {
			loaiSachImpl.setTenLoaiSach(StringPool.BLANK);
		}
		else {
			loaiSachImpl.setTenLoaiSach(TenLoaiSach);
		}

		loaiSachImpl.resetOriginalValues();

		return loaiSachImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		MaLoaiSach = objectInput.readUTF();
		TenLoaiSach = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (MaLoaiSach == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(MaLoaiSach);
		}

		if (TenLoaiSach == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(TenLoaiSach);
		}
	}

	public String MaLoaiSach;
	public String TenLoaiSach;
}