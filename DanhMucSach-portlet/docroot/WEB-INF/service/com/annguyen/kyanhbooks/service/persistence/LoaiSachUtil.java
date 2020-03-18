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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the loai sach service. This utility wraps {@link LoaiSachPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author AnNguyen
 * @see LoaiSachPersistence
 * @see LoaiSachPersistenceImpl
 * @generated
 */
public class LoaiSachUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(LoaiSach loaiSach) {
		getPersistence().clearCache(loaiSach);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<LoaiSach> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<LoaiSach> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<LoaiSach> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static LoaiSach update(LoaiSach loaiSach) throws SystemException {
		return getPersistence().update(loaiSach);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static LoaiSach update(LoaiSach loaiSach,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(loaiSach, serviceContext);
	}

	/**
	* Caches the loai sach in the entity cache if it is enabled.
	*
	* @param loaiSach the loai sach
	*/
	public static void cacheResult(
		com.annguyen.kyanhbooks.model.LoaiSach loaiSach) {
		getPersistence().cacheResult(loaiSach);
	}

	/**
	* Caches the loai sachs in the entity cache if it is enabled.
	*
	* @param loaiSachs the loai sachs
	*/
	public static void cacheResult(
		java.util.List<com.annguyen.kyanhbooks.model.LoaiSach> loaiSachs) {
		getPersistence().cacheResult(loaiSachs);
	}

	/**
	* Creates a new loai sach with the primary key. Does not add the loai sach to the database.
	*
	* @param MaLoaiSach the primary key for the new loai sach
	* @return the new loai sach
	*/
	public static com.annguyen.kyanhbooks.model.LoaiSach create(
		java.lang.String MaLoaiSach) {
		return getPersistence().create(MaLoaiSach);
	}

	/**
	* Removes the loai sach with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param MaLoaiSach the primary key of the loai sach
	* @return the loai sach that was removed
	* @throws com.annguyen.kyanhbooks.NoSuchLoaiSachException if a loai sach with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.annguyen.kyanhbooks.model.LoaiSach remove(
		java.lang.String MaLoaiSach)
		throws com.annguyen.kyanhbooks.NoSuchLoaiSachException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(MaLoaiSach);
	}

	public static com.annguyen.kyanhbooks.model.LoaiSach updateImpl(
		com.annguyen.kyanhbooks.model.LoaiSach loaiSach)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(loaiSach);
	}

	/**
	* Returns the loai sach with the primary key or throws a {@link com.annguyen.kyanhbooks.NoSuchLoaiSachException} if it could not be found.
	*
	* @param MaLoaiSach the primary key of the loai sach
	* @return the loai sach
	* @throws com.annguyen.kyanhbooks.NoSuchLoaiSachException if a loai sach with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.annguyen.kyanhbooks.model.LoaiSach findByPrimaryKey(
		java.lang.String MaLoaiSach)
		throws com.annguyen.kyanhbooks.NoSuchLoaiSachException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(MaLoaiSach);
	}

	/**
	* Returns the loai sach with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param MaLoaiSach the primary key of the loai sach
	* @return the loai sach, or <code>null</code> if a loai sach with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.annguyen.kyanhbooks.model.LoaiSach fetchByPrimaryKey(
		java.lang.String MaLoaiSach)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(MaLoaiSach);
	}

	/**
	* Returns all the loai sachs.
	*
	* @return the loai sachs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.annguyen.kyanhbooks.model.LoaiSach> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

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
	public static java.util.List<com.annguyen.kyanhbooks.model.LoaiSach> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.annguyen.kyanhbooks.model.LoaiSach> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the loai sachs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of loai sachs.
	*
	* @return the number of loai sachs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static LoaiSachPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (LoaiSachPersistence)PortletBeanLocatorUtil.locate(com.annguyen.kyanhbooks.service.ClpSerializer.getServletContextName(),
					LoaiSachPersistence.class.getName());

			ReferenceRegistry.registerReference(LoaiSachUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(LoaiSachPersistence persistence) {
	}

	private static LoaiSachPersistence _persistence;
}