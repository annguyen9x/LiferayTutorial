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

package com.annguyen.kyanhbooks.service.persistence;

import com.annguyen.kyanhbooks.model.LoaiSach;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the loai sach service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author AnNguyen
 * @see LoaiSachPersistenceImpl
 * @see LoaiSachUtil
 * @generated
 */
public interface LoaiSachPersistence extends BasePersistence<LoaiSach> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link LoaiSachUtil} to access the loai sach persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the loai sach in the entity cache if it is enabled.
	*
	* @param loaiSach the loai sach
	*/
	public void cacheResult(com.annguyen.kyanhbooks.model.LoaiSach loaiSach);

	/**
	* Caches the loai sachs in the entity cache if it is enabled.
	*
	* @param loaiSachs the loai sachs
	*/
	public void cacheResult(
		java.util.List<com.annguyen.kyanhbooks.model.LoaiSach> loaiSachs);

	/**
	* Creates a new loai sach with the primary key. Does not add the loai sach to the database.
	*
	* @param MaLoaiSach the primary key for the new loai sach
	* @return the new loai sach
	*/
	public com.annguyen.kyanhbooks.model.LoaiSach create(
		java.lang.String MaLoaiSach);

	/**
	* Removes the loai sach with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param MaLoaiSach the primary key of the loai sach
	* @return the loai sach that was removed
	* @throws com.annguyen.kyanhbooks.NoSuchLoaiSachException if a loai sach with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.annguyen.kyanhbooks.model.LoaiSach remove(
		java.lang.String MaLoaiSach)
		throws com.annguyen.kyanhbooks.NoSuchLoaiSachException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.annguyen.kyanhbooks.model.LoaiSach updateImpl(
		com.annguyen.kyanhbooks.model.LoaiSach loaiSach)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the loai sach with the primary key or throws a {@link com.annguyen.kyanhbooks.NoSuchLoaiSachException} if it could not be found.
	*
	* @param MaLoaiSach the primary key of the loai sach
	* @return the loai sach
	* @throws com.annguyen.kyanhbooks.NoSuchLoaiSachException if a loai sach with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.annguyen.kyanhbooks.model.LoaiSach findByPrimaryKey(
		java.lang.String MaLoaiSach)
		throws com.annguyen.kyanhbooks.NoSuchLoaiSachException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the loai sach with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param MaLoaiSach the primary key of the loai sach
	* @return the loai sach, or <code>null</code> if a loai sach with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.annguyen.kyanhbooks.model.LoaiSach fetchByPrimaryKey(
		java.lang.String MaLoaiSach)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the loai sachs.
	*
	* @return the loai sachs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.annguyen.kyanhbooks.model.LoaiSach> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the loai sachs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.annguyen.kyanhbooks.model.impl.LoaiSachModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of loai sachs
	* @param end the upper bound of the range of loai sachs (not inclusive)
	* @return the range of loai sachs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.annguyen.kyanhbooks.model.LoaiSach> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the loai sachs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.annguyen.kyanhbooks.model.impl.LoaiSachModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of loai sachs
	* @param end the upper bound of the range of loai sachs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of loai sachs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.annguyen.kyanhbooks.model.LoaiSach> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the loai sachs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of loai sachs.
	*
	* @return the number of loai sachs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}