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

package formulario.contato.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EstadoLocalService}.
 *
 * @author Eglen
 * @see EstadoLocalService
 * @generated
 */
public class EstadoLocalServiceWrapper
	implements EstadoLocalService, ServiceWrapper<EstadoLocalService> {

	public EstadoLocalServiceWrapper(EstadoLocalService estadoLocalService) {
		_estadoLocalService = estadoLocalService;
	}

	/**
	 * Adds the estado to the database. Also notifies the appropriate model listeners.
	 *
	 * @param estado the estado
	 * @return the estado that was added
	 */
	@Override
	public formulario.contato.model.Estado addEstado(
		formulario.contato.model.Estado estado) {

		return _estadoLocalService.addEstado(estado);
	}

	/**
	 * Creates a new estado with the primary key. Does not add the estado to the database.
	 *
	 * @param estadoId the primary key for the new estado
	 * @return the new estado
	 */
	@Override
	public formulario.contato.model.Estado createEstado(long estadoId) {
		return _estadoLocalService.createEstado(estadoId);
	}

	/**
	 * Deletes the estado from the database. Also notifies the appropriate model listeners.
	 *
	 * @param estado the estado
	 * @return the estado that was removed
	 */
	@Override
	public formulario.contato.model.Estado deleteEstado(
		formulario.contato.model.Estado estado) {

		return _estadoLocalService.deleteEstado(estado);
	}

	/**
	 * Deletes the estado with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param estadoId the primary key of the estado
	 * @return the estado that was removed
	 * @throws PortalException if a estado with the primary key could not be found
	 */
	@Override
	public formulario.contato.model.Estado deleteEstado(long estadoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _estadoLocalService.deleteEstado(estadoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _estadoLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _estadoLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _estadoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>formulario.contato.model.impl.EstadoModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _estadoLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>formulario.contato.model.impl.EstadoModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _estadoLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _estadoLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _estadoLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public formulario.contato.model.Estado fetchEstado(long estadoId) {
		return _estadoLocalService.fetchEstado(estadoId);
	}

	/**
	 * Returns the estado matching the UUID and group.
	 *
	 * @param uuid the estado's UUID
	 * @param groupId the primary key of the group
	 * @return the matching estado, or <code>null</code> if a matching estado could not be found
	 */
	@Override
	public formulario.contato.model.Estado fetchEstadoByUuidAndGroupId(
		String uuid, long groupId) {

		return _estadoLocalService.fetchEstadoByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _estadoLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the estado with the primary key.
	 *
	 * @param estadoId the primary key of the estado
	 * @return the estado
	 * @throws PortalException if a estado with the primary key could not be found
	 */
	@Override
	public formulario.contato.model.Estado getEstado(long estadoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _estadoLocalService.getEstado(estadoId);
	}

	/**
	 * Returns the estado matching the UUID and group.
	 *
	 * @param uuid the estado's UUID
	 * @param groupId the primary key of the group
	 * @return the matching estado
	 * @throws PortalException if a matching estado could not be found
	 */
	@Override
	public formulario.contato.model.Estado getEstadoByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _estadoLocalService.getEstadoByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the estados.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>formulario.contato.model.impl.EstadoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of estados
	 * @param end the upper bound of the range of estados (not inclusive)
	 * @return the range of estados
	 */
	@Override
	public java.util.List<formulario.contato.model.Estado> getEstados(
		int start, int end) {

		return _estadoLocalService.getEstados(start, end);
	}

	/**
	 * Returns all the estados matching the UUID and company.
	 *
	 * @param uuid the UUID of the estados
	 * @param companyId the primary key of the company
	 * @return the matching estados, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<formulario.contato.model.Estado>
		getEstadosByUuidAndCompanyId(String uuid, long companyId) {

		return _estadoLocalService.getEstadosByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of estados matching the UUID and company.
	 *
	 * @param uuid the UUID of the estados
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of estados
	 * @param end the upper bound of the range of estados (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching estados, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<formulario.contato.model.Estado>
		getEstadosByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<formulario.contato.model.Estado> orderByComparator) {

		return _estadoLocalService.getEstadosByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of estados.
	 *
	 * @return the number of estados
	 */
	@Override
	public int getEstadosCount() {
		return _estadoLocalService.getEstadosCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _estadoLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _estadoLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _estadoLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _estadoLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the estado in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param estado the estado
	 * @return the estado that was updated
	 */
	@Override
	public formulario.contato.model.Estado updateEstado(
		formulario.contato.model.Estado estado) {

		return _estadoLocalService.updateEstado(estado);
	}

	@Override
	public EstadoLocalService getWrappedService() {
		return _estadoLocalService;
	}

	@Override
	public void setWrappedService(EstadoLocalService estadoLocalService) {
		_estadoLocalService = estadoLocalService;
	}

	private EstadoLocalService _estadoLocalService;

}