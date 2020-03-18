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

package com.annguyen.kyanhbooks.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link LoaiSachLocalService}.
 *
 * @author AnNguyen
 * @see LoaiSachLocalService
 * @generated
 */
public class LoaiSachLocalServiceWrapper implements LoaiSachLocalService,
	ServiceWrapper<LoaiSachLocalService> {
	public LoaiSachLocalServiceWrapper(
		LoaiSachLocalService loaiSachLocalService) {
		_loaiSachLocalService = loaiSachLocalService;
	}

	/**
	* Adds the loai sach to the database. Also notifies the appropriate model listeners.
	*
	* @param loaiSach the loai sach
	* @return the loai sach that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.annguyen.kyanhbooks.model.LoaiSach addLoaiSach(
		com.annguyen.kyanhbooks.model.LoaiSach loaiSach)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _loaiSachLocalService.addLoaiSach(loaiSach);
	}

	/**
	* Creates a new loai sach with the primary key. Does not add the loai sach to the database.
	*
	* @param MaLoaiSach the primary key for the new loai sach
	* @return the new loai sach
	*/
	@Override
	public com.annguyen.kyanhbooks.model.LoaiSach createLoaiSach(
		java.lang.String MaLoaiSach) {
		return _loaiSachLocalService.createLoaiSach(MaLoaiSach);
	}

	/**
	* Deletes the loai sach with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param MaLoaiSach the primary key of the loai sach
	* @return the loai sach that was removed
	* @throws PortalException if a loai sach with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.annguyen.kyanhbooks.model.LoaiSach deleteLoaiSach(
		java.lang.String MaLoaiSach)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _loaiSachLocalService.deleteLoaiSach(MaLoaiSach);
	}

	/**
	* Deletes the loai sach from the database. Also notifies the appropriate model listeners.
	*
	* @param loaiSach the loai sach
	* @return the loai sach that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.annguyen.kyanhbooks.model.LoaiSach deleteLoaiSach(
		com.annguyen.kyanhbooks.model.LoaiSach loaiSach)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _loaiSachLocalService.deleteLoaiSach(loaiSach);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _loaiSachLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _loaiSachLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.annguyen.kyanhbooks.model.impl.LoaiSachModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _loaiSachLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.annguyen.kyanhbooks.model.impl.LoaiSachModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _loaiSachLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _loaiSachLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _loaiSachLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.annguyen.kyanhbooks.model.LoaiSach fetchLoaiSach(
		java.lang.String MaLoaiSach)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _loaiSachLocalService.fetchLoaiSach(MaLoaiSach);
	}

	/**
	* Returns the loai sach with the primary key.
	*
	* @param MaLoaiSach the primary key of the loai sach
	* @return the loai sach
	* @throws PortalException if a loai sach with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.annguyen.kyanhbooks.model.LoaiSach getLoaiSach(
		java.lang.String MaLoaiSach)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _loaiSachLocalService.getLoaiSach(MaLoaiSach);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _loaiSachLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<com.annguyen.kyanhbooks.model.LoaiSach> getLoaiSachs(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _loaiSachLocalService.getLoaiSachs(start, end);
	}

	/**
	* Returns the number of loai sachs.
	*
	* @return the number of loai sachs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getLoaiSachsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _loaiSachLocalService.getLoaiSachsCount();
	}

	/**
	* Updates the loai sach in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param loaiSach the loai sach
	* @return the loai sach that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.annguyen.kyanhbooks.model.LoaiSach updateLoaiSach(
		com.annguyen.kyanhbooks.model.LoaiSach loaiSach)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _loaiSachLocalService.updateLoaiSach(loaiSach);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _loaiSachLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_loaiSachLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _loaiSachLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public LoaiSachLocalService getWrappedLoaiSachLocalService() {
		return _loaiSachLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedLoaiSachLocalService(
		LoaiSachLocalService loaiSachLocalService) {
		_loaiSachLocalService = loaiSachLocalService;
	}

	@Override
	public LoaiSachLocalService getWrappedService() {
		return _loaiSachLocalService;
	}

	@Override
	public void setWrappedService(LoaiSachLocalService loaiSachLocalService) {
		_loaiSachLocalService = loaiSachLocalService;
	}

	private LoaiSachLocalService _loaiSachLocalService;
}